package com.vgu.cs.engine.entity.dhis2.adapter;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 15/05/2021
 */

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.vgu.cs.engine.entity.dhis2.model.TrackedEntityAttribute;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TrackedEntityAttributesMapTypeAdapter implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        TypeAdapter<TrackedEntityAttribute> teaAdapter = gson.getAdapter(TypeToken.get(TrackedEntityAttribute.class));

        return new TypeAdapter<T>() {
            @Override
            public void write(JsonWriter out, T value) {

            }

            @Override
            public T read(JsonReader in) throws IOException {
                JsonToken peek = in.peek();
                if (peek == JsonToken.NULL) {
                    in.nextNull();
                    return null;
                }

                Map<String, TrackedEntityAttribute> map = new HashMap<>();

                in.beginArray();
                while (in.hasNext()) {
                    TrackedEntityAttribute attribute = teaAdapter.read(in);
                    TrackedEntityAttribute replaced = map.put(attribute.getId(), attribute);
                    if (replaced != null) {
                        throw new JsonSyntaxException("Duplicate key: " + attribute.getId());
                    }
                }
                in.endArray();

                return (T) map;
            }
        };
    }
}

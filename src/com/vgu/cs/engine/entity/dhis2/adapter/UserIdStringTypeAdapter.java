package com.vgu.cs.engine.entity.dhis2.adapter;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class UserIdStringTypeAdapter implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
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

                String value = in.nextString();
                String uniqueId = String.valueOf(value.hashCode());

                return (T) uniqueId;
            }
        };
    }
}

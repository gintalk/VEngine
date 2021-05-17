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
import com.vgu.cs.engine.entity.dhis2.model.DataValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataValueListTypeAdapter implements TypeAdapterFactory {

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        TypeAdapter<DataValue> dataValueAdapter = gson.getAdapter(TypeToken.get(DataValue.class));

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

                List<DataValue> list = new ArrayList<>();

                in.beginArray();
                while (in.hasNext()) {
                    DataValue dataValue = dataValueAdapter.read(in);
                    list.add(dataValue);
                }
                in.endArray();

                return (T) list;
            }
        };
    }
}

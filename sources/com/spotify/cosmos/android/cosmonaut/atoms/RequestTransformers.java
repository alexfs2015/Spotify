package com.spotify.cosmos.android.cosmonaut.atoms;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

class RequestTransformers {
    private final List<Converter<?, byte[]>> mConverters;

    RequestTransformers(List<Factory> list) {
        this.mConverters = new ArrayList(list.size());
        for (Factory createRequestConverter : list) {
            this.mConverters.add(createRequestConverter.createRequestConverter());
        }
    }

    public Converter<?, byte[]> find(Type type) {
        for (Converter<?, byte[]> converter : this.mConverters) {
            if (converter.canHandle(type)) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(" is not supported by RequestTransformers");
        throw new IllegalArgumentException(sb.toString());
    }
}

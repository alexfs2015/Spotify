package com.spotify.mobile.android.cosmos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.Charset;

public final class JacksonSerializer {
    private static final Charset DEFAULT_CHARSET = far.c;
    private static final rnd sObjectMapperBuilder = new rnf().a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private JacksonSerializer() {
    }

    public static <T extends JacksonModel> byte[] toBytes(T t) {
        return toBytes(t, null);
    }

    public static <T extends JacksonModel> byte[] toBytes(T t, ObjectMapper objectMapper) {
        if (t != null) {
            if (objectMapper == null) {
                objectMapper = sObjectMapperBuilder.a();
            }
            try {
                return objectMapper.writeValueAsString(t).getBytes(DEFAULT_CHARSET);
            } catch (JsonProcessingException e) {
                throw new ParserException(e);
            }
        } else {
            throw new IllegalArgumentException("jacksonObject can't be null");
        }
    }
}

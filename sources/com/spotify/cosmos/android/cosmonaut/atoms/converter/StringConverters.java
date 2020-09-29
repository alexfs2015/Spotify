package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public class StringConverters implements Factory {
    /* access modifiers changed from: private */
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() {
            public boolean canHandle(Type type) {
                return type.equals(String.class);
            }

            public byte[] convert(Type type, Object obj) {
                return ((String) obj).getBytes(StringConverters.DEFAULT_CHARSET);
            }
        };
    }

    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() {
            public boolean canHandle(Type type) {
                return type.equals(String.class);
            }

            public Object convert(Type type, byte[] bArr) {
                return new String(bArr, StringConverters.DEFAULT_CHARSET);
            }
        };
    }
}

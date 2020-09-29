package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import java.lang.reflect.Type;

public class ByteArrayConverters implements Factory {
    private static final Converter<byte[], byte[]> PASS_THROUGH = new Converter<byte[], byte[]>() {
        public final byte[] convert(Type type, byte[] bArr) {
            return bArr;
        }

        public final boolean canHandle(Type type) {
            return type.equals(byte[].class);
        }
    };

    public Converter<byte[], byte[]> createRequestConverter() {
        return PASS_THROUGH;
    }

    public Converter<byte[], ?> createResponseConverter() {
        return PASS_THROUGH;
    }
}

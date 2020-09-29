package com.spotify.cosmos.android.cosmonaut.atoms.converter;

import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public class ProtoJavaliteConverters implements Factory {
    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() {
            public boolean canHandle(Type type) {
                return ProtoJavaliteConverters.isProtobufModel(type);
            }

            public byte[] convert(Type type, Object obj) {
                return ((fko) obj).b();
            }
        };
    }

    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() {
            public boolean canHandle(Type type) {
                return ProtoJavaliteConverters.isProtobufModel(type);
            }

            public Object convert(Type type, byte[] bArr) {
                String str = "#parser";
                Class cls = (Class) type;
                try {
                    return ((fkr) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0])).a(bArr);
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder("failed to access ");
                    sb.append(cls.getName());
                    sb.append(str);
                    throw new IOException(sb.toString(), e);
                } catch (NoSuchMethodException e2) {
                    StringBuilder sb2 = new StringBuilder("failed to find method ");
                    sb2.append(cls.getName());
                    sb2.append(str);
                    throw new IOException(sb2.toString(), e2);
                } catch (InvocationTargetException e3) {
                    StringBuilder sb3 = new StringBuilder("failed to invoke method ");
                    sb3.append(cls.getName());
                    sb3.append(str);
                    throw new IOException(sb3.toString(), e3);
                }
            }
        };
    }

    /* access modifiers changed from: private */
    public static boolean isProtobufModel(Type type) {
        return (type instanceof Class) && fko.class.isAssignableFrom((Class) type);
    }
}

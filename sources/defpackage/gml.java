package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.lang.reflect.Type;

/* renamed from: gml reason: default package */
public final class gml implements Factory {
    /* access modifiers changed from: private */
    public final ObjectMapper a;

    public gml(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    static boolean a(Type type) {
        return (type instanceof Class) && JacksonModel.class.isAssignableFrom((Class) type);
    }

    public final Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() {
            public final boolean canHandle(Type type) {
                return gml.a(type) || gml.this.a.canSerialize(gml.this.a.constructType(type).getRawClass());
            }

            public final /* synthetic */ Object convert(Type type, Object obj) {
                return gml.this.a.writeValueAsBytes(obj);
            }
        };
    }

    public final Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() {
            public final boolean canHandle(Type type) {
                return gml.a(type) || gml.this.a.canDeserialize(gml.this.a.constructType(type));
            }

            public final /* synthetic */ Object convert(Type type, Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return gml.this.a.readValue(bArr, gml.this.a.constructType(type));
            }
        };
    }
}

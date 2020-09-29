package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter;
import com.spotify.cosmos.android.cosmonaut.atoms.converter.Converter.Factory;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.lang.reflect.Type;

/* renamed from: gkx reason: default package */
public final class gkx implements Factory {
    /* access modifiers changed from: private */
    public final ObjectMapper a;

    public gkx(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    public final Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() {
            public final boolean canHandle(Type type) {
                return gkx.a(type) || gkx.this.a.canSerialize(gkx.this.a.constructType(type).getRawClass());
            }

            public final /* synthetic */ Object convert(Type type, Object obj) {
                return gkx.this.a.writeValueAsBytes(obj);
            }
        };
    }

    public final Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() {
            public final /* synthetic */ Object convert(Type type, Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                return gkx.this.a.readValue(bArr, gkx.this.a.constructType(type));
            }

            public final boolean canHandle(Type type) {
                return gkx.a(type) || gkx.this.a.canDeserialize(gkx.this.a.constructType(type));
            }
        };
    }

    static boolean a(Type type) {
        return (type instanceof Class) && JacksonModel.class.isAssignableFrom((Class) type);
    }
}

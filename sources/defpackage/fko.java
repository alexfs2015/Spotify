package defpackage;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: fko reason: default package */
public class fko<T> {
    public final Class<? super T> a;
    public final Type b;
    private int c;

    protected fko() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.b = C$Gson$Types.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.a = C$Gson$Types.b(this.b);
            this.c = this.b.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private fko(Type type) {
        this.b = C$Gson$Types.a((Type) fjn.a(type));
        this.a = C$Gson$Types.b(this.b);
        this.c = this.b.hashCode();
    }

    public static <T> fko<T> a(Class<T> cls) {
        return new fko<>(cls);
    }

    public static fko<?> a(Type type) {
        return new fko<>(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fko) && C$Gson$Types.a(this.b, ((fko) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return C$Gson$Types.c(this.b);
    }
}

package defpackage;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: fju reason: default package */
public class fju<T> {
    public final Class<? super T> a;
    public final Type b;
    private int c;

    protected fju() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this.b = C$Gson$Types.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.a = C$Gson$Types.b(this.b);
            this.c = this.b.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    private fju(Type type) {
        this.b = C$Gson$Types.a((Type) fit.a(type));
        this.a = C$Gson$Types.b(this.b);
        this.c = this.b.hashCode();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fju) && C$Gson$Types.a(this.b, ((fju) obj).b);
    }

    public final String toString() {
        return C$Gson$Types.c(this.b);
    }

    public static fju<?> a(Type type) {
        return new fju<>(type);
    }

    public static <T> fju<T> a(Class<T> cls) {
        return new fju<>(cls);
    }
}

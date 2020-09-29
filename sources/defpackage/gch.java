package defpackage;

import com.google.common.base.Suppliers;

/* renamed from: gch reason: default package */
public final class gch<T> {
    private final fbu<T> a;

    /* renamed from: gch$a */
    public interface a<T> {
        T create();
    }

    private gch(final a<T> aVar) {
        this.a = Suppliers.a((fbu<T>) new fbu<T>() {
            public final T get() {
                return aVar.create();
            }
        });
    }

    public static <T> gch<T> a(a<T> aVar) {
        return new gch<>((a) fbp.a(aVar));
    }

    public final T a() {
        return fbp.a(this.a.get());
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}

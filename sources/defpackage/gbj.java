package defpackage;

import com.google.common.base.Suppliers;

/* renamed from: gbj reason: default package */
public final class gbj<T> {
    private final fbd<T> a;

    /* renamed from: gbj$a */
    public interface a<T> {
        T create();
    }

    private gbj(final a<T> aVar) {
        this.a = Suppliers.a((fbd<T>) new fbd<T>() {
            public final T get() {
                return aVar.create();
            }
        });
    }

    public final T a() {
        return fay.a(this.a.get());
    }

    public final String toString() {
        return a().toString();
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public static <T> gbj<T> a(a<T> aVar) {
        return new gbj<>((a) fay.a(aVar));
    }
}

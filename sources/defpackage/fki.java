package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: fki reason: default package */
final class fki<T> extends fjh<T> {
    private final fix a;
    private final fjh<T> b;
    private final Type c;

    fki(fix fix, fjh<T> fjh, Type type) {
        this.a = fix;
        this.b = fjh;
        this.c = type;
    }

    public final T a(fkp fkp) {
        return this.b.a(fkp);
    }

    public final void a(fkq fkq, T t) {
        fjh<T> fjh = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            fjh = this.a.a(fko.a(type));
            if (fjh instanceof a) {
                fjh<T> fjh2 = this.b;
                if (!(fjh2 instanceof a)) {
                    fjh = fjh2;
                }
            }
        }
        fjh.a(fkq, t);
    }
}

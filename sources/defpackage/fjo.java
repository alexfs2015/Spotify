package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: fjo reason: default package */
final class fjo<T> extends fin<T> {
    private final fid a;
    private final fin<T> b;
    private final Type c;

    fjo(fid fid, fin<T> fin, Type type) {
        this.a = fid;
        this.b = fin;
        this.c = type;
    }

    public final T a(fjv fjv) {
        return this.b.a(fjv);
    }

    public final void a(fjw fjw, T t) {
        fin<T> fin = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            fin = this.a.a(fju.a(type));
            if (fin instanceof a) {
                fin<T> fin2 = this.b;
                if (!(fin2 instanceof a)) {
                    fin = fin2;
                }
            }
        }
        fin.a(fjw, t);
    }
}

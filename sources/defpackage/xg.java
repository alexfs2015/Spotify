package defpackage;

import java.util.Arrays;

/* renamed from: xg reason: default package */
public final class xg<V> {
    public final V a;
    final Throwable b;

    public xg(V v) {
        this.a = v;
        this.b = null;
    }

    public xg(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg)) {
            return false;
        }
        xg xgVar = (xg) obj;
        V v = this.a;
        if (v != null && v.equals(xgVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || xgVar.b == null) {
            return false;
        }
        return th.toString().equals(this.b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

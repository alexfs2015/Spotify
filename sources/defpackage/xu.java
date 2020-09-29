package defpackage;

import java.util.Arrays;

/* renamed from: xu reason: default package */
public final class xu<V> {
    public final V a;
    final Throwable b;

    public xu(V v) {
        this.a = v;
        this.b = null;
    }

    public xu(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        V v = this.a;
        if (v != null && v.equals(xuVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || xuVar.b == null) {
            return false;
        }
        return th.toString().equals(this.b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

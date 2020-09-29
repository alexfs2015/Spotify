package defpackage;

import android.os.Bundle;

@cey
/* renamed from: clm reason: default package */
public final class clm {
    public final Object a;
    public int b;
    public int c;
    public final cln d;
    final String e;

    private clm(cln cln, String str) {
        this.a = new Object();
        this.d = cln;
        this.e = str;
    }

    public clm(String str) {
        this(bjl.j(), str);
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.b);
            bundle.putInt("pmnll", this.c);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clm clm = (clm) obj;
            String str = this.e;
            String str2 = clm.e;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}

package defpackage;

import android.os.Bundle;

@cfp
/* renamed from: cmd reason: default package */
public final class cmd {
    public final Object a;
    public int b;
    public int c;
    public final cme d;
    final String e;

    private cmd(cme cme, String str) {
        this.a = new Object();
        this.d = cme;
        this.e = str;
    }

    public cmd(String str) {
        this(bkc.j(), str);
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
            cmd cmd = (cmd) obj;
            String str = this.e;
            String str2 = cmd.e;
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

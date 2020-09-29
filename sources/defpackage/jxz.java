package defpackage;

import java.util.Collections;

/* renamed from: jxz reason: default package */
public final class jxz {
    final jya a;
    boolean b;
    long c;
    kcb d;
    kbg e;

    public jxz() {
        this.b = true;
        this.a = null;
    }

    public jxz(jya jya) {
        this.a = jya;
        this.b = true;
    }

    public final kbk a() {
        kbg kbg = this.e;
        if (kbg == null) {
            return null;
        }
        kbk c2 = kbg.c();
        if (c2 == null) {
            c2 = new kbk(null, Collections.emptyList());
        }
        return c2;
    }
}

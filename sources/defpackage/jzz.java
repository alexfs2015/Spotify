package defpackage;

import java.util.Collections;

/* renamed from: jzz reason: default package */
public final class jzz {
    final kaa a;
    boolean b;
    long c;
    kec d;
    kdg e;

    public jzz() {
        this.b = true;
        this.a = null;
    }

    public jzz(kaa kaa) {
        this.a = kaa;
        this.b = true;
    }

    public final kdk a() {
        kdg kdg = this.e;
        if (kdg == null) {
            return null;
        }
        kdk c2 = kdg.c();
        if (c2 == null) {
            c2 = new kdk(null, Collections.emptyList());
        }
        return c2;
    }
}

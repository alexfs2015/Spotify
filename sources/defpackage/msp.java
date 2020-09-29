package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: msp reason: default package */
public final class msp implements jnv {
    private final jmq a;
    private final boolean b;

    public msp(jmq jmq, boolean z) {
        this.a = jmq;
        this.b = z;
    }

    public final jms a(sih sih, String str, String str2) {
        sih sih2 = (sih) fay.a(sih);
        String str3 = (String) fay.a(str);
        String str4 = (String) fay.a(str2);
        if (jst.a(str3).b == LinkType.TRACK) {
            return this.a.a(str3, str4, sih2.toString()).a(sih2).a(false).b(true).c(true).d(false).j(this.b).a();
        }
        return jms.a;
    }
}

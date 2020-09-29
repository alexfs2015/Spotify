package defpackage;

import com.spotify.mobile.android.util.LinkType;

/* renamed from: mxq reason: default package */
public final class mxq implements jqh {
    private final jpc a;
    private final boolean b;

    public mxq(jpc jpc, boolean z) {
        this.a = jpc;
        this.b = z;
    }

    public final jpe a(sso sso, String str, String str2) {
        sso sso2 = (sso) fbp.a(sso);
        String str3 = (String) fbp.a(str);
        return jva.a(str3).b == LinkType.TRACK ? this.a.a(str3, (String) fbp.a(str2), sso2.toString()).a(sso2).a(false).b(true).c(true).d(false).j(this.b).a() : jpe.a;
    }
}

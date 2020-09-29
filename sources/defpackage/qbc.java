package defpackage;

import java.util.Map;

/* renamed from: qbc reason: default package */
public final class qbc {
    public final jlr a;
    public final jtz b;

    public qbc(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    public final void a(String str, long j, String str2, String str3, String str4) {
        jlr jlr = this.a;
        ae aeVar = new ae(str, Float.toString(((float) j) / 1000.0f), str2, str3, str4);
        jlr.a(aeVar);
    }

    public final void a(String str, String str2) {
        jlr jlr = this.a;
        String str3 = str;
        be beVar = new be(str3, "com.spotify.music.features.quicksilver", null, null, 0, null, null, str2, (double) this.b.a());
        jlr.a(beVar);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        jlr jlr = this.a;
        ad adVar = new ad(str, str2, str3, str4, str5);
        jlr.a(adVar);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        jlr jlr = this.a;
        ag agVar = new ag(str, str2, str3, str4, str5, map);
        jlr.a(agVar);
    }

    public final void b(String str, String str2) {
        jlr jlr = this.a;
        String str3 = str;
        bh bhVar = new bh(str3, "com.spotify.music.features.quicksilver", null, null, 0, null, null, str2, (double) this.b.a(), null);
        jlr.a(bhVar);
    }
}

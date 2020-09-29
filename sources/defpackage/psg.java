package defpackage;

import java.util.Map;

/* renamed from: psg reason: default package */
public final class psg {
    public final jjf a;
    public final jrp b;

    public psg(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public final void a(String str, long j, String str2, String str3, String str4) {
        jjf jjf = this.a;
        af afVar = new af(str, Float.toString(((float) j) / 1000.0f), str2, str3, str4);
        jjf.a(afVar);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        jjf jjf = this.a;
        ae aeVar = new ae(str, str2, str3, str4, str5);
        jjf.a(aeVar);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        jjf jjf = this.a;
        ah ahVar = new ah(str, str2, str3, str4, str5, map);
        jjf.a(ahVar);
    }

    public final void a(String str, String str2) {
        jjf jjf = this.a;
        String str3 = str;
        bf bfVar = new bf(str3, "com.spotify.music.features.quicksilver", null, null, 0, null, null, str2, (double) this.b.a());
        jjf.a(bfVar);
    }

    public final void b(String str, String str2) {
        jjf jjf = this.a;
        String str3 = str;
        bi biVar = new bi(str3, "com.spotify.music.features.quicksilver", null, null, 0, null, null, str2, (double) this.b.a(), null);
        jjf.a(biVar);
    }
}

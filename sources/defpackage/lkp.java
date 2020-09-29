package defpackage;

/* renamed from: lkp reason: default package */
public final class lkp {
    public final jjf a;
    public final String b;
    public final String c;
    public final jrp d;

    public lkp(jjf jjf, jrp jrp, String str, String str2) {
        this.a = jjf;
        this.d = jrp;
        this.b = str;
        this.c = str2;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        jjf jjf = this.a;
        bh bhVar = new bh(null, "com.spotify.feature.explicit", this.c, "enable-explicit-onetrack", 0, this.b, str, str2, (double) this.d.a());
        jjf.a(bhVar);
    }
}

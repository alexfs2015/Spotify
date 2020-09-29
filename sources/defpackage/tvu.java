package defpackage;

/* renamed from: tvu reason: default package */
public final class tvu implements tvw {
    private final gjf a;
    private final jrp b;
    private final jjf c;
    private final sih d;

    public tvu(jrp jrp, jjf jjf, gjf gjf, sih sih) {
        this.b = jrp;
        this.c = jjf;
        this.a = gjf;
        this.d = sih;
    }

    public final void a(String str, String str2, int i) {
        a(str2, i, "navigate-forward", str);
    }

    public final void b(String str, String str2, int i) {
        a(str2, i, "play-episode", str);
    }

    public final void c(String str, String str2, int i) {
        a(str2, i, "pause-episode", str);
    }

    public final void d(String str, String str2, int i) {
        a(str2, i, "download-episode", str);
    }

    public final void e(String str, String str2, int i) {
        a(str2, i, "remove-downloaded-episode", str);
    }

    public final void f(String str, String str2, int i) {
        a(str2, i, "open-context-menu", str);
    }

    public final void g(String str, String str2, int i) {
        a(str2, i, "mark-as-played", str);
    }

    public final void h(String str, String str2, int i) {
        a(str2, i, "share", str);
    }

    private void a(String str, int i, String str2, String str3) {
        jjf jjf = this.c;
        String str4 = str;
        String str5 = str3;
        bh bhVar = new bh(null, this.a.a(), this.d.toString(), str4, (long) i, str5, "hit", str2, (double) this.b.a());
        jjf.a(bhVar);
    }
}

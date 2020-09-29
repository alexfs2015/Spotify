package defpackage;

/* renamed from: kye reason: default package */
public final class kye {
    private final jlr a;
    private final xij<String> b;

    public kye(jlr jlr, xij<String> xij) {
        this.a = jlr;
        this.b = xij;
    }

    public final void a(kxy kxy) {
        a(kxy, "downloading", null, null);
    }

    public final void a(kxy kxy, String str, String str2) {
        a(kxy, "failure", str, str2);
    }

    public void a(kxy kxy, String str, String str2, String str3) {
        m mVar = new m(kxy.d(), kxy.a(), str, str2, str3);
        this.a.a(mVar);
    }

    public final void b(kxy kxy) {
        a(kxy, "downloaded", null, null);
        this.b.onNext(kxy.a());
    }
}

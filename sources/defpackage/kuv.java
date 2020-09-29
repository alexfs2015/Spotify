package defpackage;

/* renamed from: kuv reason: default package */
public final class kuv {
    private final jjf a;
    private final wue<String> b;

    public kuv(jjf jjf, wue<String> wue) {
        this.a = jjf;
        this.b = wue;
    }

    public final void a(kup kup, String str, String str2) {
        a(kup, "failure", str, str2);
    }

    public final void a(kup kup) {
        a(kup, "downloading", null, null);
    }

    public final void b(kup kup) {
        a(kup, "downloaded", null, null);
        this.b.onNext(kup.a());
    }

    public void a(kup kup, String str, String str2, String str3) {
        m mVar = new m(kup.d(), kup.a(), str, str2, str3);
        this.a.a(mVar);
    }
}

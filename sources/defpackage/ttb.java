package defpackage;

/* renamed from: ttb reason: default package */
public final class ttb implements tsu {
    private final kxs b;
    private final tvw c;
    private final ttp d;
    private final vti<tto> e;

    public ttb(kxs kxs, tvw tvw, ttp ttp, vti<tto> vti) {
        this.b = kxs;
        this.c = tvw;
        this.d = ttp;
        this.e = vti;
    }

    public final void a(String str, String str2, int i) {
        this.b.a(str);
        this.c.g(str, str2, i);
        this.d.a(str);
    }

    public final void a() {
        ((tto) this.e.get()).onMarkAsPlayedClicked();
    }
}

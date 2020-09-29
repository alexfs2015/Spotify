package defpackage;

/* renamed from: sxc reason: default package */
public final class sxc implements iex, a<Boolean>, a {
    public final swv a;
    public usi b;
    private final usg c;
    private final tju d;
    private boolean e;

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.b.b(bool.booleanValue());
        this.e = bool.booleanValue();
    }

    public sxc(usg usg, swv swv, tju tju) {
        this.c = usg;
        this.a = swv;
        this.d = tju;
    }

    public final void a() {
        if (this.e) {
            this.c.d();
            this.d.a();
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.b.a(false);
        } else {
            this.b.a(true);
        }
    }
}

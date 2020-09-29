package defpackage;

/* renamed from: owi reason: default package */
public final class owi {
    public final String a;
    public final fsf b;
    public oym c;
    private final owu d;

    public owi(String str, owu owu, fsf fsf) {
        this.a = str;
        this.d = owu;
        this.b = fsf;
    }

    public final void a(fyt fyt, oxy oxy) {
        oym oym = this.c;
        if (oym != null) {
            owu owu = this.d;
            owu.a = fyt;
            owu.a(fyt, oym, true);
            owu.b(fyt, oym, true);
            owu.a(fyt, oym);
            oxy.a.a.setOnClickListener(new $$Lambda$owi$odbgRbK3L_f9Z7WqjhAZd9vKLCU(fyt));
        }
    }
}

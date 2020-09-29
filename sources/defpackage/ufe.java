package defpackage;

/* renamed from: ufe reason: default package */
public final class ufe implements uex {
    private final lbb b;
    private final uhz c;
    private final ufs d;
    private final who<ufr> e;

    public ufe(lbb lbb, uhz uhz, ufs ufs, who<ufr> who) {
        this.b = lbb;
        this.c = uhz;
        this.d = ufs;
        this.e = who;
    }

    public final void a() {
        ((ufr) this.e.get()).onMarkAsPlayedClicked();
    }

    public final void a(String str, String str2, int i) {
        this.b.a(str);
        this.c.g(str, str2, i);
        this.d.a(str);
    }
}

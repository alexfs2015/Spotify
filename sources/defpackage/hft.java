package defpackage;

/* renamed from: hft reason: default package */
public final class hft {
    public final hhg a;
    public final jrp b;
    public volatile boolean c;
    public long d;

    hft(jrp jrp) {
        this.a = new hhg(jrp);
        this.b = jrp;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a.a(3);
    }

    public final boolean b() {
        return this.a.a() == 3;
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        this.a.a(1);
    }

    public final boolean a(long j) {
        return this.a.a(1, 4000);
    }
}

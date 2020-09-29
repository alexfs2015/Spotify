package defpackage;

/* renamed from: ppu reason: default package */
public final class ppu {
    private final jlr a;
    private final ppw b;

    public ppu(jlr jlr, ppw ppw) {
        this.a = jlr;
        this.b = ppw;
    }

    private void a(String str, long j) {
        jlr jlr = this.a;
        ax axVar = new ax(str, j, null, null, null);
        jlr.a(axVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Integer num) {
        a(str, (long) num.intValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Throwable th) {
        a(str, -1);
    }

    public final void a(String str) {
        this.b.a().a((xis<? super T>) new $$Lambda$ppu$kaXiP8FuSi0CWmUgl4hoATahLQ<Object>(this, str), (xis<Throwable>) new $$Lambda$ppu$EIdj2JjaEAKwy7o0NyeNSINx9b0<Throwable>(this, str));
    }
}

package defpackage;

/* renamed from: lsr reason: default package */
public final class lsr {
    private final sso a;
    private final fzt b;
    private final lse c;

    public lsr(sso sso, fzt fzt, lse lse) {
        this.a = sso;
        this.b = (fzt) fbp.a(fzt);
        this.c = (lse) fbp.a(lse);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        this.c.a(str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lsl lsl) {
        this.c.a(lsl.a(), lsl.b(), lsl.d(), this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2) {
        this.c.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(lsl lsl) {
        this.c.b(lsl.a(), lsl.b(), lsl.c(), lsl.d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(lsl lsl) {
        this.c.a(lsl.a(), lsl.b(), lsl.c(), this.a.toString());
    }

    public final void a(fzn fzn, String str) {
        this.b.d(fzn, new $$Lambda$lsr$Cl3er5nx8buqXCQeQeAPzkV5xlc(this, str));
    }

    public final void a(fzn fzn, String str, String str2) {
        this.b.a(fzn, str, (fzk) new $$Lambda$lsr$cHNJ9A1yrvm5yvC3KQltvkOAf5U(this, str, str2));
    }

    public final void a(fzn fzn, lsl lsl) {
        this.b.c(fzn, new $$Lambda$lsr$gu9JyX_iJqCTUNUvVKnLrnN0PU(this, lsl));
    }

    public final void b(fzn fzn, String str, String str2) {
        this.b.b(fzn, new $$Lambda$lsr$8yUFBwafEhdidYgY3yxkAQpgmpI(this, str, str2));
    }

    public final void b(fzn fzn, lsl lsl) {
        this.b.a(fzn, new $$Lambda$lsr$90iD3b3CeWUPMieYOuhh05fdicY(this, lsl));
    }

    public final void c(fzn fzn, lsl lsl) {
        this.b.e(fzn, new $$Lambda$lsr$GeQYnfQrC78jeH2fF2pasxnYXIE(this, lsl));
    }
}

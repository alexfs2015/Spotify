package defpackage;

/* renamed from: nha reason: default package */
public final class nha implements gvk {
    private final net b;
    private final gxz c;

    public nha(net net, gxz gxz) {
        this.b = (net) fay.a(net);
        this.c = (gxz) fay.a(gxz);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.c.logInteraction("spotify:internal:home_taste_onboarding_header", guy.b, "notNow", null);
        this.b.a(false);
    }
}

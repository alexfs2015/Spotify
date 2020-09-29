package defpackage;

/* renamed from: ngy reason: default package */
public final class ngy implements gvk {
    private final net b;
    private final gxz c;

    public ngy(net net, gxz gxz) {
        this.b = (net) fay.a(net);
        this.c = (gxz) fay.a(gxz);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        this.c.logInteraction("spotify:internal:home_podcast_onboarding_component", guy.b, "dismiss", null);
        net net = this.b;
        net.a.a().a(net.c, false).b();
        if (net.b != null) {
            net.b.onNext(Boolean.FALSE);
        }
    }
}

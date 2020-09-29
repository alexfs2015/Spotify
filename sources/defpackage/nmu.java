package defpackage;

/* renamed from: nmu reason: default package */
public final class nmu implements gxk {
    private final nki b;
    private final has c;

    public nmu(nki nki, has has) {
        this.b = (nki) fbp.a(nki);
        this.c = (has) fbp.a(has);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.c.logInteraction("spotify:internal:home_podcast_onboarding_component", gwy.b, "dismiss", null);
        nki nki = this.b;
        nki.a.a().a(nki.c, false).b();
        if (nki.b != null) {
            nki.b.onNext(Boolean.FALSE);
        }
    }
}

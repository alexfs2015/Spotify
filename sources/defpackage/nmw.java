package defpackage;

/* renamed from: nmw reason: default package */
public final class nmw implements gxk {
    private final nki b;
    private final has c;

    public nmw(nki nki, has has) {
        this.b = (nki) fbp.a(nki);
        this.c = (has) fbp.a(has);
    }

    public final void handleCommand(hci hci, gwy gwy) {
        this.c.logInteraction("spotify:internal:home_taste_onboarding_header", gwy.b, "notNow", null);
        this.b.a(false);
    }
}

package defpackage;

/* renamed from: nrf reason: default package */
public final class nrf implements wig<nre> {
    private final wzi<nrc> a;

    private nrf(wzi<nrc> wzi) {
        this.a = wzi;
    }

    public static nrf a(wzi<nrc> wzi) {
        return new nrf(wzi);
    }

    public final /* synthetic */ Object get() {
        return new nre((nrc) this.a.get());
    }
}

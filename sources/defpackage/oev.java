package defpackage;

/* renamed from: oev reason: default package */
public final class oev implements vua<oeu> {
    private final wlc<String> a;

    private oev(wlc<String> wlc) {
        this.a = wlc;
    }

    public static oev a(wlc<String> wlc) {
        return new oev(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oeu((String) this.a.get());
    }
}

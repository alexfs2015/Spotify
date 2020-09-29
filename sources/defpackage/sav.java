package defpackage;

/* renamed from: sav reason: default package */
public final class sav implements vua<sau> {
    private final wlc<fpt> a;

    private sav(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static sav a(wlc<fpt> wlc) {
        return new sav(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sau((fpt) this.a.get());
    }
}

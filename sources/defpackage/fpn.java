package defpackage;

/* renamed from: fpn reason: default package */
public final class fpn implements vua<fpg> {
    private final wlc<fpl> a;

    private fpn(wlc<fpl> wlc) {
        this.a = wlc;
    }

    public static fpn a(wlc<fpl> wlc) {
        return new fpn(wlc);
    }

    public static fpg a(Object obj) {
        return new fpg((fpl) obj);
    }

    public final /* synthetic */ Object get() {
        return new fpg((fpl) this.a.get());
    }
}

package defpackage;

/* renamed from: owj reason: default package */
public final class owj implements vua<owi> {
    private final wlc<String> a;
    private final wlc<owu> b;
    private final wlc<fsf> c;

    private owj(wlc<String> wlc, wlc<owu> wlc2, wlc<fsf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static owj a(wlc<String> wlc, wlc<owu> wlc2, wlc<fsf> wlc3) {
        return new owj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new owi((String) this.a.get(), (owu) this.b.get(), (fsf) this.c.get());
    }
}

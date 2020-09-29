package defpackage;

/* renamed from: ifr reason: default package */
public final class ifr implements vua<ifq> {
    private final wlc<hxl> a;

    private ifr(wlc<hxl> wlc) {
        this.a = wlc;
    }

    public static ifr a(wlc<hxl> wlc) {
        return new ifr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ifq((hxl) this.a.get());
    }
}

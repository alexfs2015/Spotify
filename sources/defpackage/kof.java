package defpackage;

/* renamed from: kof reason: default package */
public final class kof implements vua<koe> {
    private final wlc<hxf> a;

    private kof(wlc<hxf> wlc) {
        this.a = wlc;
    }

    public static kof a(wlc<hxf> wlc) {
        return new kof(wlc);
    }

    public final /* synthetic */ Object get() {
        return new koe((hxf) this.a.get());
    }
}

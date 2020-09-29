package defpackage;

/* renamed from: rck reason: default package */
public final class rck implements vua<rcj> {
    private final wlc<rbr> a;

    private rck(wlc<rbr> wlc) {
        this.a = wlc;
    }

    public static rck a(wlc<rbr> wlc) {
        return new rck(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rcj((rbr) this.a.get());
    }
}

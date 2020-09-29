package defpackage;

/* renamed from: idl reason: default package */
public final class idl implements vua<idk> {
    private final wlc<hxj> a;
    private final wlc<hxi> b;

    private idl(wlc<hxj> wlc, wlc<hxi> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static idl a(wlc<hxj> wlc, wlc<hxi> wlc2) {
        return new idl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new idk((hxj) this.a.get(), (hxi) this.b.get());
    }
}

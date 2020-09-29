package defpackage;

/* renamed from: uwk reason: default package */
public final class uwk implements vua<uwj> {
    private final wlc<uwn> a;

    private uwk(wlc<uwn> wlc) {
        this.a = wlc;
    }

    public static uwk a(wlc<uwn> wlc) {
        return new uwk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uwj((uwn) this.a.get());
    }
}

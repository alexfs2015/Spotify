package defpackage;

/* renamed from: uov reason: default package */
public final class uov implements vua<uou> {
    private final wlc<rcq> a;

    private uov(wlc<rcq> wlc) {
        this.a = wlc;
    }

    public static uov a(wlc<rcq> wlc) {
        return new uov(wlc);
    }

    public final /* synthetic */ Object get() {
        return new uou((rcq) this.a.get());
    }
}

package defpackage;

/* renamed from: ifj reason: default package */
public final class ifj implements vua<ifi> {
    private final wlc<ife> a;

    private ifj(wlc<ife> wlc) {
        this.a = wlc;
    }

    public static ifj a(wlc<ife> wlc) {
        return new ifj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ifi((ife) this.a.get());
    }
}

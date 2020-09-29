package defpackage;

/* renamed from: oyp reason: default package */
public final class oyp implements vua<oyo> {
    private final wlc<oyn> a;

    private oyp(wlc<oyn> wlc) {
        this.a = wlc;
    }

    public static oyp a(wlc<oyn> wlc) {
        return new oyp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new oyo(vtz.b(this.a));
    }
}

package defpackage;

/* renamed from: umo reason: default package */
public final class umo implements vua<uly> {
    private final wlc<jjf> a;

    private umo(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static umo a(wlc<jjf> wlc) {
        return new umo(wlc);
    }

    public final /* synthetic */ Object get() {
        return (uly) vuf.a(new uly((jjf) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

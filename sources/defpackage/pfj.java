package defpackage;

/* renamed from: pfj reason: default package */
public final class pfj implements vua<String> {
    private final wlc<jrs> a;

    private pfj(wlc<jrs> wlc) {
        this.a = wlc;
    }

    public static pfj a(wlc<jrs> wlc) {
        return new pfj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((jrs) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

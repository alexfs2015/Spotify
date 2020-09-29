package defpackage;

/* renamed from: uhx reason: default package */
public final class uhx implements vua<uia> {
    private final wlc<jjf> a;

    private uhx(wlc<jjf> wlc) {
        this.a = wlc;
    }

    public static uhx a(wlc<jjf> wlc) {
        return new uhx(wlc);
    }

    public final /* synthetic */ Object get() {
        return (uia) vuf.a(new uia((jjf) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

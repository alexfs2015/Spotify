package defpackage;

/* renamed from: otl reason: default package */
public final class otl implements vua<String> {
    private final wlc<String> a;

    private otl(wlc<String> wlc) {
        this.a = wlc;
    }

    public static otl a(wlc<String> wlc) {
        return new otl(wlc);
    }

    public final /* synthetic */ Object get() {
        String b = jst.a((String) this.a.get()).b();
        if (b == null) {
            b = "";
        }
        return (String) vuf.a(b, "Cannot return null from a non-@Nullable @Provides method");
    }
}

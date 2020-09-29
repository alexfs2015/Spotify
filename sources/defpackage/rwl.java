package defpackage;

/* renamed from: rwl reason: default package */
public final class rwl implements vua<rwp> {
    private final wlc<glm> a;

    private rwl(wlc<glm> wlc) {
        this.a = wlc;
    }

    public static rwl a(wlc<glm> wlc) {
        return new rwl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (rwp) vuf.a(new rwp((glm) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

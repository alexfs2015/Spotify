package defpackage;

/* renamed from: lvx reason: default package */
public final class lvx implements vua<lvw> {
    private final wlc<Boolean> a;

    private lvx(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    public static lvx a(wlc<Boolean> wlc) {
        return new lvx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lvw(((Boolean) this.a.get()).booleanValue());
    }
}

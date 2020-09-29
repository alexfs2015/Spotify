package defpackage;

import io.reactivex.Flowable;

/* renamed from: swn reason: default package */
public final class swn implements vua<Flowable<Boolean>> {
    private final wlc<swt> a;

    private swn(wlc<swt> wlc) {
        this.a = wlc;
    }

    public static swn a(wlc<swt> wlc) {
        return new swn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((swt) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

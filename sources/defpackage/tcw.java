package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* renamed from: tcw reason: default package */
public final class tcw implements wig<Flowable<lbg>> {
    private final wzi<lbi> a;

    private tcw(wzi<lbi> wzi) {
        this.a = wzi;
    }

    public static tcw a(wzi<lbi> wzi) {
        return new tcw(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((lbi) this.a.get()).a.a(BackpressureStrategy.LATEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import io.reactivex.Flowable;

/* renamed from: tgu reason: default package */
public final class tgu implements wig<Flowable<Boolean>> {
    private final wzi<tha> a;

    private tgu(wzi<tha> wzi) {
        this.a = wzi;
    }

    public static tgu a(wzi<tha> wzi) {
        return new tgu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((tha) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

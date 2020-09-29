package defpackage;

import io.reactivex.Flowable;

/* renamed from: hmj reason: default package */
public final class hmj implements wig<Flowable<fqn>> {
    private final wzi<hgy> a;

    private hmj(wzi<hgy> wzi) {
        this.a = wzi;
    }

    public static hmj a(wzi<hgy> wzi) {
        return new hmj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((hgy) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

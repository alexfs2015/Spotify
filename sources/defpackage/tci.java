package defpackage;

import io.reactivex.Flowable;

/* renamed from: tci reason: default package */
public final class tci implements wig<tch> {
    private final wzi<Flowable<Integer>> a;
    private final wzi<jyu> b;

    private tci(wzi<Flowable<Integer>> wzi, wzi<jyu> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tci a(wzi<Flowable<Integer>> wzi, wzi<jyu> wzi2) {
        return new tci(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tch((Flowable) this.a.get(), (jyu) this.b.get());
    }
}

package defpackage;

import io.reactivex.Flowable;

/* renamed from: sol reason: default package */
public final class sol implements wig<sok> {
    private final wzi<Flowable<sqj>> a;
    private final wzi<Flowable<sqj>> b;

    private sol(wzi<Flowable<sqj>> wzi, wzi<Flowable<sqj>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sol a(wzi<Flowable<sqj>> wzi, wzi<Flowable<sqj>> wzi2) {
        return new sol(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sok(this.a, this.b);
    }
}

package defpackage;

import rx.internal.util.RxThreadFactory;

/* renamed from: wzw reason: default package */
public class wzw {
    private static final wzw a = new wzw();

    @Deprecated
    public static wum a(wum wum) {
        return wum;
    }

    public static wug a() {
        return new wxd(new RxThreadFactory("RxComputationScheduler-"));
    }

    public static wug b() {
        return new wxc(new RxThreadFactory("RxIoScheduler-"));
    }

    public static wug c() {
        return new wxf(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static wzw d() {
        return a;
    }
}

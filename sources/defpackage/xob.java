package defpackage;

import rx.internal.util.RxThreadFactory;

/* renamed from: xob reason: default package */
public class xob {
    private static final xob a = new xob();

    public static xil a() {
        return new xli(new RxThreadFactory("RxComputationScheduler-"));
    }

    @Deprecated
    public static xir a(xir xir) {
        return xir;
    }

    public static xil b() {
        return new xlh(new RxThreadFactory("RxIoScheduler-"));
    }

    public static xil c() {
        return new xlk(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static xob d() {
        return a;
    }
}

package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: fhw reason: default package */
final /* synthetic */ class fhw implements ThreadFactory {
    static final ThreadFactory a = new fhw();

    private fhw() {
    }

    public final Thread newThread(Runnable runnable) {
        return fhv.a(runnable);
    }
}

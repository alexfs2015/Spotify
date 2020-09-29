package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: fhc reason: default package */
final /* synthetic */ class fhc implements ThreadFactory {
    static final ThreadFactory a = new fhc();

    private fhc() {
    }

    public final Thread newThread(Runnable runnable) {
        return fhb.a(runnable);
    }
}

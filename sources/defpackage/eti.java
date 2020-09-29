package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eti reason: default package */
final class eti implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ etc e;

    eti(etc etc, AtomicReference atomicReference, String str, String str2, String str3) {
        this.e = etc;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void run() {
        this.e.r.i().a(this.a, this.b, this.c, this.d);
    }
}

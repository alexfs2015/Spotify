package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eua reason: default package */
final class eua implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ ett f;

    eua(ett ett, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f = ett;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final void run() {
        this.f.r.i().a(this.a, this.b, this.c, this.d, this.e);
    }
}

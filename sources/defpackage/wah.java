package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: wah reason: default package */
final class wah extends vys {
    wah(vym vym) {
        super(vym);
    }

    /* access modifiers changed from: protected */
    public final long c(vym vym, int i) {
        return PlatformDependent.d(vym.L() + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final int b(vym vym, int i) {
        return PlatformDependent.c(vym.L() + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final short a(vym vym, int i) {
        return PlatformDependent.b(vym.L() + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final void a(vym vym, int i, short s) {
        PlatformDependent.a(vym.L() + ((long) i), s);
    }

    /* access modifiers changed from: protected */
    public final void a(vym vym, int i, int i2) {
        PlatformDependent.a(vym.L() + ((long) i), i2);
    }

    /* access modifiers changed from: protected */
    public final void a(vym vym, int i, long j) {
        PlatformDependent.a(vym.L() + ((long) i), j);
    }
}

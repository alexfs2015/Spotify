package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: wai reason: default package */
final class wai extends vys {
    wai(vym vym) {
        super(vym);
    }

    /* access modifiers changed from: protected */
    public final long c(vym vym, int i) {
        return PlatformDependent.d(vym.H(), vym.C() + i);
    }

    /* access modifiers changed from: protected */
    public final int b(vym vym, int i) {
        return PlatformDependent.c(vym.H(), vym.C() + i);
    }

    /* access modifiers changed from: protected */
    public final short a(vym vym, int i) {
        return PlatformDependent.b(vym.H(), vym.C() + i);
    }

    /* access modifiers changed from: protected */
    public final void a(vym vym, int i, short s) {
        PlatformDependent.a(vym.H(), vym.C() + i, s);
    }

    /* access modifiers changed from: protected */
    public final void a(vym vym, int i, int i2) {
        PlatformDependent.a(vym.H(), vym.C() + i, i2);
    }

    /* access modifiers changed from: protected */
    public final void a(vym vym, int i, long j) {
        PlatformDependent.a(vym.H(), vym.C() + i, j);
    }
}

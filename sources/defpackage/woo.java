package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: woo reason: default package */
final class woo extends wmy {
    woo(wms wms) {
        super(wms);
    }

    /* access modifiers changed from: protected */
    public final short a(wms wms, int i) {
        return PlatformDependent.b(wms.H(), wms.C() + i);
    }

    /* access modifiers changed from: protected */
    public final void a(wms wms, int i, int i2) {
        PlatformDependent.a(wms.H(), wms.C() + i, i2);
    }

    /* access modifiers changed from: protected */
    public final void a(wms wms, int i, long j) {
        PlatformDependent.a(wms.H(), wms.C() + i, j);
    }

    /* access modifiers changed from: protected */
    public final void a(wms wms, int i, short s) {
        PlatformDependent.a(wms.H(), wms.C() + i, s);
    }

    /* access modifiers changed from: protected */
    public final int b(wms wms, int i) {
        return PlatformDependent.c(wms.H(), wms.C() + i);
    }

    /* access modifiers changed from: protected */
    public final long c(wms wms, int i) {
        return PlatformDependent.d(wms.H(), wms.C() + i);
    }
}

package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: vzx reason: default package */
public final class vzx extends vyn {
    public static final vzx b = new vzx(PlatformDependent.g());
    private final boolean c;

    public final boolean b() {
        return false;
    }

    private vzx(boolean z) {
        this(z, false);
    }

    private vzx(boolean z, boolean z2) {
        super(z);
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public final vyv b(int i, int i2) {
        return PlatformDependent.e() ? new wad(this, i, i2) : new waa((vyw) this, i, i2);
    }

    /* access modifiers changed from: protected */
    public final vyv c(int i, int i2) {
        vyv a = PlatformDependent.e() ? wag.a((vyw) this, i, i2) : new vzy((vyw) this, i, i2);
        return this.c ? a : a(a);
    }

    public final vzb f(int i) {
        vzb vzb = new vzb(this, false, i);
        return this.c ? vzb : a(vzb);
    }

    public final vzb g(int i) {
        vzb vzb = new vzb(this, true, i);
        return this.c ? vzb : a(vzb);
    }
}

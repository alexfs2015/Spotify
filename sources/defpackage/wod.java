package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: wod reason: default package */
public final class wod extends wmt {
    public static final wod b = new wod(PlatformDependent.g());
    private final boolean c;

    private wod(boolean z) {
        this(z, false);
    }

    private wod(boolean z, boolean z2) {
        super(z);
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public final wnb b(int i, int i2) {
        return PlatformDependent.e() ? new woj(this, i, i2) : new wog((wnc) this, i, i2);
    }

    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final wnb c(int i, int i2) {
        wnb a = PlatformDependent.e() ? wom.a((wnc) this, i, i2) : new woe((wnc) this, i, i2);
        return this.c ? a : a(a);
    }

    public final wnh f(int i) {
        wnh wnh = new wnh(this, false, i);
        return this.c ? wnh : a(wnh);
    }

    public final wnh g(int i) {
        wnh wnh = new wnh(this, true, i);
        return this.c ? wnh : a(wnh);
    }
}

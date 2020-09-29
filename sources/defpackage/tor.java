package defpackage;

/* renamed from: tor reason: default package */
public final class tor {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public tor(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean a() {
        return (this.d || this.c) && this.a && this.b;
    }
}

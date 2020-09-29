package defpackage;

@cfp
/* renamed from: cuv reason: default package */
public final class cuv {
    public final int a;
    public final int b;
    private final int c;

    cuv(int i, int i2, int i3) {
        this.c = i;
        this.b = i2;
        this.a = i3;
    }

    public static cuv a() {
        return new cuv(0, 0, 0);
    }

    public static cuv a(int i, int i2) {
        return new cuv(1, i, i2);
    }

    public static cuv a(dpt dpt) {
        return dpt.d ? new cuv(3, 0, 0) : dpt.i ? new cuv(2, 0, 0) : dpt.h ? a() : a(dpt.f, dpt.c);
    }

    public final boolean b() {
        return this.c == 2;
    }

    public final boolean c() {
        return this.c == 3;
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final boolean e() {
        return this.c == 4;
    }
}

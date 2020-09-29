package defpackage;

@cey
/* renamed from: cue reason: default package */
public final class cue {
    public final int a;
    public final int b;
    private final int c;

    cue(int i, int i2, int i3) {
        this.c = i;
        this.b = i2;
        this.a = i3;
    }

    public static cue a() {
        return new cue(0, 0, 0);
    }

    public static cue a(int i, int i2) {
        return new cue(1, i, i2);
    }

    public static cue a(dpc dpc) {
        return dpc.d ? new cue(3, 0, 0) : dpc.i ? new cue(2, 0, 0) : dpc.h ? a() : a(dpc.f, dpc.c);
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

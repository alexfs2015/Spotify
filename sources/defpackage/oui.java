package defpackage;

/* renamed from: oui reason: default package */
final class oui implements fxn {
    private final fxn b;
    private String c;
    private float d;
    private float e;
    private boolean f;

    public oui(fxn fxn) {
        this.b = fxn;
    }

    public final void a(String str) {
        this.b.a(str);
        this.c = str;
    }

    public final void a(float f2) {
        this.b.a(f2);
        this.d = f2;
    }

    public final void b(float f2) {
        this.b.b(f2);
        this.e = f2;
    }

    public final void a(boolean z) {
        this.b.a(z);
        this.f = z;
    }
}

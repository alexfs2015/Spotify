package defpackage;

/* renamed from: nr reason: default package */
public final class nr {
    public static final nr a;
    public static final nr b;
    public static final nr c;
    public static final nr d;
    public static final nr e;
    public static final nr f;
    final float[] g = new float[3];
    final float[] h = new float[3];
    final float[] i = new float[3];
    boolean j = true;

    static {
        nr nrVar = new nr();
        a = nrVar;
        c(nrVar);
        d(a);
        nr nrVar2 = new nr();
        b = nrVar2;
        b(nrVar2);
        d(b);
        nr nrVar3 = new nr();
        c = nrVar3;
        a(nrVar3);
        d(c);
        nr nrVar4 = new nr();
        d = nrVar4;
        c(nrVar4);
        e(d);
        nr nrVar5 = new nr();
        e = nrVar5;
        b(nrVar5);
        e(e);
        nr nrVar6 = new nr();
        f = nrVar6;
        a(nrVar6);
        e(f);
    }

    nr() {
        a(this.g);
        a(this.h);
        float[] fArr = this.i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void a(nr nrVar) {
        float[] fArr = nrVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void b(nr nrVar) {
        float[] fArr = nrVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void c(nr nrVar) {
        float[] fArr = nrVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void d(nr nrVar) {
        float[] fArr = nrVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void e(nr nrVar) {
        float[] fArr = nrVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }
}

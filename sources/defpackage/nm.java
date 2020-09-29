package defpackage;

/* renamed from: nm reason: default package */
public final class nm {
    public static final nm a;
    public static final nm b;
    public static final nm c;
    public static final nm d;
    public static final nm e;
    public static final nm f;
    final float[] g = new float[3];
    final float[] h = new float[3];
    final float[] i = new float[3];
    boolean j = true;

    static {
        nm nmVar = new nm();
        a = nmVar;
        c(nmVar);
        d(a);
        nm nmVar2 = new nm();
        b = nmVar2;
        b(nmVar2);
        d(b);
        nm nmVar3 = new nm();
        c = nmVar3;
        a(nmVar3);
        d(c);
        nm nmVar4 = new nm();
        d = nmVar4;
        c(nmVar4);
        e(d);
        nm nmVar5 = new nm();
        e = nmVar5;
        b(nmVar5);
        e(e);
        nm nmVar6 = new nm();
        f = nmVar6;
        a(nmVar6);
        e(f);
    }

    nm() {
        a(this.g);
        a(this.h);
        float[] fArr = this.i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void a(nm nmVar) {
        float[] fArr = nmVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void b(nm nmVar) {
        float[] fArr = nmVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void c(nm nmVar) {
        float[] fArr = nmVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void d(nm nmVar) {
        float[] fArr = nmVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void e(nm nmVar) {
        float[] fArr = nmVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }
}

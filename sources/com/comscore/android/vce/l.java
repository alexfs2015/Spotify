package com.comscore.android.vce;

import android.app.Activity;
import android.view.View;

class l {
    static final String a = "Geometry";
    final p b;
    final k c;
    final float d;
    float e = 1.0f;
    float f = 1.0f;
    float g = 1.0f;
    float h = 1.0f;

    l(p pVar, k kVar, float f2) {
        this.b = pVar;
        this.c = kVar;
        this.d = f2;
    }

    /* access modifiers changed from: 0000 */
    public ae a(ae aeVar) {
        return new ae(aeVar.d(), aeVar.c(), (int) (((float) aeVar.a()) * this.e), (int) (((float) aeVar.b()) * this.f));
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, float f3) {
        if (((double) f2) >= 0.1d && ((double) f3) >= 0.1d) {
            float f4 = this.d;
            this.g = f2 / f4;
            this.h = f3 / f4;
        }
    }

    /* access modifiers changed from: 0000 */
    public float[] a(Activity activity, View view) {
        float[] a2 = this.c.a(activity, view);
        this.e = a2[0];
        this.f = a2[1];
        return new float[]{this.e * this.g, this.f * this.h};
    }

    /* access modifiers changed from: 0000 */
    public float[] a(Activity activity, ae aeVar, boolean z, ae aeVar2, ae aeVar3, int i, int i2, int i3, int i4) {
        ae aeVar4 = aeVar;
        ae aeVar5 = aeVar2;
        int i5 = i;
        int i6 = i3;
        float[] fArr = new float[4];
        float f2 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = aeVar5 != null ? 0.0f : -1.0f;
        if (this.c.a(activity) != null && !z) {
            float a2 = (float) (aeVar.a() * aeVar.b());
            if (a2 == 0.0f) {
                return fArr;
            }
            ae aeVar6 = new ae(0, i5, aeVar3.a(), (aeVar3.b() - i2) - i5);
            ae aeVar7 = new ae(0, i6, aeVar3.a(), (aeVar3.b() - i6) - i4);
            ae a3 = aeVar3.a(aeVar4);
            fArr[0] = a3 != null ? ((float) (a3.a() * a3.b())) / a2 : 0.0f;
            ae a4 = aeVar6.a(aeVar4);
            fArr[1] = a4 != null ? ((float) (a4.a() * a4.b())) / a2 : 0.0f;
            ae a5 = aeVar7.a(aeVar4);
            fArr[2] = a5 != null ? ((float) (a5.a() * a5.b())) / a2 : 0.0f;
            if (aeVar5 != null) {
                ae a6 = aeVar5.a(aeVar4);
                if (a6 != null) {
                    f2 = ((float) (a6.a() * a6.b())) / a2;
                }
                fArr[3] = f2;
            }
        }
        return fArr;
    }

    /* access modifiers changed from: 0000 */
    public int[] a(ae aeVar, ae aeVar2) {
        return new int[]{aeVar.c(), aeVar2.b() - aeVar.f()};
    }

    /* access modifiers changed from: 0000 */
    public int[][] a(ae aeVar, int i) {
        int i2 = i;
        int a2 = aeVar.a();
        int b2 = aeVar.b();
        int[] iArr = {0, 0};
        float f2 = (float) a2;
        iArr[0] = aeVar.d() + Math.round(f2 / 2.0f);
        float f3 = (float) b2;
        iArr[1] = aeVar.c() + Math.round(f3 / 2.0f);
        if (i2 == 50 || i2 <= 0 || i2 > 100) {
            return new int[][]{iArr};
        }
        int[] iArr2 = {0, 0};
        int[] iArr3 = {0, 0};
        int[] iArr4 = {0, 0};
        int[] iArr5 = {0, 0};
        float f4 = 1.0f - (((float) i2) / 100.0f);
        float f5 = f2 * f4;
        float f6 = f4 * f3;
        double d2 = (double) f5;
        iArr2[0] = aeVar.d() + ((int) Math.ceil(d2));
        double d3 = (double) f6;
        iArr2[1] = aeVar.c() + ((int) Math.ceil(d3));
        iArr3[0] = aeVar.e() - ((int) Math.floor(d2));
        iArr3[1] = aeVar.c() + ((int) Math.ceil(d3));
        iArr4[0] = aeVar.d() + ((int) Math.ceil(d2));
        iArr4[1] = aeVar.f() - ((int) Math.floor(d3));
        iArr5[0] = aeVar.e() - ((int) Math.floor(d2));
        iArr5[1] = aeVar.f() - ((int) Math.floor(d3));
        return new int[][]{iArr2, iArr3, iArr, iArr4, iArr5};
    }

    /* access modifiers changed from: 0000 */
    public ae b(ae aeVar) {
        return new ae((int) (((float) aeVar.d()) / this.d), (int) (((float) aeVar.c()) / this.d), (int) ((((float) aeVar.a()) * this.e) / this.d), (int) ((((float) aeVar.b()) * this.f) / this.d));
    }

    /* access modifiers changed from: 0000 */
    public boolean b(Activity activity, View view) {
        return this.c.a(activity, view)[0] != this.e;
    }

    /* access modifiers changed from: 0000 */
    public boolean b(ae aeVar, ae aeVar2) {
        return aeVar.d() > aeVar2.a() || aeVar.c() > aeVar2.b() || aeVar.d() + aeVar.a() < 0 || aeVar.c() + aeVar.b() < 0;
    }
}

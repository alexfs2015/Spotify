package com.comscore.android.vce;

class ae {
    private int a;
    private int b;
    private int c;
    private int d;
    private float e;

    ae() {
        this.d = 0;
        this.c = 0;
        this.a = 0;
        this.b = 0;
        this.e = 1.0f;
    }

    ae(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, 1.0f);
    }

    ae(int i, int i2, int i3, int i4, float f) {
        this.b = i;
        this.a = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public ae a(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int i6 = this.a;
        int e2 = e();
        int f = f();
        ae aeVar = new ae(i5, i6, this.c, this.d);
        if (i5 >= i3 || i >= e2 || i6 >= i4 || i2 >= f) {
            return null;
        }
        if (i5 < i) {
            aeVar.b = i;
        }
        if (i6 < i2) {
            aeVar.a = i2;
        }
        int i7 = aeVar.b;
        if (e2 > i3) {
            aeVar.c = i3 - i7;
        } else {
            aeVar.c = e2 - i7;
        }
        int i8 = aeVar.a;
        if (f > i4) {
            aeVar.d = i4 - i8;
        } else {
            aeVar.d = f - i8;
        }
        return aeVar;
    }

    /* access modifiers changed from: 0000 */
    public ae a(ae aeVar) {
        return a(aeVar.d(), aeVar.c(), aeVar.e(), aeVar.f());
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        return this.b + this.c;
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        return this.a + this.d;
    }

    /* access modifiers changed from: 0000 */
    public float g() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VisRect size:");
        sb.append(this.c);
        String str = "x";
        sb.append(str);
        sb.append(this.d);
        sb.append(" offset:");
        sb.append(this.b);
        sb.append(str);
        sb.append(this.a);
        return sb.toString();
    }
}

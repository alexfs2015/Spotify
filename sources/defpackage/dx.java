package defpackage;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.SolverVariable.Type;
import java.util.Arrays;

/* renamed from: dx reason: default package */
public final class dx {
    int a = 0;
    final dy b;
    final dz c;
    int[] d;
    int[] e;
    float[] f;
    int g;
    private int h = 8;
    private SolverVariable i = null;
    private int j;
    private boolean k;

    dx(dy dyVar, dz dzVar) {
        int i2 = this.h;
        this.d = new int[i2];
        this.e = new int[i2];
        this.f = new float[i2];
        this.g = -1;
        this.j = -1;
        this.k = false;
        this.b = dyVar;
        this.c = dzVar;
    }

    static boolean a(SolverVariable solverVariable) {
        return solverVariable.g <= 1;
    }

    public final float a(SolverVariable solverVariable, boolean z) {
        if (solverVariable == null) {
            this.i = null;
        }
        int i2 = this.g;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.d[i2] == solverVariable.a) {
                if (i2 == this.g) {
                    this.g = this.e[i2];
                } else {
                    int[] iArr = this.e;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    solverVariable.b(this.b);
                }
                solverVariable.g--;
                this.a--;
                this.d[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.f[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.e[i2];
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final SolverVariable a(int i2) {
        int i3 = this.g;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.c[this.d[i3]];
            }
            i3 = this.e[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final SolverVariable a(boolean[] zArr, SolverVariable solverVariable) {
        int i2 = this.g;
        int i3 = 0;
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] < 0.0f) {
                SolverVariable solverVariable3 = this.c.c[this.d[i2]];
                if ((zArr == null || !zArr[solverVariable3.a]) && solverVariable3 != solverVariable && (solverVariable3.f == Type.SLACK || solverVariable3.f == Type.ERROR)) {
                    float f3 = this.f[i2];
                    if (f3 < f2) {
                        solverVariable2 = solverVariable3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.e[i2];
            i3++;
        }
        return solverVariable2;
    }

    public final void a() {
        int i2 = this.g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            SolverVariable solverVariable = this.c.c[this.d[i2]];
            if (solverVariable != null) {
                solverVariable.b(this.b);
            }
            i2 = this.e[i2];
            i3++;
        }
        this.g = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f2) {
        int i2 = this.g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.f;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.e[i2];
            i3++;
        }
    }

    public final void a(SolverVariable solverVariable, float f2) {
        if (f2 == 0.0f) {
            a(solverVariable, true);
            return;
        }
        int i2 = this.g;
        if (i2 == -1) {
            this.g = 0;
            float[] fArr = this.f;
            int i3 = this.g;
            fArr[i3] = f2;
            this.d[i3] = solverVariable.a;
            this.e[this.g] = -1;
            solverVariable.g++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
                int i4 = this.j;
                int[] iArr = this.d;
                if (i4 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                }
            }
            return;
        }
        int i5 = 0;
        int i6 = -1;
        while (i2 != -1 && i5 < this.a) {
            if (this.d[i2] == solverVariable.a) {
                this.f[i2] = f2;
                return;
            }
            if (this.d[i2] < solverVariable.a) {
                i6 = i2;
            }
            i2 = this.e[i2];
            i5++;
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr2 = this.d;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.d;
        if (i7 >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.d;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.d;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            this.h <<= 1;
            this.k = false;
            this.j = i7 - 1;
            this.f = Arrays.copyOf(this.f, this.h);
            this.d = Arrays.copyOf(this.d, this.h);
            this.e = Arrays.copyOf(this.e, this.h);
        }
        this.d[i7] = solverVariable.a;
        this.f[i7] = f2;
        if (i6 != -1) {
            int[] iArr6 = this.e;
            iArr6[i7] = iArr6[i6];
            iArr6[i6] = i7;
        } else {
            this.e[i7] = this.g;
            this.g = i7;
        }
        solverVariable.g++;
        solverVariable.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.d.length) {
            this.k = true;
        }
        int i10 = this.j;
        int[] iArr7 = this.d;
        if (i10 >= iArr7.length) {
            this.k = true;
            this.j = iArr7.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(SolverVariable solverVariable, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.g;
            if (i2 == -1) {
                this.g = 0;
                float[] fArr = this.f;
                int i3 = this.g;
                fArr[i3] = f2;
                this.d[i3] = solverVariable.a;
                this.e[this.g] = -1;
                solverVariable.g++;
                solverVariable.a(this.b);
                this.a++;
                if (!this.k) {
                    this.j++;
                    int i4 = this.j;
                    int[] iArr = this.d;
                    if (i4 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                    }
                }
                return;
            }
            int i5 = 0;
            int i6 = -1;
            while (i2 != -1 && i5 < this.a) {
                if (this.d[i2] == solverVariable.a) {
                    float[] fArr2 = this.f;
                    fArr2[i2] = fArr2[i2] + f2;
                    if (fArr2[i2] == 0.0f) {
                        if (i2 == this.g) {
                            this.g = this.e[i2];
                        } else {
                            int[] iArr2 = this.e;
                            iArr2[i6] = iArr2[i2];
                        }
                        if (z) {
                            solverVariable.b(this.b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        solverVariable.g--;
                        this.a--;
                    }
                    return;
                }
                if (this.d[i2] < solverVariable.a) {
                    i6 = i2;
                }
                i2 = this.e[i2];
                i5++;
            }
            int i7 = this.j;
            int i8 = i7 + 1;
            if (this.k) {
                int[] iArr3 = this.d;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.d;
            if (i7 >= iArr4.length && this.a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.d;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.d;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                this.h <<= 1;
                this.k = false;
                this.j = i7 - 1;
                this.f = Arrays.copyOf(this.f, this.h);
                this.d = Arrays.copyOf(this.d, this.h);
                this.e = Arrays.copyOf(this.e, this.h);
            }
            this.d[i7] = solverVariable.a;
            this.f[i7] = f2;
            if (i6 != -1) {
                int[] iArr7 = this.e;
                iArr7[i7] = iArr7[i6];
                iArr7[i6] = i7;
            } else {
                this.e[i7] = this.g;
                this.g = i7;
            }
            solverVariable.g++;
            solverVariable.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i10 = this.j;
            int[] iArr8 = this.d;
            if (i10 >= iArr8.length) {
                this.k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    public final void a(dy dyVar, dy dyVar2, boolean z) {
        int i2 = this.g;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                if (this.d[i2] == dyVar2.a.a) {
                    float f2 = this.f[i2];
                    a(dyVar2.a, false);
                    dx dxVar = dyVar2.d;
                    int i4 = dxVar.g;
                    int i5 = 0;
                    while (i4 != -1 && i5 < dxVar.a) {
                        a(this.c.c[dxVar.d[i4]], dxVar.f[i4] * f2, false);
                        i4 = dxVar.e[i4];
                        i5++;
                    }
                    dyVar.b += dyVar2.b * f2;
                    i2 = this.g;
                } else {
                    i2 = this.e[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(dy dyVar, dy[] dyVarArr) {
        int i2 = this.g;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                SolverVariable solverVariable = this.c.c[this.d[i2]];
                if (solverVariable.b != -1) {
                    float f2 = this.f[i2];
                    a(solverVariable, true);
                    dy dyVar2 = dyVarArr[solverVariable.b];
                    if (!dyVar2.e) {
                        dx dxVar = dyVar2.d;
                        int i4 = dxVar.g;
                        int i5 = 0;
                        while (i4 != -1 && i5 < dxVar.a) {
                            a(this.c.c[dxVar.d[i4]], dxVar.f[i4] * f2, true);
                            i4 = dxVar.e[i4];
                            i5++;
                        }
                    }
                    dyVar.b += dyVar2.b * f2;
                    dyVar2.a.b(dyVar);
                    i2 = this.g;
                } else {
                    i2 = this.e[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    public final float b(int i2) {
        int i3 = this.g;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f[i3];
            }
            i3 = this.e[i3];
            i4++;
        }
        return 0.0f;
    }

    public final float b(SolverVariable solverVariable) {
        int i2 = this.g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.d[i2] == solverVariable.a) {
                return this.f[i2];
            }
            i2 = this.e[i2];
            i3++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.g;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f[i2]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.c.c[this.d[i2]]);
            str = sb5.toString();
            i2 = this.e[i2];
            i3++;
        }
        return str;
    }
}

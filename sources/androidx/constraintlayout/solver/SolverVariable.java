package androidx.constraintlayout.solver;

import java.util.Arrays;

public final class SolverVariable {
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public float d;
    public float[] e = new float[7];
    public Type f;
    public int g = 0;
    private String h;
    private dy[] i = new dy[8];
    private int j = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f = type;
    }

    public final void a(dy dyVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.j;
            if (i2 >= i3) {
                dy[] dyVarArr = this.i;
                if (i3 >= dyVarArr.length) {
                    this.i = (dy[]) Arrays.copyOf(dyVarArr, dyVarArr.length << 1);
                }
                dy[] dyVarArr2 = this.i;
                int i4 = this.j;
                dyVarArr2[i4] = dyVar;
                this.j = i4 + 1;
                return;
            } else if (this.i[i2] != dyVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(dy dyVar) {
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.i[i3] == dyVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    dy[] dyVarArr = this.i;
                    int i5 = i3 + i4;
                    dyVarArr[i5] = dyVarArr[i5 + 1];
                }
                this.j--;
                return;
            }
        }
    }

    public final void c(dy dyVar) {
        int i2 = this.j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.i[i3].d.a(this.i[i3], dyVar, false);
        }
        this.j = 0;
    }

    public final void a() {
        this.h = null;
        this.f = Type.UNKNOWN;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.j = 0;
        this.g = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(null);
        return sb.toString();
    }
}

package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;
import java.util.ArrayList;

public class ConstraintWidget {
    private static float am = 0.5f;
    public ConstraintAnchor[] A = {this.u, this.w, this.v, this.x, this.y, this.z};
    protected ArrayList<ConstraintAnchor> B = new ArrayList<>();
    public DimensionBehaviour[] C = {DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
    public ConstraintWidget D = null;
    protected int E = 0;
    public int F = 0;
    public float G = 0.0f;
    public int H = -1;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    protected int N;
    protected int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public Object T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    private int a = -1;
    public int aa;
    public float[] ab;
    public ConstraintWidget[] ac;
    public ConstraintWidget[] ad;
    private ConstraintAnchor ae = new ConstraintAnchor(this, Type.CENTER_X);
    private ConstraintAnchor af = new ConstraintAnchor(this, Type.CENTER_Y);
    private int ag = 0;
    private int ah = 0;
    private int ai = 0;
    private int aj = 0;
    private int ak = 0;
    private int al = 0;
    private int an;
    private String ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private ConstraintWidget at;
    private ConstraintWidget au;
    private float b = 1.0f;
    public int c = -1;
    public int d = -1;
    protected ep e;
    protected ep f;
    public int g = 0;
    public int h = 0;
    public int[] i = new int[2];
    public int j = 0;
    public int k = 0;
    public float l = 1.0f;
    public int m = 0;
    public int n = 0;
    public float o = 1.0f;
    public boolean p;
    public boolean q;
    public ej r = null;
    public int[] s = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float t = 0.0f;
    public ConstraintAnchor u = new ConstraintAnchor(this, Type.LEFT);
    public ConstraintAnchor v = new ConstraintAnchor(this, Type.TOP);
    public ConstraintAnchor w = new ConstraintAnchor(this, Type.RIGHT);
    public ConstraintAnchor x = new ConstraintAnchor(this, Type.BOTTOM);
    public ConstraintAnchor y = new ConstraintAnchor(this, Type.BASELINE);
    public ConstraintAnchor z = new ConstraintAnchor(this, Type.CENTER);

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b = new int[DimensionBehaviour.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x0048 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0052 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0066 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0087 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0093 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009f }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.<clinit>():void");
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public void c() {
    }

    public final boolean d() {
        return this.g == 0 && this.G == 0.0f && this.j == 0 && this.k == 0 && this.C[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public final boolean e() {
        return this.h == 0 && this.G == 0.0f && this.m == 0 && this.n == 0 && this.C[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void f() {
        this.u.c();
        this.v.c();
        this.w.c();
        this.x.c();
        this.y.c();
        this.ae.c();
        this.af.c();
        this.z.c();
        this.D = null;
        this.t = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.ag = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f2 = am;
        this.R = f2;
        this.S = f2;
        this.C[0] = DimensionBehaviour.FIXED;
        this.C[1] = DimensionBehaviour.FIXED;
        this.T = null;
        this.an = 0;
        this.U = 0;
        this.ao = null;
        this.ap = false;
        this.aq = false;
        this.Z = 0;
        this.aa = 0;
        this.ar = false;
        this.as = false;
        float[] fArr = this.ab;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.c = -1;
        this.d = -1;
        int[] iArr = this.s;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.g = 0;
        this.h = 0;
        this.l = 1.0f;
        this.o = 1.0f;
        this.k = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.j = 0;
        this.m = 0;
        this.a = -1;
        this.b = 1.0f;
        ep epVar = this.e;
        if (epVar != null) {
            epVar.b();
        }
        ep epVar2 = this.f;
        if (epVar2 != null) {
            epVar2.b();
        }
        this.r = null;
        this.W = false;
        this.X = false;
        this.Y = false;
    }

    public void b() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.A[i2].a.b();
        }
    }

    public final void g() {
        for (int i2 = 0; i2 < 6; i2++) {
            eo eoVar = this.A[i2].a;
            ConstraintAnchor constraintAnchor = eoVar.a.d;
            if (constraintAnchor != null) {
                if (constraintAnchor.d == eoVar.a) {
                    eoVar.e = 4;
                    constraintAnchor.a.e = 4;
                }
                int b2 = eoVar.a.b();
                if (eoVar.a.c == Type.RIGHT || eoVar.a.c == Type.BOTTOM) {
                    b2 = -b2;
                }
                eoVar.a(constraintAnchor.a, b2);
            }
        }
    }

    public void a(int i2) {
        em.a(i2, this);
    }

    public final boolean h() {
        if (this.u.a.g == 1 && this.w.a.g == 1 && this.v.a.g == 1 && this.x.a.g == 1) {
            return true;
        }
        return false;
    }

    public final ep i() {
        if (this.e == null) {
            this.e = new ep();
        }
        return this.e;
    }

    public final ep j() {
        if (this.f == null) {
            this.f = new ep();
        }
        return this.f;
    }

    public ConstraintWidget() {
        float f2 = am;
        this.R = f2;
        this.S = f2;
        this.an = 0;
        this.U = 0;
        this.V = null;
        this.ao = null;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = 0;
        this.aa = 0;
        this.ab = new float[]{-1.0f, -1.0f};
        this.ac = new ConstraintWidget[]{null, null};
        this.ad = new ConstraintWidget[]{null, null};
        this.at = null;
        this.au = null;
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.w);
        this.B.add(this.x);
        this.B.add(this.ae);
        this.B.add(this.af);
        this.B.add(this.z);
        this.B.add(this.y);
    }

    public void a(dz dzVar) {
        this.u.a();
        this.v.a();
        this.w.a();
        this.x.a();
        this.y.a();
        this.z.a();
        this.ae.a();
        this.af.a();
    }

    public final void b(eb ebVar) {
        ebVar.a((Object) this.u);
        ebVar.a((Object) this.v);
        ebVar.a((Object) this.w);
        ebVar.a((Object) this.x);
        if (this.M > 0) {
            ebVar.a((Object) this.y);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.V != null) {
            StringBuilder sb2 = new StringBuilder("id: ");
            sb2.append(this.V);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        String str2 = " x ";
        sb.append(str2);
        sb.append(this.F);
        sb.append(") wrap: (");
        sb.append(this.P);
        sb.append(str2);
        sb.append(this.Q);
        sb.append(")");
        return sb.toString();
    }

    public final int k() {
        return this.I;
    }

    public final int l() {
        return this.J;
    }

    public final int m() {
        if (this.U == 8) {
            return 0;
        }
        return this.E;
    }

    public final int n() {
        if (this.U == 8) {
            return 0;
        }
        return this.F;
    }

    public final int b(int i2) {
        if (i2 == 0) {
            return m();
        }
        if (i2 == 1) {
            return n();
        }
        return 0;
    }

    public final int o() {
        return this.ag + this.ak;
    }

    public final int p() {
        return this.ah + this.al;
    }

    /* access modifiers changed from: protected */
    public final int q() {
        return this.I + this.ak;
    }

    /* access modifiers changed from: protected */
    public final int r() {
        return this.J + this.al;
    }

    public final boolean u() {
        return this.M > 0;
    }

    public ArrayList<ConstraintAnchor> v() {
        return this.B;
    }

    public final void c(int i2) {
        this.I = i2;
    }

    public final void d(int i2) {
        this.J = i2;
    }

    public final void a(int i2, int i3) {
        this.I = i2;
        this.J = i3;
    }

    public void b(int i2, int i3) {
        this.ak = i2;
        this.al = i3;
    }

    public void w() {
        int i2 = this.I;
        int i3 = this.J;
        int i4 = this.E + i2;
        int i5 = this.F + i3;
        this.ag = i2;
        this.ah = i3;
        this.ai = i4 - i2;
        this.aj = i5 - i3;
    }

    public final void e(int i2) {
        this.E = i2;
        int i3 = this.E;
        int i4 = this.N;
        if (i3 < i4) {
            this.E = i4;
        }
    }

    public final void f(int i2) {
        this.F = i2;
        int i3 = this.F;
        int i4 = this.O;
        if (i3 < i4) {
            this.F = i4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.G = r9
            r8.H = r1
        L_0x008d:
            return
        L_0x008e:
            r8.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.a(java.lang.String):void");
    }

    public final void g(int i2) {
        if (i2 < 0) {
            this.N = 0;
        } else {
            this.N = i2;
        }
    }

    public final void h(int i2) {
        if (i2 < 0) {
            this.O = 0;
        } else {
            this.O = i2;
        }
    }

    public final void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            c(i2, i3);
        } else if (i4 == 1) {
            d(i2, i3);
        }
        this.X = true;
    }

    public final void c(int i2, int i3) {
        this.I = i2;
        this.E = i3 - i2;
        int i4 = this.E;
        int i5 = this.N;
        if (i4 < i5) {
            this.E = i5;
        }
    }

    public final void d(int i2, int i3) {
        this.J = i2;
        this.F = i3 - i2;
        int i4 = this.F;
        int i5 = this.O;
        if (i4 < i5) {
            this.F = i5;
        }
    }

    public final void e(int i2, int i3) {
        if (i3 == 0) {
            this.K = i2;
            return;
        }
        if (i3 == 1) {
            this.L = i2;
        }
    }

    public boolean a() {
        return this.U != 8;
    }

    public final void a(Type type, ConstraintWidget constraintWidget, Type type2, int i2, int i3) {
        a(type).a(constraintWidget.a(type2), i2, i3, Strength.STRONG, 0, true);
    }

    public final void x() {
        int size = this.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintAnchor) this.B.get(i2)).c();
        }
    }

    public ConstraintAnchor a(Type type) {
        switch (type) {
            case LEFT:
                return this.u;
            case TOP:
                return this.v;
            case RIGHT:
                return this.w;
            case BOTTOM:
                return this.x;
            case BASELINE:
                return this.y;
            case CENTER:
                return this.z;
            case CENTER_X:
                return this.ae;
            case CENTER_Y:
                return this.af;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour y() {
        return this.C[0];
    }

    public final DimensionBehaviour z() {
        return this.C[1];
    }

    public final void a(DimensionBehaviour dimensionBehaviour) {
        this.C[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            e(this.P);
        }
    }

    public final void b(DimensionBehaviour dimensionBehaviour) {
        this.C[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            f(this.Q);
        }
    }

    private boolean j(int i2) {
        int i3 = i2 << 1;
        if (this.A[i3].d != null) {
            ConstraintAnchor constraintAnchor = this.A[i3].d.d;
            ConstraintAnchor[] constraintAnchorArr = this.A;
            if (constraintAnchor != constraintAnchorArr[i3]) {
                int i4 = i3 + 1;
                if (constraintAnchorArr[i4].d != null && this.A[i4].d.d == this.A[i4]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:181:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x035e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.eb r39) {
        /*
            r38 = this;
            r15 = r38
            r14 = r39
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.u
            androidx.constraintlayout.solver.SolverVariable r21 = r14.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.w
            androidx.constraintlayout.solver.SolverVariable r10 = r14.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.v
            androidx.constraintlayout.solver.SolverVariable r6 = r14.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.x
            androidx.constraintlayout.solver.SolverVariable r4 = r14.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.y
            androidx.constraintlayout.solver.SolverVariable r3 = r14.a(r0)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.D
            r1 = 8
            r2 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00ef
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.C
            r0 = r0[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r5) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r15.D
            if (r5 == 0) goto L_0x0045
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r5.C
            r5 = r5[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r7) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            boolean r7 = r15.j(r13)
            if (r7 == 0) goto L_0x0055
            androidx.constraintlayout.solver.widgets.ConstraintWidget r7 = r15.D
            ei r7 = (defpackage.ei) r7
            r7.a(r15, r13)
        L_0x0053:
            r7 = 1
            goto L_0x0077
        L_0x0055:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.u
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.d
            if (r7 == 0) goto L_0x0065
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.u
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.u
            if (r7 == r8) goto L_0x0053
        L_0x0065:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.w
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.d
            if (r7 == 0) goto L_0x0076
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.w
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r7.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.w
            if (r7 != r8) goto L_0x0076
            goto L_0x0053
        L_0x0076:
            r7 = 0
        L_0x0077:
            boolean r8 = r15.j(r2)
            if (r8 == 0) goto L_0x0086
            androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r15.D
            ei r8 = (defpackage.ei) r8
            r8.a(r15, r2)
        L_0x0084:
            r8 = 1
            goto L_0x00a8
        L_0x0086:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.v
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            if (r8 == 0) goto L_0x0096
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.v
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.v
            if (r8 == r9) goto L_0x0084
        L_0x0096:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.x
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            if (r8 == 0) goto L_0x00a7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.x
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r8.d
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.x
            if (r8 != r9) goto L_0x00a7
            goto L_0x0084
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00c5
            int r9 = r15.U
            if (r9 == r1) goto L_0x00c5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.u
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 != 0) goto L_0x00c5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.w
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 != 0) goto L_0x00c5
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r15.D
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.w
            androidx.constraintlayout.solver.SolverVariable r9 = r14.a(r9)
            r14.a(r9, r10, r13, r2)
        L_0x00c5:
            if (r5 == 0) goto L_0x00e6
            int r9 = r15.U
            if (r9 == r1) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.v
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 != 0) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.x
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 != 0) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r15.y
            if (r9 != 0) goto L_0x00e6
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = r15.D
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.x
            androidx.constraintlayout.solver.SolverVariable r9 = r14.a(r9)
            r14.a(r9, r4, r13, r2)
        L_0x00e6:
            r16 = r0
            r22 = r5
            r20 = r7
            r23 = r8
            goto L_0x00f7
        L_0x00ef:
            r16 = 0
            r20 = 0
            r22 = 0
            r23 = 0
        L_0x00f7:
            int r0 = r15.E
            int r5 = r15.N
            if (r0 >= r5) goto L_0x00fe
            r0 = r5
        L_0x00fe:
            int r5 = r15.F
            int r7 = r15.O
            if (r5 >= r7) goto L_0x0105
            r5 = r7
        L_0x0105:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r15.C
            r7 = r7[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 == r8) goto L_0x010f
            r7 = 1
            goto L_0x0110
        L_0x010f:
            r7 = 0
        L_0x0110:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.C
            r8 = r8[r2]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x011a
            r8 = 1
            goto L_0x011b
        L_0x011a:
            r8 = 0
        L_0x011b:
            int r9 = r15.H
            r15.a = r9
            float r9 = r15.G
            r15.b = r9
            int r11 = r15.g
            int r12 = r15.h
            r17 = 0
            r18 = 4
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x02ae
            int r9 = r15.U
            if (r9 == r1) goto L_0x02ae
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r1 = r1[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 3
            if (r1 != r9) goto L_0x013f
            if (r11 != 0) goto L_0x013f
            r11 = 3
        L_0x013f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r9 = 1
            r1 = r1[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r9) goto L_0x014b
            if (r12 != 0) goto L_0x014b
            r12 = 3
        L_0x014b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r1 = r1[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r9) goto L_0x024c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r9 = 1
            r1 = r1[r9]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r9) goto L_0x024c
            if (r11 != r2) goto L_0x024c
            if (r12 != r2) goto L_0x024c
            int r1 = r15.a
            r2 = -1
            if (r1 != r2) goto L_0x017f
            if (r7 == 0) goto L_0x016e
            if (r8 != 0) goto L_0x016e
            r15.a = r13
            goto L_0x017f
        L_0x016e:
            if (r7 != 0) goto L_0x017f
            if (r8 == 0) goto L_0x017f
            r1 = 1
            r15.a = r1
            int r1 = r15.H
            if (r1 != r2) goto L_0x017f
            float r1 = r15.b
            float r1 = r17 / r1
            r15.b = r1
        L_0x017f:
            int r1 = r15.a
            if (r1 != 0) goto L_0x0197
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.v
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0193
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.x
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x0197
        L_0x0193:
            r1 = 1
            r15.a = r1
            goto L_0x01ae
        L_0x0197:
            r1 = 1
            int r2 = r15.a
            if (r2 != r1) goto L_0x01ae
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.u
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01ac
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.w
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x01ae
        L_0x01ac:
            r15.a = r13
        L_0x01ae:
            int r1 = r15.a
            r2 = -1
            if (r1 != r2) goto L_0x01ff
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.v
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.x
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.u
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01d3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.w
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x01ff
        L_0x01d3:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.v
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01e6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.x
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01e6
            r15.a = r13
            goto L_0x01ff
        L_0x01e6:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.u
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01ff
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r15.w
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x01ff
            float r1 = r15.b
            float r1 = r17 / r1
            r15.b = r1
            r1 = 1
            r15.a = r1
        L_0x01ff:
            int r1 = r15.a
            r2 = -1
            if (r1 != r2) goto L_0x0218
            if (r16 == 0) goto L_0x020b
            if (r22 != 0) goto L_0x020b
            r15.a = r13
            goto L_0x0218
        L_0x020b:
            if (r16 != 0) goto L_0x0218
            if (r22 == 0) goto L_0x0218
            float r1 = r15.b
            float r1 = r17 / r1
            r15.b = r1
            r1 = 1
            r15.a = r1
        L_0x0218:
            int r1 = r15.a
            r2 = -1
            if (r1 != r2) goto L_0x0239
            int r1 = r15.j
            if (r1 <= 0) goto L_0x0228
            int r1 = r15.m
            if (r1 != 0) goto L_0x0228
            r15.a = r13
            goto L_0x0239
        L_0x0228:
            int r1 = r15.j
            if (r1 != 0) goto L_0x0239
            int r1 = r15.m
            if (r1 <= 0) goto L_0x0239
            float r1 = r15.b
            float r1 = r17 / r1
            r15.b = r1
            r1 = 1
            r15.a = r1
        L_0x0239:
            int r1 = r15.a
            r2 = -1
            if (r1 != r2) goto L_0x02a3
            if (r16 == 0) goto L_0x02a3
            if (r22 == 0) goto L_0x02a3
            float r1 = r15.b
            float r1 = r17 / r1
            r15.b = r1
            r1 = 1
            r15.a = r1
            goto L_0x02a3
        L_0x024c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r1 = r1[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x0272
            if (r11 != r2) goto L_0x0272
            r15.a = r13
            float r0 = r15.b
            int r1 = r15.F
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r7 = 1
            r1 = r1[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 == r2) goto L_0x02a3
            r29 = r0
            r30 = r5
            r27 = r12
            r26 = 4
            goto L_0x02b6
        L_0x0272:
            r7 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r15.C
            r1 = r1[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r8) goto L_0x02a3
            if (r12 != r2) goto L_0x02a3
            r15.a = r7
            int r1 = r15.H
            r2 = -1
            if (r1 != r2) goto L_0x028a
            float r1 = r15.b
            float r1 = r17 / r1
            r15.b = r1
        L_0x028a:
            float r1 = r15.b
            int r2 = r15.E
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.C
            r2 = r2[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r29 = r0
            r30 = r1
            r26 = r11
            if (r2 == r5) goto L_0x02a9
            r27 = 4
            goto L_0x02b6
        L_0x02a3:
            r29 = r0
            r30 = r5
            r26 = r11
        L_0x02a9:
            r27 = r12
            r28 = 1
            goto L_0x02b8
        L_0x02ae:
            r29 = r0
            r30 = r5
            r26 = r11
            r27 = r12
        L_0x02b6:
            r28 = 0
        L_0x02b8:
            int[] r0 = r15.i
            r0[r13] = r26
            r1 = 1
            r0[r1] = r27
            if (r28 == 0) goto L_0x02cb
            int r0 = r15.a
            r2 = -1
            if (r0 == 0) goto L_0x02c8
            if (r0 != r2) goto L_0x02cc
        L_0x02c8:
            r25 = 1
            goto L_0x02ce
        L_0x02cb:
            r2 = -1
        L_0x02cc:
            r25 = 0
        L_0x02ce:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.C
            r0 = r0[r13]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r1) goto L_0x02dd
            boolean r0 = r15 instanceof defpackage.ei
            if (r0 == 0) goto L_0x02dd
            r31 = 1
            goto L_0x02df
        L_0x02dd:
            r31 = 0
        L_0x02df:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.z
            boolean r0 = r0.d()
            r24 = 1
            r32 = r0 ^ 1
            int r0 = r15.c
            r1 = 2
            r33 = 0
            if (r0 == r1) goto L_0x034f
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.D
            if (r0 == 0) goto L_0x02fd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.w
            androidx.constraintlayout.solver.SolverVariable r0 = r14.a(r0)
            r34 = r0
            goto L_0x02ff
        L_0x02fd:
            r34 = r33
        L_0x02ff:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.D
            if (r0 == 0) goto L_0x030c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.u
            androidx.constraintlayout.solver.SolverVariable r0 = r14.a(r0)
            r35 = r0
            goto L_0x030e
        L_0x030c:
            r35 = r33
        L_0x030e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.C
            r5 = r0[r13]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.u
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.w
            int r9 = r15.I
            int r11 = r15.N
            int[] r0 = r15.s
            r12 = r0[r13]
            float r0 = r15.R
            r13 = r0
            int r0 = r15.j
            r17 = r0
            int r0 = r15.k
            r18 = r0
            float r0 = r15.l
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r16
            r36 = r3
            r3 = r35
            r24 = r4
            r4 = r34
            r37 = r6
            r6 = r31
            r31 = r10
            r10 = r29
            r14 = r25
            r15 = r20
            r16 = r26
            r20 = r32
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0357
        L_0x034f:
            r36 = r3
            r24 = r4
            r37 = r6
            r31 = r10
        L_0x0357:
            r15 = r38
            int r0 = r15.d
            r1 = 2
            if (r0 != r1) goto L_0x035f
            return
        L_0x035f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.C
            r14 = 1
            r0 = r0[r14]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r1) goto L_0x036e
            boolean r0 = r15 instanceof defpackage.ei
            if (r0 == 0) goto L_0x036e
            r6 = 1
            goto L_0x036f
        L_0x036e:
            r6 = 0
        L_0x036f:
            if (r28 == 0) goto L_0x037b
            int r0 = r15.a
            if (r0 == r14) goto L_0x0378
            r1 = -1
            if (r0 != r1) goto L_0x037b
        L_0x0378:
            r16 = 1
            goto L_0x037d
        L_0x037b:
            r16 = 0
        L_0x037d:
            int r0 = r15.M
            if (r0 <= 0) goto L_0x03b4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.y
            eo r0 = r0.a
            int r0 = r0.g
            if (r0 != r14) goto L_0x0393
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.y
            eo r0 = r0.a
            r10 = r39
            r0.a(r10)
            goto L_0x03b6
        L_0x0393:
            r10 = r39
            int r0 = r15.M
            r1 = 6
            r2 = r36
            r4 = r37
            r10.c(r2, r4, r0, r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.y
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            if (r0 == 0) goto L_0x03b8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r15.y
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            androidx.constraintlayout.solver.SolverVariable r0 = r10.a(r0)
            r3 = 0
            r10.c(r2, r0, r3, r1)
            r20 = 0
            goto L_0x03ba
        L_0x03b4:
            r10 = r39
        L_0x03b6:
            r4 = r37
        L_0x03b8:
            r20 = r32
        L_0x03ba:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.D
            if (r0 == 0) goto L_0x03c7
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.x
            androidx.constraintlayout.solver.SolverVariable r0 = r10.a(r0)
            r25 = r0
            goto L_0x03c9
        L_0x03c7:
            r25 = r33
        L_0x03c9:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r15.D
            if (r0 == 0) goto L_0x03d5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.v
            androidx.constraintlayout.solver.SolverVariable r0 = r10.a(r0)
            r3 = r0
            goto L_0x03d7
        L_0x03d5:
            r3 = r33
        L_0x03d7:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.C
            r5 = r0[r14]
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r15.v
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r15.x
            int r9 = r15.J
            int r11 = r15.O
            int[] r0 = r15.s
            r12 = r0[r14]
            float r13 = r15.S
            int r0 = r15.m
            r17 = r0
            int r0 = r15.n
            r18 = r0
            float r0 = r15.o
            r19 = r0
            r0 = r38
            r1 = r39
            r2 = r22
            r22 = r4
            r4 = r25
            r10 = r30
            r14 = r16
            r15 = r23
            r16 = r27
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r7 = r38
            if (r28 == 0) goto L_0x0434
            int r0 = r7.a
            r1 = 1
            if (r0 != r1) goto L_0x0424
            float r5 = r7.b
            r6 = 6
            r0 = r39
            r1 = r24
            r2 = r22
            r3 = r31
            r4 = r21
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0434
        L_0x0424:
            float r5 = r7.b
            r6 = 6
            r0 = r39
            r1 = r31
            r2 = r21
            r3 = r24
            r4 = r22
            r0.a(r1, r2, r3, r4, r5, r6)
        L_0x0434:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.z
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x04da
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r7.z
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r0 = r0.b
            float r1 = r7.t
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r7.z
            int r2 = r2.b()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.a(r3)
            r4 = r39
            androidx.constraintlayout.solver.SolverVariable r9 = r4.a(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.a(r3)
            androidx.constraintlayout.solver.SolverVariable r11 = r4.a(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r7.a(r3)
            androidx.constraintlayout.solver.SolverVariable r3 = r4.a(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r7.a(r5)
            androidx.constraintlayout.solver.SolverVariable r12 = r4.a(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r0.a(r5)
            androidx.constraintlayout.solver.SolverVariable r5 = r4.a(r5)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.a(r6)
            androidx.constraintlayout.solver.SolverVariable r13 = r4.a(r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r0.a(r6)
            androidx.constraintlayout.solver.SolverVariable r6 = r4.a(r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r0.a(r8)
            androidx.constraintlayout.solver.SolverVariable r14 = r4.a(r0)
            dy r0 = r39.c()
            double r7 = (double) r1
            double r15 = java.lang.Math.sin(r7)
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            r17 = r5
            r18 = r6
            double r5 = r15 * r1
            float r15 = (float) r5
            r10 = r0
            r10.b(r11, r12, r13, r14, r15)
            r4.a(r0)
            dy r0 = r39.c()
            double r5 = java.lang.Math.cos(r7)
            java.lang.Double.isNaN(r1)
            double r5 = r5 * r1
            float r13 = (float) r5
            r8 = r0
            r10 = r3
            r11 = r17
            r12 = r18
            r8.b(r9, r10, r11, r12, r13)
            r4.a(r0)
        L_0x04da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.a(eb):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.eb r25, boolean r26, androidx.constraintlayout.solver.SolverVariable r27, androidx.constraintlayout.solver.SolverVariable r28, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour r29, boolean r30, androidx.constraintlayout.solver.widgets.ConstraintAnchor r31, androidx.constraintlayout.solver.widgets.ConstraintAnchor r32, int r33, int r34, int r35, int r36, float r37, boolean r38, boolean r39, int r40, int r41, int r42, float r43, boolean r44) {
        /*
            r24 = this;
            r0 = r24
            r10 = r25
            r11 = r27
            r12 = r28
            r13 = r31
            r14 = r32
            r1 = r35
            r2 = r36
            androidx.constraintlayout.solver.SolverVariable r15 = r10.a(r13)
            androidx.constraintlayout.solver.SolverVariable r9 = r10.a(r14)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r13.d
            androidx.constraintlayout.solver.SolverVariable r8 = r10.a(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r14.d
            androidx.constraintlayout.solver.SolverVariable r7 = r10.a(r3)
            boolean r3 = r10.c
            r6 = 1
            r4 = 6
            r5 = 0
            if (r3 == 0) goto L_0x005a
            eo r3 = r13.a
            int r3 = r3.g
            if (r3 != r6) goto L_0x005a
            eo r3 = r14.a
            int r3 = r3.g
            if (r3 != r6) goto L_0x005a
            ec r1 = defpackage.eb.a()
            if (r1 == 0) goto L_0x0048
            ec r1 = defpackage.eb.a()
            long r2 = r1.r
            r6 = 1
            long r2 = r2 + r6
            r1.r = r2
        L_0x0048:
            eo r1 = r13.a
            r1.a(r10)
            eo r1 = r14.a
            r1.a(r10)
            if (r39 != 0) goto L_0x0059
            if (r26 == 0) goto L_0x0059
            r10.a(r12, r9, r5, r4)
        L_0x0059:
            return
        L_0x005a:
            ec r3 = defpackage.eb.a()
            if (r3 == 0) goto L_0x006c
            ec r3 = defpackage.eb.a()
            long r4 = r3.z
            r16 = 1
            long r4 = r4 + r16
            r3.z = r4
        L_0x006c:
            boolean r16 = r31.d()
            boolean r17 = r32.d()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r0.z
            boolean r20 = r3.d()
            if (r16 == 0) goto L_0x007e
            r3 = 1
            goto L_0x007f
        L_0x007e:
            r3 = 0
        L_0x007f:
            if (r17 == 0) goto L_0x0083
            int r3 = r3 + 1
        L_0x0083:
            if (r20 == 0) goto L_0x0087
            int r3 = r3 + 1
        L_0x0087:
            r5 = r3
            if (r38 == 0) goto L_0x008c
            r3 = 3
            goto L_0x008e
        L_0x008c:
            r3 = r40
        L_0x008e:
            int[] r21 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.b
            int r22 = r29.ordinal()
            r4 = r21[r22]
            r14 = 2
            r11 = 4
            if (r4 == r6) goto L_0x00a1
            if (r4 == r14) goto L_0x00a1
            r14 = 3
            if (r4 == r14) goto L_0x00a1
            if (r4 == r11) goto L_0x00a3
        L_0x00a1:
            r4 = 0
            goto L_0x00a7
        L_0x00a3:
            if (r3 != r11) goto L_0x00a6
            goto L_0x00a1
        L_0x00a6:
            r4 = 1
        L_0x00a7:
            int r14 = r0.U
            r11 = 8
            if (r14 != r11) goto L_0x00b0
            r4 = 0
            r11 = 0
            goto L_0x00b3
        L_0x00b0:
            r11 = r4
            r4 = r34
        L_0x00b3:
            if (r44 == 0) goto L_0x00ce
            if (r16 != 0) goto L_0x00c1
            if (r17 != 0) goto L_0x00c1
            if (r20 != 0) goto L_0x00c1
            r14 = r33
            r10.a(r15, r14)
            goto L_0x00ce
        L_0x00c1:
            if (r16 == 0) goto L_0x00ce
            if (r17 != 0) goto L_0x00ce
            int r14 = r31.b()
            r6 = 6
            r10.c(r15, r8, r14, r6)
            goto L_0x00cf
        L_0x00ce:
            r6 = 6
        L_0x00cf:
            if (r11 != 0) goto L_0x00fb
            if (r30 == 0) goto L_0x00e8
            r6 = 0
            r14 = 3
            r10.c(r9, r15, r6, r14)
            r4 = 6
            if (r1 <= 0) goto L_0x00de
            r10.a(r9, r15, r1, r4)
        L_0x00de:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r6) goto L_0x00e6
            r10.b(r9, r15, r2, r4)
        L_0x00e6:
            r6 = 6
            goto L_0x00ec
        L_0x00e8:
            r14 = 3
            r10.c(r9, r15, r4, r6)
        L_0x00ec:
            r0 = r41
            r14 = r42
            r30 = r3
            r23 = r7
            r21 = r8
            r2 = 2
            r13 = 0
            r8 = r5
            goto L_0x01de
        L_0x00fb:
            r14 = 3
            r2 = -2
            r14 = r41
            if (r14 != r2) goto L_0x0105
            r14 = r42
            r6 = r4
            goto L_0x0108
        L_0x0105:
            r6 = r14
            r14 = r42
        L_0x0108:
            if (r14 != r2) goto L_0x010b
            r14 = r4
        L_0x010b:
            r2 = 6
            if (r6 <= 0) goto L_0x0115
            r10.a(r9, r15, r6, r2)
            int r4 = java.lang.Math.max(r4, r6)
        L_0x0115:
            if (r14 <= 0) goto L_0x011e
            r10.b(r9, r15, r14, r2)
            int r4 = java.lang.Math.min(r4, r14)
        L_0x011e:
            r2 = 1
            if (r3 != r2) goto L_0x0149
            if (r26 == 0) goto L_0x0135
            r2 = 6
            r10.c(r9, r15, r4, r2)
            r30 = r3
            r0 = r4
            r23 = r7
            r21 = r8
            r34 = r11
            r13 = 0
            r8 = r5
            r11 = r6
            goto L_0x01c2
        L_0x0135:
            r2 = 6
            if (r39 == 0) goto L_0x0140
            r34 = r11
            r11 = 4
            r10.c(r9, r15, r4, r11)
            goto L_0x01b8
        L_0x0140:
            r34 = r11
            r2 = 1
            r11 = 4
            r10.c(r9, r15, r4, r2)
            goto L_0x01b8
        L_0x0149:
            r34 = r11
            r2 = 2
            r11 = 4
            if (r3 != r2) goto L_0x01b8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = r13.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            if (r2 == r11) goto L_0x0177
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = r13.c
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            if (r2 != r11) goto L_0x015c
            goto L_0x0177
        L_0x015c:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.D
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.a(r11)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.a(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.D
            r30 = r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.a(r2)
            goto L_0x0191
        L_0x0177:
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.D
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.a(r11)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.a(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.D
            r30 = r2
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            androidx.constraintlayout.solver.SolverVariable r2 = r10.a(r2)
        L_0x0191:
            r22 = r30
            r11 = r2
            dy r2 = r25.c()
            r18 = 1
            r21 = 6
            r13 = r3
            r3 = r9
            r0 = r4
            r21 = r8
            r8 = 6
            r4 = r15
            r8 = r5
            r30 = r13
            r13 = 0
            r5 = r11
            r11 = r6
            r6 = r22
            r23 = r7
            r7 = r43
            dy r2 = r2.a(r3, r4, r5, r6, r7)
            r10.a(r2)
            r5 = 0
            goto L_0x01c4
        L_0x01b8:
            r30 = r3
            r0 = r4
            r11 = r6
            r23 = r7
            r21 = r8
            r13 = 0
            r8 = r5
        L_0x01c2:
            r5 = r34
        L_0x01c4:
            r2 = 2
            if (r5 == 0) goto L_0x01dc
            if (r8 == r2) goto L_0x01dc
            if (r38 != 0) goto L_0x01dc
            int r0 = java.lang.Math.max(r11, r0)
            if (r14 <= 0) goto L_0x01d5
            int r0 = java.lang.Math.min(r14, r0)
        L_0x01d5:
            r3 = 6
            r10.c(r9, r15, r0, r3)
            r0 = r11
            r11 = 0
            goto L_0x01de
        L_0x01dc:
            r0 = r11
            r11 = r5
        L_0x01de:
            if (r44 == 0) goto L_0x0325
            if (r39 == 0) goto L_0x01e4
            goto L_0x0325
        L_0x01e4:
            r8 = 5
            if (r16 != 0) goto L_0x01f2
            if (r17 != 0) goto L_0x01f2
            if (r20 != 0) goto L_0x01f2
            if (r26 == 0) goto L_0x031a
            r10.a(r12, r9, r13, r8)
            goto L_0x031a
        L_0x01f2:
            if (r16 == 0) goto L_0x01fd
            if (r17 != 0) goto L_0x01fd
            if (r26 == 0) goto L_0x031a
            r10.a(r12, r9, r13, r8)
            goto L_0x031a
        L_0x01fd:
            if (r16 != 0) goto L_0x0215
            if (r17 == 0) goto L_0x0215
            int r0 = r32.b()
            int r0 = -r0
            r7 = r23
            r1 = 6
            r10.c(r9, r7, r0, r1)
            if (r26 == 0) goto L_0x031a
            r6 = r27
            r10.a(r15, r6, r13, r8)
            goto L_0x031a
        L_0x0215:
            r6 = r27
            r7 = r23
            r2 = 4
            if (r16 == 0) goto L_0x031a
            if (r17 == 0) goto L_0x031a
            if (r11 == 0) goto L_0x028b
            if (r26 == 0) goto L_0x0229
            if (r1 != 0) goto L_0x0229
            r5 = 6
            r10.a(r9, r15, r13, r5)
            goto L_0x022a
        L_0x0229:
            r5 = 6
        L_0x022a:
            if (r30 != 0) goto L_0x0254
            if (r14 > 0) goto L_0x0234
            if (r0 <= 0) goto L_0x0231
            goto L_0x0234
        L_0x0231:
            r1 = 0
            r2 = 6
            goto L_0x0235
        L_0x0234:
            r1 = 1
        L_0x0235:
            int r3 = r31.b()
            r4 = r21
            r10.c(r15, r4, r3, r2)
            int r3 = r32.b()
            int r3 = -r3
            r10.c(r9, r7, r3, r2)
            if (r14 > 0) goto L_0x024d
            if (r0 <= 0) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r0 = 0
            goto L_0x024e
        L_0x024d:
            r0 = 1
        L_0x024e:
            r3 = 1
            r14 = 5
            r16 = r1
            r1 = r0
            goto L_0x025f
        L_0x0254:
            r0 = r30
            r4 = r21
            r3 = 1
            if (r0 != r3) goto L_0x0262
            r1 = 1
            r14 = 6
            r16 = 1
        L_0x025f:
            r0 = r24
            goto L_0x0295
        L_0x0262:
            r1 = 3
            if (r0 != r1) goto L_0x0287
            r0 = r24
            if (r38 != 0) goto L_0x0272
            int r1 = r0.a
            r2 = -1
            if (r1 == r2) goto L_0x0272
            if (r14 > 0) goto L_0x0272
            r1 = 6
            goto L_0x0273
        L_0x0272:
            r1 = 4
        L_0x0273:
            int r2 = r31.b()
            r10.c(r15, r4, r2, r1)
            int r2 = r32.b()
            int r2 = -r2
            r10.c(r9, r7, r2, r1)
            r1 = 1
            r14 = 5
            r16 = 1
            goto L_0x0295
        L_0x0287:
            r0 = r24
            r1 = 0
            goto L_0x0292
        L_0x028b:
            r4 = r21
            r3 = 1
            r5 = 6
            r0 = r24
            r1 = 1
        L_0x0292:
            r14 = 5
            r16 = 0
        L_0x0295:
            if (r1 == 0) goto L_0x02e0
            int r17 = r31.b()
            int r18 = r32.b()
            r1 = r25
            r2 = r15
            r19 = 1
            r3 = r4
            r20 = r4
            r4 = r17
            r17 = 6
            r5 = r37
            r13 = r6
            r6 = r7
            r0 = r7
            r7 = r9
            r12 = r20
            r13 = 6
            r17 = 5
            r8 = r18
            r13 = r9
            r9 = r14
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r31
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r1.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r2.b
            boolean r2 = r2 instanceof defpackage.ef
            r3 = r32
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r3.d
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r4.b
            boolean r4 = r4 instanceof defpackage.ef
            if (r2 == 0) goto L_0x02d8
            if (r4 != 0) goto L_0x02d8
            r19 = r26
            r2 = 1
            r4 = 5
            r17 = 6
            goto L_0x02ee
        L_0x02d8:
            if (r2 != 0) goto L_0x02e9
            if (r4 == 0) goto L_0x02e9
            r2 = r26
            r4 = 6
            goto L_0x02ee
        L_0x02e0:
            r1 = r31
            r3 = r32
            r12 = r4
            r0 = r7
            r13 = r9
            r17 = 5
        L_0x02e9:
            r2 = r26
            r19 = r2
            r4 = 5
        L_0x02ee:
            if (r16 == 0) goto L_0x02f3
            r4 = 6
            r5 = 6
            goto L_0x02f5
        L_0x02f3:
            r5 = r17
        L_0x02f5:
            if (r11 != 0) goto L_0x02f9
            if (r19 != 0) goto L_0x02fb
        L_0x02f9:
            if (r16 == 0) goto L_0x0302
        L_0x02fb:
            int r1 = r31.b()
            r10.a(r15, r12, r1, r4)
        L_0x0302:
            if (r11 != 0) goto L_0x0306
            if (r2 != 0) goto L_0x0308
        L_0x0306:
            if (r16 == 0) goto L_0x0310
        L_0x0308:
            int r1 = r32.b()
            int r1 = -r1
            r10.b(r13, r0, r1, r5)
        L_0x0310:
            if (r26 == 0) goto L_0x031b
            r0 = r27
            r1 = 6
            r2 = 0
            r10.a(r15, r0, r2, r1)
            goto L_0x031d
        L_0x031a:
            r13 = r9
        L_0x031b:
            r1 = 6
            r2 = 0
        L_0x031d:
            if (r26 == 0) goto L_0x0324
            r3 = r28
            r10.a(r3, r13, r2, r1)
        L_0x0324:
            return
        L_0x0325:
            r0 = r27
            r13 = r9
            r3 = r12
            r1 = 6
            r2 = 0
            r4 = 2
            if (r8 >= r4) goto L_0x0336
            if (r26 == 0) goto L_0x0336
            r10.a(r15, r0, r2, r1)
            r10.a(r3, r13, r2, r1)
        L_0x0336:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.a(eb, boolean, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.SolverVariable, androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.solver.widgets.ConstraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1 < r7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r2 < r0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(defpackage.eb r7) {
        /*
            r6 = this;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r6.u
            int r7 = defpackage.eb.b(r7)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r0 = r6.v
            int r0 = defpackage.eb.b(r0)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r6.w
            int r1 = defpackage.eb.b(r1)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r6.x
            int r2 = defpackage.eb.b(r2)
            int r3 = r1 - r7
            int r4 = r2 - r0
            r5 = 0
            if (r3 < 0) goto L_0x0036
            if (r4 < 0) goto L_0x0036
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r3) goto L_0x0036
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r4) goto L_0x0036
            if (r0 == r3) goto L_0x0036
            if (r0 == r4) goto L_0x0036
            if (r1 == r3) goto L_0x0036
            if (r1 == r4) goto L_0x0036
            if (r2 == r3) goto L_0x0036
            if (r2 != r4) goto L_0x003a
        L_0x0036:
            r7 = 0
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x003a:
            int r1 = r1 - r7
            int r2 = r2 - r0
            r6.I = r7
            r6.J = r0
            int r7 = r6.U
            r0 = 8
            if (r7 != r0) goto L_0x004b
            r6.E = r5
            r6.F = r5
            return
        L_0x004b:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r6.C
            r7 = r7[r5]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 != r0) goto L_0x0058
            int r7 = r6.E
            if (r1 >= r7) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r7 = r1
        L_0x0059:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.C
            r1 = 1
            r0 = r0[r1]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r3) goto L_0x0067
            int r0 = r6.F
            if (r2 >= r0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r0 = r2
        L_0x0068:
            r6.E = r7
            r6.F = r0
            int r7 = r6.F
            int r0 = r6.O
            if (r7 >= r0) goto L_0x0074
            r6.F = r0
        L_0x0074:
            int r7 = r6.E
            int r0 = r6.N
            if (r7 >= r0) goto L_0x007c
            r6.E = r0
        L_0x007c:
            r6.X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidget.c(eb):void");
    }

    public final int s() {
        return this.I + this.E;
    }

    public final int t() {
        return this.J + this.F;
    }

    public final DimensionBehaviour i(int i2) {
        if (i2 == 0) {
            return this.C[0];
        }
        if (i2 == 1) {
            return this.C[1];
        }
        return null;
    }
}

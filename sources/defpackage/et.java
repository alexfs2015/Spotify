package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.Guideline;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: et reason: default package */
public final class et {
    private static final int[] b = {0, 4, 8};
    private static SparseIntArray c;
    public HashMap<Integer, a> a = new HashMap<>();

    /* renamed from: et$a */
    public static class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public float Q;
        public float R;
        public int S;
        public int T;
        public float U;
        public boolean V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        public boolean a;
        public float aa;
        public float ab;
        public float ac;
        public float ad;
        public float ae;
        public float af;
        public float ag;
        public float ah;
        public float ai;
        public boolean aj;
        public int ak;
        public int al;
        public int[] am;
        public String an;
        private boolean ao;
        private boolean ap;
        private int aq;
        private int ar;
        private int as;
        private int at;
        private int au;
        private int av;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public float g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public float z;

        private a() {
            this.a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = 0;
            this.z = 0.0f;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = false;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 1.0f;
            this.ab = 1.0f;
            this.ac = Float.NaN;
            this.ad = Float.NaN;
            this.ae = 0.0f;
            this.af = 0.0f;
            this.ag = 0.0f;
            this.ao = false;
            this.ap = false;
            this.aq = 0;
            this.ar = 0;
            this.as = -1;
            this.at = -1;
            this.au = -1;
            this.av = -1;
            this.ah = 1.0f;
            this.ai = 1.0f;
            this.aj = false;
            this.ak = -1;
            this.al = -1;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, LayoutParams layoutParams) {
            this.d = i2;
            this.h = layoutParams.d;
            this.i = layoutParams.e;
            this.j = layoutParams.f;
            this.k = layoutParams.g;
            this.l = layoutParams.h;
            this.m = layoutParams.i;
            this.n = layoutParams.j;
            this.o = layoutParams.k;
            this.p = layoutParams.l;
            this.q = layoutParams.p;
            this.r = layoutParams.q;
            this.s = layoutParams.r;
            this.t = layoutParams.s;
            this.u = layoutParams.z;
            this.v = layoutParams.A;
            this.w = layoutParams.B;
            this.x = layoutParams.m;
            this.y = layoutParams.n;
            this.z = layoutParams.o;
            this.A = layoutParams.O;
            this.B = layoutParams.P;
            this.C = layoutParams.Q;
            this.g = layoutParams.c;
            this.e = layoutParams.a;
            this.f = layoutParams.b;
            this.b = layoutParams.width;
            this.c = layoutParams.height;
            this.D = layoutParams.leftMargin;
            this.E = layoutParams.rightMargin;
            this.F = layoutParams.topMargin;
            this.G = layoutParams.bottomMargin;
            this.Q = layoutParams.D;
            this.R = layoutParams.C;
            this.T = layoutParams.F;
            this.S = layoutParams.E;
            this.ao = layoutParams.R;
            this.ap = layoutParams.S;
            this.aq = layoutParams.G;
            this.ar = layoutParams.H;
            this.ao = layoutParams.R;
            this.as = layoutParams.K;
            this.at = layoutParams.L;
            this.au = layoutParams.I;
            this.av = layoutParams.J;
            this.ah = layoutParams.M;
            this.ai = layoutParams.N;
            if (VERSION.SDK_INT >= 17) {
                this.H = layoutParams.getMarginEnd();
                this.I = layoutParams.getMarginStart();
            }
        }

        public void a(int i2, Constraints.LayoutParams layoutParams) {
            a(i2, (LayoutParams) layoutParams);
            this.U = layoutParams.al;
            this.X = layoutParams.ao;
            this.Y = layoutParams.ap;
            this.Z = layoutParams.aq;
            this.aa = layoutParams.ar;
            this.ab = layoutParams.as;
            this.ac = layoutParams.at;
            this.ad = layoutParams.au;
            this.ae = layoutParams.av;
            this.af = layoutParams.aw;
            this.ag = 0.0f;
            this.W = layoutParams.an;
            this.V = layoutParams.am;
        }

        public final void a(LayoutParams layoutParams) {
            layoutParams.d = this.h;
            layoutParams.e = this.i;
            layoutParams.f = this.j;
            layoutParams.g = this.k;
            layoutParams.h = this.l;
            layoutParams.i = this.m;
            layoutParams.j = this.n;
            layoutParams.k = this.o;
            layoutParams.l = this.p;
            layoutParams.p = this.q;
            layoutParams.q = this.r;
            layoutParams.r = this.s;
            layoutParams.s = this.t;
            layoutParams.leftMargin = this.D;
            layoutParams.rightMargin = this.E;
            layoutParams.topMargin = this.F;
            layoutParams.bottomMargin = this.G;
            layoutParams.x = this.P;
            layoutParams.y = this.O;
            layoutParams.z = this.u;
            layoutParams.A = this.v;
            layoutParams.m = this.x;
            layoutParams.n = this.y;
            layoutParams.o = this.z;
            layoutParams.B = this.w;
            layoutParams.O = this.A;
            layoutParams.P = this.B;
            layoutParams.D = this.Q;
            layoutParams.C = this.R;
            layoutParams.F = this.T;
            layoutParams.E = this.S;
            layoutParams.R = this.ao;
            layoutParams.S = this.ap;
            layoutParams.G = this.aq;
            layoutParams.H = this.ar;
            layoutParams.K = this.as;
            layoutParams.L = this.at;
            layoutParams.I = this.au;
            layoutParams.J = this.av;
            layoutParams.M = this.ah;
            layoutParams.N = this.ai;
            layoutParams.Q = this.C;
            layoutParams.c = this.g;
            layoutParams.a = this.e;
            layoutParams.b = this.f;
            layoutParams.width = this.b;
            layoutParams.height = this.c;
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.I);
                layoutParams.setMarginEnd(this.H);
            }
            layoutParams.a();
        }

        public final /* synthetic */ Object clone() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.n = this.n;
            aVar.o = this.o;
            aVar.p = this.p;
            aVar.q = this.q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.aa = this.aa;
            aVar.ab = this.ab;
            aVar.ac = this.ac;
            aVar.ad = this.ad;
            aVar.ae = this.ae;
            aVar.af = this.af;
            aVar.ag = this.ag;
            aVar.ao = this.ao;
            aVar.ap = this.ap;
            aVar.aq = this.aq;
            aVar.ar = this.ar;
            aVar.as = this.as;
            aVar.at = this.at;
            aVar.au = this.au;
            aVar.av = this.av;
            aVar.ah = this.ah;
            aVar.ai = this.ai;
            aVar.ak = this.ak;
            aVar.al = this.al;
            int[] iArr = this.am;
            if (iArr != null) {
                aVar.am = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.z = this.z;
            aVar.aj = this.aj;
            return aVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(b.bj, 25);
        c.append(b.bk, 26);
        c.append(b.bm, 29);
        c.append(b.bn, 30);
        c.append(b.bs, 36);
        c.append(b.br, 35);
        c.append(b.aR, 4);
        c.append(b.aQ, 3);
        c.append(b.aO, 1);
        c.append(b.bA, 6);
        c.append(b.bB, 7);
        c.append(b.aY, 17);
        c.append(b.aZ, 18);
        c.append(b.ba, 19);
        c.append(b.am, 27);
        c.append(b.bo, 32);
        c.append(b.bp, 33);
        c.append(b.aX, 10);
        c.append(b.aW, 9);
        c.append(b.bE, 13);
        c.append(b.bH, 16);
        c.append(b.bF, 14);
        c.append(b.bC, 11);
        c.append(b.bG, 15);
        c.append(b.bD, 12);
        c.append(b.bv, 40);
        c.append(b.bh, 39);
        c.append(b.bg, 41);
        c.append(b.bu, 42);
        c.append(b.bf, 20);
        c.append(b.bt, 37);
        c.append(b.aV, 5);
        c.append(b.bi, 75);
        c.append(b.bq, 75);
        c.append(b.bl, 75);
        c.append(b.aP, 75);
        c.append(b.aN, 75);
        c.append(b.ar, 24);
        c.append(b.at, 28);
        c.append(b.aF, 31);
        c.append(b.aG, 8);
        c.append(b.as, 34);
        c.append(b.au, 2);
        c.append(b.ap, 23);
        c.append(b.aq, 21);
        c.append(b.ao, 22);
        c.append(b.av, 43);
        c.append(b.aI, 44);
        c.append(b.aD, 45);
        c.append(b.aE, 46);
        c.append(b.aC, 60);
        c.append(b.aA, 47);
        c.append(b.aB, 48);
        c.append(b.aw, 49);
        c.append(b.ax, 50);
        c.append(b.ay, 51);
        c.append(b.az, 52);
        c.append(b.aH, 53);
        c.append(b.bw, 54);
        c.append(b.bb, 55);
        c.append(b.bx, 56);
        c.append(b.bc, 57);
        c.append(b.by, 58);
        c.append(b.bd, 59);
        c.append(b.aS, 61);
        c.append(b.aU, 62);
        c.append(b.aT, 63);
        c.append(b.an, 38);
        c.append(b.bz, 69);
        c.append(b.be, 70);
        c.append(b.aL, 71);
        c.append(b.aK, 72);
        c.append(b.aM, 73);
        c.append(b.aJ, 74);
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static String a(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static void a(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = c.get(index);
            switch (i2) {
                case 1:
                    aVar.p = a(typedArray, index, aVar.p);
                    break;
                case 2:
                    aVar.G = typedArray.getDimensionPixelSize(index, aVar.G);
                    break;
                case 3:
                    aVar.o = a(typedArray, index, aVar.o);
                    break;
                case 4:
                    aVar.n = a(typedArray, index, aVar.n);
                    break;
                case 5:
                    aVar.w = typedArray.getString(index);
                    break;
                case 6:
                    aVar.A = typedArray.getDimensionPixelOffset(index, aVar.A);
                    break;
                case 7:
                    aVar.B = typedArray.getDimensionPixelOffset(index, aVar.B);
                    break;
                case 8:
                    aVar.H = typedArray.getDimensionPixelSize(index, aVar.H);
                    break;
                case 9:
                    aVar.t = a(typedArray, index, aVar.t);
                    break;
                case 10:
                    aVar.s = a(typedArray, index, aVar.s);
                    break;
                case 11:
                    aVar.N = typedArray.getDimensionPixelSize(index, aVar.N);
                    break;
                case 12:
                    aVar.O = typedArray.getDimensionPixelSize(index, aVar.O);
                    break;
                case 13:
                    aVar.K = typedArray.getDimensionPixelSize(index, aVar.K);
                    break;
                case 14:
                    aVar.M = typedArray.getDimensionPixelSize(index, aVar.M);
                    break;
                case 15:
                    aVar.P = typedArray.getDimensionPixelSize(index, aVar.P);
                    break;
                case 16:
                    aVar.L = typedArray.getDimensionPixelSize(index, aVar.L);
                    break;
                case 17:
                    aVar.e = typedArray.getDimensionPixelOffset(index, aVar.e);
                    break;
                case 18:
                    aVar.f = typedArray.getDimensionPixelOffset(index, aVar.f);
                    break;
                case 19:
                    aVar.g = typedArray.getFloat(index, aVar.g);
                    break;
                case 20:
                    aVar.u = typedArray.getFloat(index, aVar.u);
                    break;
                case 21:
                    aVar.c = typedArray.getLayoutDimension(index, aVar.c);
                    break;
                case 22:
                    aVar.J = typedArray.getInt(index, aVar.J);
                    aVar.J = b[aVar.J];
                    break;
                case 23:
                    aVar.b = typedArray.getLayoutDimension(index, aVar.b);
                    break;
                case 24:
                    aVar.D = typedArray.getDimensionPixelSize(index, aVar.D);
                    break;
                case 25:
                    aVar.h = a(typedArray, index, aVar.h);
                    break;
                case 26:
                    aVar.i = a(typedArray, index, aVar.i);
                    break;
                case 27:
                    aVar.C = typedArray.getInt(index, aVar.C);
                    break;
                case 28:
                    aVar.E = typedArray.getDimensionPixelSize(index, aVar.E);
                    break;
                case 29:
                    aVar.j = a(typedArray, index, aVar.j);
                    break;
                case 30:
                    aVar.k = a(typedArray, index, aVar.k);
                    break;
                case 31:
                    aVar.I = typedArray.getDimensionPixelSize(index, aVar.I);
                    break;
                case 32:
                    aVar.q = a(typedArray, index, aVar.q);
                    break;
                case 33:
                    aVar.r = a(typedArray, index, aVar.r);
                    break;
                case 34:
                    aVar.F = typedArray.getDimensionPixelSize(index, aVar.F);
                    break;
                case 35:
                    aVar.m = a(typedArray, index, aVar.m);
                    break;
                case 36:
                    aVar.l = a(typedArray, index, aVar.l);
                    break;
                case 37:
                    aVar.v = typedArray.getFloat(index, aVar.v);
                    break;
                case 38:
                    aVar.d = typedArray.getResourceId(index, aVar.d);
                    break;
                case 39:
                    aVar.R = typedArray.getFloat(index, aVar.R);
                    break;
                case 40:
                    aVar.Q = typedArray.getFloat(index, aVar.Q);
                    break;
                case 41:
                    aVar.S = typedArray.getInt(index, aVar.S);
                    break;
                case 42:
                    aVar.T = typedArray.getInt(index, aVar.T);
                    break;
                case 43:
                    aVar.U = typedArray.getFloat(index, aVar.U);
                    break;
                case 44:
                    aVar.V = true;
                    aVar.W = typedArray.getDimension(index, aVar.W);
                    break;
                case 45:
                    aVar.Y = typedArray.getFloat(index, aVar.Y);
                    break;
                case 46:
                    aVar.Z = typedArray.getFloat(index, aVar.Z);
                    break;
                case 47:
                    aVar.aa = typedArray.getFloat(index, aVar.aa);
                    break;
                case 48:
                    aVar.ab = typedArray.getFloat(index, aVar.ab);
                    break;
                case 49:
                    aVar.ac = typedArray.getFloat(index, aVar.ac);
                    break;
                case 50:
                    aVar.ad = typedArray.getFloat(index, aVar.ad);
                    break;
                case 51:
                    aVar.ae = typedArray.getDimension(index, aVar.ae);
                    break;
                case 52:
                    aVar.af = typedArray.getDimension(index, aVar.af);
                    break;
                case 53:
                    aVar.ag = typedArray.getDimension(index, aVar.ag);
                    break;
                default:
                    switch (i2) {
                        case b.bo /*60*/:
                            aVar.X = typedArray.getFloat(index, aVar.X);
                            break;
                        case b.bp /*61*/:
                            aVar.x = a(typedArray, index, aVar.x);
                            break;
                        case b.bq /*62*/:
                            aVar.y = typedArray.getDimensionPixelSize(index, aVar.y);
                            break;
                        case b.br /*63*/:
                            aVar.z = typedArray.getFloat(index, aVar.z);
                            break;
                        default:
                            String str = "   ";
                            switch (i2) {
                                case b.bx /*69*/:
                                    aVar.ah = typedArray.getFloat(index, 1.0f);
                                    break;
                                case b.by /*70*/:
                                    aVar.ai = typedArray.getFloat(index, 1.0f);
                                    break;
                                case b.bz /*71*/:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case b.bA /*72*/:
                                    aVar.ak = typedArray.getInt(index, aVar.ak);
                                    break;
                                case b.bB /*73*/:
                                    aVar.an = typedArray.getString(index);
                                    break;
                                case b.bC /*74*/:
                                    aVar.aj = typedArray.getBoolean(index, aVar.aj);
                                    break;
                                case b.bD /*75*/:
                                    StringBuilder sb = new StringBuilder("unused attribute 0x");
                                    sb.append(Integer.toHexString(index));
                                    sb.append(str);
                                    sb.append(c.get(index));
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                                    sb2.append(Integer.toHexString(index));
                                    sb2.append(str);
                                    sb2.append(c.get(index));
                                    break;
                            }
                    }
            }
        }
    }

    private static int[] a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = defpackage.eu.a.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a2 = ((ConstraintLayout) view.getParent()).a(0, (Object) trim);
                if (a2 != null && (a2 instanceof Integer)) {
                    i = ((Integer) a2).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final void a(int i, int i2) {
        if (this.a.containsKey(Integer.valueOf(i))) {
            a aVar = (a) this.a.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    aVar.i = -1;
                    aVar.h = -1;
                    aVar.D = -1;
                    aVar.K = -1;
                    break;
                case 2:
                    aVar.k = -1;
                    aVar.j = -1;
                    aVar.E = -1;
                    aVar.M = -1;
                    return;
                case 3:
                    aVar.m = -1;
                    aVar.l = -1;
                    aVar.F = -1;
                    aVar.L = -1;
                    return;
                case 4:
                    aVar.n = -1;
                    aVar.o = -1;
                    aVar.G = -1;
                    aVar.N = -1;
                    return;
                case 5:
                    aVar.p = -1;
                    return;
                case 6:
                    aVar.q = -1;
                    aVar.r = -1;
                    aVar.I = -1;
                    aVar.P = -1;
                    return;
                case 7:
                    aVar.s = -1;
                    aVar.t = -1;
                    aVar.H = -1;
                    aVar.O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (!this.a.containsKey(Integer.valueOf(i))) {
            this.a.put(Integer.valueOf(i), new a(0));
        }
        a aVar = (a) this.a.get(Integer.valueOf(i));
        String str = "right to ";
        String str2 = " undefined";
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.h = i3;
                    aVar.i = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.i = i3;
                    aVar.h = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("left to ");
                    sb.append(a(i4));
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    aVar.j = i3;
                    aVar.k = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.k = i3;
                    aVar.j = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append(a(i4));
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    aVar.l = i3;
                    aVar.m = -1;
                    aVar.p = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.m = i3;
                    aVar.l = -1;
                    aVar.p = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder(str);
                    sb3.append(a(i4));
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i4 == 4) {
                    aVar.o = i3;
                    aVar.n = -1;
                    aVar.p = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.n = i3;
                    aVar.o = -1;
                    aVar.p = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder(str);
                    sb4.append(a(i4));
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i4 == 5) {
                    aVar.p = i3;
                    aVar.o = -1;
                    aVar.n = -1;
                    aVar.l = -1;
                    aVar.m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder(str);
                sb5.append(a(i4));
                sb5.append(str2);
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    aVar.r = i3;
                    aVar.q = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.q = i3;
                    aVar.r = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder(str);
                    sb6.append(a(i4));
                    sb6.append(str2);
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    aVar.t = i3;
                    aVar.s = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.s = i3;
                    aVar.t = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder(str);
                    sb7.append(a(i4));
                    sb7.append(str2);
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(a(i2));
                sb8.append(" to ");
                sb8.append(a(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    public final void a(int i, String str) {
        if (!this.a.containsKey(Integer.valueOf(i))) {
            this.a.put(Integer.valueOf(i), new a(0));
        }
        ((a) this.a.get(Integer.valueOf(i))).w = str;
    }

    public final void a(Context context, int i) {
        a((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.a.containsKey(Integer.valueOf(id))) {
                    this.a.put(Integer.valueOf(id), new a(0));
                }
                a aVar = (a) this.a.get(Integer.valueOf(id));
                aVar.a(id, layoutParams);
                aVar.J = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    aVar.U = childAt.getAlpha();
                    aVar.X = childAt.getRotation();
                    aVar.Y = childAt.getRotationX();
                    aVar.Z = childAt.getRotationY();
                    aVar.aa = childAt.getScaleX();
                    aVar.ab = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        aVar.ac = pivotX;
                        aVar.ad = pivotY;
                    }
                    aVar.ae = childAt.getTranslationX();
                    aVar.af = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        aVar.ag = childAt.getTranslationZ();
                        if (aVar.V) {
                            aVar.W = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.aj = barrier.a();
                    aVar.am = barrier.b();
                    aVar.ak = barrier.a;
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.a = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = (a) this.a.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.al = 1;
                    }
                    if (aVar.al != -1 && aVar.al == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.a(aVar.ak);
                        barrier.a(aVar.aj);
                        if (aVar.am != null) {
                            barrier.a(aVar.am);
                        } else if (aVar.an != null) {
                            aVar.am = a((View) barrier, aVar.an);
                            barrier.a(aVar.am);
                        }
                    }
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    aVar.a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(aVar.J);
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.U);
                        childAt.setRotation(aVar.X);
                        childAt.setRotationX(aVar.Y);
                        childAt.setRotationY(aVar.Z);
                        childAt.setScaleX(aVar.aa);
                        childAt.setScaleY(aVar.ab);
                        if (!Float.isNaN(aVar.ac)) {
                            childAt.setPivotX(aVar.ac);
                        }
                        if (!Float.isNaN(aVar.ad)) {
                            childAt.setPivotY(aVar.ad);
                        }
                        childAt.setTranslationX(aVar.ae);
                        childAt.setTranslationY(aVar.af);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.ag);
                            if (aVar.V) {
                                childAt.setElevation(aVar.W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.a.get(num);
            if (aVar2.al != -1 && aVar2.al == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (aVar2.am != null) {
                    barrier2.a(aVar2.am);
                } else if (aVar2.an != null) {
                    aVar2.am = a((View) barrier2, aVar2.an);
                    barrier2.a(aVar2.am);
                }
                barrier2.a(aVar2.ak);
                LayoutParams a2 = ConstraintLayout.a();
                barrier2.c();
                aVar2.a(a2);
                constraintLayout.addView(barrier2, a2);
            }
            if (aVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                LayoutParams a3 = ConstraintLayout.a();
                aVar2.a(a3);
                constraintLayout.addView(guideline, a3);
            }
        }
    }
}

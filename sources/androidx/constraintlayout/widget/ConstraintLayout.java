package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    public et a = null;
    private SparseArray<View> b = new SparseArray<>();
    private ArrayList<ConstraintHelper> c = new ArrayList<>(4);
    private final ArrayList<ConstraintWidget> d = new ArrayList<>(100);
    private ei e = new ei();
    private int f = 0;
    private int g = 0;
    private int h = Integer.MAX_VALUE;
    private int i = Integer.MAX_VALUE;
    private boolean j = true;
    private int k = 7;
    private int l = -1;
    private HashMap<String, Integer> m = new HashMap<>();
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;
    private int r = 0;
    private int s = 0;

    public static class LayoutParams extends MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public float C = -1.0f;
        public float D = -1.0f;
        public int E = 0;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public float M = 1.0f;
        public float N = 1.0f;
        public int O = -1;
        public int P = -1;
        public int Q = -1;
        public boolean R = false;
        public boolean S = false;
        boolean T = true;
        boolean U = true;
        boolean V = false;
        boolean W = false;
        boolean X = false;
        boolean Y = false;
        int Z = -1;
        public int a = -1;
        int aa = -1;
        int ab = -1;
        int ac = -1;
        int ad = -1;
        int ae = -1;
        float af = 0.5f;
        int ag;
        int ah;
        float ai;
        ConstraintWidget aj = new ConstraintWidget();
        public boolean ak = false;
        private float al = 0.0f;
        private int am = 1;
        public int b = -1;
        public float c = -1.0f;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public int g = -1;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(b.I, 8);
                a.append(b.J, 9);
                a.append(b.L, 10);
                a.append(b.M, 11);
                a.append(b.R, 12);
                a.append(b.Q, 13);
                a.append(b.q, 14);
                a.append(b.p, 15);
                a.append(b.n, 16);
                a.append(b.r, 2);
                a.append(b.t, 3);
                a.append(b.s, 4);
                a.append(b.Z, 49);
                a.append(b.aa, 50);
                a.append(b.x, 5);
                a.append(b.y, 6);
                a.append(b.z, 7);
                a.append(b.b, 1);
                a.append(b.N, 17);
                a.append(b.O, 18);
                a.append(b.w, 19);
                a.append(b.v, 20);
                a.append(b.ad, 21);
                a.append(b.ag, 22);
                a.append(b.ae, 23);
                a.append(b.ab, 24);
                a.append(b.af, 25);
                a.append(b.ac, 26);
                a.append(b.E, 29);
                a.append(b.S, 30);
                a.append(b.u, 44);
                a.append(b.G, 45);
                a.append(b.U, 46);
                a.append(b.F, 47);
                a.append(b.T, 48);
                a.append(b.l, 27);
                a.append(b.k, 28);
                a.append(b.V, 31);
                a.append(b.A, 32);
                a.append(b.X, 33);
                a.append(b.W, 34);
                a.append(b.Y, 35);
                a.append(b.C, 36);
                a.append(b.B, 37);
                a.append(b.D, 38);
                a.append(b.H, 39);
                a.append(b.P, 40);
                a.append(b.K, 41);
                a.append(b.o, 42);
                a.append(b.m, 43);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            int i2;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = a.a.get(index);
                String str = "ConstraintLayout";
                switch (i4) {
                    case 0:
                        break;
                    case 1:
                        this.Q = obtainStyledAttributes.getInt(index, this.Q);
                        break;
                    case 2:
                        this.m = obtainStyledAttributes.getResourceId(index, this.m);
                        if (this.m != -1) {
                            break;
                        } else {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        this.o = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        float f2 = this.o;
                        if (f2 >= 0.0f) {
                            break;
                        } else {
                            this.o = (360.0f - f2) % 360.0f;
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        this.d = obtainStyledAttributes.getResourceId(index, this.d);
                        if (this.d != -1) {
                            break;
                        } else {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.e = obtainStyledAttributes.getResourceId(index, this.e);
                        if (this.e != -1) {
                            break;
                        } else {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f = obtainStyledAttributes.getResourceId(index, this.f);
                        if (this.f != -1) {
                            break;
                        } else {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.g = obtainStyledAttributes.getResourceId(index, this.g);
                        if (this.g != -1) {
                            break;
                        } else {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.h = obtainStyledAttributes.getResourceId(index, this.h);
                        if (this.h != -1) {
                            break;
                        } else {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.i = obtainStyledAttributes.getResourceId(index, this.i);
                        if (this.i != -1) {
                            break;
                        } else {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.j = obtainStyledAttributes.getResourceId(index, this.j);
                        if (this.j != -1) {
                            break;
                        } else {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.k = obtainStyledAttributes.getResourceId(index, this.k);
                        if (this.k != -1) {
                            break;
                        } else {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.l = obtainStyledAttributes.getResourceId(index, this.l);
                        if (this.l != -1) {
                            break;
                        } else {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.p = obtainStyledAttributes.getResourceId(index, this.p);
                        if (this.p != -1) {
                            break;
                        } else {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.q = obtainStyledAttributes.getResourceId(index, this.q);
                        if (this.q != -1) {
                            break;
                        } else {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.r = obtainStyledAttributes.getResourceId(index, this.r);
                        if (this.r != -1) {
                            break;
                        } else {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.s = obtainStyledAttributes.getResourceId(index, this.s);
                        if (this.s != -1) {
                            break;
                        } else {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.R = obtainStyledAttributes.getBoolean(index, this.R);
                        break;
                    case 28:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.G = obtainStyledAttributes.getInt(index, 0);
                        if (this.G != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.H = obtainStyledAttributes.getInt(index, 0);
                        if (this.H != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.I) != -2) {
                                break;
                            } else {
                                this.I = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.K) != -2) {
                                break;
                            } else {
                                this.K = -2;
                                break;
                            }
                        }
                    case 35:
                        this.M = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.M));
                        break;
                    case 36:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.J) != -2) {
                                break;
                            } else {
                                this.J = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.L) != -2) {
                                break;
                            } else {
                                this.L = -2;
                                break;
                            }
                        }
                    case 38:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                this.B = obtainStyledAttributes.getString(index);
                                this.al = Float.NaN;
                                this.am = -1;
                                String str2 = this.B;
                                if (str2 == null) {
                                    break;
                                } else {
                                    int length = str2.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.am = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.am = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.am != 1) {
                                                        this.al = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.al = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.al = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                break;
                            case 46:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 47:
                                this.E = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.O = obtainStyledAttributes.getDimensionPixelOffset(index, this.O);
                                break;
                            case 50:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.W = false;
            this.T = true;
            this.U = true;
            if (this.width == -2 && this.R) {
                this.T = false;
                this.G = 1;
            }
            if (this.height == -2 && this.S) {
                this.U = false;
                this.H = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.T = false;
                if (this.width == 0 && this.G == 1) {
                    this.width = -2;
                    this.R = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.U = false;
                if (this.height == 0 && this.H == 1) {
                    this.height = -2;
                    this.S = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.W = true;
                this.T = true;
                this.U = true;
                if (!(this.aj instanceof ek)) {
                    this.aj = new ek();
                }
                ((ek) this.aj).j(this.Q);
            }
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.ab = r7
                r6.ac = r7
                r6.Z = r7
                r6.aa = r7
                r6.ad = r7
                r6.ae = r7
                int r2 = r6.t
                r6.ad = r2
                int r2 = r6.v
                r6.ae = r2
                float r2 = r6.z
                r6.af = r2
                int r2 = r6.a
                r6.ag = r2
                int r2 = r6.b
                r6.ah = r2
                float r2 = r6.c
                r6.ai = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x009a
                int r2 = r6.p
                if (r2 == r7) goto L_0x0041
                r6.ab = r2
            L_0x003f:
                r3 = 1
                goto L_0x0048
            L_0x0041:
                int r2 = r6.q
                if (r2 == r7) goto L_0x0048
                r6.ac = r2
                goto L_0x003f
            L_0x0048:
                int r2 = r6.r
                if (r2 == r7) goto L_0x004f
                r6.aa = r2
                r3 = 1
            L_0x004f:
                int r2 = r6.s
                if (r2 == r7) goto L_0x0056
                r6.Z = r2
                r3 = 1
            L_0x0056:
                int r2 = r6.x
                if (r2 == r7) goto L_0x005c
                r6.ae = r2
            L_0x005c:
                int r2 = r6.y
                if (r2 == r7) goto L_0x0062
                r6.ad = r2
            L_0x0062:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x006c
                float r3 = r6.z
                float r3 = r2 - r3
                r6.af = r3
            L_0x006c:
                boolean r3 = r6.W
                if (r3 == 0) goto L_0x00be
                int r3 = r6.Q
                if (r3 != r4) goto L_0x00be
                float r3 = r6.c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0084
                float r2 = r2 - r3
                r6.ai = r2
                r6.ag = r7
                r6.ah = r7
                goto L_0x00be
            L_0x0084:
                int r2 = r6.a
                if (r2 == r7) goto L_0x008f
                r6.ah = r2
                r6.ag = r7
                r6.ai = r4
                goto L_0x00be
            L_0x008f:
                int r2 = r6.b
                if (r2 == r7) goto L_0x00be
                r6.ag = r2
                r6.ah = r7
                r6.ai = r4
                goto L_0x00be
            L_0x009a:
                int r2 = r6.p
                if (r2 == r7) goto L_0x00a0
                r6.aa = r2
            L_0x00a0:
                int r2 = r6.q
                if (r2 == r7) goto L_0x00a6
                r6.Z = r2
            L_0x00a6:
                int r2 = r6.r
                if (r2 == r7) goto L_0x00ac
                r6.ab = r2
            L_0x00ac:
                int r2 = r6.s
                if (r2 == r7) goto L_0x00b2
                r6.ac = r2
            L_0x00b2:
                int r2 = r6.x
                if (r2 == r7) goto L_0x00b8
                r6.ad = r2
            L_0x00b8:
                int r2 = r6.y
                if (r2 == r7) goto L_0x00be
                r6.ae = r2
            L_0x00be:
                int r2 = r6.r
                if (r2 != r7) goto L_0x0108
                int r2 = r6.s
                if (r2 != r7) goto L_0x0108
                int r2 = r6.q
                if (r2 != r7) goto L_0x0108
                int r2 = r6.p
                if (r2 != r7) goto L_0x0108
                int r2 = r6.f
                if (r2 == r7) goto L_0x00dd
                r6.ab = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
                goto L_0x00eb
            L_0x00dd:
                int r2 = r6.g
                if (r2 == r7) goto L_0x00eb
                r6.ac = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r6.rightMargin = r1
            L_0x00eb:
                int r1 = r6.d
                if (r1 == r7) goto L_0x00fa
                r6.Z = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
                return
            L_0x00fa:
                int r1 = r6.e
                if (r1 == r7) goto L_0x0108
                r6.aa = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r6.leftMargin = r0
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    private void a(int i2, Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final Object a(int i2, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.m;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.m.get(str);
            }
        }
        return null;
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public void setId(int i2) {
        this.b.remove(getId());
        super.setId(i2);
        this.b.put(getId(), this);
    }

    private void a(AttributeSet attributeSet) {
        this.e.T = this;
        this.b.put(getId(), this);
        this.a = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == b.e) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == b.f) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == b.c) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == b.d) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == b.ah) {
                    this.k = obtainStyledAttributes.getInt(index, this.k);
                } else if (index == b.i) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.a = new et();
                        et etVar = this.a;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    a aVar = new a(0);
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, b.al);
                                    et.a(aVar, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        aVar.a = true;
                                    }
                                    etVar.a.put(Integer.valueOf(aVar.d), aVar);
                                }
                            }
                        } catch (XmlPullParserException e2) {
                            e2.printStackTrace();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    } catch (NotFoundException unused) {
                        this.a = null;
                    }
                    this.l = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.e.an = this.k;
    }

    public void addView(View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget a2 = a(view);
        if ((view instanceof Guideline) && !(a2 instanceof ek)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.aj = new ek();
            layoutParams.W = true;
            ((ek) layoutParams.aj).j(layoutParams.Q);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.c();
            ((LayoutParams) view.getLayoutParams()).X = true;
            if (!this.c.contains(constraintHelper)) {
                this.c.add(constraintHelper);
            }
        }
        this.b.put(view.getId(), view);
        this.j = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.b.remove(view.getId());
        ConstraintWidget a2 = a(view);
        this.e.b(a2);
        this.c.remove(view);
        this.d.remove(a2);
        this.j = true;
    }

    private final ConstraintWidget b(int i2) {
        if (i2 == 0) {
            return this.e;
        }
        View view = (View) this.b.get(i2);
        if (view == null) {
            view = findViewById(i2);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.e;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).aj;
    }

    public final ConstraintWidget a(View view) {
        if (view == this) {
            return this.e;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).aj;
    }

    private void a(int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.aj;
                if (!layoutParams.W && !layoutParams.X) {
                    constraintWidget.U = childAt.getVisibility();
                    int i9 = layoutParams.width;
                    int i10 = layoutParams.height;
                    if (layoutParams.T || layoutParams.U || (!layoutParams.T && layoutParams.G == 1) || layoutParams.width == -1 || (!layoutParams.U && (layoutParams.H == 1 || layoutParams.height == -1))) {
                        if (i9 == 0) {
                            i4 = getChildMeasureSpec(i6, paddingLeft, -2);
                            z2 = true;
                        } else if (i9 == -1) {
                            i4 = getChildMeasureSpec(i6, paddingLeft, -1);
                            z2 = false;
                        } else {
                            z2 = i9 == -2;
                            i4 = getChildMeasureSpec(i6, paddingLeft, i9);
                        }
                        if (i10 == 0) {
                            i5 = getChildMeasureSpec(i7, paddingTop, -2);
                            z = true;
                        } else if (i10 == -1) {
                            i5 = getChildMeasureSpec(i7, paddingTop, -1);
                            z = false;
                        } else {
                            z = i10 == -2;
                            i5 = getChildMeasureSpec(i7, paddingTop, i10);
                        }
                        childAt.measure(i4, i5);
                        constraintWidget.p = i9 == -2;
                        constraintWidget.q = i10 == -2;
                        i9 = childAt.getMeasuredWidth();
                        i10 = childAt.getMeasuredHeight();
                    } else {
                        z2 = false;
                        z = false;
                    }
                    constraintWidget.e(i9);
                    constraintWidget.f(i10);
                    if (z2) {
                        constraintWidget.P = i9;
                    }
                    if (z) {
                        constraintWidget.Q = i10;
                    }
                    if (layoutParams.V) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            constraintWidget.M = baseline;
                        }
                    }
                }
            }
        }
    }

    private void b() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Placeholder) {
                Placeholder placeholder = (Placeholder) childAt;
                if (placeholder.b != null) {
                    LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                    LayoutParams layoutParams2 = (LayoutParams) placeholder.b.getLayoutParams();
                    layoutParams2.aj.U = 0;
                    layoutParams.aj.e(layoutParams2.aj.m());
                    layoutParams.aj.f(layoutParams2.aj.n());
                    layoutParams2.aj.U = 8;
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                this.c.get(i3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r23.getPaddingTop()
            int r4 = r23.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r23.getPaddingLeft()
            int r5 = r23.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r23.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 8
            r9 = -1
            r10 = -2
            if (r7 >= r5) goto L_0x00be
            android.view.View r12 = r0.getChildAt(r7)
            int r13 = r12.getVisibility()
            if (r13 == r8) goto L_0x00ba
            android.view.ViewGroup$LayoutParams r8 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = r8.aj
            boolean r14 = r8.W
            if (r14 != 0) goto L_0x00ba
            boolean r14 = r8.X
            if (r14 != 0) goto L_0x00ba
            int r14 = r12.getVisibility()
            r13.U = r14
            int r14 = r8.width
            int r15 = r8.height
            if (r14 == 0) goto L_0x00ac
            if (r15 != 0) goto L_0x004c
            goto L_0x00ac
        L_0x004c:
            if (r14 != r10) goto L_0x0051
            r16 = 1
            goto L_0x0053
        L_0x0051:
            r16 = 0
        L_0x0053:
            int r6 = getChildMeasureSpec(r1, r4, r14)
            if (r15 != r10) goto L_0x005c
            r17 = 1
            goto L_0x005e
        L_0x005c:
            r17 = 0
        L_0x005e:
            int r11 = getChildMeasureSpec(r2, r3, r15)
            r12.measure(r6, r11)
            if (r14 != r10) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            r13.p = r6
            if (r15 != r10) goto L_0x0070
            r6 = 1
            goto L_0x0071
        L_0x0070:
            r6 = 0
        L_0x0071:
            r13.q = r6
            int r6 = r12.getMeasuredWidth()
            int r10 = r12.getMeasuredHeight()
            r13.e(r6)
            r13.f(r10)
            if (r16 == 0) goto L_0x0085
            r13.P = r6
        L_0x0085:
            if (r17 == 0) goto L_0x0089
            r13.Q = r10
        L_0x0089:
            boolean r11 = r8.V
            if (r11 == 0) goto L_0x0095
            int r11 = r12.getBaseline()
            if (r11 == r9) goto L_0x0095
            r13.M = r11
        L_0x0095:
            boolean r9 = r8.T
            if (r9 == 0) goto L_0x00ba
            boolean r8 = r8.U
            if (r8 == 0) goto L_0x00ba
            ep r8 = r13.i()
            r8.a(r6)
            ep r6 = r13.j()
            r6.a(r10)
            goto L_0x00ba
        L_0x00ac:
            ep r6 = r13.i()
            r6.c()
            ep r6 = r13.j()
            r6.c()
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x001d
        L_0x00be:
            ei r6 = r0.e
            r6.C()
            r6 = 0
        L_0x00c4:
            if (r6 >= r5) goto L_0x0278
            android.view.View r7 = r0.getChildAt(r6)
            int r11 = r7.getVisibility()
            if (r11 == r8) goto L_0x0265
            android.view.ViewGroup$LayoutParams r11 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r11 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r11
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = r11.aj
            boolean r13 = r11.W
            if (r13 != 0) goto L_0x0265
            boolean r13 = r11.X
            if (r13 != 0) goto L_0x0265
            int r13 = r7.getVisibility()
            r12.U = r13
            int r13 = r11.width
            int r14 = r11.height
            if (r13 == 0) goto L_0x00ee
            if (r14 != 0) goto L_0x0265
        L_0x00ee:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r15 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r12.a(r15)
            eo r15 = r15.a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r12.a(r8)
            eo r8 = r8.a
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r12.a(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 == 0) goto L_0x0114
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r12.a(r9)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r9.d
            if (r9 == 0) goto L_0x0114
            r9 = 1
            goto L_0x0115
        L_0x0114:
            r9 = 0
        L_0x0115:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r12.a(r10)
            eo r10 = r10.a
            r18 = r5
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r5 = r12.a(r5)
            eo r5 = r5.a
            r19 = r6
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r12.a(r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.d
            if (r6 == 0) goto L_0x013f
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r12.a(r6)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r6 = r6.d
            if (r6 == 0) goto L_0x013f
            r6 = 1
            goto L_0x0140
        L_0x013f:
            r6 = 0
        L_0x0140:
            if (r13 != 0) goto L_0x0148
            if (r14 != 0) goto L_0x0148
            if (r9 == 0) goto L_0x0148
            if (r6 != 0) goto L_0x0269
        L_0x0148:
            r20 = r11
            ei r11 = r0.e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r11.y()
            r21 = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r7) goto L_0x0158
            r7 = 1
            goto L_0x0159
        L_0x0158:
            r7 = 0
        L_0x0159:
            ei r11 = r0.e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r11.z()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r0) goto L_0x0165
            r0 = 1
            goto L_0x0166
        L_0x0165:
            r0 = 0
        L_0x0166:
            if (r7 != 0) goto L_0x016f
            ep r11 = r12.i()
            r11.c()
        L_0x016f:
            if (r0 != 0) goto L_0x0178
            ep r11 = r12.j()
            r11.c()
        L_0x0178:
            if (r13 != 0) goto L_0x01a7
            if (r7 == 0) goto L_0x019f
            boolean r11 = r12.d()
            if (r11 == 0) goto L_0x019f
            if (r9 == 0) goto L_0x019f
            boolean r9 = r15.e()
            if (r9 == 0) goto L_0x019f
            boolean r9 = r8.e()
            if (r9 == 0) goto L_0x019f
            float r8 = r8.d
            float r9 = r15.d
            float r8 = r8 - r9
            int r8 = (int) r8
            ep r9 = r12.i()
            r9.a(r8)
            r13 = r8
            goto L_0x01b7
        L_0x019f:
            r8 = -2
            int r7 = getChildMeasureSpec(r1, r4, r8)
            r8 = 1
            r9 = 0
            goto L_0x01c1
        L_0x01a7:
            r8 = -2
            r9 = -1
            if (r13 != r9) goto L_0x01b3
            int r11 = getChildMeasureSpec(r1, r4, r9)
            r9 = r7
            r7 = r11
            r8 = 0
            goto L_0x01c1
        L_0x01b3:
            if (r13 != r8) goto L_0x01b7
            r8 = 1
            goto L_0x01b8
        L_0x01b7:
            r8 = 0
        L_0x01b8:
            int r9 = getChildMeasureSpec(r1, r4, r13)
            r22 = r9
            r9 = r7
            r7 = r22
        L_0x01c1:
            if (r14 != 0) goto L_0x01f4
            if (r0 == 0) goto L_0x01e9
            boolean r11 = r12.e()
            if (r11 == 0) goto L_0x01e9
            if (r6 == 0) goto L_0x01e9
            boolean r6 = r10.e()
            if (r6 == 0) goto L_0x01e9
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x01e9
            float r5 = r5.d
            float r6 = r10.d
            float r5 = r5 - r6
            int r5 = (int) r5
            ep r6 = r12.j()
            r6.a(r5)
            r14 = r5
            r5 = -2
            goto L_0x0205
        L_0x01e9:
            r5 = -2
            int r0 = getChildMeasureSpec(r2, r3, r5)
            r10 = r0
            r0 = r21
            r6 = 1
            r11 = 0
            goto L_0x020d
        L_0x01f4:
            r5 = -2
            r6 = -1
            if (r14 != r6) goto L_0x0201
            int r10 = getChildMeasureSpec(r2, r3, r6)
            r11 = r0
            r0 = r21
            r6 = 0
            goto L_0x020d
        L_0x0201:
            if (r14 != r5) goto L_0x0205
            r6 = 1
            goto L_0x0206
        L_0x0205:
            r6 = 0
        L_0x0206:
            int r10 = getChildMeasureSpec(r2, r3, r14)
            r11 = r0
            r0 = r21
        L_0x020d:
            r0.measure(r7, r10)
            if (r13 != r5) goto L_0x0214
            r7 = 1
            goto L_0x0215
        L_0x0214:
            r7 = 0
        L_0x0215:
            r12.p = r7
            if (r14 != r5) goto L_0x021b
            r7 = 1
            goto L_0x021c
        L_0x021b:
            r7 = 0
        L_0x021c:
            r12.q = r7
            int r7 = r0.getMeasuredWidth()
            int r10 = r0.getMeasuredHeight()
            r12.e(r7)
            r12.f(r10)
            if (r8 == 0) goto L_0x0230
            r12.P = r7
        L_0x0230:
            if (r6 == 0) goto L_0x0234
            r12.Q = r10
        L_0x0234:
            r6 = 2
            if (r9 == 0) goto L_0x023f
            ep r8 = r12.i()
            r8.a(r7)
            goto L_0x0245
        L_0x023f:
            ep r7 = r12.i()
            r7.g = r6
        L_0x0245:
            if (r11 == 0) goto L_0x024f
            ep r6 = r12.j()
            r6.a(r10)
            goto L_0x0255
        L_0x024f:
            ep r7 = r12.j()
            r7.g = r6
        L_0x0255:
            r11 = r20
            boolean r6 = r11.V
            if (r6 == 0) goto L_0x026a
            int r0 = r0.getBaseline()
            r6 = -1
            if (r0 == r6) goto L_0x026b
            r12.M = r0
            goto L_0x026b
        L_0x0265:
            r18 = r5
            r19 = r6
        L_0x0269:
            r5 = -2
        L_0x026a:
            r6 = -1
        L_0x026b:
            int r0 = r19 + 1
            r8 = 8
            r6 = r0
            r5 = r18
            r9 = -1
            r10 = -2
            r0 = r23
            goto L_0x00c4
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x06a3  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0728  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0797  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07b0  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x09a8  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x09c0  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x09f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            java.lang.System.currentTimeMillis()
            int r3 = android.view.View.MeasureSpec.getMode(r39)
            int r4 = android.view.View.MeasureSpec.getSize(r39)
            int r5 = android.view.View.MeasureSpec.getMode(r40)
            int r6 = android.view.View.MeasureSpec.getSize(r40)
            int r7 = r38.getPaddingLeft()
            int r8 = r38.getPaddingTop()
            ei r9 = r0.e
            r9.c(r7)
            ei r9 = r0.e
            r9.d(r8)
            ei r9 = r0.e
            int r10 = r0.h
            int[] r9 = r9.s
            r11 = 0
            r9[r11] = r10
            ei r9 = r0.e
            int r10 = r0.i
            int[] r9 = r9.s
            r12 = 1
            r9[r12] = r10
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 < r10) goto L_0x0050
            ei r9 = r0.e
            int r13 = r38.getLayoutDirection()
            if (r13 != r12) goto L_0x004d
            r13 = 1
            goto L_0x004e
        L_0x004d:
            r13 = 0
        L_0x004e:
            r9.a = r13
        L_0x0050:
            int r9 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getSize(r39)
            int r14 = android.view.View.MeasureSpec.getMode(r40)
            int r15 = android.view.View.MeasureSpec.getSize(r40)
            int r16 = r38.getPaddingTop()
            int r17 = r38.getPaddingBottom()
            int r16 = r16 + r17
            int r17 = r38.getPaddingLeft()
            int r18 = r38.getPaddingRight()
            int r17 = r17 + r18
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r18 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r19 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r38.getLayoutParams()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1073741824(0x40000000, float:2.0)
            if (r9 == r10) goto L_0x0096
            if (r9 == 0) goto L_0x0093
            if (r9 == r12) goto L_0x0089
        L_0x0085:
            r9 = r18
            r13 = 0
            goto L_0x009a
        L_0x0089:
            int r9 = r0.h
            int r9 = java.lang.Math.min(r9, r13)
            int r9 = r9 - r17
            r13 = r9
            goto L_0x0098
        L_0x0093:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r18 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            goto L_0x0085
        L_0x0096:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r18 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x0098:
            r9 = r18
        L_0x009a:
            if (r14 == r10) goto L_0x00b1
            if (r14 == 0) goto L_0x00ae
            if (r14 == r12) goto L_0x00a4
        L_0x00a0:
            r14 = r19
            r15 = 0
            goto L_0x00b5
        L_0x00a4:
            int r14 = r0.i
            int r14 = java.lang.Math.min(r14, r15)
            int r14 = r14 - r16
            r15 = r14
            goto L_0x00b3
        L_0x00ae:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r19 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            goto L_0x00a0
        L_0x00b1:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r19 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00b3:
            r14 = r19
        L_0x00b5:
            ei r12 = r0.e
            r12.g(r11)
            ei r12 = r0.e
            r12.h(r11)
            ei r12 = r0.e
            r12.a(r9)
            ei r9 = r0.e
            r9.e(r13)
            ei r9 = r0.e
            r9.b(r14)
            ei r9 = r0.e
            r9.f(r15)
            ei r9 = r0.e
            int r12 = r0.f
            int r13 = r38.getPaddingLeft()
            int r12 = r12 - r13
            int r13 = r38.getPaddingRight()
            int r12 = r12 - r13
            r9.g(r12)
            ei r9 = r0.e
            int r12 = r0.g
            int r13 = r38.getPaddingTop()
            int r12 = r12 - r13
            int r13 = r38.getPaddingBottom()
            int r12 = r12 - r13
            r9.h(r12)
            ei r9 = r0.e
            int r9 = r9.m()
            ei r12 = r0.e
            int r12 = r12.n()
            boolean r13 = r0.j
            if (r13 == 0) goto L_0x068d
            r0.j = r11
            int r13 = r38.getChildCount()
            r10 = 0
        L_0x010c:
            if (r10 >= r13) goto L_0x011d
            android.view.View r18 = r0.getChildAt(r10)
            boolean r18 = r18.isLayoutRequested()
            if (r18 == 0) goto L_0x011a
            r10 = 1
            goto L_0x011e
        L_0x011a:
            int r10 = r10 + 1
            goto L_0x010c
        L_0x011d:
            r10 = 0
        L_0x011e:
            if (r10 == 0) goto L_0x067d
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r10 = r0.d
            r10.clear()
            boolean r10 = r38.isInEditMode()
            int r13 = r38.getChildCount()
            if (r10 == 0) goto L_0x016d
            r14 = 0
        L_0x0130:
            if (r14 >= r13) goto L_0x016d
            android.view.View r19 = r0.getChildAt(r14)
            android.content.res.Resources r15 = r38.getResources()     // Catch:{ NotFoundException -> 0x0167 }
            int r11 = r19.getId()     // Catch:{ NotFoundException -> 0x0167 }
            java.lang.String r11 = r15.getResourceName(r11)     // Catch:{ NotFoundException -> 0x0167 }
            int r15 = r19.getId()     // Catch:{ NotFoundException -> 0x0167 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NotFoundException -> 0x0167 }
            r2 = 0
            r0.a(r2, r11, r15)     // Catch:{ NotFoundException -> 0x0167 }
            r2 = 47
            int r2 = r11.indexOf(r2)     // Catch:{ NotFoundException -> 0x0167 }
            r15 = -1
            if (r2 == r15) goto L_0x015d
            int r2 = r2 + 1
            java.lang.String r11 = r11.substring(r2)     // Catch:{ NotFoundException -> 0x0167 }
        L_0x015d:
            int r2 = r19.getId()     // Catch:{ NotFoundException -> 0x0167 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.b(r2)     // Catch:{ NotFoundException -> 0x0167 }
            r2.V = r11     // Catch:{ NotFoundException -> 0x0167 }
        L_0x0167:
            int r14 = r14 + 1
            r2 = r40
            r11 = 0
            goto L_0x0130
        L_0x016d:
            r2 = 0
        L_0x016e:
            if (r2 >= r13) goto L_0x0180
            android.view.View r11 = r0.getChildAt(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.a(r11)
            if (r11 == 0) goto L_0x017d
            r11.f()
        L_0x017d:
            int r2 = r2 + 1
            goto L_0x016e
        L_0x0180:
            int r2 = r0.l
            r11 = -1
            if (r2 == r11) goto L_0x0267
            r2 = 0
        L_0x0186:
            if (r2 >= r13) goto L_0x0267
            android.view.View r11 = r0.getChildAt(r2)
            int r14 = r11.getId()
            int r15 = r0.l
            if (r14 != r15) goto L_0x0249
            boolean r14 = r11 instanceof androidx.constraintlayout.widget.Constraints
            if (r14 == 0) goto L_0x0249
            androidx.constraintlayout.widget.Constraints r11 = (androidx.constraintlayout.widget.Constraints) r11
            et r14 = r11.a
            if (r14 != 0) goto L_0x01a5
            et r14 = new et
            r14.<init>()
            r11.a = r14
        L_0x01a5:
            et r14 = r11.a
            int r15 = r11.getChildCount()
            java.util.HashMap<java.lang.Integer, et$a> r1 = r14.a
            r1.clear()
            r1 = 0
        L_0x01b1:
            if (r1 >= r15) goto L_0x0238
            r19 = r15
            android.view.View r15 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r22 = r15.getLayoutParams()
            r23 = r7
            r7 = r22
            androidx.constraintlayout.widget.Constraints$LayoutParams r7 = (androidx.constraintlayout.widget.Constraints.LayoutParams) r7
            r22 = r8
            int r8 = r15.getId()
            r24 = r6
            r6 = -1
            if (r8 == r6) goto L_0x0230
            java.util.HashMap<java.lang.Integer, et$a> r6 = r14.a
            r25 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x01f0
            java.util.HashMap<java.lang.Integer, et$a> r5 = r14.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r26 = r4
            et$a r4 = new et$a
            r27 = r3
            r3 = 0
            r4.<init>(r3)
            r5.put(r6, r4)
            goto L_0x01f4
        L_0x01f0:
            r27 = r3
            r26 = r4
        L_0x01f4:
            java.util.HashMap<java.lang.Integer, et$a> r3 = r14.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r4)
            et$a r3 = (defpackage.et.a) r3
            boolean r4 = r15 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r4 == 0) goto L_0x021c
            androidx.constraintlayout.widget.ConstraintHelper r15 = (androidx.constraintlayout.widget.ConstraintHelper) r15
            r3.a(r8, r7)
            boolean r4 = r15 instanceof androidx.constraintlayout.widget.Barrier
            if (r4 == 0) goto L_0x021c
            r4 = 1
            r3.al = r4
            androidx.constraintlayout.widget.Barrier r15 = (androidx.constraintlayout.widget.Barrier) r15
            int r4 = r15.a
            r3.ak = r4
            int[] r4 = r15.b()
            r3.am = r4
        L_0x021c:
            r3.a(r8, r7)
            int r1 = r1 + 1
            r15 = r19
            r8 = r22
            r7 = r23
            r6 = r24
            r5 = r25
            r4 = r26
            r3 = r27
            goto L_0x01b1
        L_0x0230:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r1.<init>(r2)
            throw r1
        L_0x0238:
            r27 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r22 = r8
            et r1 = r11.a
            r0.a = r1
            goto L_0x0255
        L_0x0249:
            r27 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r22 = r8
        L_0x0255:
            int r2 = r2 + 1
            r1 = r39
            r8 = r22
            r7 = r23
            r6 = r24
            r5 = r25
            r4 = r26
            r3 = r27
            goto L_0x0186
        L_0x0267:
            r27 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r22 = r8
            et r1 = r0.a
            if (r1 == 0) goto L_0x027a
            r1.c(r0)
        L_0x027a:
            ei r1 = r0.e
            r1.E()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r1 = r0.c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0298
            r2 = 0
        L_0x0288:
            if (r2 >= r1) goto L_0x0298
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r3 = r0.c
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.ConstraintHelper r3 = (androidx.constraintlayout.widget.ConstraintHelper) r3
            r3.a(r0)
            int r2 = r2 + 1
            goto L_0x0288
        L_0x0298:
            r1 = 0
        L_0x0299:
            if (r1 >= r13) goto L_0x02d8
            android.view.View r2 = r0.getChildAt(r1)
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Placeholder
            if (r3 == 0) goto L_0x02d5
            androidx.constraintlayout.widget.Placeholder r2 = (androidx.constraintlayout.widget.Placeholder) r2
            int r3 = r2.a
            r4 = -1
            if (r3 != r4) goto L_0x02b5
            boolean r3 = r2.isInEditMode()
            if (r3 != 0) goto L_0x02b5
            int r3 = r2.c
            r2.setVisibility(r3)
        L_0x02b5:
            int r3 = r2.a
            android.view.View r3 = r0.findViewById(r3)
            r2.b = r3
            android.view.View r3 = r2.b
            if (r3 == 0) goto L_0x02d5
            android.view.View r3 = r2.b
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            r4 = 1
            r3.Y = r4
            android.view.View r3 = r2.b
            r4 = 0
            r3.setVisibility(r4)
            r2.setVisibility(r4)
        L_0x02d5:
            int r1 = r1 + 1
            goto L_0x0299
        L_0x02d8:
            r1 = 0
        L_0x02d9:
            if (r1 >= r13) goto L_0x0689
            android.view.View r2 = r0.getChildAt(r1)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = r0.a(r2)
            if (r11 == 0) goto L_0x066f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            r14 = r3
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r14 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r14
            r14.a()
            if (r10 == 0) goto L_0x0321
            android.content.res.Resources r3 = r38.getResources()     // Catch:{ NotFoundException -> 0x0320 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0320 }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x0320 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0320 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x0320 }
            r5 = 0
            r0.a(r5, r3, r4)     // Catch:{ NotFoundException -> 0x0320 }
            java.lang.String r4 = "id/"
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x0320 }
            int r4 = r4 + 3
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x0320 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x0320 }
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = r0.b(r4)     // Catch:{ NotFoundException -> 0x0320 }
            r4.V = r3     // Catch:{ NotFoundException -> 0x0320 }
            goto L_0x0321
        L_0x0320:
        L_0x0321:
            int r3 = r2.getVisibility()
            r11.U = r3
            boolean r3 = r14.Y
            if (r3 == 0) goto L_0x032f
            r3 = 8
            r11.U = r3
        L_0x032f:
            r11.T = r2
            ei r2 = r0.e
            r2.a(r11)
            boolean r2 = r14.U
            if (r2 == 0) goto L_0x033e
            boolean r2 = r14.T
            if (r2 != 0) goto L_0x0343
        L_0x033e:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r0.d
            r2.add(r11)
        L_0x0343:
            boolean r2 = r14.W
            if (r2 == 0) goto L_0x0375
            ek r11 = (defpackage.ek) r11
            int r2 = r14.ag
            int r3 = r14.ah
            float r4 = r14.ai
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 >= r6) goto L_0x035b
            int r2 = r14.a
            int r3 = r14.b
            float r4 = r14.c
        L_0x035b:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0366
            r11.a(r4)
            goto L_0x066f
        L_0x0366:
            r4 = -1
            if (r2 == r4) goto L_0x036e
            r11.k(r2)
            goto L_0x066f
        L_0x036e:
            if (r3 == r4) goto L_0x066f
            r11.l(r3)
            goto L_0x066f
        L_0x0375:
            r4 = -1
            int r2 = r14.d
            if (r2 != r4) goto L_0x03be
            int r2 = r14.e
            if (r2 != r4) goto L_0x03be
            int r2 = r14.f
            if (r2 != r4) goto L_0x03be
            int r2 = r14.g
            if (r2 != r4) goto L_0x03be
            int r2 = r14.q
            if (r2 != r4) goto L_0x03be
            int r2 = r14.p
            if (r2 != r4) goto L_0x03be
            int r2 = r14.r
            if (r2 != r4) goto L_0x03be
            int r2 = r14.s
            if (r2 != r4) goto L_0x03be
            int r2 = r14.h
            if (r2 != r4) goto L_0x03be
            int r2 = r14.i
            if (r2 != r4) goto L_0x03be
            int r2 = r14.j
            if (r2 != r4) goto L_0x03be
            int r2 = r14.k
            if (r2 != r4) goto L_0x03be
            int r2 = r14.l
            if (r2 != r4) goto L_0x03be
            int r2 = r14.O
            if (r2 != r4) goto L_0x03be
            int r2 = r14.P
            if (r2 != r4) goto L_0x03be
            int r2 = r14.m
            if (r2 != r4) goto L_0x03be
            int r2 = r14.width
            if (r2 == r4) goto L_0x03be
            int r2 = r14.height
            if (r2 != r4) goto L_0x066f
        L_0x03be:
            int r2 = r14.Z
            int r3 = r14.aa
            int r4 = r14.ab
            int r5 = r14.ac
            int r6 = r14.ad
            int r7 = r14.ae
            float r8 = r14.af
            int r15 = android.os.Build.VERSION.SDK_INT
            r19 = r8
            r8 = 17
            if (r15 >= r8) goto L_0x041e
            int r2 = r14.d
            int r3 = r14.e
            int r4 = r14.f
            int r5 = r14.g
            int r6 = r14.t
            int r7 = r14.v
            float r15 = r14.z
            r8 = -1
            if (r2 != r8) goto L_0x03f8
            if (r3 != r8) goto L_0x03f8
            r19 = r2
            int r2 = r14.q
            if (r2 == r8) goto L_0x03f0
            int r2 = r14.q
            goto L_0x03fc
        L_0x03f0:
            int r2 = r14.p
            if (r2 == r8) goto L_0x03fa
            int r2 = r14.p
            r3 = r2
            goto L_0x03fa
        L_0x03f8:
            r19 = r2
        L_0x03fa:
            r2 = r19
        L_0x03fc:
            if (r4 != r8) goto L_0x0410
            if (r5 != r8) goto L_0x0410
            r19 = r2
            int r2 = r14.r
            if (r2 == r8) goto L_0x0409
            int r4 = r14.r
            goto L_0x0412
        L_0x0409:
            int r2 = r14.s
            if (r2 == r8) goto L_0x0412
            int r5 = r14.s
            goto L_0x0412
        L_0x0410:
            r19 = r2
        L_0x0412:
            r2 = r19
            r19 = r7
            r7 = r4
            r37 = r6
            r6 = r5
            r5 = r15
            r15 = r37
            goto L_0x0426
        L_0x041e:
            r8 = -1
            r15 = r6
            r6 = r5
            r5 = r19
            r19 = r7
            r7 = r4
        L_0x0426:
            int r4 = r14.m
            if (r4 == r8) goto L_0x044c
            int r2 = r14.m
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r2)
            if (r5 == 0) goto L_0x0444
            float r2 = r14.o
            int r7 = r14.n
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r8 = 0
            r3 = r11
            r20 = 17
            r3.a(r4, r5, r6, r7, r8)
            r11.t = r2
            goto L_0x0446
        L_0x0444:
            r20 = 17
        L_0x0446:
            r28 = r9
            r29 = r13
            goto L_0x0597
        L_0x044c:
            r4 = -1
            r20 = 17
            if (r2 == r4) goto L_0x0479
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r0.b(r2)
            if (r2 == 0) goto L_0x0471
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r3 = r14.leftMargin
            r28 = r3
            r3 = r11
            r29 = r13
            r13 = r5
            r5 = r2
            r2 = r6
            r6 = r8
            r8 = r7
            r7 = r28
            r28 = r9
            r9 = r8
            r8 = r15
            r3.a(r4, r5, r6, r7, r8)
            goto L_0x0493
        L_0x0471:
            r2 = r6
            r28 = r9
            r29 = r13
            r13 = r5
            r9 = r7
            goto L_0x0493
        L_0x0479:
            r2 = r6
            r28 = r9
            r29 = r13
            r13 = r5
            r9 = r7
            if (r3 == r4) goto L_0x0493
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r3)
            if (r5 == 0) goto L_0x0493
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r7 = r14.leftMargin
            r3 = r11
            r8 = r15
            r3.a(r4, r5, r6, r7, r8)
        L_0x0493:
            r3 = -1
            if (r9 == r3) goto L_0x04a9
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r9)
            if (r5 == 0) goto L_0x04bd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r7 = r14.rightMargin
            r3 = r11
            r8 = r19
            r3.a(r4, r5, r6, r7, r8)
            goto L_0x04bd
        L_0x04a9:
            if (r2 == r3) goto L_0x04bd
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r2)
            if (r5 == 0) goto L_0x04bd
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r7 = r14.rightMargin
            r3 = r11
            r8 = r19
            r3.a(r4, r5, r6, r7, r8)
        L_0x04bd:
            int r2 = r14.h
            r3 = -1
            if (r2 == r3) goto L_0x04d7
            int r2 = r14.h
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r2)
            if (r5 == 0) goto L_0x04f0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r7 = r14.topMargin
            int r8 = r14.u
            r3 = r11
            r3.a(r4, r5, r6, r7, r8)
            goto L_0x04f0
        L_0x04d7:
            int r2 = r14.i
            r3 = -1
            if (r2 == r3) goto L_0x04f0
            int r2 = r14.i
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r2)
            if (r5 == 0) goto L_0x04f0
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r7 = r14.topMargin
            int r8 = r14.u
            r3 = r11
            r3.a(r4, r5, r6, r7, r8)
        L_0x04f0:
            int r2 = r14.j
            r3 = -1
            if (r2 == r3) goto L_0x050a
            int r2 = r14.j
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r2)
            if (r5 == 0) goto L_0x0523
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r7 = r14.bottomMargin
            int r8 = r14.w
            r3 = r11
            r3.a(r4, r5, r6, r7, r8)
            goto L_0x0523
        L_0x050a:
            int r2 = r14.k
            r3 = -1
            if (r2 == r3) goto L_0x0523
            int r2 = r14.k
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r0.b(r2)
            if (r5 == 0) goto L_0x0523
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r7 = r14.bottomMargin
            int r8 = r14.w
            r3 = r11
            r3.a(r4, r5, r6, r7, r8)
        L_0x0523:
            int r2 = r14.l
            r3 = -1
            if (r2 == r3) goto L_0x057a
            android.util.SparseArray<android.view.View> r2 = r0.b
            int r3 = r14.l
            java.lang.Object r2 = r2.get(r3)
            android.view.View r2 = (android.view.View) r2
            int r3 = r14.l
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r0.b(r3)
            if (r3 == 0) goto L_0x057a
            if (r2 == 0) goto L_0x057a
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            boolean r4 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r4 == 0) goto L_0x057a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            r4 = 1
            r14.V = r4
            r2.V = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r30 = r11.a(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r31 = r3.a(r2)
            r32 = 0
            r33 = -1
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Strength r34 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Strength.STRONG
            r35 = 0
            r36 = 1
            r30.a(r31, r32, r33, r34, r35, r36)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            r2.c()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            r2.c()
        L_0x057a:
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            int r4 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x0587
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0587
            r11.R = r13
        L_0x0587:
            float r4 = r14.A
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0597
            float r3 = r14.A
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0597
            float r2 = r14.A
            r11.S = r2
        L_0x0597:
            if (r10 == 0) goto L_0x05a9
            int r2 = r14.O
            r3 = -1
            if (r2 != r3) goto L_0x05a2
            int r2 = r14.P
            if (r2 == r3) goto L_0x05a9
        L_0x05a2:
            int r2 = r14.O
            int r3 = r14.P
            r11.a(r2, r3)
        L_0x05a9:
            boolean r2 = r14.T
            if (r2 != 0) goto L_0x05d6
            int r2 = r14.width
            r3 = -1
            if (r2 != r3) goto L_0x05cc
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r11.a(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            int r3 = r14.leftMargin
            r2.e = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            int r3 = r14.rightMargin
            r2.e = r3
            goto L_0x05e0
        L_0x05cc:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r11.a(r2)
            r2 = 0
            r11.e(r2)
            goto L_0x05e0
        L_0x05d6:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11.a(r2)
            int r2 = r14.width
            r11.e(r2)
        L_0x05e0:
            boolean r2 = r14.U
            if (r2 != 0) goto L_0x060d
            int r2 = r14.height
            r3 = -1
            if (r2 != r3) goto L_0x0603
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r11.b(r2)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            int r3 = r14.topMargin
            r2.e = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r11.a(r2)
            int r3 = r14.bottomMargin
            r2.e = r3
            goto L_0x0617
        L_0x0603:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r11.b(r2)
            r2 = 0
            r11.f(r2)
            goto L_0x0617
        L_0x060d:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r11.b(r2)
            int r2 = r14.height
            r11.f(r2)
        L_0x0617:
            java.lang.String r2 = r14.B
            if (r2 == 0) goto L_0x0620
            java.lang.String r2 = r14.B
            r11.a(r2)
        L_0x0620:
            float r2 = r14.C
            float[] r3 = r11.ab
            r4 = 0
            r3[r4] = r2
            float r2 = r14.D
            float[] r3 = r11.ab
            r4 = 1
            r3[r4] = r2
            int r2 = r14.E
            r11.Z = r2
            int r2 = r14.F
            r11.aa = r2
            int r2 = r14.G
            int r3 = r14.I
            int r4 = r14.K
            float r5 = r14.M
            r11.g = r2
            r11.j = r3
            r11.k = r4
            r11.l = r5
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0653
            int r3 = r11.g
            if (r3 != 0) goto L_0x0653
            r3 = 2
            r11.g = r3
        L_0x0653:
            int r3 = r14.H
            int r4 = r14.J
            int r5 = r14.L
            float r6 = r14.N
            r11.h = r3
            r11.m = r4
            r11.n = r5
            r11.o = r6
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0675
            int r2 = r11.h
            if (r2 != 0) goto L_0x0675
            r2 = 2
            r11.h = r2
            goto L_0x0675
        L_0x066f:
            r28 = r9
            r29 = r13
            r20 = 17
        L_0x0675:
            int r1 = r1 + 1
            r9 = r28
            r13 = r29
            goto L_0x02d9
        L_0x067d:
            r27 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r22 = r8
        L_0x0689:
            r28 = r9
            r1 = 1
            goto L_0x069c
        L_0x068d:
            r27 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            r1 = 0
        L_0x069c:
            int r2 = r0.k
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x06a5
            r2 = 1
            goto L_0x06a6
        L_0x06a5:
            r2 = 0
        L_0x06a6:
            if (r2 == 0) goto L_0x06b8
            ei r3 = r0.e
            r3.B()
            ei r3 = r0.e
            r4 = r28
            r3.f(r4, r12)
            r38.b(r39, r40)
            goto L_0x06bd
        L_0x06b8:
            r4 = r28
            r38.a(r39, r40)
        L_0x06bd:
            r38.b()
            int r3 = r38.getChildCount()
            if (r3 <= 0) goto L_0x06cd
            if (r1 == 0) goto L_0x06cd
            ei r1 = r0.e
            defpackage.ee.a(r1)
        L_0x06cd:
            ei r1 = r0.e
            boolean r1 = r1.ai
            if (r1 == 0) goto L_0x0728
            ei r1 = r0.e
            boolean r1 = r1.aj
            if (r1 == 0) goto L_0x06f9
            r1 = r27
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L_0x06f6
            ei r3 = r0.e
            int r3 = r3.al
            r5 = r26
            if (r3 >= r5) goto L_0x06ee
            ei r3 = r0.e
            int r6 = r3.al
            r3.e(r6)
        L_0x06ee:
            ei r3 = r0.e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3.a(r6)
            goto L_0x06fd
        L_0x06f6:
            r5 = r26
            goto L_0x06fd
        L_0x06f9:
            r5 = r26
            r1 = r27
        L_0x06fd:
            ei r3 = r0.e
            boolean r3 = r3.ak
            if (r3 == 0) goto L_0x0723
            r3 = r25
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r6) goto L_0x0720
            ei r6 = r0.e
            int r6 = r6.am
            r7 = r24
            if (r6 >= r7) goto L_0x0718
            ei r6 = r0.e
            int r8 = r6.am
            r6.f(r8)
        L_0x0718:
            ei r6 = r0.e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.b(r8)
            goto L_0x0730
        L_0x0720:
            r7 = r24
            goto L_0x0730
        L_0x0723:
            r7 = r24
            r3 = r25
            goto L_0x0730
        L_0x0728:
            r7 = r24
            r3 = r25
            r5 = r26
            r1 = r27
        L_0x0730:
            int r6 = r0.k
            r8 = 32
            r6 = r6 & r8
            if (r6 != r8) goto L_0x078f
            ei r6 = r0.e
            int r6 = r6.m()
            ei r8 = r0.e
            int r8 = r8.n()
            int r9 = r0.n
            if (r9 == r6) goto L_0x0754
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 != r9) goto L_0x0756
            ei r1 = r0.e
            java.util.List<ej> r1 = r1.ah
            r10 = 0
            defpackage.ee.a(r1, r10, r6)
            goto L_0x0756
        L_0x0754:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x0756:
            int r1 = r0.o
            if (r1 == r8) goto L_0x0764
            if (r3 != r9) goto L_0x0764
            ei r1 = r0.e
            java.util.List<ej> r1 = r1.ah
            r3 = 1
            defpackage.ee.a(r1, r3, r8)
        L_0x0764:
            ei r1 = r0.e
            boolean r1 = r1.aj
            if (r1 == 0) goto L_0x0779
            ei r1 = r0.e
            int r1 = r1.al
            if (r1 <= r5) goto L_0x0779
            ei r1 = r0.e
            java.util.List<ej> r1 = r1.ah
            r3 = 0
            defpackage.ee.a(r1, r3, r5)
            goto L_0x077a
        L_0x0779:
            r3 = 0
        L_0x077a:
            ei r1 = r0.e
            boolean r1 = r1.ak
            if (r1 == 0) goto L_0x0790
            ei r1 = r0.e
            int r1 = r1.am
            if (r1 <= r7) goto L_0x0790
            ei r1 = r0.e
            java.util.List<ej> r1 = r1.ah
            r5 = 1
            defpackage.ee.a(r1, r5, r7)
            goto L_0x0791
        L_0x078f:
            r3 = 0
        L_0x0790:
            r5 = 1
        L_0x0791:
            int r1 = r38.getChildCount()
            if (r1 <= 0) goto L_0x079c
            ei r1 = r0.e
            r1.A()
        L_0x079c:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r1 = r0.d
            int r1 = r1.size()
            int r6 = r38.getPaddingBottom()
            int r8 = r22 + r6
            int r6 = r38.getPaddingRight()
            int r7 = r23 + r6
            if (r1 <= 0) goto L_0x09a8
            ei r9 = r0.e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = r9.y()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r10) goto L_0x07bc
            r9 = 1
            goto L_0x07bd
        L_0x07bc:
            r9 = 0
        L_0x07bd:
            ei r10 = r0.e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = r10.z()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r10 != r11) goto L_0x07c9
            r10 = 1
            goto L_0x07ca
        L_0x07c9:
            r10 = 0
        L_0x07ca:
            ei r11 = r0.e
            int r11 = r11.m()
            int r13 = r0.f
            int r11 = java.lang.Math.max(r11, r13)
            ei r13 = r0.e
            int r13 = r13.n()
            int r14 = r0.g
            int r13 = java.lang.Math.max(r13, r14)
            r14 = r11
            r15 = r13
            r11 = 0
            r13 = 0
        L_0x07e6:
            if (r11 >= r1) goto L_0x0911
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r0.d
            java.lang.Object r5 = r5.get(r11)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r5
            java.lang.Object r6 = r5.T
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x08fb
            android.view.ViewGroup$LayoutParams r19 = r6.getLayoutParams()
            r20 = r1
            r1 = r19
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r19 = r12
            boolean r12 = r1.X
            if (r12 != 0) goto L_0x08f6
            boolean r12 = r1.W
            if (r12 != 0) goto L_0x08f6
            int r12 = r6.getVisibility()
            r28 = r4
            r4 = 8
            if (r12 == r4) goto L_0x08f8
            if (r2 == 0) goto L_0x082a
            ep r4 = r5.i()
            boolean r4 = r4.e()
            if (r4 == 0) goto L_0x082a
            ep r4 = r5.j()
            boolean r4 = r4.e()
            if (r4 != 0) goto L_0x08f8
        L_0x082a:
            int r4 = r1.width
            r12 = -2
            if (r4 != r12) goto L_0x083c
            boolean r4 = r1.T
            if (r4 == 0) goto L_0x083c
            int r4 = r1.width
            r12 = r39
            int r4 = getChildMeasureSpec(r12, r7, r4)
            goto L_0x0848
        L_0x083c:
            r12 = r39
            int r4 = r5.m()
            r12 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r12)
        L_0x0848:
            int r12 = r1.height
            r23 = r7
            r7 = -2
            if (r12 != r7) goto L_0x085c
            boolean r7 = r1.U
            if (r7 == 0) goto L_0x085c
            int r7 = r1.height
            r12 = r40
            int r7 = getChildMeasureSpec(r12, r8, r7)
            goto L_0x0868
        L_0x085c:
            r12 = r40
            int r7 = r5.n()
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
        L_0x0868:
            r6.measure(r4, r7)
            int r4 = r6.getMeasuredWidth()
            int r7 = r6.getMeasuredHeight()
            int r12 = r5.m()
            if (r4 == r12) goto L_0x08a2
            r5.e(r4)
            if (r2 == 0) goto L_0x0885
            ep r12 = r5.i()
            r12.a(r4)
        L_0x0885:
            if (r9 == 0) goto L_0x08a0
            int r4 = r5.s()
            if (r4 <= r14) goto L_0x08a0
            int r4 = r5.s()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r5.a(r12)
            int r12 = r12.b()
            int r4 = r4 + r12
            int r14 = java.lang.Math.max(r14, r4)
        L_0x08a0:
            r12 = 1
            goto L_0x08a3
        L_0x08a2:
            r12 = r13
        L_0x08a3:
            int r4 = r5.n()
            if (r7 == r4) goto L_0x08d2
            r5.f(r7)
            if (r2 == 0) goto L_0x08b5
            ep r4 = r5.j()
            r4.a(r7)
        L_0x08b5:
            if (r10 == 0) goto L_0x08d1
            int r4 = r5.t()
            if (r4 <= r15) goto L_0x08d1
            int r4 = r5.t()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r7 = r5.a(r7)
            int r7 = r7.b()
            int r4 = r4 + r7
            int r4 = java.lang.Math.max(r15, r4)
            r15 = r4
        L_0x08d1:
            r12 = 1
        L_0x08d2:
            boolean r1 = r1.V
            if (r1 == 0) goto L_0x08e5
            int r1 = r6.getBaseline()
            r4 = -1
            if (r1 == r4) goto L_0x08e6
            int r7 = r5.M
            if (r1 == r7) goto L_0x08e6
            r5.M = r1
            r12 = 1
            goto L_0x08e6
        L_0x08e5:
            r4 = -1
        L_0x08e6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 11
            if (r1 < r5) goto L_0x08f4
            int r1 = r6.getMeasuredState()
            int r3 = combineMeasuredStates(r3, r1)
        L_0x08f4:
            r13 = r12
            goto L_0x0904
        L_0x08f6:
            r28 = r4
        L_0x08f8:
            r23 = r7
            goto L_0x0903
        L_0x08fb:
            r20 = r1
            r28 = r4
            r23 = r7
            r19 = r12
        L_0x0903:
            r4 = -1
        L_0x0904:
            int r11 = r11 + 1
            r12 = r19
            r1 = r20
            r7 = r23
            r4 = r28
            r5 = 1
            goto L_0x07e6
        L_0x0911:
            r20 = r1
            r28 = r4
            r23 = r7
            r19 = r12
            if (r13 == 0) goto L_0x095e
            ei r1 = r0.e
            r4 = r28
            r1.e(r4)
            ei r1 = r0.e
            r4 = r19
            r1.f(r4)
            if (r2 == 0) goto L_0x0930
            ei r1 = r0.e
            r1.C()
        L_0x0930:
            ei r1 = r0.e
            r1.A()
            ei r1 = r0.e
            int r1 = r1.m()
            if (r1 >= r14) goto L_0x0944
            ei r1 = r0.e
            r1.e(r14)
            r12 = 1
            goto L_0x0945
        L_0x0944:
            r12 = 0
        L_0x0945:
            ei r1 = r0.e
            int r1 = r1.n()
            if (r1 >= r15) goto L_0x0955
            ei r1 = r0.e
            r1.f(r15)
            r21 = 1
            goto L_0x0957
        L_0x0955:
            r21 = r12
        L_0x0957:
            if (r21 == 0) goto L_0x095e
            ei r1 = r0.e
            r1.A()
        L_0x095e:
            r1 = r20
            r2 = 0
        L_0x0961:
            if (r2 >= r1) goto L_0x09ab
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r4 = r0.d
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r4 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r4
            java.lang.Object r5 = r4.T
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x09a1
            int r6 = r5.getMeasuredWidth()
            int r7 = r4.m()
            if (r6 != r7) goto L_0x0985
            int r6 = r5.getMeasuredHeight()
            int r7 = r4.n()
            if (r6 == r7) goto L_0x09a1
        L_0x0985:
            int r6 = r4.U
            r7 = 8
            if (r6 == r7) goto L_0x09a3
            int r6 = r4.m()
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r4 = r4.n()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            r5.measure(r6, r4)
            goto L_0x09a5
        L_0x09a1:
            r7 = 8
        L_0x09a3:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x09a5:
            int r2 = r2 + 1
            goto L_0x0961
        L_0x09a8:
            r23 = r7
            r3 = 0
        L_0x09ab:
            ei r1 = r0.e
            int r1 = r1.m()
            int r1 = r1 + r23
            ei r2 = r0.e
            int r2 = r2.n()
            int r2 = r2 + r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 11
            if (r4 < r5) goto L_0x09f7
            r4 = r39
            int r1 = resolveSizeAndState(r1, r4, r3)
            int r3 = r3 << 16
            r4 = r40
            int r2 = resolveSizeAndState(r2, r4, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.h
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.i
            int r2 = java.lang.Math.min(r3, r2)
            ei r3 = r0.e
            boolean r3 = r3.ap
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x09e8
            r1 = r1 | r4
        L_0x09e8:
            ei r3 = r0.e
            boolean r3 = r3.aq
            if (r3 == 0) goto L_0x09ef
            r2 = r2 | r4
        L_0x09ef:
            r0.setMeasuredDimension(r1, r2)
            r0.n = r1
            r0.o = r2
            return
        L_0x09f7:
            r0.setMeasuredDimension(r1, r2)
            r0.n = r1
            r0.o = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.aj;
            if ((childAt.getVisibility() != 8 || layoutParams.W || layoutParams.X || isInEditMode) && !layoutParams.Y) {
                int o2 = constraintWidget.o();
                int p2 = constraintWidget.p();
                int m2 = constraintWidget.m() + o2;
                int n2 = constraintWidget.n() + p2;
                childAt.layout(o2, p2, m2, n2);
                if (childAt instanceof Placeholder) {
                    View view = ((Placeholder) childAt).b;
                    if (view != null) {
                        view.setVisibility(0);
                        view.layout(o2, p2, m2, n2);
                    }
                }
            }
        }
        int size = this.c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((ConstraintHelper) this.c.get(i7)).d();
            }
        }
    }

    public static LayoutParams a() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View a(int i2) {
        return (View) this.b.get(i2);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f2 = (float) i3;
                            float f3 = (float) i4;
                            float f4 = (float) (i3 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f5 = f3;
                            float f6 = f3;
                            float f7 = f4;
                            float f8 = f2;
                            Paint paint2 = paint;
                            canvas2.drawLine(f2, f5, f7, f6, paint);
                            float f9 = (float) (i4 + parseInt4);
                            float f10 = f4;
                            float f11 = f9;
                            canvas2.drawLine(f10, f6, f7, f11, paint);
                            float f12 = f9;
                            float f13 = f8;
                            canvas2.drawLine(f10, f12, f13, f11, paint);
                            float f14 = f8;
                            canvas2.drawLine(f14, f12, f13, f6, paint);
                            paint.setColor(-16711936);
                            float f15 = f4;
                            Paint paint3 = paint;
                            canvas2.drawLine(f14, f6, f15, f9, paint);
                            canvas2.drawLine(f14, f9, f15, f6, paint);
                        }
                    }
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.j = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}

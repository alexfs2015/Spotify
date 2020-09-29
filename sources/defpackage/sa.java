package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: sa reason: default package */
public final class sa extends rz {
    static final Mode a = Mode.SRC_IN;
    boolean c;
    private g d;
    private PorterDuffColorFilter e;
    private ColorFilter f;
    private boolean g;
    private ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    /* renamed from: sa$a */
    static class a extends e {
        a() {
        }

        a(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        public void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.l = ge.b(string2);
            }
            this.n = gc.a(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: sa$b */
    static class b extends e {
        fx a;
        float b = 0.0f;
        fx c;
        float d = 1.0f;
        float e = 1.0f;
        float f = 0.0f;
        float g = 1.0f;
        float h = 0.0f;
        Cap i = Cap.BUTT;
        Join j = Join.MITER;
        float k = 4.0f;
        private int[] p;

        b() {
        }

        b(b bVar) {
            super(bVar);
            this.p = bVar.p;
            this.a = bVar.a;
            this.b = bVar.b;
            this.d = bVar.d;
            this.c = bVar.c;
            this.n = bVar.n;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
        }

        private static Cap a(int i2, Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Cap.SQUARE : Cap.ROUND : Cap.BUTT;
        }

        private static Join a(int i2, Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Join.BEVEL : Join.ROUND : Join.MITER;
        }

        /* access modifiers changed from: 0000 */
        public void a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.p = null;
            if (gc.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.m = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.l = ge.b(string2);
                }
                Theme theme2 = theme;
                this.c = gc.a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.e = gc.a(typedArray, xmlPullParser, "fillAlpha", 12, this.e);
                this.i = a(gc.a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.i);
                this.j = a(gc.a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.j);
                this.k = gc.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.k);
                this.a = gc.a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.d = gc.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.d);
                this.b = gc.a(typedArray, xmlPullParser, "strokeWidth", 4, this.b);
                this.g = gc.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.g);
                this.h = gc.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.h);
                this.f = gc.a(typedArray, xmlPullParser, "trimPathStart", 5, this.f);
                this.n = gc.a(typedArray, xmlPullParser, "fillType", 13, this.n);
            }
        }

        public final boolean a(int[] iArr) {
            return this.a.a(iArr) | this.c.a(iArr);
        }

        public final boolean b() {
            return this.c.b() || this.a.b();
        }

        /* access modifiers changed from: 0000 */
        public final float getFillAlpha() {
            return this.e;
        }

        /* access modifiers changed from: 0000 */
        public final int getFillColor() {
            return this.c.b;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeAlpha() {
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        public final int getStrokeColor() {
            return this.a.b;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeWidth() {
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathEnd() {
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathOffset() {
            return this.h;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathStart() {
            return this.f;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillAlpha(float f2) {
            this.e = f2;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillColor(int i2) {
            this.c.b = i2;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeAlpha(float f2) {
            this.d = f2;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeColor(int i2) {
            this.a.b = i2;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeWidth(float f2) {
            this.b = f2;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathEnd(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathOffset(float f2) {
            this.h = f2;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathStart(float f2) {
            this.f = f2;
        }
    }

    /* renamed from: sa$c */
    static class c extends d {
        final Matrix a = new Matrix();
        final ArrayList<d> b = new ArrayList<>();
        float c = 0.0f;
        float d = 0.0f;
        float e = 0.0f;
        float f = 1.0f;
        float g = 1.0f;
        float h = 0.0f;
        float i = 0.0f;
        final Matrix j = new Matrix();
        int k;
        int[] l;
        String m = null;

        public c() {
            super(0);
        }

        public c(c cVar, dp<String, Object> dpVar) {
            e eVar;
            super(0);
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.k = cVar.k;
            String str = this.m;
            if (str != null) {
                dpVar.put(str, this);
            }
            this.j.set(cVar.j);
            ArrayList<d> arrayList = cVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof c) {
                    this.b.add(new c((c) obj, dpVar));
                } else {
                    if (obj instanceof b) {
                        eVar = new b((b) obj);
                    } else if (obj instanceof a) {
                        eVar = new a((a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(eVar);
                    if (eVar.m != null) {
                        dpVar.put(eVar.m, eVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= ((d) this.b.get(i2)).a(iArr);
            }
            return z;
        }

        public final boolean b() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (((d) this.b.get(i2)).b()) {
                    return true;
                }
            }
            return false;
        }

        public final String getGroupName() {
            return this.m;
        }

        public final Matrix getLocalMatrix() {
            return this.j;
        }

        public final float getPivotX() {
            return this.d;
        }

        public final float getPivotY() {
            return this.e;
        }

        public final float getRotation() {
            return this.c;
        }

        public final float getScaleX() {
            return this.f;
        }

        public final float getScaleY() {
            return this.g;
        }

        public final float getTranslateX() {
            return this.h;
        }

        public final float getTranslateY() {
            return this.i;
        }

        public final void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                a();
            }
        }

        public final void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                a();
            }
        }

        public final void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                a();
            }
        }

        public final void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                a();
            }
        }

        public final void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                a();
            }
        }

        public final void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                a();
            }
        }

        public final void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                a();
            }
        }
    }

    /* renamed from: sa$d */
    static abstract class d {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public boolean a(int[] iArr) {
            return false;
        }

        public boolean b() {
            return false;
        }
    }

    /* renamed from: sa$e */
    static abstract class e extends d {
        protected defpackage.ge.b[] l = null;
        String m;
        int n = 0;
        int o;

        public e() {
            super(0);
        }

        public e(e eVar) {
            super(0);
            this.m = eVar.m;
            this.o = eVar.o;
            this.l = ge.a(eVar.l);
        }

        public final void a(Path path) {
            path.reset();
            defpackage.ge.b[] bVarArr = this.l;
            if (bVarArr != null) {
                defpackage.ge.b.a(bVarArr, path);
            }
        }

        public boolean a() {
            return false;
        }

        public defpackage.ge.b[] getPathData() {
            return this.l;
        }

        public String getPathName() {
            return this.m;
        }

        public void setPathData(defpackage.ge.b[] bVarArr) {
            if (!ge.a(this.l, bVarArr)) {
                this.l = ge.a(bVarArr);
                return;
            }
            defpackage.ge.b[] bVarArr2 = this.l;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].a = bVarArr[i].a;
                for (int i2 = 0; i2 < bVarArr[i].b.length; i2++) {
                    bVarArr2[i].b[i2] = bVarArr[i].b[i2];
                }
            }
        }
    }

    /* renamed from: sa$f */
    static class f {
        private static final Matrix l = new Matrix();
        Paint a;
        Paint b;
        final c c;
        float d;
        float e;
        float f;
        float g;
        String h;
        final dp<String, Object> i;
        private final Path j;
        private final Path k;
        private final Matrix m;
        private PathMeasure n;
        private int o;
        private int p;
        private Boolean q;

        public f() {
            this.m = new Matrix();
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.p = 255;
            this.h = null;
            this.q = null;
            this.i = new dp<>();
            this.c = new c();
            this.j = new Path();
            this.k = new Path();
        }

        public f(f fVar) {
            this.m = new Matrix();
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.p = 255;
            this.h = null;
            this.q = null;
            this.i = new dp<>();
            this.c = new c(fVar.c, this.i);
            this.j = new Path(fVar.j);
            this.k = new Path(fVar.k);
            this.d = fVar.d;
            this.e = fVar.e;
            this.f = fVar.f;
            this.g = fVar.g;
            this.o = fVar.o;
            this.p = fVar.p;
            this.h = fVar.h;
            String str = fVar.h;
            if (str != null) {
                this.i.put(str, this);
            }
            this.q = fVar.q;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        /* JADX WARNING: type inference failed for: r11v3 */
        /* JADX WARNING: type inference failed for: r11v4 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v1, types: [boolean]
          assigns: []
          uses: [?[int, short, byte, char], boolean]
          mth insns count: 230
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(defpackage.sa.c r17, android.graphics.Matrix r18, android.graphics.Canvas r19, int r20, int r21, android.graphics.ColorFilter r22) {
            /*
                r16 = this;
                r7 = r16
                r8 = r17
                r9 = r19
                r10 = r22
                android.graphics.Matrix r0 = r8.a
                r1 = r18
                r0.set(r1)
                android.graphics.Matrix r0 = r8.a
                android.graphics.Matrix r1 = r8.j
                r0.preConcat(r1)
                r19.save()
                r11 = 0
                r12 = 0
            L_0x001b:
                java.util.ArrayList<sa$d> r0 = r8.b
                int r0 = r0.size()
                if (r12 >= r0) goto L_0x0222
                java.util.ArrayList<sa$d> r0 = r8.b
                java.lang.Object r0 = r0.get(r12)
                sa$d r0 = (defpackage.sa.d) r0
                boolean r1 = r0 instanceof defpackage.sa.c
                if (r1 == 0) goto L_0x0043
                r1 = r0
                sa$c r1 = (defpackage.sa.c) r1
                android.graphics.Matrix r2 = r8.a
                r0 = r16
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r0.a(r1, r2, r3, r4, r5, r6)
                goto L_0x0217
            L_0x0043:
                boolean r1 = r0 instanceof defpackage.sa.e
                if (r1 == 0) goto L_0x0217
                sa$e r0 = (defpackage.sa.e) r0
                r1 = r20
                float r2 = (float) r1
                float r3 = r7.f
                float r2 = r2 / r3
                r3 = r21
                float r4 = (float) r3
                float r5 = r7.g
                float r4 = r4 / r5
                float r5 = java.lang.Math.min(r2, r4)
                android.graphics.Matrix r6 = r8.a
                android.graphics.Matrix r13 = r7.m
                r13.set(r6)
                android.graphics.Matrix r13 = r7.m
                r13.postScale(r2, r4)
                r2 = 4
                float[] r2 = new float[r2]
                r2 = {0, 1065353216, 1065353216, 0} // fill-array
                r6.mapVectors(r2)
                r4 = r2[r11]
                double r13 = (double) r4
                r4 = 1
                r6 = r2[r4]
                r18 = r5
                double r4 = (double) r6
                double r4 = java.lang.Math.hypot(r13, r4)
                float r4 = (float) r4
                r5 = 2
                r6 = r2[r5]
                double r13 = (double) r6
                r6 = 3
                r15 = r2[r6]
                double r6 = (double) r15
                double r6 = java.lang.Math.hypot(r13, r6)
                float r6 = (float) r6
                r7 = r2[r11]
                r13 = 1
                r14 = r2[r13]
                r5 = r2[r5]
                r13 = 3
                r2 = r2[r13]
                float r7 = r7 * r2
                float r14 = r14 * r5
                float r7 = r7 - r14
                float r2 = java.lang.Math.max(r4, r6)
                r4 = 0
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x00a8
                float r5 = java.lang.Math.abs(r7)
                float r2 = r5 / r2
                goto L_0x00a9
            L_0x00a8:
                r2 = 0
            L_0x00a9:
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0214
                r5 = r16
                android.graphics.Path r6 = r5.j
                r0.a(r6)
                android.graphics.Path r6 = r5.j
                android.graphics.Path r7 = r5.k
                r7.reset()
                boolean r7 = r0.a()
                if (r7 == 0) goto L_0x00dd
                android.graphics.Path r2 = r5.k
                int r0 = r0.n
                if (r0 != 0) goto L_0x00ca
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
                goto L_0x00cc
            L_0x00ca:
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            L_0x00cc:
                r2.setFillType(r0)
                android.graphics.Path r0 = r5.k
                android.graphics.Matrix r2 = r5.m
                r0.addPath(r6, r2)
                android.graphics.Path r0 = r5.k
                r9.clipPath(r0)
                goto L_0x021c
            L_0x00dd:
                sa$b r0 = (defpackage.sa.b) r0
                float r7 = r0.f
                r13 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 != 0) goto L_0x00ed
                float r7 = r0.g
                int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r7 == 0) goto L_0x0131
            L_0x00ed:
                float r7 = r0.f
                float r14 = r0.h
                float r7 = r7 + r14
                float r7 = r7 % r13
                float r14 = r0.g
                float r15 = r0.h
                float r14 = r14 + r15
                float r14 = r14 % r13
                android.graphics.PathMeasure r13 = r5.n
                if (r13 != 0) goto L_0x0104
                android.graphics.PathMeasure r13 = new android.graphics.PathMeasure
                r13.<init>()
                r5.n = r13
            L_0x0104:
                android.graphics.PathMeasure r13 = r5.n
                android.graphics.Path r15 = r5.j
                r13.setPath(r15, r11)
                android.graphics.PathMeasure r13 = r5.n
                float r13 = r13.getLength()
                float r7 = r7 * r13
                float r14 = r14 * r13
                r6.reset()
                int r15 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r15 <= 0) goto L_0x0128
                android.graphics.PathMeasure r15 = r5.n
                r11 = 1
                r15.getSegment(r7, r13, r6, r11)
                android.graphics.PathMeasure r7 = r5.n
                r7.getSegment(r4, r14, r6, r11)
                goto L_0x012e
            L_0x0128:
                r11 = 1
                android.graphics.PathMeasure r13 = r5.n
                r13.getSegment(r7, r14, r6, r11)
            L_0x012e:
                r6.rLineTo(r4, r4)
            L_0x0131:
                android.graphics.Path r4 = r5.k
                android.graphics.Matrix r7 = r5.m
                r4.addPath(r6, r7)
                fx r4 = r0.c
                boolean r4 = r4.c()
                r6 = 1132396544(0x437f0000, float:255.0)
                r7 = 255(0xff, float:3.57E-43)
                r11 = 0
                if (r4 == 0) goto L_0x019f
                fx r4 = r0.c
                android.graphics.Paint r13 = r5.b
                if (r13 != 0) goto L_0x015a
                android.graphics.Paint r13 = new android.graphics.Paint
                r14 = 1
                r13.<init>(r14)
                r5.b = r13
                android.graphics.Paint r13 = r5.b
                android.graphics.Paint$Style r14 = android.graphics.Paint.Style.FILL
                r13.setStyle(r14)
            L_0x015a:
                android.graphics.Paint r13 = r5.b
                boolean r14 = r4.a()
                if (r14 == 0) goto L_0x0178
                android.graphics.Shader r4 = r4.a
                android.graphics.Matrix r14 = r5.m
                r4.setLocalMatrix(r14)
                r13.setShader(r4)
                float r4 = r0.e
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r13.setAlpha(r4)
                goto L_0x0189
            L_0x0178:
                r13.setShader(r11)
                r13.setAlpha(r7)
                int r4 = r4.b
                float r14 = r0.e
                int r4 = defpackage.sa.a(r4, r14)
                r13.setColor(r4)
            L_0x0189:
                r13.setColorFilter(r10)
                android.graphics.Path r4 = r5.k
                int r14 = r0.n
                if (r14 != 0) goto L_0x0195
                android.graphics.Path$FillType r14 = android.graphics.Path.FillType.WINDING
                goto L_0x0197
            L_0x0195:
                android.graphics.Path$FillType r14 = android.graphics.Path.FillType.EVEN_ODD
            L_0x0197:
                r4.setFillType(r14)
                android.graphics.Path r4 = r5.k
                r9.drawPath(r4, r13)
            L_0x019f:
                fx r4 = r0.a
                boolean r4 = r4.c()
                if (r4 == 0) goto L_0x021c
                fx r4 = r0.a
                android.graphics.Paint r13 = r5.a
                if (r13 != 0) goto L_0x01bc
                android.graphics.Paint r13 = new android.graphics.Paint
                r14 = 1
                r13.<init>(r14)
                r5.a = r13
                android.graphics.Paint r13 = r5.a
                android.graphics.Paint$Style r14 = android.graphics.Paint.Style.STROKE
                r13.setStyle(r14)
            L_0x01bc:
                android.graphics.Paint r13 = r5.a
                android.graphics.Paint$Join r14 = r0.j
                if (r14 == 0) goto L_0x01c7
                android.graphics.Paint$Join r14 = r0.j
                r13.setStrokeJoin(r14)
            L_0x01c7:
                android.graphics.Paint$Cap r14 = r0.i
                if (r14 == 0) goto L_0x01d0
                android.graphics.Paint$Cap r14 = r0.i
                r13.setStrokeCap(r14)
            L_0x01d0:
                float r14 = r0.k
                r13.setStrokeMiter(r14)
                boolean r14 = r4.a()
                if (r14 == 0) goto L_0x01f1
                android.graphics.Shader r4 = r4.a
                android.graphics.Matrix r7 = r5.m
                r4.setLocalMatrix(r7)
                r13.setShader(r4)
                float r4 = r0.d
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r13.setAlpha(r4)
                goto L_0x0202
            L_0x01f1:
                r13.setShader(r11)
                r13.setAlpha(r7)
                int r4 = r4.b
                float r6 = r0.d
                int r4 = defpackage.sa.a(r4, r6)
                r13.setColor(r4)
            L_0x0202:
                r13.setColorFilter(r10)
                float r2 = r2 * r18
                float r0 = r0.b
                float r0 = r0 * r2
                r13.setStrokeWidth(r0)
                android.graphics.Path r0 = r5.k
                r9.drawPath(r0, r13)
                goto L_0x021c
            L_0x0214:
                r5 = r16
                goto L_0x021c
            L_0x0217:
                r1 = r20
                r3 = r21
                r5 = r7
            L_0x021c:
                int r12 = r12 + 1
                r7 = r5
                r11 = 0
                goto L_0x001b
            L_0x0222:
                r5 = r7
                r19.restore()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sa.f.a(sa$c, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }

        public final void a(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            a(this.c, l, canvas, i2, i3, null);
        }

        public final boolean a() {
            if (this.q == null) {
                this.q = Boolean.valueOf(this.c.b());
            }
            return this.q.booleanValue();
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public final int getRootAlpha() {
            return this.p;
        }

        public final void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public final void setRootAlpha(int i2) {
            this.p = i2;
        }
    }

    /* renamed from: sa$g */
    static class g extends ConstantState {
        int a;
        f b;
        ColorStateList c;
        Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public g() {
            this.c = null;
            this.d = sa.a;
            this.b = new f();
        }

        public g(g gVar) {
            this.c = null;
            this.d = sa.a;
            if (gVar != null) {
                this.a = gVar.a;
                this.b = new f(gVar.b);
                if (gVar.b.b != null) {
                    this.b.b = new Paint(gVar.b.b);
                }
                if (gVar.b.a != null) {
                    this.b.a = new Paint(gVar.b.a);
                }
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        public final void a(int i2, int i3) {
            this.f.eraseColor(0);
            this.b.a(new Canvas(this.f), i2, i3, null);
        }

        public final int getChangingConfigurations() {
            return this.a;
        }

        public final Drawable newDrawable() {
            return new sa(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new sa(this);
        }
    }

    /* renamed from: sa$h */
    static class h extends ConstantState {
        private final ConstantState a;

        public h(ConstantState constantState) {
            this.a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            sa saVar = new sa();
            saVar.b = (VectorDrawable) this.a.newDrawable();
            return saVar;
        }

        public final Drawable newDrawable(Resources resources) {
            sa saVar = new sa();
            saVar.b = (VectorDrawable) this.a.newDrawable(resources);
            return saVar;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            sa saVar = new sa();
            saVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return saVar;
        }
    }

    sa() {
        this.c = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.d = new g();
    }

    sa(g gVar) {
        this.c = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.d = gVar;
        this.e = a(gVar.c, gVar.d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public static sa a(Resources resources, int i2, Theme theme) {
        int next;
        String str = "parser error";
        String str2 = "VectorDrawableCompat";
        if (VERSION.SDK_INT >= 24) {
            sa saVar = new sa();
            saVar.b = gb.a(resources, i2, theme);
            saVar.h = new h(saVar.b.getConstantState());
            return saVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (XmlPullParserException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (IOException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    public static sa a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        sa saVar = new sa();
        saVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return saVar;
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        g gVar = this.d;
        f fVar = gVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i2 = 1; eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3); i2 = 1) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    TypedArray a2 = gc.a(resources2, theme2, attributeSet2, rs.c);
                    bVar.a(a2, xmlPullParser2, theme2);
                    a2.recycle();
                    cVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.i.put(bVar.getPathName(), bVar);
                    }
                    gVar.a = bVar.o | gVar.a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    if (gc.a(xmlPullParser2, "pathData")) {
                        TypedArray a3 = gc.a(resources2, theme2, attributeSet2, rs.d);
                        aVar.a(a3, xmlPullParser2);
                        a3.recycle();
                    }
                    cVar.b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.i.put(aVar.getPathName(), aVar);
                    }
                    gVar.a = aVar.o | gVar.a;
                } else if (str.equals(name)) {
                    c cVar2 = new c();
                    TypedArray a4 = gc.a(resources2, theme2, attributeSet2, rs.b);
                    cVar2.l = null;
                    cVar2.c = gc.a(a4, xmlPullParser2, "rotation", 5, cVar2.c);
                    cVar2.d = a4.getFloat(1, cVar2.d);
                    cVar2.e = a4.getFloat(2, cVar2.e);
                    cVar2.f = gc.a(a4, xmlPullParser2, "scaleX", 3, cVar2.f);
                    cVar2.g = gc.a(a4, xmlPullParser2, "scaleY", 4, cVar2.g);
                    cVar2.h = gc.a(a4, xmlPullParser2, "translateX", 6, cVar2.h);
                    cVar2.i = gc.a(a4, xmlPullParser2, "translateY", 7, cVar2.i);
                    String string = a4.getString(0);
                    if (string != null) {
                        cVar2.m = string;
                    }
                    cVar2.a();
                    a4.recycle();
                    cVar.b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.i.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.a = cVar2.k | gVar.a;
                }
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: 0000 */
    public final Object a(String str) {
        return this.d.b.i.get(str);
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public final boolean canApplyTheme() {
        if (this.b != null) {
            gm.c(this.b);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
        if ((r1 == r6.f.getWidth() && r3 == r6.f.getHeight()) == false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.b
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.Drawable r0 = r10.b
            r0.draw(r11)
            return
        L_0x000a:
            android.graphics.Rect r0 = r10.k
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.k
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x0179
            android.graphics.Rect r0 = r10.k
            int r0 = r0.height()
            if (r0 > 0) goto L_0x0021
            goto L_0x0179
        L_0x0021:
            android.graphics.ColorFilter r0 = r10.f
            if (r0 != 0) goto L_0x0027
            android.graphics.PorterDuffColorFilter r0 = r10.e
        L_0x0027:
            android.graphics.Matrix r1 = r10.j
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.j
            float[] r2 = r10.i
            r1.getValues(r2)
            float[] r1 = r10.i
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.i
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.i
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.i
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0066
        L_0x0062:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0066:
            android.graphics.Rect r4 = r10.k
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.k
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x0179
            if (r3 > 0) goto L_0x008a
            goto L_0x0179
        L_0x008a:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.k
            int r6 = r6.left
            float r6 = (float) r6
            android.graphics.Rect r9 = r10.k
            int r9 = r9.top
            float r9 = (float) r9
            r11.translate(r6, r9)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 17
            if (r6 < r9) goto L_0x00af
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00af
            int r6 = defpackage.gm.h(r10)
            if (r6 != r5) goto L_0x00af
            r6 = 1
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            if (r6 == 0) goto L_0x00c1
            android.graphics.Rect r6 = r10.k
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00c1:
            android.graphics.Rect r6 = r10.k
            r6.offsetTo(r2, r2)
            sa$g r6 = r10.d
            android.graphics.Bitmap r7 = r6.f
            if (r7 == 0) goto L_0x00e1
            android.graphics.Bitmap r7 = r6.f
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00de
            android.graphics.Bitmap r7 = r6.f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00de
            r7 = 1
            goto L_0x00df
        L_0x00de:
            r7 = 0
        L_0x00df:
            if (r7 != 0) goto L_0x00eb
        L_0x00e1:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f = r7
            r6.k = r5
        L_0x00eb:
            boolean r6 = r10.c
            if (r6 != 0) goto L_0x00f5
            sa$g r6 = r10.d
            r6.a(r1, r3)
            goto L_0x0139
        L_0x00f5:
            sa$g r6 = r10.d
            boolean r7 = r6.k
            if (r7 != 0) goto L_0x0119
            android.content.res.ColorStateList r7 = r6.g
            android.content.res.ColorStateList r8 = r6.c
            if (r7 != r8) goto L_0x0119
            android.graphics.PorterDuff$Mode r7 = r6.h
            android.graphics.PorterDuff$Mode r8 = r6.d
            if (r7 != r8) goto L_0x0119
            boolean r7 = r6.j
            boolean r8 = r6.e
            if (r7 != r8) goto L_0x0119
            int r7 = r6.i
            sa$f r6 = r6.b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x0119
            r6 = 1
            goto L_0x011a
        L_0x0119:
            r6 = 0
        L_0x011a:
            if (r6 != 0) goto L_0x0139
            sa$g r6 = r10.d
            r6.a(r1, r3)
            sa$g r1 = r10.d
            android.content.res.ColorStateList r3 = r1.c
            r1.g = r3
            android.graphics.PorterDuff$Mode r3 = r1.d
            r1.h = r3
            sa$f r3 = r1.b
            int r3 = r3.getRootAlpha()
            r1.i = r3
            boolean r3 = r1.e
            r1.j = r3
            r1.k = r2
        L_0x0139:
            sa$g r1 = r10.d
            android.graphics.Rect r3 = r10.k
            sa$f r6 = r1.b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x0148
            r2 = 1
        L_0x0148:
            r6 = 0
            if (r2 != 0) goto L_0x014f
            if (r0 != 0) goto L_0x014f
            r0 = r6
            goto L_0x0171
        L_0x014f:
            android.graphics.Paint r2 = r1.l
            if (r2 != 0) goto L_0x015f
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.l = r2
            android.graphics.Paint r2 = r1.l
            r2.setFilterBitmap(r5)
        L_0x015f:
            android.graphics.Paint r2 = r1.l
            sa$f r5 = r1.b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.l
        L_0x0171:
            android.graphics.Bitmap r1 = r1.f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        return this.b != null ? gm.b(this.b) : this.d.b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        return this.b != null ? gm.d(this.b) : this.f;
    }

    public final ConstantState getConstantState() {
        if (this.b != null && VERSION.SDK_INT >= 24) {
            return new h(this.b.getConstantState());
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : (int) this.d.b.e;
    }

    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : (int) this.d.b.d;
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        ColorStateList colorStateList;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        if (this.b != null) {
            gm.a(this.b, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        g gVar = this.d;
        gVar.b = new f();
        TypedArray a2 = gc.a(resources2, theme2, attributeSet2, rs.a);
        g gVar2 = this.d;
        f fVar = gVar2.b;
        int a3 = gc.a(a2, xmlPullParser2, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        if (a3 == 3) {
            mode = Mode.SRC_OVER;
        } else if (a3 == 5) {
            mode = Mode.SRC_IN;
        } else if (a3 != 9) {
            switch (a3) {
                case 14:
                    mode = Mode.MULTIPLY;
                    break;
                case 15:
                    mode = Mode.SCREEN;
                    break;
                case 16:
                    mode = Mode.ADD;
                    break;
            }
        } else {
            mode = Mode.SRC_ATOP;
        }
        gVar2.d = mode;
        if (gc.a(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            a2.getValue(1, typedValue);
            if (typedValue.type != 2) {
                colorStateList = (typedValue.type < 28 || typedValue.type > 31) ? fw.a(a2.getResources(), a2.getResourceId(1, 0), theme2) : ColorStateList.valueOf(typedValue.data);
            } else {
                StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            gVar2.c = colorStateList;
        }
        gVar2.e = gc.a(a2, xmlPullParser2, "autoMirrored", 5, gVar2.e);
        fVar.f = gc.a(a2, xmlPullParser2, "viewportWidth", 7, fVar.f);
        fVar.g = gc.a(a2, xmlPullParser2, "viewportHeight", 8, fVar.g);
        if (fVar.f <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a2.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        } else if (fVar.g > 0.0f) {
            fVar.d = a2.getDimension(3, fVar.d);
            fVar.e = a2.getDimension(2, fVar.e);
            if (fVar.d <= 0.0f) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2.getPositionDescription());
                sb3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb3.toString());
            } else if (fVar.e > 0.0f) {
                fVar.setAlpha(gc.a(a2, xmlPullParser2, "alpha", 4, fVar.getAlpha()));
                String string = a2.getString(0);
                if (string != null) {
                    fVar.h = string;
                    fVar.i.put(string, fVar);
                }
                a2.recycle();
                gVar.a = getChangingConfigurations();
                gVar.k = true;
                b(resources, xmlPullParser, attributeSet, theme);
                this.e = a(gVar.c, gVar.d);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(a2.getPositionDescription());
                sb4.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a2.getPositionDescription());
            sb5.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb5.toString());
        }
    }

    public final void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        return this.b != null ? gm.a(this.b) : this.d.e;
    }

    public final boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.d;
            if (gVar == null || (!gVar.b.a() && (this.d.c == null || !this.d.c.isStateful()))) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.d = new g(this.d);
            this.g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        boolean z = false;
        g gVar = this.d;
        if (!(gVar.c == null || gVar.d == null)) {
            this.e = a(gVar.c, gVar.d);
            invalidateSelf();
            z = true;
        }
        if (gVar.b.a()) {
            boolean a2 = gVar.b.c.a(iArr);
            gVar.k |= a2;
            if (a2) {
                invalidateSelf();
                z = true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j2) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.b != null) {
            this.b.setAlpha(i2);
            return;
        }
        if (this.d.b.getRootAlpha() != i2) {
            this.d.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            gm.a(this.b, z);
        } else {
            this.d.e = z;
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i2, Mode mode) {
        super.setColorFilter(i2, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i2) {
        if (this.b != null) {
            gm.a(this.b, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            gm.a(this.b, colorStateList);
            return;
        }
        g gVar = this.d;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.e = a(colorStateList, gVar.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            gm.a(this.b, mode);
            return;
        }
        g gVar = this.d;
        if (gVar.d != mode) {
            gVar.d = mode;
            this.e = a(gVar.c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.b != null ? this.b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}

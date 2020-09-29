package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    private static final String[] m = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<b, float[]> n = new Property<b, float[]>(float[].class, "nonTranslations") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            b bVar = (b) obj;
            float[] fArr = (float[]) obj2;
            System.arraycopy(fArr, 0, bVar.b, 0, fArr.length);
            bVar.a();
        }
    };
    private static final Property<b, PointF> o = new Property<b, PointF>(PointF.class, "translations") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            b bVar = (b) obj;
            PointF pointF = (PointF) obj2;
            bVar.c = pointF.x;
            bVar.d = pointF.y;
            bVar.a();
        }
    };
    private static final boolean p;
    boolean a = true;
    private boolean q = true;
    private Matrix r = new Matrix();

    static class a extends qq {
        private View a;
        private qg b;

        a(View view, qg qgVar) {
            this.a = view;
            this.b = qgVar;
        }

        public final void a(Transition transition) {
            transition.b((androidx.transition.Transition.c) this);
            View view = this.a;
            if (VERSION.SDK_INT >= 21) {
                qf.a(view);
            } else {
                qe.a(view);
            }
            this.a.setTag(R.id.transition_transform, null);
            this.a.setTag(R.id.parent_matrix, null);
        }

        public final void a() {
            this.b.setVisibility(4);
        }

        public final void b() {
            this.b.setVisibility(0);
        }
    }

    static class b {
        final Matrix a = new Matrix();
        final float[] b;
        float c;
        float d;
        private final View e;

        b(View view, float[] fArr) {
            this.e = view;
            this.b = (float[]) fArr.clone();
            float[] fArr2 = this.b;
            this.c = fArr2[2];
            this.d = fArr2[5];
            a();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            float[] fArr = this.b;
            fArr[2] = this.c;
            fArr[5] = this.d;
            this.a.setValues(fArr);
            re.c(this.e, this.a);
        }
    }

    static class c {
        private float a;
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;

        c(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = ip.p(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public final void a(View view) {
            ChangeTransform.a(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a == this.a && cVar.b == this.b && cVar.c == this.c && cVar.d == this.d && cVar.e == this.e && cVar.f == this.f && cVar.g == this.g && cVar.h == this.h) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            float f2 = this.a;
            int i = 0;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.h;
            if (f9 != 0.0f) {
                i = Float.floatToIntBits(f9);
            }
            return floatToIntBits7 + i;
        }
    }

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        }
        p = z;
    }

    public ChangeTransform() {
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qp.e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.a = gc.a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.q = gc.a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    public final String[] a() {
        return m;
    }

    private void d(qu quVar) {
        View view = quVar.b;
        if (view.getVisibility() != 8) {
            quVar.a.put("android:changeTransform:parent", view.getParent());
            quVar.a.put("android:changeTransform:transforms", new c(view));
            Matrix matrix = view.getMatrix();
            quVar.a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.q) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                re.a((View) viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                quVar.a.put("android:changeTransform:parentMatrix", matrix2);
                quVar.a.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
                quVar.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
            }
        }
    }

    public final void a(qu quVar) {
        d(quVar);
        if (!p) {
            ((ViewGroup) quVar.b.getParent()).startViewTransition(quVar.b);
        }
    }

    public final void b(qu quVar) {
        d(quVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 == r2.b) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r10 == r1) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.view.ViewGroup r18, defpackage.qu r19, defpackage.qu r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            r9 = r20
            r0 = 0
            if (r8 == 0) goto L_0x015a
            if (r9 == 0) goto L_0x015a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.a
            java.lang.String r2 = "android:changeTransform:parent"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x015a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.a
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x001f
            goto L_0x015a
        L_0x001f:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.a
            java.lang.Object r1 = r1.get(r2)
            r10 = r1
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.a
            java.lang.Object r1 = r1.get(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r7.q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0058
            boolean r2 = r7.b(r10)
            if (r2 == 0) goto L_0x0051
            boolean r2 = r7.b(r1)
            if (r2 != 0) goto L_0x0043
            goto L_0x0051
        L_0x0043:
            qu r2 = r7.b(r10, r3)
            if (r2 == 0) goto L_0x004f
            android.view.View r2 = r2.b
            if (r1 != r2) goto L_0x004f
        L_0x004d:
            r1 = 1
            goto L_0x0054
        L_0x004f:
            r1 = 0
            goto L_0x0054
        L_0x0051:
            if (r10 != r1) goto L_0x004f
            goto L_0x004d
        L_0x0054:
            if (r1 != 0) goto L_0x0058
            r11 = 1
            goto L_0x0059
        L_0x0058:
            r11 = 0
        L_0x0059:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.a
            java.lang.String r2 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r2 = "android:changeTransform:matrix"
            if (r1 == 0) goto L_0x006c
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.a
            r5.put(r2, r1)
        L_0x006c:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.a
            java.lang.String r5 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r1.get(r5)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r5 = "android:changeTransform:parentMatrix"
            if (r1 == 0) goto L_0x007f
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            r6.put(r5, r1)
        L_0x007f:
            if (r11 == 0) goto L_0x00bb
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.a
            java.lang.Object r1 = r1.get(r5)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            android.view.View r6 = r9.b
            r12 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            r6.setTag(r12, r1)
            android.graphics.Matrix r6 = r7.r
            r6.reset()
            r1.invert(r6)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x00ad
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.Object> r12 = r8.a
            r12.put(r2, r1)
        L_0x00ad:
            java.util.Map<java.lang.String, java.lang.Object> r12 = r8.a
            java.lang.Object r5 = r12.get(r5)
            android.graphics.Matrix r5 = (android.graphics.Matrix) r5
            r1.postConcat(r5)
            r1.postConcat(r6)
        L_0x00bb:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.util.Map<java.lang.String, java.lang.Object> r5 = r9.a
            java.lang.Object r2 = r5.get(r2)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r1 != 0) goto L_0x00cf
            android.graphics.Matrix r1 = defpackage.qi.a
        L_0x00cf:
            if (r2 != 0) goto L_0x00d3
            android.graphics.Matrix r2 = defpackage.qi.a
        L_0x00d3:
            r5 = r2
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x00db
            goto L_0x0145
        L_0x00db:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.a
            java.lang.String r2 = "android:changeTransform:transforms"
            java.lang.Object r0 = r0.get(r2)
            r6 = r0
            androidx.transition.ChangeTransform$c r6 = (androidx.transition.ChangeTransform.c) r6
            android.view.View r12 = r9.b
            a(r12)
            r0 = 9
            float[] r2 = new float[r0]
            r1.getValues(r2)
            float[] r1 = new float[r0]
            r5.getValues(r1)
            androidx.transition.ChangeTransform$b r13 = new androidx.transition.ChangeTransform$b
            r13.<init>(r12, r2)
            android.util.Property<androidx.transition.ChangeTransform$b, float[]> r14 = n
            qc r15 = new qc
            float[] r0 = new float[r0]
            r15.<init>(r0)
            r0 = 2
            float[][] r9 = new float[r0][]
            r9[r4] = r2
            r9[r3] = r1
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r14, r15, r9)
            androidx.transition.PathMotion r14 = r7.l
            r15 = r2[r0]
            r16 = 5
            r2 = r2[r16]
            r3 = r1[r0]
            r1 = r1[r16]
            android.graphics.Path r1 = r14.a(r15, r2, r3, r1)
            android.util.Property<androidx.transition.ChangeTransform$b, android.graphics.PointF> r2 = o
            android.animation.PropertyValuesHolder r1 = defpackage.ql.a(r2, r1)
            android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r0]
            r0[r4] = r9
            r2 = 1
            r0[r2] = r1
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r13, r0)
            androidx.transition.ChangeTransform$3 r14 = new androidx.transition.ChangeTransform$3
            r0 = r14
            r1 = r17
            r2 = r11
            r3 = r5
            r4 = r12
            r5 = r6
            r6 = r13
            r0.<init>(r2, r3, r4, r5, r6)
            r9.addListener(r14)
            defpackage.qa.a(r9, r14)
            r0 = r9
        L_0x0145:
            if (r11 == 0) goto L_0x0151
            if (r0 == 0) goto L_0x0151
            boolean r1 = r7.a
            if (r1 == 0) goto L_0x0151
            r17.b(r18, r19, r20)
            goto L_0x015a
        L_0x0151:
            boolean r1 = p
            if (r1 != 0) goto L_0x015a
            android.view.View r1 = r8.b
            r10.endViewTransition(r1)
        L_0x015a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.a(android.view.ViewGroup, qu, qu):android.animation.Animator");
    }

    private void b(ViewGroup viewGroup, qu quVar, qu quVar2) {
        qg qgVar;
        View view = quVar2.b;
        Matrix matrix = new Matrix((Matrix) quVar2.a.get("android:changeTransform:parentMatrix"));
        re.b(viewGroup, matrix);
        if (VERSION.SDK_INT >= 21) {
            qgVar = qf.a(view, viewGroup, matrix);
        } else {
            qgVar = qe.a(view, viewGroup);
        }
        if (qgVar != null) {
            qgVar.a((ViewGroup) quVar.a.get("android:changeTransform:parent"), quVar.b);
            Transition transition = this;
            while (transition.g != null) {
                transition = transition.g;
            }
            transition.a((androidx.transition.Transition.c) new a(view, qgVar));
            if (p) {
                if (quVar.b != quVar2.b) {
                    re.a(quVar.b, 0.0f);
                }
                re.a(view, 1.0f);
            }
        }
    }

    static void a(View view) {
        a(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    static void a(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ip.f(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }
}

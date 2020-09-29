package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import org.xmlpull.v1.XmlPullParser;

public class ChangeBounds extends Transition {
    private static final String[] a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> m = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        private Rect a = new Rect();

        public final /* synthetic */ Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.a);
            return new PointF((float) this.a.left, (float) this.a.top);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    };
    private static final Property<a, PointF> n;
    private static final Property<a, PointF> o;
    private static final Property<View, PointF> p;
    private static final Property<View, PointF> q;
    private static final Property<View, PointF> r = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            rj.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static qr v = new qr();
    private int[] s = new int[2];
    private boolean t = false;
    private boolean u = false;

    static class a {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        private View g;

        a(View view) {
            this.g = view;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            rj.a(this.g, this.a, this.b, this.c, this.d);
            this.e = 0;
            this.f = 0;
        }
    }

    static {
        String str = "topLeft";
        n = new Property<a, PointF>(PointF.class, str) {
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                return null;
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                a aVar = (a) obj;
                PointF pointF = (PointF) obj2;
                aVar.a = Math.round(pointF.x);
                aVar.b = Math.round(pointF.y);
                aVar.e++;
                if (aVar.e == aVar.f) {
                    aVar.a();
                }
            }
        };
        String str2 = "bottomRight";
        o = new Property<a, PointF>(PointF.class, str2) {
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                return null;
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                a aVar = (a) obj;
                PointF pointF = (PointF) obj2;
                aVar.c = Math.round(pointF.x);
                aVar.d = Math.round(pointF.y);
                aVar.f++;
                if (aVar.e == aVar.f) {
                    aVar.a();
                }
            }
        };
        p = new Property<View, PointF>(PointF.class, str2) {
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                return null;
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                rj.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        q = new Property<View, PointF>(PointF.class, str) {
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                return null;
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                rj.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
    }

    public ChangeBounds() {
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.b);
        boolean a2 = gc.a(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.t = a2;
    }

    private void d(qz qzVar) {
        View view = qzVar.b;
        if (ip.B(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            qzVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            qzVar.a.put("android:changeBounds:parent", qzVar.b.getParent());
            if (this.t) {
                qzVar.a.put("android:changeBounds:clip", ip.D(view));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v15, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v18, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r4v17, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v24, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v12
      assigns: []
      uses: []
      mth insns count: 189
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.qz r21, defpackage.qz r22) {
        /*
            r19 = this;
            r8 = r19
            r0 = r21
            r1 = r22
            if (r0 == 0) goto L_0x01ad
            if (r1 != 0) goto L_0x000c
            goto L_0x01ad
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r3 = r3.get(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 == 0) goto L_0x01ab
            if (r4 != 0) goto L_0x0024
            goto L_0x01ab
        L_0x0024:
            android.view.View r9 = r1.b
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.a
            java.lang.String r4 = "android:changeBounds:bounds"
            java.lang.Object r3 = r3.get(r4)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.a
            java.lang.Object r4 = r5.get(r4)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r5 = r3.left
            int r6 = r4.left
            int r7 = r3.top
            int r10 = r4.top
            int r11 = r3.right
            int r12 = r4.right
            int r3 = r3.bottom
            int r13 = r4.bottom
            int r4 = r11 - r5
            int r14 = r3 - r7
            int r15 = r12 - r6
            int r2 = r13 - r10
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.a
            r16 = r9
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.a
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            if (r4 == 0) goto L_0x0069
            if (r14 != 0) goto L_0x006d
        L_0x0069:
            if (r15 == 0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
        L_0x006d:
            if (r5 != r6) goto L_0x0075
            if (r7 == r10) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            r17 = 0
            goto L_0x0077
        L_0x0075:
            r17 = 1
        L_0x0077:
            if (r11 != r12) goto L_0x007b
            if (r3 == r13) goto L_0x0080
        L_0x007b:
            int r17 = r17 + 1
            goto L_0x0080
        L_0x007e:
            r17 = 0
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            boolean r18 = r0.equals(r9)
            if (r18 == 0) goto L_0x008c
        L_0x0088:
            if (r0 != 0) goto L_0x008e
            if (r9 == 0) goto L_0x008e
        L_0x008c:
            int r17 = r17 + 1
        L_0x008e:
            r1 = r17
            if (r1 <= 0) goto L_0x01a9
            r17 = r9
            boolean r9 = r8.t
            r18 = r0
            r0 = 2
            if (r9 != 0) goto L_0x011f
            r9 = r16
            defpackage.rj.a(r9, r5, r7, r11, r3)
            if (r1 != r0) goto L_0x00f6
            if (r4 != r15) goto L_0x00b7
            if (r14 != r2) goto L_0x00b7
            androidx.transition.PathMotion r0 = r8.l
            float r1 = (float) r5
            float r2 = (float) r7
            float r3 = (float) r6
            float r4 = (float) r10
            android.graphics.Path r0 = r0.a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = r
            android.animation.ObjectAnimator r0 = defpackage.qo.a(r9, r1, r0)
            goto L_0x011c
        L_0x00b7:
            androidx.transition.ChangeBounds$a r1 = new androidx.transition.ChangeBounds$a
            r1.<init>(r9)
            androidx.transition.PathMotion r2 = r8.l
            float r4 = (float) r5
            float r5 = (float) r7
            float r6 = (float) r6
            float r7 = (float) r10
            android.graphics.Path r2 = r2.a(r4, r5, r6, r7)
            android.util.Property<androidx.transition.ChangeBounds$a, android.graphics.PointF> r4 = n
            android.animation.ObjectAnimator r2 = defpackage.qo.a(r1, r4, r2)
            androidx.transition.PathMotion r4 = r8.l
            float r5 = (float) r11
            float r3 = (float) r3
            float r6 = (float) r12
            float r7 = (float) r13
            android.graphics.Path r3 = r4.a(r5, r3, r6, r7)
            android.util.Property<androidx.transition.ChangeBounds$a, android.graphics.PointF> r4 = o
            android.animation.ObjectAnimator r3 = defpackage.qo.a(r1, r4, r3)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r5 = 0
            r0[r5] = r2
            r2 = 1
            r0[r2] = r3
            r4.playTogether(r0)
            androidx.transition.ChangeBounds$7 r0 = new androidx.transition.ChangeBounds$7
            r0.<init>(r1)
            r4.addListener(r0)
            r0 = r4
            goto L_0x011c
        L_0x00f6:
            if (r5 != r6) goto L_0x010c
            if (r7 == r10) goto L_0x00fb
            goto L_0x010c
        L_0x00fb:
            androidx.transition.PathMotion r0 = r8.l
            float r1 = (float) r11
            float r2 = (float) r3
            float r3 = (float) r12
            float r4 = (float) r13
            android.graphics.Path r0 = r0.a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = p
            android.animation.ObjectAnimator r0 = defpackage.qo.a(r9, r1, r0)
            goto L_0x011c
        L_0x010c:
            androidx.transition.PathMotion r0 = r8.l
            float r1 = (float) r5
            float r2 = (float) r7
            float r3 = (float) r6
            float r4 = (float) r10
            android.graphics.Path r0 = r0.a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = q
            android.animation.ObjectAnimator r0 = defpackage.qo.a(r9, r1, r0)
        L_0x011c:
            r10 = 1
            goto L_0x018f
        L_0x011f:
            r9 = r16
            int r1 = java.lang.Math.max(r4, r15)
            int r3 = java.lang.Math.max(r14, r2)
            int r1 = r1 + r5
            int r3 = r3 + r7
            defpackage.rj.a(r9, r5, r7, r1, r3)
            if (r5 != r6) goto L_0x0135
            if (r7 == r10) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r11 = 0
            goto L_0x0146
        L_0x0135:
            androidx.transition.PathMotion r1 = r8.l
            float r3 = (float) r5
            float r5 = (float) r7
            float r7 = (float) r6
            float r11 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r7, r11)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = r
            android.animation.ObjectAnimator r1 = defpackage.qo.a(r9, r3, r1)
            r11 = r1
        L_0x0146:
            if (r18 != 0) goto L_0x014f
            android.graphics.Rect r1 = new android.graphics.Rect
            r3 = 0
            r1.<init>(r3, r3, r4, r14)
            goto L_0x0152
        L_0x014f:
            r3 = 0
            r1 = r18
        L_0x0152:
            if (r17 != 0) goto L_0x015a
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r3, r15, r2)
            goto L_0x015c
        L_0x015a:
            r4 = r17
        L_0x015c:
            boolean r2 = r1.equals(r4)
            if (r2 != 0) goto L_0x0189
            defpackage.ip.a(r9, r1)
            qr r2 = v
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r1
            r1 = 1
            r0[r1] = r4
            java.lang.String r3 = "clipBounds"
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofObject(r9, r3, r2, r0)
            androidx.transition.ChangeBounds$8 r15 = new androidx.transition.ChangeBounds$8
            r0 = r15
            r7 = 1
            r1 = r19
            r2 = r9
            r3 = r17
            r4 = r6
            r5 = r10
            r6 = r12
            r10 = 1
            r7 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r14.addListener(r15)
            goto L_0x018b
        L_0x0189:
            r10 = 1
            r14 = 0
        L_0x018b:
            android.animation.Animator r0 = defpackage.qy.a(r11, r14)
        L_0x018f:
            android.view.ViewParent r1 = r9.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01a8
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            defpackage.rf.a(r1, r10)
            androidx.transition.ChangeBounds$9 r2 = new androidx.transition.ChangeBounds$9
            r2.<init>(r1)
            r8.a(r2)
        L_0x01a8:
            return r0
        L_0x01a9:
            r0 = 0
            return r0
        L_0x01ab:
            r0 = 0
            return r0
        L_0x01ad:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeBounds.a(android.view.ViewGroup, qz, qz):android.animation.Animator");
    }

    public final void a(qz qzVar) {
        d(qzVar);
    }

    public final String[] a() {
        return a;
    }

    public final void b(qz qzVar) {
        d(qzVar);
    }
}

package com.google.android.material.transformation;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.comscore.streaming.ContentType;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect a = new Rect();
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final int[] d = new int[2];

    public static class a {
        public ezb a;
        public ezd b;

        protected a() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private float a(View view, View view2, ezd ezd) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.b;
        RectF rectF2 = this.c;
        a(view, rectF);
        a(view2, rectF2);
        int i = ezd.a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + ezd.b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + ezd.b;
    }

    private static float a(a aVar, ezc ezc, float f, float f2) {
        long j = ezc.a;
        long j2 = ezc.b;
        ezc a2 = aVar.a.a("expansion");
        return eyu.a(f, f2, ezc.a().getInterpolation(((float) (((a2.a + a2.b) + 17) - j)) / ((float) j2)));
    }

    private static ViewGroup a(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private static void a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.d;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private float b(View view, View view2, ezd ezd) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.b;
        RectF rectF2 = this.c;
        a(view, rectF);
        a(view2, rectF2);
        int i = ezd.a & ContentType.LONG_FORM_ON_DEMAND;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + ezd.c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + ezd.c;
    }

    /* access modifiers changed from: protected */
    public abstract a a(Context context, boolean z);

    public final void a(d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int i = ((FloatingActionButton) view2).c.c;
            return i == 0 || i == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0366 A[LOOP:0: B:93:0x0364->B:94:0x0366, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet b(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r9 = r28
            r10 = r29
            android.content.Context r2 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$a r11 = r0.a(r2, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r14 = 21
            r15 = 1
            r8 = 0
            r7 = 0
            if (r2 < r14) goto L_0x0058
            float r2 = defpackage.ip.o(r28)
            float r3 = defpackage.ip.o(r27)
            float r2 = r2 - r3
            if (r10 == 0) goto L_0x003f
            if (r30 != 0) goto L_0x0034
            float r2 = -r2
            r9.setTranslationZ(r2)
        L_0x0034:
            android.util.Property r2 = android.view.View.TRANSLATION_Z
            float[] r3 = new float[r15]
            r3[r7] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r2, r3)
            goto L_0x004a
        L_0x003f:
            android.util.Property r3 = android.view.View.TRANSLATION_Z
            float[] r4 = new float[r15]
            float r2 = -r2
            r4[r7] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r3, r4)
        L_0x004a:
            ezb r3 = r11.a
            java.lang.String r4 = "elevation"
            ezc r3 = r3.a(r4)
            r3.a(r2)
            r12.add(r2)
        L_0x0058:
            android.graphics.RectF r2 = r0.b
            ezd r3 = r11.b
            float r3 = r0.a(r1, r9, r3)
            ezd r4 = r11.b
            float r4 = r0.b(r1, r9, r4)
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x009d
            int r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x006f
            goto L_0x009d
        L_0x006f:
            if (r10 == 0) goto L_0x0075
            int r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x007b
        L_0x0075:
            if (r10 != 0) goto L_0x008c
            int r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x008c
        L_0x007b:
            ezb r5 = r11.a
            java.lang.String r6 = "translationXCurveUpwards"
            ezc r5 = r5.a(r6)
            ezb r6 = r11.a
            java.lang.String r14 = "translationYCurveUpwards"
            ezc r6 = r6.a(r14)
            goto L_0x00ad
        L_0x008c:
            ezb r5 = r11.a
            java.lang.String r6 = "translationXCurveDownwards"
            ezc r5 = r5.a(r6)
            ezb r6 = r11.a
            java.lang.String r14 = "translationYCurveDownwards"
            ezc r6 = r6.a(r14)
            goto L_0x00ad
        L_0x009d:
            ezb r5 = r11.a
            java.lang.String r6 = "translationXLinear"
            ezc r5 = r5.a(r6)
            ezb r6 = r11.a
            java.lang.String r14 = "translationYLinear"
            ezc r6 = r6.a(r14)
        L_0x00ad:
            if (r10 == 0) goto L_0x00f7
            if (r30 != 0) goto L_0x00b9
            float r14 = -r3
            r9.setTranslationX(r14)
            float r14 = -r4
            r9.setTranslationY(r14)
        L_0x00b9:
            android.util.Property r14 = android.view.View.TRANSLATION_X
            r17 = r13
            float[] r13 = new float[r15]
            r13[r7] = r8
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r14, r13)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            r18 = r13
            float[] r13 = new float[r15]
            r13[r7] = r8
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r14, r13)
            float r3 = -r3
            float r4 = -r4
            float r3 = a(r11, r5, r3, r8)
            float r4 = a(r11, r6, r4, r8)
            android.graphics.Rect r14 = r0.a
            r9.getWindowVisibleDisplayFrame(r14)
            android.graphics.RectF r8 = r0.b
            r8.set(r14)
            android.graphics.RectF r14 = r0.c
            r0.a(r9, r14)
            r14.offset(r3, r4)
            r14.intersect(r8)
            r2.set(r14)
            r3 = r13
            r13 = r18
            goto L_0x010f
        L_0x00f7:
            r17 = r13
            android.util.Property r8 = android.view.View.TRANSLATION_X
            float[] r13 = new float[r15]
            float r3 = -r3
            r13[r7] = r3
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r9, r8, r13)
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float[] r8 = new float[r15]
            float r4 = -r4
            r8[r7] = r4
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r9, r3, r8)
        L_0x010f:
            r5.a(r13)
            r6.a(r3)
            r12.add(r13)
            r12.add(r3)
            float r24 = r2.width()
            float r25 = r2.height()
            boolean r13 = r9 instanceof defpackage.ezr
            if (r13 == 0) goto L_0x017a
            boolean r2 = r1 instanceof android.widget.ImageView
            if (r2 != 0) goto L_0x012c
            goto L_0x017a
        L_0x012c:
            r2 = r9
            ezr r2 = (defpackage.ezr) r2
            r3 = r1
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            if (r3 == 0) goto L_0x017a
            r3.mutate()
            r4 = 255(0xff, float:3.57E-43)
            if (r10 == 0) goto L_0x014f
            if (r30 != 0) goto L_0x0144
            r3.setAlpha(r4)
        L_0x0144:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r4 = defpackage.eyy.a
            int[] r5 = new int[r15]
            r5[r7] = r7
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r3, r4, r5)
            goto L_0x0159
        L_0x014f:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r5 = defpackage.eyy.a
            int[] r6 = new int[r15]
            r6[r7] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r3, r5, r6)
        L_0x0159:
            com.google.android.material.transformation.FabTransformationBehavior$2 r5 = new com.google.android.material.transformation.FabTransformationBehavior$2
            r5.<init>(r9)
            r4.addUpdateListener(r5)
            ezb r5 = r11.a
            java.lang.String r6 = "iconFade"
            ezc r5 = r5.a(r6)
            r5.a(r4)
            r12.add(r4)
            com.google.android.material.transformation.FabTransformationBehavior$3 r4 = new com.google.android.material.transformation.FabTransformationBehavior$3
            r4.<init>(r2, r3)
            r14 = r17
            r14.add(r4)
            goto L_0x017c
        L_0x017a:
            r14 = r17
        L_0x017c:
            if (r13 == 0) goto L_0x0289
            r8 = r9
            ezr r8 = (defpackage.ezr) r8
            ezd r2 = r11.b
            android.graphics.RectF r3 = r0.b
            android.graphics.RectF r4 = r0.c
            r0.a(r1, r3)
            r0.a(r9, r4)
            float r2 = r0.a(r1, r9, r2)
            float r2 = -r2
            r6 = 0
            r4.offset(r2, r6)
            float r2 = r3.centerX()
            float r3 = r4.left
            float r2 = r2 - r3
            ezd r3 = r11.b
            android.graphics.RectF r4 = r0.b
            android.graphics.RectF r5 = r0.c
            r0.a(r1, r4)
            r0.a(r9, r5)
            float r3 = r0.b(r1, r9, r3)
            float r3 = -r3
            r5.offset(r6, r3)
            float r3 = r4.centerY()
            float r4 = r5.top
            float r3 = r3 - r4
            r4 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            android.graphics.Rect r5 = r0.a
            r4.a(r5)
            android.graphics.Rect r4 = r0.a
            int r4 = r4.width()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r4 / r5
            ezb r4 = r11.a
            java.lang.String r6 = "expansion"
            ezc r6 = r4.a(r6)
            if (r10 == 0) goto L_0x022a
            if (r30 != 0) goto L_0x01df
            ezr$d r4 = new ezr$d
            r4.<init>(r2, r3, r5)
            r8.a(r4)
        L_0x01df:
            if (r30 == 0) goto L_0x01ea
            ezr$d r4 = r8.c()
            float r4 = r4.c
            r16 = r4
            goto L_0x01ec
        L_0x01ea:
            r16 = r5
        L_0x01ec:
            r22 = 0
            r23 = 0
            r20 = r2
            r21 = r3
            float r4 = defpackage.fal.a(r20, r21, r22, r23, r24, r25)
            android.animation.Animator r5 = defpackage.ezp.a(r8, r2, r3, r4)
            com.google.android.material.transformation.FabTransformationBehavior$4 r4 = new com.google.android.material.transformation.FabTransformationBehavior$4
            r4.<init>(r8)
            r5.addListener(r4)
            r18 = r8
            long r7 = r6.a
            int r4 = (int) r2
            int r3 = (int) r3
            r2 = r28
            r21 = r3
            r20 = r4
            r3 = r7
            r22 = r5
            r5 = r20
            r8 = r6
            r19 = 0
            r6 = r21
            r7 = r16
            r15 = r8
            r17 = r18
            r8 = r12
            a(r2, r3, r5, r6, r7, r8)
            r1 = r17
            r0 = r22
            r22 = r11
            goto L_0x027a
        L_0x022a:
            r15 = r6
            r17 = r8
            r19 = 0
            ezr$d r4 = r17.c()
            float r7 = r4.c
            android.animation.Animator r17 = defpackage.ezp.a(r8, r2, r3, r5)
            r6 = r5
            long r4 = r15.a
            int r2 = (int) r2
            int r3 = (int) r3
            r20 = r2
            r2 = r28
            r21 = r3
            r3 = r4
            r5 = r20
            r0 = r6
            r6 = r21
            r1 = r8
            r8 = r12
            a(r2, r3, r5, r6, r7, r8)
            long r2 = r15.a
            long r4 = r15.b
            ezb r6 = r11.a
            long r6 = r6.a()
            int r8 = android.os.Build.VERSION.SDK_INT
            r22 = r11
            r11 = 21
            if (r8 < r11) goto L_0x0278
            long r2 = r2 + r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0278
            r4 = r20
            r5 = r21
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r9, r4, r5, r0, r0)
            r0.setStartDelay(r2)
            long r6 = r6 - r2
            r0.setDuration(r6)
            r12.add(r0)
        L_0x0278:
            r0 = r17
        L_0x027a:
            r15.a(r0)
            r12.add(r0)
            ezp$1 r0 = new ezp$1
            r0.<init>(r1)
            r14.add(r0)
            goto L_0x028d
        L_0x0289:
            r22 = r11
            r19 = 0
        L_0x028d:
            if (r13 == 0) goto L_0x02e2
            r0 = r9
            ezr r0 = (defpackage.ezr) r0
            android.content.res.ColorStateList r1 = defpackage.ip.w(r27)
            if (r1 == 0) goto L_0x02a5
            int[] r2 = r27.getDrawableState()
            int r3 = r1.getDefaultColor()
            int r7 = r1.getColorForState(r2, r3)
            goto L_0x02a6
        L_0x02a5:
            r7 = 0
        L_0x02a6:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r7
            if (r10 == 0) goto L_0x02be
            if (r30 != 0) goto L_0x02b1
            r0.c_(r7)
        L_0x02b1:
            android.util.Property<ezr, java.lang.Integer> r2 = defpackage.ezr.c.a
            r3 = 1
            int[] r4 = new int[r3]
            r5 = 0
            r4[r5] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r2, r4)
            goto L_0x02ca
        L_0x02be:
            r3 = 1
            r5 = 0
            android.util.Property<ezr, java.lang.Integer> r1 = defpackage.ezr.c.a
            int[] r2 = new int[r3]
            r2[r5] = r7
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r1, r2)
        L_0x02ca:
            eyw r1 = defpackage.eyw.a()
            r0.setEvaluator(r1)
            r1 = r22
            ezb r2 = r1.a
            java.lang.String r3 = "color"
            ezc r2 = r2.a(r3)
            r2.a(r0)
            r12.add(r0)
            goto L_0x02e5
        L_0x02e2:
            r1 = r22
            r5 = 0
        L_0x02e5:
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x034c
            if (r13 == 0) goto L_0x02ef
            int r0 = defpackage.ezq.a
            if (r0 == 0) goto L_0x034c
        L_0x02ef:
            r0 = 2131429893(0x7f0b0a05, float:1.8481472E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 == 0) goto L_0x02fd
            android.view.ViewGroup r0 = a(r0)
            goto L_0x0316
        L_0x02fd:
            boolean r0 = r9 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r0 != 0) goto L_0x030b
            boolean r0 = r9 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r0 == 0) goto L_0x0306
            goto L_0x030b
        L_0x0306:
            android.view.ViewGroup r0 = a(r28)
            goto L_0x0316
        L_0x030b:
            r0 = r9
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getChildAt(r5)
            android.view.ViewGroup r0 = a(r0)
        L_0x0316:
            if (r0 == 0) goto L_0x034c
            if (r10 == 0) goto L_0x0333
            if (r30 != 0) goto L_0x0325
            android.util.Property<android.view.ViewGroup, java.lang.Float> r2 = defpackage.eyx.a
            java.lang.Float r3 = java.lang.Float.valueOf(r19)
            r2.set(r0, r3)
        L_0x0325:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r2 = defpackage.eyx.a
            r3 = 1
            float[] r3 = new float[r3]
            r4 = 1065353216(0x3f800000, float:1.0)
            r3[r5] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3)
            goto L_0x033e
        L_0x0333:
            r3 = 1
            android.util.Property<android.view.ViewGroup, java.lang.Float> r2 = defpackage.eyx.a
            float[] r3 = new float[r3]
            r3[r5] = r19
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r2, r3)
        L_0x033e:
            ezb r1 = r1.a
            java.lang.String r2 = "contentFade"
            ezc r1 = r1.a(r2)
            r1.a(r0)
            r12.add(r0)
        L_0x034c:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            defpackage.eyv.a(r0, r12)
            com.google.android.material.transformation.FabTransformationBehavior$1 r1 = new com.google.android.material.transformation.FabTransformationBehavior$1
            r2 = r26
            r3 = r27
            r1.<init>(r10, r9, r3)
            r0.addListener(r1)
            int r1 = r14.size()
        L_0x0364:
            if (r5 >= r1) goto L_0x0372
            java.lang.Object r3 = r14.get(r5)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r5 = r5 + 1
            goto L_0x0364
        L_0x0372:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }
}

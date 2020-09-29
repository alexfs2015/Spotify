package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.spotify.music.R;
import java.util.ArrayList;

/* renamed from: ezw reason: default package */
public class ezw {
    static final TimeInterpolator a = eyu.c;
    static final int[] t = {16842919, 16842910};
    static final int[] u = {16843623, 16842908, 16842910};
    static final int[] v = {16842908, 16842910};
    static final int[] w = {16843623, 16842910};
    static final int[] x = {16842910};
    static final int[] y = new int[0];
    final faq A;
    public OnPreDrawListener B;
    private final fah C;
    private float D = 1.0f;
    private final Rect E = new Rect();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Matrix H = new Matrix();
    public int b = 0;
    public Animator c;
    public ezb d;
    public ezb e;
    public ezb f;
    public ezb g;
    fap h;
    float i;
    public Drawable j;
    Drawable k;
    public ezy l;
    Drawable m;
    public float n;
    public float o;
    public float p;
    public int q;
    public ArrayList<AnimatorListener> r;
    public ArrayList<AnimatorListener> s;
    public final VisibilityAwareImageButton z;

    /* renamed from: ezw$a */
    class a extends f {
        a() {
            super(ezw.this, 0);
        }

        /* access modifiers changed from: protected */
        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: ezw$b */
    class b extends f {
        b() {
            super(ezw.this, 0);
        }

        /* access modifiers changed from: protected */
        public final float a() {
            return ezw.this.n + ezw.this.o;
        }
    }

    /* renamed from: ezw$c */
    class c extends f {
        c() {
            super(ezw.this, 0);
        }

        /* access modifiers changed from: protected */
        public final float a() {
            return ezw.this.n + ezw.this.p;
        }
    }

    /* renamed from: ezw$d */
    public interface d {
    }

    /* renamed from: ezw$e */
    class e extends f {
        e() {
            super(ezw.this, 0);
        }

        /* access modifiers changed from: protected */
        public final float a() {
            return ezw.this.n;
        }
    }

    /* renamed from: ezw$f */
    abstract class f extends AnimatorListenerAdapter implements AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;

        private f() {
        }

        /* synthetic */ f(ezw ezw, byte b2) {
            this();
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            ezw.this.h.a(this.c);
            this.a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                this.b = ezw.this.h.b;
                this.c = a();
                this.a = true;
            }
            fap fap = ezw.this.h;
            float f = this.b;
            fap.a(f + ((this.c - f) * valueAnimator.getAnimatedFraction()));
        }
    }

    public ezw(VisibilityAwareImageButton visibilityAwareImageButton, faq faq) {
        this.z = visibilityAwareImageButton;
        this.A = faq;
        this.C = new fah();
        this.C.a(t, a((f) new c()));
        this.C.a(u, a((f) new b()));
        this.C.a(v, a((f) new b()));
        this.C.a(w, a((f) new b()));
        this.C.a(x, a((f) new e()));
        this.C.a(y, a((f) new a()));
        this.i = this.z.getRotation();
    }

    private static ValueAnimator a(f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.z.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF rectF = this.F;
            RectF rectF2 = this.G;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    public AnimatorSet a(ezb ezb, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.z, View.ALPHA, new float[]{f2});
        ezb.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.z, View.SCALE_X, new float[]{f3});
        String str = "scale";
        ezb.a(str).a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.z, View.SCALE_Y, new float[]{f3});
        ezb.a(str).a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.H);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.z, new eyz(), new eza(), new Matrix[]{new Matrix(this.H)});
        ezb.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        eyv.a(animatorSet, arrayList);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    public final ezy a(int i2, ColorStateList colorStateList) {
        Context context = this.z.getContext();
        ezy e2 = e();
        e2.a(fr.c(context, R.color.design_fab_stroke_top_outer_color), fr.c(context, R.color.design_fab_stroke_top_inner_color), fr.c(context, R.color.design_fab_stroke_end_inner_color), fr.c(context, R.color.design_fab_stroke_end_outer_color));
        e2.a((float) i2);
        e2.a(colorStateList);
        return e2;
    }

    public final void a() {
        a(this.D);
    }

    public final void a(float f2) {
        this.D = f2;
        Matrix matrix = this.H;
        a(f2, matrix);
        this.z.setImageMatrix(matrix);
    }

    public void a(float f2, float f3, float f4) {
        fap fap = this.h;
        if (fap != null) {
            fap.a(f2, this.p + f2);
            c();
        }
    }

    public void a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable[] drawableArr;
        this.j = gm.f(f());
        gm.a(this.j, colorStateList);
        if (mode != null) {
            gm.a(this.j, mode);
        }
        this.k = gm.f(f());
        gm.a(this.k, fao.a(colorStateList2));
        if (i2 > 0) {
            this.l = a(i2, colorStateList);
            drawableArr = new Drawable[]{this.l, this.j, this.k};
        } else {
            this.l = null;
            drawableArr = new Drawable[]{this.j, this.k};
        }
        this.m = new LayerDrawable(drawableArr);
        Context context = this.z.getContext();
        Drawable drawable = this.m;
        float a2 = this.A.a();
        float f2 = this.n;
        fap fap = new fap(context, drawable, a2, f2, f2 + this.p);
        this.h = fap;
        fap fap2 = this.h;
        fap2.c = false;
        fap2.invalidateSelf();
        this.A.a(this.h);
    }

    /* access modifiers changed from: 0000 */
    public void a(Rect rect) {
        this.h.getPadding(rect);
    }

    public void a(int[] iArr) {
        defpackage.fah.a aVar;
        fah fah = this.C;
        int size = fah.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                aVar = null;
                break;
            }
            aVar = (defpackage.fah.a) fah.a.get(i2);
            if (StateSet.stateSetMatches(aVar.a, iArr)) {
                break;
            }
            i2++;
        }
        if (aVar != fah.b) {
            if (!(fah.b == null || fah.c == null)) {
                fah.c.cancel();
                fah.c = null;
            }
            fah.b = aVar;
            if (aVar != null) {
                fah.c = aVar.b;
                fah.c.start();
            }
        }
    }

    public void b() {
        fah fah = this.C;
        if (fah.c != null) {
            fah.c.end();
            fah.c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Rect rect) {
    }

    public final void c() {
        Rect rect = this.E;
        a(rect);
        b(rect);
        this.A.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public ezy e() {
        return new ezy();
    }

    /* access modifiers changed from: 0000 */
    public final GradientDrawable f() {
        GradientDrawable g2 = g();
        g2.setShape(1);
        g2.setColor(-1);
        return g2;
    }

    /* access modifiers changed from: 0000 */
    public GradientDrawable g() {
        return new GradientDrawable();
    }

    public final boolean h() {
        return this.z.getVisibility() != 0 ? this.b == 2 : this.b != 1;
    }

    public boolean i() {
        return ip.B(this.z) && !this.z.isInEditMode();
    }
}

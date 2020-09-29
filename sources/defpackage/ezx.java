package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;

/* renamed from: ezx reason: default package */
public final class ezx extends ezw {
    private InsetDrawable C;

    /* renamed from: ezx$a */
    static class a extends GradientDrawable {
        a() {
        }

        public final boolean isStateful() {
            return true;
        }
    }

    public ezx(VisibilityAwareImageButton visibilityAwareImageButton, faq faq) {
        super(visibilityAwareImageButton, faq);
    }

    private Animator a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.z, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    public final void a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.z.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(t, a(f, f3));
            stateListAnimator.addState(u, a(f, f2));
            stateListAnimator.addState(v, a(f, f2));
            stateListAnimator.addState(w, a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.z, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, new float[]{this.z.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(x, animatorSet);
            stateListAnimator.addState(y, a(0.0f, 0.0f));
            this.z.setStateListAnimator(stateListAnimator);
        }
        if (this.A.b()) {
            c();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.j = gm.f(f());
        gm.a(this.j, colorStateList);
        if (mode != null) {
            gm.a(this.j, mode);
        }
        if (i > 0) {
            this.l = a(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.l, this.j});
        } else {
            this.l = null;
            drawable = this.j;
        }
        this.k = new RippleDrawable(fao.a(colorStateList2), drawable, null);
        this.m = this.k;
        this.A.a(this.k);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Rect rect) {
        if (this.A.b()) {
            float a2 = this.A.a();
            float elevation = this.z.getElevation() + this.p;
            int ceil = (int) Math.ceil((double) fap.b(elevation, a2, false));
            int ceil2 = (int) Math.ceil((double) fap.a(elevation, a2, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int[] iArr) {
        if (VERSION.SDK_INT == 21) {
            if (this.z.isEnabled()) {
                this.z.setElevation(this.n);
                if (this.z.isPressed()) {
                    this.z.setTranslationZ(this.p);
                } else if (this.z.isFocused() || this.z.isHovered()) {
                    this.z.setTranslationZ(this.o);
                } else {
                    this.z.setTranslationZ(0.0f);
                }
            } else {
                this.z.setElevation(0.0f);
                this.z.setTranslationZ(0.0f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
    }

    /* access modifiers changed from: 0000 */
    public final void b(Rect rect) {
        if (this.A.b()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.k, rect.left, rect.top, rect.right, rect.bottom);
            this.C = insetDrawable;
            this.A.a(this.C);
            return;
        }
        this.A.a(this.k);
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final ezy e() {
        return new ezz();
    }

    /* access modifiers changed from: 0000 */
    public final GradientDrawable g() {
        return new a();
    }
}

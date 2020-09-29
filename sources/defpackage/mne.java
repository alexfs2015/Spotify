package defpackage;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;

/* renamed from: mne reason: default package */
public final class mne extends Animation implements AnimationListener {
    public int a;
    public int b;
    private final View c;
    private final MarginLayoutParams d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public mne(View view, int i2) {
        setDuration(200);
        this.c = view;
        this.d = (MarginLayoutParams) view.getLayoutParams();
        int i3 = this.d.leftMargin;
        this.h = i3;
        this.e = i3;
        int i4 = this.d.topMargin;
        this.i = i4;
        this.f = i4;
        int i5 = this.d.rightMargin;
        this.j = i5;
        this.g = i5;
        int i6 = this.d.bottomMargin;
        this.b = i6;
        this.a = i6;
        setAnimationListener(this);
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f2, Transformation transformation) {
        super.applyTransformation(f2, transformation);
        int i2 = this.e;
        int i3 = i2 + ((int) (((float) (this.h - i2)) * f2));
        int i4 = this.f;
        int i5 = i4 + ((int) (((float) (this.i - i4)) * f2));
        int i6 = this.g;
        int i7 = i6 + ((int) (((float) (this.j - i6)) * f2));
        int i8 = this.a;
        int i9 = i8 + ((int) (((float) (this.b - i8)) * f2));
        MarginLayoutParams marginLayoutParams = this.d;
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.rightMargin = i7;
        marginLayoutParams.bottomMargin = i9;
        this.c.requestLayout();
    }

    public final void onAnimationEnd(Animation animation) {
        MarginLayoutParams marginLayoutParams = this.d;
        marginLayoutParams.leftMargin = this.h;
        marginLayoutParams.topMargin = this.i;
        marginLayoutParams.rightMargin = this.j;
        marginLayoutParams.bottomMargin = this.b;
        this.c.requestLayout();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final boolean willChangeBounds() {
        return true;
    }
}

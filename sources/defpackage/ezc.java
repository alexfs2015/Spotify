package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: ezc reason: default package */
public final class ezc {
    public long a = 0;
    public long b = 300;
    private TimeInterpolator c = null;
    private int d = 0;
    private int e = 1;

    public ezc(long j, long j2) {
        this.a = j;
        this.b = 150;
    }

    private ezc(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }

    static ezc a(ValueAnimator valueAnimator) {
        ezc ezc = new ezc(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        ezc.d = valueAnimator.getRepeatCount();
        ezc.e = valueAnimator.getRepeatMode();
        return ezc;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return eyu.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return eyu.c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = eyu.d;
        }
        return interpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : eyu.b;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.b);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ezc ezc = (ezc) obj;
        if (this.a == ezc.a && this.b == ezc.b && this.d == ezc.d && this.e == ezc.e) {
            return a().getClass().equals(ezc.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        sb.append(this.e);
        sb.append("}\n");
        return sb.toString();
    }
}

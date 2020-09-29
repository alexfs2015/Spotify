package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: eyl reason: default package */
public final class eyl {
    public long a = 0;
    public long b = 300;
    private TimeInterpolator c = null;
    private int d = 0;
    private int e = 1;

    public eyl(long j, long j2) {
        this.a = j;
        this.b = 150;
    }

    private eyl(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : eyd.b;
    }

    static eyl a(ValueAnimator valueAnimator) {
        eyl eyl = new eyl(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        eyl.d = valueAnimator.getRepeatCount();
        eyl.e = valueAnimator.getRepeatMode();
        return eyl;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return eyd.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return eyd.c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = eyd.d;
        }
        return interpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eyl eyl = (eyl) obj;
        if (this.a == eyl.a && this.b == eyl.b && this.d == eyl.d && this.e == eyl.e) {
            return a().getClass().equals(eyl.a().getClass());
        }
        return false;
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

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.d) * 31) + this.e;
    }
}

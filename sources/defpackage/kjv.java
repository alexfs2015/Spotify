package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.ArcView;
import java.util.List;

/* renamed from: kjv reason: default package */
public final class kjv {
    private static final Long a = Long.valueOf(530);
    private static final Long b = Long.valueOf(250);
    private static final Long c = Long.valueOf(50);
    private static final Long d = Long.valueOf(6000);
    private static final Long e = Long.valueOf(300);
    private static final Long f;
    private static final Long g = Long.valueOf(600);
    private static final Long h;
    private static final Long i = Long.valueOf(900);

    static {
        Long valueOf = Long.valueOf(1200);
        f = valueOf;
        h = valueOf;
    }

    private static Animator a(View view, long j, boolean z) {
        long j2 = z ? 20 : 300;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(j2);
        ofFloat.setInterpolator(kfr.a);
        return ofFloat;
    }

    private static Animator a(ArcView arcView, int i2, long j, int i3, boolean z) {
        ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(new float[]{(float) i3, 0.0f}) : ValueAnimator.ofFloat(new float[]{0.0f, (float) i3});
        ofFloat.setDuration(z ? 600 : 900);
        ofFloat.setStartDelay(j);
        ofFloat.setInterpolator(kfr.a);
        ofFloat.addUpdateListener(new $$Lambda$kjv$4dYJfxjKpJ99askGj0qH4TR107c(arcView, i2));
        return ofFloat;
    }

    private static Animator a(ArcView arcView, List<Integer> list, boolean z) {
        boolean z2 = z;
        a g2 = ImmutableList.g();
        int size = list.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            long j = 0;
            long longValue = z2 ? 0 : (((long) (size - i2)) * 900) + c.longValue();
            if (!z2) {
                j = ((long) (size - i2)) * 900;
            }
            g2.b((E[]) new Animator[]{a(arcView, i2, longValue, ((Integer) list.get(i2)).intValue(), z), a(arcView, i2, j, z2)});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(g2.a());
        return animatorSet;
    }

    public static AnimatorSet a(ArcView arcView, List<Integer> list, List<TextView> list2, List<TextView> list3) {
        AnimatorSet a2 = a(list3, false);
        Animator a3 = a(arcView, list, false);
        AnimatorSet a4 = a(list2, true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(arcView, "backgroundSweepAngle", new int[]{0, 180});
        ofInt.setDuration(f.longValue());
        ofInt.setInterpolator(kfr.a);
        animatorSet.playTogether(new Animator[]{ofInt, a2});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{a3, a4});
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(new Animator[]{animatorSet, animatorSet2});
        return animatorSet3;
    }

    public static AnimatorSet a(ArcView arcView, List<Integer> list, List<TextView> list2, List<TextView> list3, TextView textView) {
        Animator a2 = a(arcView, list, true);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(arcView, "backgroundSweepAngle", new int[]{180, 0});
        ofInt.setInterpolator(kfr.a);
        ofInt.setDuration(g.longValue());
        AnimatorSet b2 = b(list2, true);
        AnimatorSet b3 = b(list3, false);
        Animator b4 = b((View) textView, e.longValue(), true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a2, ofInt, b2, b3, b4});
        animatorSet.setStartDelay(d.longValue());
        return animatorSet;
    }

    private static AnimatorSet a(final List<TextView> list, boolean z) {
        a g2 = ImmutableList.g();
        for (int i2 = 0; i2 < list.size(); i2++) {
            long longValue = (h.longValue() / ((long) list.size())) * ((long) (list.size() - i2));
            long longValue2 = (i.longValue() * ((long) (list.size() - i2))) + a.longValue();
            if (z) {
                longValue = longValue2;
            }
            g2.c(a((View) list.get(i2), longValue, z));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(g2.a());
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                for (View view : list) {
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }

    private static ValueAnimator a(ArcView arcView, int i2, long j, boolean z) {
        ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}) : ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(z ? 550 : 50);
        ofFloat.setInterpolator(kfr.a);
        ofFloat.setStartDelay(j);
        ofFloat.addUpdateListener(new $$Lambda$kjv$Z8uoqB483Wn1O4nY0aIxhHvY64(arcView, i2));
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ArcView arcView, int i2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ArcView.a a2 = arcView.a(i2);
        if (a2 != null) {
            a2.b = floatValue;
            arcView.invalidate();
        }
    }

    private static Animator b(View view, long j, boolean z) {
        long j2 = z ? 300 : 150;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(j2);
        ofFloat.setInterpolator(kfr.a);
        return ofFloat;
    }

    private static AnimatorSet b(List<TextView> list, boolean z) {
        a g2 = ImmutableList.g();
        for (int i2 = 0; i2 < list.size(); i2++) {
            long size = ((200 / ((long) list.size())) * ((long) (list.size() - i2))) + b.longValue();
            long size2 = (200 / ((long) list.size())) * ((long) i2);
            if (z) {
                size = size2;
            }
            g2.c(b((View) list.get(i2), size, false));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(g2.a());
        return animatorSet;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ArcView arcView, int i2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ArcView.a a2 = arcView.a(i2);
        if (a2 != null) {
            a2.a = (((floatValue / arcView.a) * 100.0f) * 144.0f) / 100.0f;
        }
        arcView.invalidate();
    }
}

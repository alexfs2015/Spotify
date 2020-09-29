package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.common.base.Optional;
import java.util.List;

/* renamed from: ibe reason: default package */
public final class ibe {
    final Animator a;
    final Animator b;
    final Animator c;
    final Animator d;
    final Animator e;
    final Animator f;
    final Animator g;
    final Animator h;
    final Animator i;
    final Animator j;
    private AnimatorSet k;

    public ibe(View view, View view2, View view3, View view4) {
        this.a = ibu.a(view3);
        this.b = ibu.b(view3);
        this.c = ibu.a(view);
        this.d = ibu.b(view);
        this.e = ibu.a(view4);
        this.f = ibu.b(view4);
        this.g = ibu.a(view2);
        this.h = ibu.b(view2);
        this.i = ibu.a(view4, 50.0f);
        this.j = ibu.b(view4, 50.0f);
    }

    /* access modifiers changed from: 0000 */
    public void a(List<Animator> list, Optional<AnimatorListener> optional, Interpolator interpolator, long j2) {
        a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setDuration(j2);
        animatorSet.setInterpolator(interpolator);
        if (optional.b()) {
            animatorSet.addListener((AnimatorListener) optional.c());
        }
        animatorSet.start();
        this.k = animatorSet;
    }

    public final void a() {
        AnimatorSet animatorSet = this.k;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.k.cancel();
        }
    }
}

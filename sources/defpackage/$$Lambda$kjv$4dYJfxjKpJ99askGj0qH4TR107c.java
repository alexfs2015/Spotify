package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.spotify.mobile.android.wrapped2019.stories.templates.minuteslistened.ArcView;

/* renamed from: -$$Lambda$kjv$4dYJfxjKpJ99askGj0qH4TR107c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kjv$4dYJfxjKpJ99askGj0qH4TR107c implements AnimatorUpdateListener {
    private final /* synthetic */ ArcView f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ $$Lambda$kjv$4dYJfxjKpJ99askGj0qH4TR107c(ArcView arcView, int i) {
        this.f$0 = arcView;
        this.f$1 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        kjv.b(this.f$0, this.f$1, valueAnimator);
    }
}

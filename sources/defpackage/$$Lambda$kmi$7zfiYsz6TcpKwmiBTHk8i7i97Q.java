package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.spotify.mobile.android.wrapped2019.stories.views.IsometricImageStack;

/* renamed from: -$$Lambda$kmi$7z-fiYsz6TcpKwmiBTHk8i7i97Q reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kmi$7zfiYsz6TcpKwmiBTHk8i7i97Q implements AnimatorUpdateListener {
    private final /* synthetic */ IsometricImageStack f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ $$Lambda$kmi$7zfiYsz6TcpKwmiBTHk8i7i97Q(IsometricImageStack isometricImageStack, int i) {
        this.f$0 = isometricImageStack;
        this.f$1 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.a(this.f$1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}

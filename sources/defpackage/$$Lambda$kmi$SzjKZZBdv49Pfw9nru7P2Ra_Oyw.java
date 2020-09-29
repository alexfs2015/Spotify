package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.spotify.mobile.android.wrapped2019.stories.views.IsometricImageStack;

/* renamed from: -$$Lambda$kmi$SzjKZZBdv49Pfw9nru7P2Ra_Oyw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kmi$SzjKZZBdv49Pfw9nru7P2Ra_Oyw implements AnimatorUpdateListener {
    private final /* synthetic */ IsometricImageStack f$0;
    private final /* synthetic */ int f$1;
    private final /* synthetic */ gcp f$2;

    public /* synthetic */ $$Lambda$kmi$SzjKZZBdv49Pfw9nru7P2Ra_Oyw(IsometricImageStack isometricImageStack, int i, gcp gcp) {
        this.f$0 = isometricImageStack;
        this.f$1 = i;
        this.f$2 = gcp;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        kmi.a(this.f$0, this.f$1, this.f$2, valueAnimator);
    }
}

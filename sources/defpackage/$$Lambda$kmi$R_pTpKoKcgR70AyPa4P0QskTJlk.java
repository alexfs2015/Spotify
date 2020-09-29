package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.spotify.mobile.android.wrapped2019.stories.views.IsometricImageStack;

/* renamed from: -$$Lambda$kmi$R_pTpKoKcgR70AyPa4P0QskTJlk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kmi$R_pTpKoKcgR70AyPa4P0QskTJlk implements AnimatorUpdateListener {
    private final /* synthetic */ IsometricImageStack f$0;
    private final /* synthetic */ int f$1;
    private final /* synthetic */ gcp f$2;

    public /* synthetic */ $$Lambda$kmi$R_pTpKoKcgR70AyPa4P0QskTJlk(IsometricImageStack isometricImageStack, int i, gcp gcp) {
        this.f$0 = isometricImageStack;
        this.f$1 = i;
        this.f$2 = gcp;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        kmi.b(this.f$0, this.f$1, this.f$2, valueAnimator);
    }
}

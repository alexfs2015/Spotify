package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: shz reason: default package */
public final class shz extends shl {
    public shz(Context context) {
        super((xo) xp.b(context, (int) R.raw.downloadprogress_pending).a);
    }

    public final void a(LottieAnimationView lottieAnimationView, shj shj, shj shj2) {
        if (lottieAnimationView.f()) {
            lottieAnimationView.a(-1);
            return;
        }
        a(lottieAnimationView);
        lottieAnimationView.a(-1);
        lottieAnimationView.e();
    }
}

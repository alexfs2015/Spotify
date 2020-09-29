package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: ryp reason: default package */
public final class ryp extends ryb {
    public ryp(Context context) {
        super((xa) xb.b(context, (int) R.raw.downloadprogress_pending).a);
    }

    public final void a(LottieAnimationView lottieAnimationView, rxz rxz, rxz rxz2) {
        if (lottieAnimationView.f()) {
            lottieAnimationView.a(-1);
            return;
        }
        a(lottieAnimationView);
        lottieAnimationView.a(-1);
        lottieAnimationView.e();
    }
}

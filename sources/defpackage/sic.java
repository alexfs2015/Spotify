package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: sic reason: default package */
public final class sic extends shl {
    public sic(Context context) {
        super((xo) xp.b(context, (int) R.raw.downloadprogress_inprogress_granular).a);
    }

    public final void a(LottieAnimationView lottieAnimationView, shj shj, shj shj2) {
        Object a = shj.a();
        Object a2 = shj2.a();
        if ((a instanceof Integer) && (a2 instanceof Integer)) {
            a(lottieAnimationView);
            float a3 = sid.a(((Integer) a).intValue());
            float a4 = sid.a(((Integer) a2).intValue());
            if (a3 > a4) {
                lottieAnimationView.g();
                lottieAnimationView.c(a4);
                return;
            }
            lottieAnimationView.a(a3);
            lottieAnimationView.b(a4);
            lottieAnimationView.e();
        }
    }
}

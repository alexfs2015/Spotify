package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: rys reason: default package */
public final class rys extends ryb {
    public rys(Context context) {
        super((xa) xb.b(context, (int) R.raw.downloadprogress_inprogress_granular).a);
    }

    public final void a(LottieAnimationView lottieAnimationView, rxz rxz, rxz rxz2) {
        Object a = rxz.a();
        Object a2 = rxz2.a();
        if ((a instanceof Integer) && (a2 instanceof Integer)) {
            a(lottieAnimationView);
            float a3 = ryt.a(((Integer) a).intValue());
            float a4 = ryt.a(((Integer) a2).intValue());
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

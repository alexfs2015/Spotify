package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: ryo reason: default package */
public final class ryo extends ryb {
    public ryo(Context context) {
        super((xa) xb.b(context, (int) R.raw.downloadprogress_inprogress_granular).a);
    }

    public final void a(LottieAnimationView lottieAnimationView, rxz rxz, rxz rxz2) {
        if (rxz2 instanceof ryh) {
            Object a = rxz2.a();
            if (a instanceof Integer) {
                a(lottieAnimationView);
                Integer num = (Integer) a;
                lottieAnimationView.g();
                lottieAnimationView.c(ryt.a(num.intValue()));
            }
        }
    }
}

package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;

/* renamed from: shy reason: default package */
public final class shy extends shl {
    public shy(Context context) {
        super((xo) xp.b(context, (int) R.raw.downloadprogress_inprogress_granular).a);
    }

    public final void a(LottieAnimationView lottieAnimationView, shj shj, shj shj2) {
        if (shj2 instanceof shr) {
            Object a = shj2.a();
            if (a instanceof Integer) {
                a(lottieAnimationView);
                Integer num = (Integer) a;
                lottieAnimationView.g();
                lottieAnimationView.c(sid.a(num.intValue()));
            }
        }
    }
}

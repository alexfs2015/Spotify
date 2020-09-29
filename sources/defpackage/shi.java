package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* renamed from: shi reason: default package */
public final class shi implements shk {
    private final shm a;
    private shj b = new shp();
    private String c;

    public shi(shm shm) {
        this.a = shm;
    }

    public final void a(String str, shj shj, LottieAnimationView lottieAnimationView) {
        shl a2 = this.a.a(this.b, shj);
        if (!str.equals(this.c) || a2 == null) {
            this.b = new shp();
            a2 = this.a.a(this.b, shj);
        }
        if (a2 != null) {
            a2.a(lottieAnimationView, this.b, shj);
        }
        this.b = shj;
        this.c = str;
    }
}

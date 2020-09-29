package defpackage;

import com.airbnb.lottie.LottieAnimationView;

/* renamed from: rxy reason: default package */
public final class rxy implements rya {
    private final ryc a;
    private rxz b = new ryf();
    private String c;

    public rxy(ryc ryc) {
        this.a = ryc;
    }

    public final void a(String str, rxz rxz, LottieAnimationView lottieAnimationView) {
        ryb a2 = this.a.a(this.b, rxz);
        if (!str.equals(this.c) || a2 == null) {
            this.b = new ryf();
            a2 = this.a.a(this.b, rxz);
        }
        if (a2 != null) {
            a2.a(lottieAnimationView, this.b, rxz);
        }
        this.b = rxz;
        this.c = str;
    }
}

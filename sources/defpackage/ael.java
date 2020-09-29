package defpackage;

import com.spotify.music.features.placebobanner.models.PlaceboBannerView;

/* renamed from: ael reason: default package */
public final class ael {
    private static final afp a = afp.a("connected.car.core");
    private static final aem b = new aem();
    private static final aen c = new aen();
    private static final aeo d = new aeo();

    public static aek a(String str) {
        if (str.equalsIgnoreCase(PlaceboBannerView.V1)) {
            return b;
        }
        if (str.equalsIgnoreCase("v2")) {
            return c;
        }
        return d;
    }
}

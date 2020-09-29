package defpackage;

import com.spotify.music.features.placebobanner.models.PlaceboBannerView;

/* renamed from: aez reason: default package */
public final class aez {
    private static final agd a = agd.a("connected.car.core");
    private static final afa b = new afa();
    private static final afb c = new afb();
    private static final afc d = new afc();

    public static aey a(String str) {
        return str.equalsIgnoreCase(PlaceboBannerView.V1) ? b : str.equalsIgnoreCase("v2") ? c : d;
    }
}

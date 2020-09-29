package defpackage;

import com.spotify.music.features.homemix.logging.HomeMixInteractionLogger;
import com.squareup.picasso.Picasso;

/* renamed from: nmm reason: default package */
public final class nmm implements vua<nml> {
    private final wlc<Picasso> a;
    private final wlc<HomeMixInteractionLogger> b;
    private final wlc<fpt> c;

    private nmm(wlc<Picasso> wlc, wlc<HomeMixInteractionLogger> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nmm a(wlc<Picasso> wlc, wlc<HomeMixInteractionLogger> wlc2, wlc<fpt> wlc3) {
        return new nmm(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nml(this.a, this.b, this.c);
    }
}

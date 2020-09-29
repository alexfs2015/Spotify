package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;

/* renamed from: usv reason: default package */
public final class usv implements wig<usu> {
    private final wzi<RxResolver> a;
    private final wzi<gmm<RadioStationTracksModel>> b;
    private final wzi<gmm<RadioStationsModel>> c;
    private final wzi<gmm<TracksAndRadioStationModel>> d;
    private final wzi<gmm<RadioStationModel>> e;
    private final wzi<hgy> f;

    private usv(wzi<RxResolver> wzi, wzi<gmm<RadioStationTracksModel>> wzi2, wzi<gmm<RadioStationsModel>> wzi3, wzi<gmm<TracksAndRadioStationModel>> wzi4, wzi<gmm<RadioStationModel>> wzi5, wzi<hgy> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static usv a(wzi<RxResolver> wzi, wzi<gmm<RadioStationTracksModel>> wzi2, wzi<gmm<RadioStationsModel>> wzi3, wzi<gmm<TracksAndRadioStationModel>> wzi4, wzi<gmm<RadioStationModel>> wzi5, wzi<hgy> wzi6) {
        usv usv = new usv(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return usv;
    }

    public final /* synthetic */ Object get() {
        usu usu = new usu((RxResolver) this.a.get(), (gmm) this.b.get(), (gmm) this.c.get(), (gmm) this.d.get(), (gmm) this.e.get(), (hgy) this.f.get());
        return usu;
    }
}

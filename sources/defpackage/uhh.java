package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;

/* renamed from: uhh reason: default package */
public final class uhh implements vua<uhg> {
    private final wlc<RxResolver> a;
    private final wlc<gky<RadioStationTracksModel>> b;
    private final wlc<gky<RadioStationsModel>> c;
    private final wlc<gky<TracksAndRadioStationModel>> d;
    private final wlc<gky<RadioStationModel>> e;
    private final wlc<hec> f;

    private uhh(wlc<RxResolver> wlc, wlc<gky<RadioStationTracksModel>> wlc2, wlc<gky<RadioStationsModel>> wlc3, wlc<gky<TracksAndRadioStationModel>> wlc4, wlc<gky<RadioStationModel>> wlc5, wlc<hec> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static uhh a(wlc<RxResolver> wlc, wlc<gky<RadioStationTracksModel>> wlc2, wlc<gky<RadioStationsModel>> wlc3, wlc<gky<TracksAndRadioStationModel>> wlc4, wlc<gky<RadioStationModel>> wlc5, wlc<hec> wlc6) {
        uhh uhh = new uhh(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return uhh;
    }

    public final /* synthetic */ Object get() {
        uhg uhg = new uhg((RxResolver) this.a.get(), (gky) this.b.get(), (gky) this.c.get(), (gky) this.d.get(), (gky) this.e.get(), (hec) this.f.get());
        return uhg;
    }
}

package defpackage;

import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;

/* renamed from: ufv reason: default package */
public final class ufv implements vua<gky<TracksAndRadioStationModel>> {
    private final wlc<gkz> a;

    private ufv(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static ufv a(wlc<gkz> wlc) {
        return new ufv(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(TracksAndRadioStationModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

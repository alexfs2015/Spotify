package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationModel;

/* renamed from: ufr reason: default package */
public final class ufr implements vua<gky<RadioStationModel>> {
    private final wlc<gkz> a;

    private ufr(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static ufr a(wlc<gkz> wlc) {
        return new ufr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(RadioStationModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;

/* renamed from: ufs reason: default package */
public final class ufs implements vua<gky<RadioStationTracksModel>> {
    private final wlc<gkz> a;

    private ufs(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static ufs a(wlc<gkz> wlc) {
        return new ufs(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(RadioStationTracksModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

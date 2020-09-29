package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationsModel;

/* renamed from: uft reason: default package */
public final class uft implements vua<gky<RadioStationsModel>> {
    private final wlc<gkz> a;

    private uft(wlc<gkz> wlc) {
        this.a = wlc;
    }

    public static uft a(wlc<gkz> wlc) {
        return new uft(wlc);
    }

    public final /* synthetic */ Object get() {
        return (gky) vuf.a(((gkz) this.a.get()).a(RadioStationsModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

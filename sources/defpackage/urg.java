package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;

/* renamed from: urg reason: default package */
public final class urg implements wig<gmm<RadioStationTracksModel>> {
    private final wzi<gmn> a;

    private urg(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static urg a(wzi<gmn> wzi) {
        return new urg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(RadioStationTracksModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

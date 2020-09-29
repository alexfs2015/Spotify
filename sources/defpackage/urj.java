package defpackage;

import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;

/* renamed from: urj reason: default package */
public final class urj implements wig<gmm<TracksAndRadioStationModel>> {
    private final wzi<gmn> a;

    private urj(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static urj a(wzi<gmn> wzi) {
        return new urj(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(TracksAndRadioStationModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

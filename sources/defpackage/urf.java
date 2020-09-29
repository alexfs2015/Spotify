package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationModel;

/* renamed from: urf reason: default package */
public final class urf implements wig<gmm<RadioStationModel>> {
    private final wzi<gmn> a;

    private urf(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static urf a(wzi<gmn> wzi) {
        return new urf(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(RadioStationModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import com.spotify.music.spotlets.radio.model.RadioStationsModel;

/* renamed from: urh reason: default package */
public final class urh implements wig<gmm<RadioStationsModel>> {
    private final wzi<gmn> a;

    private urh(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static urh a(wzi<gmn> wzi) {
        return new urh(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gmm) wil.a(((gmn) this.a.get()).a(RadioStationsModel.class), "Cannot return null from a non-@Nullable @Provides method");
    }
}

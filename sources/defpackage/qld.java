package defpackage;

import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: qld reason: default package */
public final class qld implements wig<qlc> {
    private final wzi<AndroidFeatureSearchProperties> a;
    private final wzi<DurationFormatter> b;

    private qld(wzi<AndroidFeatureSearchProperties> wzi, wzi<DurationFormatter> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qld a(wzi<AndroidFeatureSearchProperties> wzi, wzi<DurationFormatter> wzi2) {
        return new qld(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new qlc((AndroidFeatureSearchProperties) this.a.get(), (DurationFormatter) this.b.get());
    }
}

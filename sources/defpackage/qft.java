package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties.NewPodcastResultComponents;

/* renamed from: qft reason: default package */
public final class qft implements wig<sjr> {
    private final wzi<AndroidFeatureSearchProperties> a;
    private final wzi<qks> b;
    private final wzi<qle> c;

    private qft(wzi<AndroidFeatureSearchProperties> wzi, wzi<qks> wzi2, wzi<qle> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qft a(wzi<AndroidFeatureSearchProperties> wzi, wzi<qks> wzi2, wzi<qle> wzi3) {
        return new qft(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (sjr) wil.a(((AndroidFeatureSearchProperties) this.a.get()).b() == NewPodcastResultComponents.OFF ? (sjr) this.b.get() : (sjr) this.c.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

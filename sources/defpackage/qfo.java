package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties.NewPodcastResultComponents;

/* renamed from: qfo reason: default package */
public final class qfo implements wig<Boolean> {
    private final wzi<AndroidFeatureSearchProperties> a;

    private qfo(wzi<AndroidFeatureSearchProperties> wzi) {
        this.a = wzi;
    }

    public static qfo a(wzi<AndroidFeatureSearchProperties> wzi) {
        return new qfo(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((AndroidFeatureSearchProperties) this.a.get()).b() != NewPodcastResultComponents.OFF);
    }
}

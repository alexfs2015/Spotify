package defpackage;

import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;

/* renamed from: gtl reason: default package */
public final class gtl implements wig<DiscoveryConfiguration> {
    private final wzi<mjq> a;

    private gtl(wzi<mjq> wzi) {
        this.a = wzi;
    }

    public static gtl a(wzi<mjq> wzi) {
        return new gtl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (DiscoveryConfiguration) wil.a(((mjq) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

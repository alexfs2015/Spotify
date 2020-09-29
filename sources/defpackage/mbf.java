package defpackage;

import com.spotify.music.libs.hubslocalcache.HubsCachedFeature;

/* renamed from: mbf reason: default package */
public final class mbf implements wig<HubsCachedFeature> {
    private static final mbf a = new mbf();

    public static mbf a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (HubsCachedFeature) wil.a(HubsCachedFeature.FIND, "Cannot return null from a non-@Nullable @Provides method");
    }
}

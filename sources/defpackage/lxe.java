package defpackage;

import com.spotify.music.libs.hubslocalcache.HubsCachedFeature;

/* renamed from: lxe reason: default package */
public final class lxe implements vua<HubsCachedFeature> {
    private static final lxe a = new lxe();

    public static lxe a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (HubsCachedFeature) vuf.a(HubsCachedFeature.FIND, "Cannot return null from a non-@Nullable @Provides method");
    }
}

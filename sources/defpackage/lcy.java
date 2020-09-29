package defpackage;

import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;

/* renamed from: lcy reason: default package */
public final class lcy implements vua<HeaderPolicy> {
    static {
        new lcy();
    }

    public static HeaderPolicy a() {
        return (HeaderPolicy) vuf.a(CC.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}

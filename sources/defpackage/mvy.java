package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response;

/* renamed from: mvy reason: default package */
public final class mvy implements vua<gky<Response>> {
    private final wlc<gkz> a;

    public static gky<Response> a(gkz gkz) {
        return (gky) vuf.a(gkz.a(Response.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((gkz) this.a.get());
    }
}

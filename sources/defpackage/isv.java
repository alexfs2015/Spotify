package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.Response;

/* renamed from: isv reason: default package */
public final class isv implements wig<gmm<Response>> {
    private final wzi<gmn> a;

    private isv(wzi<gmn> wzi) {
        this.a = wzi;
    }

    public static gmm<Response> a(gmn gmn) {
        return (gmm) wil.a(gmn.a(Response.class), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static isv a(wzi<gmn> wzi) {
        return new isv(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((gmn) this.a.get());
    }
}

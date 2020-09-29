package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.apis.RecommendedPlaylists.Response;

/* renamed from: inl reason: default package */
public final class inl implements wig<ink> {
    private final wzi<Context> a;
    private final wzi<gmm<Response>> b;
    private final wzi<xil> c;

    private inl(wzi<Context> wzi, wzi<gmm<Response>> wzi2, wzi<xil> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static inl a(wzi<Context> wzi, wzi<gmm<Response>> wzi2, wzi<xil> wzi3) {
        return new inl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ink((Context) this.a.get(), (gmm) this.b.get(), (xil) this.c.get());
    }
}

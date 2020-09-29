package defpackage;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Flowable;

/* renamed from: kpw reason: default package */
public final class kpw implements vua<Flowable<kqc>> {
    private final wlc<Context> a;
    private final wlc<Flowable<RecentlyPlayedItems>> b;

    private kpw(wlc<Context> wlc, wlc<Flowable<RecentlyPlayedItems>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kpw a(wlc<Context> wlc, wlc<Flowable<RecentlyPlayedItems>> wlc2) {
        return new kpw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Context) this.a.get(), (Flowable) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

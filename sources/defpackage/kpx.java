package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* renamed from: kpx reason: default package */
public final class kpx implements vua<Flowable<RecentlyPlayedItems>> {
    private final wlc<hde> a;

    private kpx(wlc<hde> wlc) {
        this.a = wlc;
    }

    public static kpx a(wlc<hde> wlc) {
        return new kpx(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(((hde) this.a.get()).b().a(BackpressureStrategy.LATEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}

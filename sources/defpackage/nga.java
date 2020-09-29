package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Scheduler;

/* renamed from: nga reason: default package */
public final class nga implements vua<vit<RecentlyPlayedItems>> {
    private final wlc<Scheduler> a;

    private nga(wlc<Scheduler> wlc) {
        this.a = wlc;
    }

    public static nga a(wlc<Scheduler> wlc) {
        return new nga(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vit) vuf.a(new a(new RecentlyPlayedItems(0, true, ImmutableList.d()), (Scheduler) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Scheduler;

/* renamed from: nlp reason: default package */
public final class nlp implements wig<vvy<RecentlyPlayedItems>> {
    private final wzi<Scheduler> a;

    private nlp(wzi<Scheduler> wzi) {
        this.a = wzi;
    }

    public static nlp a(wzi<Scheduler> wzi) {
        return new nlp(wzi);
    }

    public final /* synthetic */ Object get() {
        return (vvy) wil.a(new a(new RecentlyPlayedItems(0, true, ImmutableList.d()), (Scheduler) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

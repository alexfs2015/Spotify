package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* renamed from: ktg reason: default package */
public final class ktg implements wig<Flowable<RecentlyPlayedItems>> {
    private final wzi<hga> a;

    private ktg(wzi<hga> wzi) {
        this.a = wzi;
    }

    public static ktg a(wzi<hga> wzi) {
        return new ktg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((hga) this.a.get()).b().a(BackpressureStrategy.LATEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}

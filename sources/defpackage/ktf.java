package defpackage;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Flowable;

/* renamed from: ktf reason: default package */
public final class ktf implements wig<Flowable<ktl>> {
    private final wzi<Context> a;
    private final wzi<Flowable<RecentlyPlayedItems>> b;

    private ktf(wzi<Context> wzi, wzi<Flowable<RecentlyPlayedItems>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ktf a(wzi<Context> wzi, wzi<Flowable<RecentlyPlayedItems>> wzi2) {
        return new ktf(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(CC.a((Context) this.a.get(), (Flowable) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

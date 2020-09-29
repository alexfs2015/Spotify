package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: nll reason: default package */
public final class nll implements wig<xii<RecentlyPlayedItems>> {
    private final wzi<vvy<RecentlyPlayedItems>> a;
    private final wzi<hga> b;
    private final wzi<nkc> c;

    private nll(wzi<vvy<RecentlyPlayedItems>> wzi, wzi<hga> wzi2, wzi<nkc> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nll a(wzi<vvy<RecentlyPlayedItems>> wzi, wzi<hga> wzi2, wzi<nkc> wzi3) {
        return new nll(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(wit.a((ObservableSource<T>) ((hga) this.b.get()).b(), BackpressureStrategy.BUFFER).b().a(wit.a((ObservableTransformer<T, R>) (nkc) this.c.get(), BackpressureStrategy.LATEST)).a(wit.a((ObservableTransformer<T, R>) (vvy) this.a.get(), BackpressureStrategy.LATEST)), "Cannot return null from a non-@Nullable @Provides method");
    }
}

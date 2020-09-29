package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: nfw reason: default package */
public final class nfw implements vua<wud<RecentlyPlayedItems>> {
    private final wlc<vit<RecentlyPlayedItems>> a;
    private final wlc<hde> b;
    private final wlc<nen> c;

    private nfw(wlc<vit<RecentlyPlayedItems>> wlc, wlc<hde> wlc2, wlc<nen> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nfw a(wlc<vit<RecentlyPlayedItems>> wlc, wlc<hde> wlc2, wlc<nen> wlc3) {
        return new nfw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(vun.a((ObservableSource<T>) ((hde) this.b.get()).b(), BackpressureStrategy.BUFFER).b().a(vun.a((ObservableTransformer<T, R>) (nen) this.c.get(), BackpressureStrategy.LATEST)).a(vun.a((ObservableTransformer<T, R>) (vit) this.a.get(), BackpressureStrategy.LATEST)), "Cannot return null from a non-@Nullable @Provides method");
    }
}

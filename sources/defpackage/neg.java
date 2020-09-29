package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/* renamed from: neg reason: default package */
public final class neg implements vua<Observable<uyy<uys>>> {
    private final wlc<RxResolver> a;
    private final wlc<String> b;
    private final wlc<MediaType> c;
    private final wlc<SortOption> d;
    private final wlc<Boolean> e;

    private neg(wlc<RxResolver> wlc, wlc<String> wlc2, wlc<MediaType> wlc3, wlc<SortOption> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static neg a(wlc<RxResolver> wlc, wlc<String> wlc2, wlc<MediaType> wlc3, wlc<SortOption> wlc4, wlc<Boolean> wlc5) {
        neg neg = new neg(wlc, wlc2, wlc3, wlc4, wlc5);
        return neg;
    }

    public final /* synthetic */ Object get() {
        RxResolver rxResolver = (RxResolver) this.a.get();
        String str = (String) this.b.get();
        MediaType mediaType = (MediaType) this.c.get();
        SortOption sortOption = (SortOption) this.d.get();
        boolean booleanValue = ((Boolean) this.e.get()).booleanValue();
        rxf rxf = new rxf(rxResolver, str, false);
        rxf.a(false, true, false);
        rxf.c = sortOption;
        rxf.a(Integer.valueOf(0), Integer.valueOf(20));
        rxf.a = mediaType;
        if (booleanValue) {
            rxf.d("syncProgress");
        }
        return (Observable) vuf.a(vun.b(rxf.e().a((b<? extends R, ? super T>) new wvv<Object,Object>(200, TimeUnit.MILLISECONDS, wzz.b()))), "Cannot return null from a non-@Nullable @Provides method");
    }
}

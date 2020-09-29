package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: toa reason: default package */
public final class toa implements vua<rxh> {
    private final wlc<RxResolver> a;
    private final wlc<String> b;
    private final wlc<MediaType> c;
    private final wlc<SortOption> d;
    private final wlc<Boolean> e;

    private toa(wlc<RxResolver> wlc, wlc<String> wlc2, wlc<MediaType> wlc3, wlc<SortOption> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static toa a(wlc<RxResolver> wlc, wlc<String> wlc2, wlc<MediaType> wlc3, wlc<SortOption> wlc4, wlc<Boolean> wlc5) {
        toa toa = new toa(wlc, wlc2, wlc3, wlc4, wlc5);
        return toa;
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
        rxf.a = mediaType;
        if (booleanValue) {
            rxf.d("syncProgress");
        }
        return (rxh) vuf.a(rxf, "Cannot return null from a non-@Nullable @Provides method");
    }
}

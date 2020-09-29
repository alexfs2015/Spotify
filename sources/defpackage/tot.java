package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tot reason: default package */
public final class tot implements vua<rxf> {
    private final wlc<RxResolver> a;
    private final wlc<String> b;
    private final wlc<MediaType> c;
    private final wlc<SortOption> d;

    private tot(wlc<RxResolver> wlc, wlc<String> wlc2, wlc<MediaType> wlc3, wlc<SortOption> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tot a(wlc<RxResolver> wlc, wlc<String> wlc2, wlc<MediaType> wlc3, wlc<SortOption> wlc4) {
        return new tot(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        MediaType mediaType = (MediaType) this.c.get();
        SortOption sortOption = (SortOption) this.d.get();
        rxf rxf = new rxf((RxResolver) this.a.get(), (String) this.b.get(), true);
        rxf.a(false, false, false);
        rxf.c = sortOption;
        rxf.a = mediaType;
        return (rxf) vuf.a(rxf, "Cannot return null from a non-@Nullable @Provides method");
    }
}

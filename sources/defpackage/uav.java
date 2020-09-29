package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: uav reason: default package */
public final class uav implements wig<sgp> {
    private final wzi<RxResolver> a;
    private final wzi<String> b;
    private final wzi<MediaType> c;
    private final wzi<SortOption> d;

    private uav(wzi<RxResolver> wzi, wzi<String> wzi2, wzi<MediaType> wzi3, wzi<SortOption> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static uav a(wzi<RxResolver> wzi, wzi<String> wzi2, wzi<MediaType> wzi3, wzi<SortOption> wzi4) {
        return new uav(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        MediaType mediaType = (MediaType) this.c.get();
        SortOption sortOption = (SortOption) this.d.get();
        sgp sgp = new sgp((RxResolver) this.a.get(), (String) this.b.get(), true);
        sgp.a(false, false, false);
        sgp.c = sortOption;
        sgp.a = mediaType;
        return (sgp) wil.a(sgp, "Cannot return null from a non-@Nullable @Provides method");
    }
}

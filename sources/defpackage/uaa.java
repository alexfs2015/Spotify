package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: uaa reason: default package */
public final class uaa implements wig<sgr> {
    private final wzi<RxResolver> a;
    private final wzi<String> b;
    private final wzi<MediaType> c;
    private final wzi<SortOption> d;
    private final wzi<Boolean> e;

    private uaa(wzi<RxResolver> wzi, wzi<String> wzi2, wzi<MediaType> wzi3, wzi<SortOption> wzi4, wzi<Boolean> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static uaa a(wzi<RxResolver> wzi, wzi<String> wzi2, wzi<MediaType> wzi3, wzi<SortOption> wzi4, wzi<Boolean> wzi5) {
        uaa uaa = new uaa(wzi, wzi2, wzi3, wzi4, wzi5);
        return uaa;
    }

    public final /* synthetic */ Object get() {
        RxResolver rxResolver = (RxResolver) this.a.get();
        String str = (String) this.b.get();
        MediaType mediaType = (MediaType) this.c.get();
        SortOption sortOption = (SortOption) this.d.get();
        boolean booleanValue = ((Boolean) this.e.get()).booleanValue();
        sgp sgp = new sgp(rxResolver, str, false);
        sgp.a(false, true, false);
        sgp.c = sortOption;
        sgp.a = mediaType;
        if (booleanValue) {
            sgp.d("syncProgress");
        }
        return (sgr) wil.a(sgp, "Cannot return null from a non-@Nullable @Provides method");
    }
}

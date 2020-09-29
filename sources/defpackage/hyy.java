package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;

/* renamed from: hyy reason: default package */
public final class hyy implements wig<SlotApi> {
    private final wzi<rwl> a;
    private final wzi<RxResolver> b;

    private hyy(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hyy a(wzi<rwl> wzi, wzi<RxResolver> wzi2) {
        return new hyy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (SlotApi) wil.a(CC.b((rwl) this.a.get(), (RxResolver) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

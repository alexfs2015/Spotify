package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Observable;

/* renamed from: hvm reason: default package */
public final class hvm implements wig<Observable<vlb<vkv>>> {
    private final wzi<RxResolver> a;
    private final wzi<hxx> b;

    private hvm(wzi<RxResolver> wzi, wzi<hxx> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static hvm a(wzi<RxResolver> wzi, wzi<hxx> wzi2) {
        return new hvm(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(hvk.a((RxResolver) this.a.get(), (hxx) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

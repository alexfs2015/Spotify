package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Observable;

/* renamed from: tvl reason: default package */
public final class tvl implements wig<viy> {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;
    private final wzi<Observable<Boolean>> c;

    private tvl(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Observable<Boolean>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static tvl a(wzi<RxResolver> wzi, wzi<rwl> wzi2, wzi<Observable<Boolean>> wzi3) {
        return new tvl(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (viy) wil.a(CC.a((RxResolver) this.a.get(), (rwl) this.b.get(), (Observable) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

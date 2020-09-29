package defpackage;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.policy.Policy;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: vlz reason: default package */
final class vlz implements vlx {
    private final vly a;

    public vlz(vly vly) {
        this.a = vly;
    }

    public final Single<vlb<vkv>> a(a aVar) {
        Optional a2 = aVar.a();
        return (a2.b() ? this.a.a(aVar.l(), (Policy) a2.c()) : this.a.a(aVar.l())).a((Function<? super T, ? extends SingleSource<? extends R>>) $$Lambda$vlz$G8R_Uj3t1DNxqHCMnlbF_7d8Yg.INSTANCE).f($$Lambda$2G9zXk9odOB46kvl7vvBVPTx0.INSTANCE);
    }
}

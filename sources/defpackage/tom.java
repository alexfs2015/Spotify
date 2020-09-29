package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tom reason: default package */
public final class tom implements c<ImmutableList<tpq>, tps> {
    private final Flowable<PlayerState> a;
    private final top b;

    public tom(Flowable<PlayerState> flowable, top top) {
        this.a = flowable;
        this.b = top;
    }

    /* access modifiers changed from: private */
    public static tps a(ImmutableList<tpq> immutableList, tpq tpq) {
        fdz R_ = immutableList.R_();
        while (R_.hasNext()) {
            tpq tpq2 = (tpq) R_.next();
            if (tpq.e().equals(tpq2.e())) {
                return new a().a(immutableList).a(Integer.parseInt(tpq2.a())).a();
            }
        }
        return new a().a(ImmutableList.g().c(tpq).b((Iterable<? extends E>) immutableList).a()).a(0).a();
    }

    public final /* synthetic */ Object call(Object obj) {
        return ((xii) obj).a(wit.a((xfk<T>) this.a).a((c<? super T, ? extends R>) this.b), (xiz<? super T, ? super U, ? extends R>) $$Lambda$tom$abwkR_0KSc2Sn31XTBaAq3CV2lM.INSTANCE);
    }
}

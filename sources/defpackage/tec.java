package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tec reason: default package */
public final class tec implements c<ImmutableList<tfg>, tfi> {
    private final Flowable<PlayerState> a;
    private final tef b;

    public final /* synthetic */ Object call(Object obj) {
        return ((wud) obj).a(vun.a((wrf<T>) this.a).a((c<? super T, ? extends R>) this.b), (wuu<? super T, ? super U, ? extends R>) $$Lambda$tec$Dnxl4vjVq0svQw94DWtleZ6_LNY.INSTANCE);
    }

    public tec(Flowable<PlayerState> flowable, tef tef) {
        this.a = flowable;
        this.b = tef;
    }

    /* access modifiers changed from: private */
    public static tfi a(ImmutableList<tfg> immutableList, tfg tfg) {
        fdh R_ = immutableList.R_();
        while (R_.hasNext()) {
            tfg tfg2 = (tfg) R_.next();
            if (tfg.e().equals(tfg2.e())) {
                return new a().a(immutableList).a(Integer.parseInt(tfg2.a())).a();
            }
        }
        return new a().a(ImmutableList.g().c(tfg).b((Iterable<? extends E>) immutableList).a()).a(0).a();
    }
}

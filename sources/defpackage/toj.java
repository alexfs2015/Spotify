package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: toj reason: default package */
public final class toj implements c<hcs, ImmutableList<tpq>> {
    private final toi a;

    public toj(toi toi) {
        this.a = toi;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(tpq tpq) {
        return Boolean.valueOf(tpq.e() != null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(hcs hcs) {
        return hcs.body().size() > 1 ? hcs.body() : ((hcm) hcs.body().get(0)).children();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(hcs hcs) {
        return Boolean.valueOf(hcs != null && !hcs.body().isEmpty());
    }

    public final /* synthetic */ Object call(Object obj) {
        return xjl.a(((xii) obj).c((xiy<? super T, Boolean>) $$Lambda$toj$pikYX284_VnSJA2QkjKXldQKqE4.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$toj$8H5PVlNwzSYpYDecy7ezW0j1SA.INSTANCE), $$Lambda$toj$pJupmOfcg4gtTrRfcHMJzyb9DA.INSTANCE, xlx.b).a((c<? super T, ? extends R>) this.a).c((xiy<? super T, Boolean>) $$Lambda$toj$sjpvScQfL53Olj2gKEJj249PRE.INSTANCE).a((b<? extends R, ? super T>) a.a).e((xiy<? super T, ? extends R>) $$Lambda$Nj5J6z9tVlSoj5sG7U4KH36Rrpo.INSTANCE);
    }
}

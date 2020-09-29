package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import java.util.List;

/* renamed from: low reason: default package */
final class low implements xiz<hcs, Boolean, hcs> {
    private static final Function<hcm, hcm> a = $$Lambda$low$0yfuItp83J8B5riLhFzZYJyTV4.INSTANCE;

    low() {
    }

    private static hcm a(hcm hcm) {
        return (!HubsComponentCategory.ROW.mId.equals(hcm.componentId().category()) || !lpa.b(hcm)) ? hcm : hcm.toBuilder().f(gzg.a(true)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcm b(hcm hcm) {
        hcm a2 = a(hcm);
        if (a2.children().isEmpty()) {
            return a2;
        }
        a g = ImmutableList.g();
        for (hcm a3 : a2.children()) {
            g.c(a(a3));
        }
        return a2.toBuilder().a((List<? extends hcm>) g.a()).a();
    }

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        hcs hcs = (hcs) obj;
        return ((Boolean) obj2).booleanValue() ? hcs.toBuilder().a(Lists.a(hcs.body(), a)).a() : hcs;
    }
}

package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import java.util.List;

/* renamed from: lkw reason: default package */
final class lkw implements wuu<gzz, Boolean, gzz> {
    private static final Function<gzt, gzt> a = $$Lambda$lkw$v0fYPCCEQew7qCq8SfkBjD62O0.INSTANCE;

    public final /* synthetic */ Object call(Object obj, Object obj2) {
        gzz gzz = (gzz) obj;
        return ((Boolean) obj2).booleanValue() ? gzz.toBuilder().a(Lists.a(gzz.body(), a)).a() : gzz;
    }

    lkw() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ gzt b(gzt gzt) {
        gzt a2 = a(gzt);
        if (a2.children().isEmpty()) {
            return a2;
        }
        a g = ImmutableList.g();
        for (gzt a3 : a2.children()) {
            g.c(a(a3));
        }
        return a2.toBuilder().a((List<? extends gzt>) g.a()).a();
    }

    private static gzt a(gzt gzt) {
        return (!HubsComponentCategory.ROW.mId.equals(gzt.componentId().category()) || !lla.b(gzt)) ? gzt : gzt.toBuilder().f(gww.a(true)).a();
    }
}

package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: tdz reason: default package */
public final class tdz implements c<gzz, ImmutableList<tfg>> {
    private final tdy a;

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable a(List list) {
        return list;
    }

    public final /* synthetic */ Object call(Object obj) {
        return wvg.a(((wud) obj).c((wut<? super T, Boolean>) $$Lambda$tdz$CWK9LukSmNQC8MeKOf36eqeU8o.INSTANCE).f($$Lambda$tdz$KydseCI1pcCGz0TVRO4q3qAoe4.INSTANCE), $$Lambda$tdz$LEsgLcjNpx4iVqKD7zmpPfNQtzo.INSTANCE, wxs.b).a((c<? super T, ? extends R>) this.a).c((wut<? super T, Boolean>) $$Lambda$tdz$pS5MjEyKj28SdHCYCmRiaR3dUZg.INSTANCE).a((b<? extends R, ? super T>) a.a).f($$Lambda$XPVSJjLtgc1NsZ4KAzCybyiCJY.INSTANCE);
    }

    public tdz(tdy tdy) {
        this.a = tdy;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(gzz gzz) {
        return Boolean.valueOf(gzz != null && !gzz.body().isEmpty());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List a(gzz gzz) {
        if (gzz.body().size() > 1) {
            return gzz.body();
        }
        return ((gzt) gzz.body().get(0)).children();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(tfg tfg) {
        return Boolean.valueOf(tfg.e() != null);
    }
}

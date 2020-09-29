package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: nmy reason: default package */
public final class nmy implements c<hcs, hcs> {
    private static final hdn b = new hdn($$Lambda$nmy$Pvw1xwOHRFX3G7cZ0b3J8MOTO8U.INSTANCE);
    private static final hdn c = new hdn($$Lambda$nmy$qX82pWtZPKuYckqSplITu4R3QE.INSTANCE);
    private static boolean d;
    private static String e;
    private final xii<Boolean> a;

    nmy(xii<Boolean> xii) {
        this.a = xii;
    }

    /* access modifiers changed from: private */
    public static hcm a(hcm hcm) {
        if (!c(hcm)) {
            return hcm;
        }
        String[] stringArray = hcm.custom().stringArray("podcastOnboardingShelfCarousel");
        return (stringArray == null || stringArray.length <= 0) ? hcm : hcm.toBuilder().a(a(hcm, stringArray[0])).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ hcs a(Boolean bool, hcs hcs) {
        hcs a2 = bool.booleanValue() ? b.a(hcs) : c.a(hcs);
        return d ? a2.toBuilder().a((List<? extends hcm>) ImmutableList.a(fcp.a((Iterable<E>) a2.body()).a((fbq<? super E>) $$Lambda$nmy$qs_Oesc7zF89cG2SZ01QHBfP7j4.INSTANCE).a())).a() : a2;
    }

    private static List<? extends hcm> a(hcm hcm, String str) {
        ImmutableList a2 = ImmutableList.a(fcp.a((Iterable<E>) hcm.children()).a((fbq<? super E>) new $$Lambda$nmy$ETVSudUwbUzlt6cFGOWOyilm6so<Object>(str)).a());
        d = a2.isEmpty();
        return a2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, hcm hcm) {
        return !hcm.id().equals(str);
    }

    /* access modifiers changed from: private */
    public static hcm b(hcm hcm) {
        if (!c(hcm)) {
            return hcm;
        }
        String[] stringArray = hcm.custom().stringArray("podcastOnboardingShelfHeader");
        if (stringArray != null && stringArray.length > 0) {
            e = stringArray[0];
        }
        String[] stringArray2 = hcm.custom().stringArray("podcastOnboardingShelfBanner");
        return (stringArray2 == null || stringArray2.length <= 0) ? hcm : hcm.toBuilder().a(a(hcm, stringArray2[0])).a();
    }

    private static boolean c(hcm hcm) {
        String[] stringArray = hcm.custom().stringArray("podcastOnboardingShelf");
        return (stringArray == null || stringArray.length <= 0 || stringArray[0] == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(hcm hcm) {
        String id = hcm.id();
        return !(id != null && id.equals(e));
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.a(this.a, (xii) obj, (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$nmy$HNiJC6VCgIWezmQwxXpprhcKvN0.INSTANCE);
    }
}

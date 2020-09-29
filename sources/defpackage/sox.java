package defpackage;

import io.reactivex.functions.BiFunction;

/* renamed from: sox reason: default package */
final class sox implements BiFunction<hcs, hcs, hcs> {
    sox() {
    }

    private static boolean a(hcs hcs) {
        return !hcs.body().isEmpty();
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        hcs hcs = (hcs) obj;
        hcs hcs2 = (hcs) obj2;
        boolean z = false;
        if (a(hcs) && a(hcs2)) {
            if (six.d(hcs2) > six.d(hcs)) {
                z = true;
            }
            return z ? hcs.toBuilder().b(hcs2.body()).a(hcs2.custom()).a() : hcs;
        } else if (!a(hcs)) {
            return hcs2;
        } else {
            String str = "isLastPage";
            return hcs2.custom().boolValue(str, false) ? hcs.toBuilder().a(str, Boolean.TRUE).a() : hcs;
        }
    }
}

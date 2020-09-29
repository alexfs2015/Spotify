package defpackage;

import io.reactivex.functions.BiFunction;

/* renamed from: seq reason: default package */
final class seq implements BiFunction<gzz, gzz, gzz> {
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        gzz gzz = (gzz) obj;
        gzz gzz2 = (gzz) obj2;
        boolean z = false;
        if (a(gzz) && a(gzz2)) {
            if (rzj.d(gzz2) > rzj.d(gzz)) {
                z = true;
            }
            if (z) {
                return gzz.toBuilder().b(gzz2.body()).a(gzz2.custom()).a();
            }
            return gzz;
        } else if (!a(gzz)) {
            return gzz2;
        } else {
            String str = "isLastPage";
            return gzz2.custom().boolValue(str, false) ? gzz.toBuilder().a(str, Boolean.TRUE).a() : gzz;
        }
    }

    seq() {
    }

    private static boolean a(gzz gzz) {
        return !gzz.body().isEmpty();
    }
}

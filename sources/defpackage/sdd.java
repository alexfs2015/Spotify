package defpackage;

import com.spotify.music.libs.search.offline.model.OfflineResults;
import io.reactivex.functions.BiFunction;

/* renamed from: sdd reason: default package */
final class sdd implements BiFunction<sgg<gzz>, sgg<OfflineResults>, gzz> {
    private final rzh a;
    private final sgy<gzz> b;

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        sgg sgg = (sgg) obj;
        sgg sgg2 = (sgg) obj2;
        sgy<gzz> sgy = this.b;
        rzh rzh = this.a;
        boolean z = sgg.a() || sgg.b();
        boolean a2 = sgg2.a();
        if (!z) {
            if (a2) {
                return (gzz) sgy.a((OfflineResults) sgg2.b);
            }
            return rzh.b(sgg2.a);
        } else if (sgg.b()) {
            return rzh.b(sgg.a);
        } else {
            gzz gzz = (gzz) fay.a(sgg.b);
            return gzz.toBuilder().a(gzz.custom().toBuilder().a("isOnlineResults", true).a()).a();
        }
    }

    sdd(rzh rzh, sgy<gzz> sgy) {
        this.a = rzh;
        this.b = sgy;
    }
}

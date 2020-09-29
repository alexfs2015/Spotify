package defpackage;

import com.spotify.music.libs.search.offline.model.OfflineResults;
import io.reactivex.functions.BiFunction;

/* renamed from: snk reason: default package */
final class snk implements BiFunction<sqn<hcs>, sqn<OfflineResults>, hcs> {
    private final siv a;
    private final srf<hcs> b;

    snk(siv siv, srf<hcs> srf) {
        this.a = siv;
        this.b = srf;
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        sqn sqn = (sqn) obj;
        sqn sqn2 = (sqn) obj2;
        srf<hcs> srf = this.b;
        siv siv = this.a;
        boolean z = sqn.a() || sqn.b();
        boolean a2 = sqn2.a();
        if (!z) {
            return a2 ? (hcs) srf.a((OfflineResults) sqn2.b) : siv.b(sqn2.a);
        }
        if (sqn.b()) {
            return siv.b(sqn.a);
        }
        hcs hcs = (hcs) fbp.a(sqn.b);
        return hcs.toBuilder().a(hcs.custom().toBuilder().a("isOnlineResults", true).a()).a();
    }
}

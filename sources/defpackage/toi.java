package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: toi reason: default package */
public final class toi implements c<hcm, tpq> {
    private final tol a;

    public toi(tol tol) {
        this.a = tol;
    }

    private static String a(hcr hcr) {
        if (hcr != null) {
            return hcr.uri();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tpq a(AtomicInteger atomicInteger, too too, hcm hcm) {
        String a2 = a(hcm.target());
        hcp main = hcm.images().main();
        return new a().e(main != null ? main.uri() : "").a(new hfv(a2)).b(hcm.id()).a(Integer.toString(atomicInteger.getAndIncrement())).a(new PlayerContextIndex(0, 0)).a(0).c(hcm.text().title()).d(too.a()).a(too.b()).a(too.c()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(hcm hcm) {
        return Boolean.valueOf(hcm.target() != null);
    }

    public final /* synthetic */ Object call(Object obj) {
        xii xii = (xii) obj;
        AtomicInteger atomicInteger = new AtomicInteger();
        xii a2 = xii.c((xiy<? super T, Boolean>) $$Lambda$toi$vZPzp88IhIfKqQRpK41QKrmBjCk.INSTANCE).a((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$toi$i3Spg6bRiYeBZHlaiYH26RBwTx4.INSTANCE);
        tol tol = this.a;
        tol.getClass();
        return a2.d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$8ZNENFhGPKDlz_l5jy5FCq_Jpw0<Object,Object>(tol)).b(xii, (xiz<? super T, ? super T2, ? extends R>) new $$Lambda$toi$zNrT1kjl_6HqYbvI1mnwbdk_o4<Object,Object,Object>(atomicInteger));
    }
}

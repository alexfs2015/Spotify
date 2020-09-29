package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: gsw reason: default package */
public final class gsw {
    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.spotify.mobile.android.connect.model.GaiaDevice>, for r5v0, types: [java.util.List, java.util.List<com.spotify.mobile.android.connect.model.GaiaDevice>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ defpackage.gud a(com.google.common.base.Optional r3, com.google.common.base.Optional r4, java.util.List<com.spotify.mobile.android.connect.model.GaiaDevice> r5, com.spotify.mobile.android.connect.ConnectManager.ConnectState r6) {
        /*
            java.lang.Class<com.spotify.mobile.android.connect.model.Tech> r0 = com.spotify.mobile.android.connect.model.Tech.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x000a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r5.next()
            com.spotify.mobile.android.connect.model.GaiaDevice r1 = (com.spotify.mobile.android.connect.model.GaiaDevice) r1
            boolean r2 = r1.isSelf()
            if (r2 != 0) goto L_0x000a
            com.spotify.mobile.android.connect.model.Tech r1 = com.spotify.mobile.android.connect.model.Tech.of(r1)
            r0.add(r1)
            goto L_0x000a
        L_0x0024:
            java.lang.Object r3 = r3.d()
            com.spotify.mobile.android.connect.model.GaiaDevice r3 = (com.spotify.mobile.android.connect.model.GaiaDevice) r3
            java.lang.Object r4 = r4.d()
            com.spotify.mobile.android.connect.model.GaiaDevice r4 = (com.spotify.mobile.android.connect.model.GaiaDevice) r4
            gud r3 = defpackage.gud.a(r6, r0, r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsw.a(com.google.common.base.Optional, com.google.common.base.Optional, java.util.List, com.spotify.mobile.android.connect.ConnectManager$ConnectState):gud");
    }

    public static Observable<gud> a(ConnectManager connectManager) {
        return Observable.a(connectManager.g().c((Function<? super T, ? extends R>) $$Lambda$mZ9LFNADZu_WPDiBz80peLQVbQ.INSTANCE).e(Optional.e()), connectManager.h().e(Optional.e()), connectManager.e(), connectManager.f().e(ConnectState.UNKNOWN), $$Lambda$gsw$WrM2a6RqNeH6ihm8EkPXi2X69uI.INSTANCE);
    }
}

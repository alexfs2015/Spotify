package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: pqp reason: default package */
public final class pqp implements ObservableTransformer<PlayerState, prf> {
    private final kyj a;

    /* renamed from: pqp$a */
    static final class a {
        final String a;
        final PlayerTrack b;
        final String c;
        final boolean d;

        /* synthetic */ a(PlayerState playerState, byte b2) {
            this(playerState);
        }

        private a(PlayerState playerState) {
            this.a = playerState.playbackId();
            this.b = playerState.track();
            this.c = playerState.playOrigin().deviceIdentifier();
            this.d = playerState.isPaused();
        }
    }

    public pqp(kyj kyj) {
        this.a = kyj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(ho hoVar, PlayerState playerState) {
        return new ho(hoVar.b, new a(playerState, 0));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r4 == false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ java.lang.Iterable a(defpackage.ho r7) {
        /*
            r6 = this;
            F r0 = r7.a
            pqp$a r0 = (defpackage.pqp.a) r0
            S r7 = r7.b
            pqp$a r7 = (defpackage.pqp.a) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0014
            if (r7 == 0) goto L_0x0037
        L_0x0014:
            if (r0 != 0) goto L_0x0017
            goto L_0x0038
        L_0x0017:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r4 = r0.b
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r5 = r7.b
            if (r4 != 0) goto L_0x0021
            if (r5 != 0) goto L_0x0021
            r4 = 1
            goto L_0x0034
        L_0x0021:
            if (r4 == 0) goto L_0x0033
            if (r5 != 0) goto L_0x0026
            goto L_0x0033
        L_0x0026:
            java.lang.String r4 = r4.uri()
            java.lang.String r5 = r5.uri()
            boolean r4 = r4.equals(r5)
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            if (r3 == 0) goto L_0x003b
            return r1
        L_0x003b:
            boolean r2 = a(r0)
            java.lang.String r3 = "PLAYBACK_STARTED"
            if (r2 != 0) goto L_0x0050
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r0 = r0.b
            java.lang.String r0 = r0.uri()
            prf r0 = defpackage.prf.b(r0, r3)
            r1.add(r0)
        L_0x0050:
            kyj r0 = r6.a
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x006b
            boolean r0 = a(r7)
            if (r0 != 0) goto L_0x006b
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r7 = r7.b
            java.lang.String r7 = r7.uri()
            prf r7 = defpackage.prf.a(r7, r3)
            r1.add(r7)
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqp.a(ho):java.lang.Iterable");
    }

    private static boolean a(a aVar) {
        return aVar == null || aVar.a == null || aVar.b == null || PlayerTrackUtil.isAd(aVar.b) || InterruptionUtil.isInterruptionUri(aVar.b.uri()) || (aVar.c != null && !aVar.c.isEmpty()) || aVar.d;
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        return observable.a(new ho(null, null), (BiFunction<R, ? super T, R>) $$Lambda$pqp$kYwWwaMscwSHSgu1erni73sIVY.INSTANCE).b((Function<? super T, ? extends Iterable<? extends U>>) new $$Lambda$pqp$7aDpV6TzhANm0HeyPZl3X1dnDNo<Object,Object>(this));
    }
}

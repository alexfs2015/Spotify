package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: sqn reason: default package */
public interface sqn {

    /* renamed from: sqn$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<sze> a(Flowable<PlayerTrack> flowable, kug kug, wlc<PlayerState> wlc, fpt fpt) {
            kug.getClass();
            return flowable.c((Function<? super T, ? extends R>) new $$Lambda$sJQcD2otrdFU6kdPlv83vj6Zxw<Object,Object>(kug)).c((Function<? super T, ? extends R>) new $$Lambda$sqn$9KW8yxNu449rbrvNLvAktOI8b4s<Object,Object>(wlc, fpt));
        }

        public static /* synthetic */ sze a(wlc wlc, fpt fpt, Boolean bool) {
            boolean z;
            boolean booleanValue = bool.booleanValue();
            PlayerState playerState = (PlayerState) wlc.get();
            if (playerState != null) {
                if (!(uhq.g(playerState.contextUri()) || uhq.f(playerState.contextUri()))) {
                    z = true;
                    return sze.c().a(c.m().a(false).j(true).k(true).f(false).g(z).l(uag.a(fpt)).i(booleanValue).a()).a();
                }
            }
            z = false;
            return sze.c().a(c.m().a(false).j(true).k(true).f(false).g(z).l(uag.a(fpt)).i(booleanValue).a()).a();
        }
    }
}

package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: tau reason: default package */
public interface tau {

    /* renamed from: tau$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<tjl> a(Flowable<PlayerTrack> flowable, kxp kxp, wzi<PlayerState> wzi, fqn fqn) {
            kxp.getClass();
            return flowable.c((Function<? super T, ? extends R>) new $$Lambda$F86ts5uxM_c3AaiG8qX798D5nGw<Object,Object>(kxp)).c((Function<? super T, ? extends R>) new $$Lambda$tau$my1Pwp87MXwbdbrDvV2wRdmkZaE<Object,Object>(wzi, fqn));
        }

        public static /* synthetic */ tjl a(wzi wzi, fqn fqn, Boolean bool) {
            boolean z;
            boolean booleanValue = bool.booleanValue();
            PlayerState playerState = (PlayerState) wzi.get();
            if (playerState != null) {
                if (!(ute.f(playerState.contextUri()) || ute.e(playerState.contextUri()))) {
                    z = true;
                    return tjl.c().a(c.m().a(false).j(true).k(true).f(false).g(z).l(unb.a(fqn)).i(booleanValue).a()).a();
                }
            }
            z = false;
            return tjl.c().a(c.m().a(false).j(true).k(true).f(false).g(z).l(unb.a(fqn)).i(booleanValue).a()).a();
        }
    }
}

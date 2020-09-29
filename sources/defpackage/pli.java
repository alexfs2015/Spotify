package defpackage;

import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pli reason: default package */
public final class pli {
    public final Player a;
    final plh b;
    final wug c;
    public final QueueManager d;
    pmk e;
    public PlayerQueue f;
    public final wue<Response> g = new wue<Response>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Error while updating the queue", new Object[0]);
        }

        public final /* synthetic */ void onNext(Object obj) {
            Logger.b("Queue updated", new Object[0]);
        }
    };
    final wue<PlayerQueue> h = new wue<PlayerQueue>() {
        public final void onCompleted() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            PlayerQueue playerQueue = (PlayerQueue) obj;
            pli pli = pli.this;
            pli.a(playerQueue, pli.a.getLastPlayerState());
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Failed to get PlayerQueue for mPlayerObserver.", new Object[0]);
        }
    };
    public final PlayerStateObserver i = new PlayerStateObserver() {
        public final void onPlayerStateReceived(PlayerState playerState) {
            pli.this.k.a(vun.a((ObservableSource<T>) pli.this.d.getQueue(), BackpressureStrategy.BUFFER).a(1).a(pli.this.c).a((wun<? super T>) new $$Lambda$pli$3$tLnQH227fXFvXwYP_FSaf0ZBw<Object>(this, playerState), (wun<Throwable>) $$Lambda$pli$3$KBbfQdgaKGFGxahBTJZo83NmFo.INSTANCE));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerState playerState, PlayerQueue playerQueue) {
            pli.this.a(playerQueue, playerState);
        }
    };
    public pme j;
    public final xag k = new xag();
    private boolean l;

    public pli(Player player, plh plh, QueueManager queueManager, pmk pmk, wug wug) {
        this.a = (Player) fay.a(player);
        this.b = (plh) fay.a(plh);
        this.e = (pmk) fay.a(pmk);
        this.d = (QueueManager) fay.a(queueManager);
        this.c = (wug) fay.a(wug);
    }

    public final boolean a(int i2) {
        return 2 == this.b.a(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void a(PlayerQueue playerQueue, PlayerState playerState) {
        if (playerState != null) {
            boolean repeatingContext = playerState.options().repeatingContext();
            boolean shufflingContext = playerState.options().shufflingContext();
            PlayerRestrictions restrictions = playerState.restrictions();
            String str = (String) jtc.a((String) playerState.contextMetadata().get("context_description"), "");
            this.f = playerQueue;
            pmj pmj = new pmj(playerQueue, str, restrictions, repeatingContext, shufflingContext, this.l);
            this.e = pmj;
            ArrayList a2 = Lists.a((Iterable<? extends E>) this.b.a);
            plh plh = this.b;
            if (!plh.b.equals(this.e)) {
                this.b.a(this.e);
                List<a> list = this.b.a;
                pme pme = this.j;
                if (pme != null) {
                    jsb.a(a2, list, pme, $$Lambda$pli$5fkCS_fGDtwxV_B6teLfoPznw64.INSTANCE);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(a aVar, a aVar2) {
        return aVar.c.hashCode() == aVar2.c.hashCode();
    }

    public final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            PlayerQueue playerQueue = this.f;
            if (playerQueue != null) {
                a(playerQueue, this.a.getLastPlayerState());
            }
        }
        plh plh = this.b;
        plh.d = z;
        plh.a(plh.b);
    }
}

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

/* renamed from: pue reason: default package */
public final class pue {
    public final Player a;
    final pud b;
    final xil c;
    public final QueueManager d;
    pvg e;
    public PlayerQueue f;
    public final xij<Response> g = new xij<Response>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Error while updating the queue", new Object[0]);
        }

        public final /* synthetic */ void onNext(Object obj) {
            Logger.b("Queue updated", new Object[0]);
        }
    };
    final xij<PlayerQueue> h = new xij<PlayerQueue>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Failed to get PlayerQueue for mPlayerObserver.", new Object[0]);
        }

        public final /* synthetic */ void onNext(Object obj) {
            PlayerQueue playerQueue = (PlayerQueue) obj;
            pue pue = pue.this;
            pue.a(playerQueue, pue.a.getLastPlayerState());
        }
    };
    public final PlayerStateObserver i = new PlayerStateObserver() {
        /* access modifiers changed from: private */
        public /* synthetic */ void a(PlayerState playerState, PlayerQueue playerQueue) {
            pue.this.a(playerQueue, playerState);
        }

        public final void onPlayerStateReceived(PlayerState playerState) {
            pue.this.k.a(wit.a((ObservableSource<T>) pue.this.d.getQueue(), BackpressureStrategy.BUFFER).a(1).a(pue.this.c).a((xis<? super T>) new $$Lambda$pue$3$ATIobxOZbQiNNuIoWvW6kj2_v18<Object>(this, playerState), (xis<Throwable>) $$Lambda$pue$3$FPobyrOArk1CEexAt_0vvdw3HDc.INSTANCE));
        }
    };
    public pva j;
    public final xok k = new xok();
    private boolean l;

    public pue(Player player, pud pud, QueueManager queueManager, pvg pvg, xil xil) {
        this.a = (Player) fbp.a(player);
        this.b = (pud) fbp.a(pud);
        this.e = (pvg) fbp.a(pvg);
        this.d = (QueueManager) fbp.a(queueManager);
        this.c = (xil) fbp.a(xil);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(a aVar, a aVar2) {
        return aVar.c.hashCode() == aVar2.c.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final void a(PlayerQueue playerQueue, PlayerState playerState) {
        if (playerState != null) {
            boolean repeatingContext = playerState.options().repeatingContext();
            boolean shufflingContext = playerState.options().shufflingContext();
            PlayerRestrictions restrictions = playerState.restrictions();
            String str = (String) jvi.a((String) playerState.contextMetadata().get("context_description"), "");
            this.f = playerQueue;
            pvf pvf = new pvf(playerQueue, str, restrictions, repeatingContext, shufflingContext, this.l);
            this.e = pvf;
            ArrayList a2 = Lists.a((Iterable<? extends E>) this.b.a);
            pud pud = this.b;
            if (!pud.b.equals(this.e)) {
                this.b.a(this.e);
                List<a> list = this.b.a;
                pva pva = this.j;
                if (pva != null) {
                    jul.a(a2, list, pva, $$Lambda$pue$2ECOebci0fDVlHqIwtZ1OmIuKUc.INSTANCE);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            PlayerQueue playerQueue = this.f;
            if (playerQueue != null) {
                a(playerQueue, this.a.getLastPlayerState());
            }
        }
        pud pud = this.b;
        pud.d = z;
        pud.a(pud.b);
    }

    public final boolean a(int i2) {
        return 2 == this.b.a(i2);
    }
}

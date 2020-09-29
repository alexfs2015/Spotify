package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;

/* renamed from: tne reason: default package */
public final class tne implements a, tto {
    public final xag a;
    private final wue<uyy<uys>> c = new wue<uyy<uys>>() {
        public final void onCompleted() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            tne.a(tne.this, (uyy) obj);
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Error loading episodes", new Object[0]);
            tne.a(tne.this);
        }
    };
    private final wue<PlayerState> d = new wue<PlayerState>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            PlayerState playerState = (PlayerState) obj;
            PlayerTrack track = playerState.track();
            boolean z = playerState.isPlaying() && !playerState.isPaused();
            if (track != null) {
                tne.this.g.a(track.uri(), z);
            } else {
                tne.this.g.a(null, z);
            }
        }
    };
    private final rxh e;
    private final tng f;
    /* access modifiers changed from: private */
    public final tnl g;
    private final tlh h;
    private final Flowable<PlayerState> i;
    private final wug j;

    public tne(tng tng, tnl tnl, tlh tlh, Flowable<PlayerState> flowable, rxh rxh, wug wug) {
        this.f = tng;
        this.g = tnl;
        this.h = tlh;
        this.i = flowable;
        this.e = rxh;
        this.j = wug;
        this.a = new xag();
    }

    public final void onErrorStateButtonClick() {
        this.h.b();
        b();
        this.g.c();
    }

    public final void onMarkAsPlayedClicked() {
        b();
    }

    public final void a() {
        wuk a2 = this.e.e().a(this.j).a(this.c);
        this.a.a(vun.a((ObservableSource<T>) this.i.j(), BackpressureStrategy.BUFFER).a(this.j).a(this.d));
        this.a.a(a2);
    }

    private void b() {
        this.a.a();
        a();
    }

    static /* synthetic */ void a(tne tne) {
        tne.g.d();
        tne.h.a();
        tne.f.a();
    }

    static /* synthetic */ void a(tne tne, uyy uyy) {
        tne.h.b();
        tne.g.d();
        boolean z = ((uys[]) uyy.getItems()).length == 0;
        if (!uyy.isLoading() || !z) {
            if (z) {
                tne.g.e();
            } else {
                tne.g.a((uys[]) uyy.getItems());
                tne.g.f();
            }
            tne.f.b();
        }
    }
}

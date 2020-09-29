package defpackage;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import java.util.concurrent.TimeUnit;

/* renamed from: tzd reason: default package */
public final class tzd extends c implements sig, a, ufr {
    private final xij<vlb<vkv>> b = new xij<vlb<vkv>>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
            Logger.e(th, "Error loading episodes", new Object[0]);
            tzd.a(tzd.this);
        }

        public final /* synthetic */ void onNext(Object obj) {
            vlb vlb = (vlb) obj;
            tzd.this.m = vlb.getUnrangedLength() >= tzd.this.l;
            tzd.a(tzd.this, vlb);
        }
    };
    private final xij<PlayerState> c = new xij<PlayerState>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            tzd.a(tzd.this, (PlayerState) obj);
        }
    };
    private final sgr d;
    private final tzf e;
    private final tzk f;
    private final twz g;
    private final Flowable<PlayerState> h;
    private final xil i;
    private final a j;
    private final xok k;
    /* access modifiers changed from: private */
    public int l;
    /* access modifiers changed from: private */
    public boolean m;

    public tzd(tzf tzf, tzk tzk, twz twz, Flowable<PlayerState> flowable, sgr sgr, xil xil, a aVar, int i2) {
        this.e = tzf;
        this.f = tzk;
        this.g = twz;
        this.h = flowable;
        this.d = sgr;
        this.i = xil;
        this.j = aVar;
        this.k = new xok();
        this.l = i2;
    }

    static /* synthetic */ void a(tzd tzd) {
        tzd.f.d();
        tzd.g.a();
        tzd.e.a();
    }

    static /* synthetic */ void a(tzd tzd, PlayerState playerState) {
        PlayerTrack track = playerState.track();
        int i2 = 0;
        boolean z = playerState.isPlaying() && !playerState.isPaused();
        if (track != null) {
            String uri = track.uri();
            tzd.f.a(uri, z);
            tzk tzk = tzd.f;
            long currentPlaybackPosition = playerState.currentPlaybackPosition();
            if (currentPlaybackPosition > 0) {
                i2 = (int) TimeUnit.MILLISECONDS.toSeconds(currentPlaybackPosition);
            }
            tzk.a(uri, i2);
            return;
        }
        tzd.f.a((String) null, z);
    }

    static /* synthetic */ void a(tzd tzd, vlb vlb) {
        tzd.g.b();
        tzd.f.d();
        boolean z = ((vkv[]) vlb.getItems()).length == 0;
        if (!vlb.isLoading() || !z) {
            if (z) {
                tzd.f.e();
            } else {
                tzd.f.a((vkv[]) vlb.getItems());
                tzd.f.f();
            }
            tzd.e.b();
        }
    }

    private void g() {
        xip a = this.d.a(0, this.l).a(this.i).a(this.b);
        this.k.a(wit.a((ObservableSource<T>) this.h.j(), BackpressureStrategy.BUFFER).a(this.i).a(this.c));
        this.k.a(a);
    }

    private void i() {
        this.k.a();
        g();
    }

    public final void a() {
        this.k.a();
    }

    public final void a(int i2) {
        this.l = i2;
        i();
    }

    public final void a(Bundle bundle) {
        bundle.putInt("range_length", this.l);
    }

    public final void aN_() {
        this.j.b(this);
    }

    public final void c() {
        g();
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.l = bundle.getInt("range_length", this.l);
        }
    }

    public final void d() {
        this.j.a(this);
    }

    public final boolean h() {
        return this.m;
    }

    public final void onErrorStateButtonClick() {
        this.g.b();
        i();
        this.f.c();
    }

    public final void onMarkAsPlayedClicked() {
        i();
    }
}

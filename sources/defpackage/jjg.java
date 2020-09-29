package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: jjg reason: default package */
public final class jjg {
    public final String a;
    public final hqy b;
    public boolean c;
    private final rzt d;
    private final Flowable<PlayerState> e;
    private final hps f;
    private Disposable g;

    jjg(hqy hqy, hqu hqu, rzt rzt, Flowable<PlayerState> flowable) {
        this.b = (hqy) fbp.a(hqy);
        this.d = (rzt) fbp.a(rzt);
        this.e = flowable;
        this.a = hqu.a();
        this.f = new hps(this.b, this.a, rzt);
    }

    public final void a() {
        if (!this.c) {
            this.b.a(this.a, 0, this.d);
            Flowable<PlayerState> flowable = this.e;
            hps hps = this.f;
            hps.getClass();
            this.g = flowable.c((Consumer<? super T>) new $$Lambda$fpSxFpnOLKlIg4fcatdtFCsdagc<Object>(hps));
            this.c = true;
        }
    }

    public final void a(boolean z) {
        if (this.c) {
            Disposable disposable = this.g;
            if (disposable != null && !disposable.b()) {
                this.g.bd_();
            }
            if (z) {
                this.f.a();
                this.b.b(this.a, 0, this.d);
            }
            this.c = false;
        }
    }
}

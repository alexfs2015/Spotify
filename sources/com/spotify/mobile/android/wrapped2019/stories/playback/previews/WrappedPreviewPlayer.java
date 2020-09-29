package com.spotify.mobile.android.wrapped2019.stories.playback.previews;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import io.reactivex.Observable;

public class WrappedPreviewPlayer implements lg {
    private final jrp a;
    private final apz b;
    private final c c;
    private final Observable<kfg> d;
    private kju<kfi, kfg, kff> e;

    public WrappedPreviewPlayer(jrp jrp, apz apz, c cVar, Observable<kfg> observable, Lifecycle lifecycle) {
        this.a = jrp;
        this.b = apz;
        this.c = cVar;
        this.d = observable;
        lifecycle.a(this);
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_START)
    public void start() {
        a a2 = klb.a((kjz<M, E, F>) $$Lambda$kjrIo_S8kUjIwgZVI4gB93pYW4.INSTANCE, kfj.a(this.b, this.c)).a((kjo<M, F>) $$Lambda$YkfyT_wYbi5j1VUaEPIj4iNeaFs.INSTANCE);
        apz apz = this.b;
        jrp jrp = this.a;
        this.e = a2.a(kla.a(kfm.a(apz, jrp), this.d)).a((d<M, E, F>) kka.a("WrappedPreviewPlayer")).a(kfi.a);
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_STOP)
    public void stop() {
        kju<kfi, kfg, kff> kju = this.e;
        if (kju != null) {
            kju.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    @lp(a = Event.ON_DESTROY)
    public void destroy() {
        this.b.b();
    }
}

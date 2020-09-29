package com.spotify.mobile.android.wrapped2019.stories.playback.previews;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import io.reactivex.Observable;

public class WrappedPreviewPlayer implements ll {
    private final jtz a;
    private final aqq b;
    private final c c;
    private final Observable<khi> d;
    private knd<khk, khi, khh> e;

    public WrappedPreviewPlayer(jtz jtz, aqq aqq, c cVar, Observable<khi> observable, Lifecycle lifecycle) {
        this.a = jtz;
        this.b = aqq;
        this.c = cVar;
        this.d = observable;
        lifecycle.a(this);
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_DESTROY)
    public void destroy() {
        this.b.b();
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_START)
    public void start() {
        a a2 = kok.a((kni<M, E, F>) $$Lambda$I4hBXLZJkFwrI_hqfLFzHOMAeA.INSTANCE, khl.a(this.b, this.c)).a((kmx<M, F>) $$Lambda$MBP8CUongFAu7hGm8LRDEPhXNc.INSTANCE);
        aqq aqq = this.b;
        jtz jtz = this.a;
        this.e = a2.a(koj.a(kho.a(aqq, jtz), this.d)).a((d<M, E, F>) knj.a("WrappedPreviewPlayer")).a(khk.a);
    }

    /* access modifiers changed from: 0000 */
    @lu(a = Event.ON_STOP)
    public void stop() {
        knd<khk, khi, khh> knd = this.e;
        if (knd != null) {
            knd.dispose();
        }
    }
}

package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Consumer;

/* renamed from: kgb reason: default package */
public final class kgb {
    private final kgx a;
    private final kgw b;
    private final kfv c;
    private final Consumer<StoriesPlaybackState> d;
    private final Consumer<kgk> e;
    private final kgn f;
    private final kgt g;
    private final kk h;

    public kgb(kgx kgx, kgw kgw, kfv kfv, Consumer<StoriesPlaybackState> consumer, Consumer<kgk> consumer2, kgn kgn, kgt kgt, kk kkVar) {
        this.a = kgx;
        this.b = kgw;
        this.c = kfv;
        this.d = consumer;
        this.e = consumer2;
        this.f = kgn;
        this.g = kgt;
        this.h = kkVar;
    }

    /* access modifiers changed from: 0000 */
    public c<kgh, kgf, kge> a(boolean z) {
        return kok.a((kni<M, E, F>) $$Lambda$NMmTGv7hmLlNWSwcz9PGpNtWdU.INSTANCE, kgi.a(this.a, this.b, this.c, this.d, this.e, this.g, this.h)).a((kmx<M, F>) $$Lambda$GtG3IwChsaCyNWhzPh1s7wMekGc.INSTANCE).a(z ? kgj.a(this.f) : kgj.a()).a((d<M, E, F>) knj.a("StoriesContainer"));
    }
}

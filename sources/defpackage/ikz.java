package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import java.util.Queue;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: ikz reason: default package */
public final class ikz {
    private final ikx a;
    private Emitter<Integer> b;

    public ikz(ikx ikx) {
        this.a = ikx;
    }

    public final wud<Queue<ContentItem>> a() {
        if (this.b == null) {
            return wud.a((wun<Emitter<T>>) new $$Lambda$ikz$ovdqEogQiLpFPhNmyjONQXfVgg<Emitter<T>>(this), BackpressureMode.DROP).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$ikz$hGeV5fi4Pevpa5Czk1quWowTs4g<Object,Object>(this));
        }
        throw new IllegalStateException("Only one observer per instance is allowed");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        this.b = emitter;
        emitter.onNext(Integer.valueOf(0));
        emitter.a((wur) new $$Lambda$ikz$Q0FJiL56xEYbPiEXsvpJkf6YjhE(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.b = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Integer num) {
        return this.a.a().g($$Lambda$ikz$YQNBEScGZqmFfUjDa1xPyMTA4.INSTANCE);
    }

    public final void b() {
        Emitter<Integer> emitter = this.b;
        if (emitter != null) {
            emitter.onNext(Integer.valueOf(0));
        }
    }
}

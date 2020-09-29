package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.volume.VolumeState;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: roz reason: default package */
public final class roz implements rpu, rpv {
    private final gkr a;
    private final gkw b;
    private final CompositeDisposable c = new CompositeDisposable();
    private final BehaviorSubject<Float> d = BehaviorSubject.a();

    public roz(gkr gkr, gkw gkw) {
        this.a = gkr;
        this.b = gkw;
    }

    public final void a() {
        float c2 = this.b.c();
        Logger.b("Set system volume to %f", Float.valueOf(c2));
        this.c.a(this.a.a(Float.valueOf(c2)).d());
        CompositeDisposable compositeDisposable = this.c;
        Observable c3 = this.a.a().c((Function<? super T, ? extends R>) $$Lambda$roz$3Y7KBbL5bnula8w2k5CgCSqpp3I.INSTANCE);
        BehaviorSubject<Float> behaviorSubject = this.d;
        behaviorSubject.getClass();
        $$Lambda$wP9ZqOorEc2HdC0o2tjXL5pmX_0 r3 = new $$Lambda$wP9ZqOorEc2HdC0o2tjXL5pmX_0(behaviorSubject);
        BehaviorSubject<Float> behaviorSubject2 = this.d;
        behaviorSubject2.getClass();
        compositeDisposable.a(c3.a((Consumer<? super T>) r3, (Consumer<? super Throwable>) new $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME<Object>(behaviorSubject2)));
    }

    public final void b() {
        this.c.c();
    }

    public final Observable<Float> c() {
        return this.d;
    }

    public final float d() {
        return ((Float) this.d.j()).floatValue();
    }

    /* access modifiers changed from: private */
    public static Float a(VolumeState volumeState) {
        return Float.valueOf(volumeState.getVolume());
    }
}

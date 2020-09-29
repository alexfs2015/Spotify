package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import java.util.Queue;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: inm reason: default package */
public final class inm {
    private final ink a;
    private Emitter<Integer> b;

    public inm(ink ink) {
        this.a = ink;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Integer num) {
        return this.a.a().f($$Lambda$inm$HbJtJXzFw9_QMeC6SVtnHteZm8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        this.b = emitter;
        emitter.onNext(Integer.valueOf(0));
        emitter.a((xiw) new $$Lambda$inm$loQQPXz06sRsuXmkCHz5bvI_I(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.b = null;
    }

    public final xii<Queue<ContentItem>> a() {
        if (this.b == null) {
            return xii.a((xis<Emitter<T>>) new $$Lambda$inm$TUkiRH0c4tkmwLSjWUiRVJaqf7A<Emitter<T>>(this), BackpressureMode.DROP).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$inm$ZOlPG1DoK9z1CvSe_6F83iVROI<Object,Object>(this));
        }
        throw new IllegalStateException("Only one observer per instance is allowed");
    }

    public final void b() {
        Emitter<Integer> emitter = this.b;
        if (emitter != null) {
            emitter.onNext(Integer.valueOf(0));
        }
    }
}

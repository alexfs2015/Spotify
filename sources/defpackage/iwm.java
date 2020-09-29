package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: iwm reason: default package */
final class iwm implements a<ConnectManager>, xis<Emitter<ConnectManager>> {
    final Set<Object> a = new CopyOnWriteArraySet();
    final gtb b;
    boolean c;
    private final gsw d;
    private final Handler e = new Handler();
    private boolean f;
    private Emitter<ConnectManager> g;

    public iwm(gtb gtb, gsw gsw) {
        this.b = (gtb) fbp.a(gtb);
        this.d = gsw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(ConnectManager connectManager) {
        return connectManager.o() ? wit.a((ObservableSource<T>) gsw.a((ConnectManager) this.b.h()), BackpressureStrategy.BUFFER) : ScalarSynchronousObservable.d(gud.a);
    }

    /* access modifiers changed from: private */
    public void b() {
        if (this.b.c()) {
            gtb gtb = this.b;
            gtb.b();
            gtb.a();
        }
    }

    public final xii<gud> a() {
        return xii.a((xis<Emitter<T>>) this, BackpressureMode.LATEST).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$iwm$U6eZIRDMxoXkHFk56uxDFOrbuuM<Object,Object>(this));
    }

    public final /* synthetic */ void a(Object obj) {
        ConnectManager connectManager = (ConnectManager) this.b.h();
        if (connectManager.o()) {
            Emitter<ConnectManager> emitter = this.g;
            if (emitter != null) {
                emitter.onNext(connectManager);
            }
            this.f = true;
            if (!this.c) {
                this.c = true;
                ((ConnectManager) this.b.h()).r();
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.a.clear();
            return;
        }
        this.e.postDelayed(new $$Lambda$iwm$SEnycOd7j_NxXbo64ep254QJxGQ(this), 300);
    }

    public final /* bridge */ /* synthetic */ void call(Object obj) {
        this.g = (Emitter) obj;
    }

    public final void e() {
        this.f = false;
        Emitter<ConnectManager> emitter = this.g;
        if (emitter != null) {
            emitter.onCompleted();
        }
    }
}

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

/* renamed from: iub reason: default package */
final class iub implements a<ConnectManager>, wun<Emitter<ConnectManager>> {
    final Set<Object> a = new CopyOnWriteArraySet();
    final hip b;
    boolean c;
    private final gqx d;
    private final Handler e = new Handler();
    private boolean f;
    private Emitter<ConnectManager> g;

    public final /* bridge */ /* synthetic */ void call(Object obj) {
        this.g = (Emitter) obj;
    }

    public iub(hip hip, gqx gqx) {
        this.b = (hip) fay.a(hip);
        this.d = gqx;
    }

    public final wud<gsd> a() {
        return wud.a((wun<Emitter<T>>) this, BackpressureMode.LATEST).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$iub$oLxy9I53tmSLVT9Ql0xtzQcin8<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(ConnectManager connectManager) {
        if (connectManager.o()) {
            return vun.a((ObservableSource<T>) gqx.a((ConnectManager) this.b.i()), BackpressureStrategy.BUFFER);
        }
        return ScalarSynchronousObservable.d(gsd.a);
    }

    /* access modifiers changed from: private */
    public void b() {
        if (this.b.d()) {
            this.b.c();
        }
    }

    public final void e() {
        this.f = false;
        Emitter<ConnectManager> emitter = this.g;
        if (emitter != null) {
            emitter.onCompleted();
        }
    }

    public final /* synthetic */ void a(Object obj) {
        ConnectManager connectManager = (ConnectManager) this.b.i();
        if (connectManager.o()) {
            Emitter<ConnectManager> emitter = this.g;
            if (emitter != null) {
                emitter.onNext(connectManager);
            }
            this.f = true;
            if (!this.c) {
                this.c = true;
                ((ConnectManager) this.b.i()).r();
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.a.clear();
            return;
        }
        this.e.postDelayed(new $$Lambda$iub$kye3r4NsaVvHschrTl5dMtzUaI(this), 300);
    }
}

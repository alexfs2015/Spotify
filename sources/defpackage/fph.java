package defpackage;

import android.content.ComponentName;
import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: fph reason: default package */
final class fph {
    final BehaviorSubject<dd> a = BehaviorSubject.a();
    private final fpj b;
    private final df c = new a(this, 0);

    /* renamed from: fph$a */
    class a extends df {
        private a() {
        }

        /* synthetic */ a(fph fph, byte b) {
            this();
        }

        public final void a(ComponentName componentName, dd ddVar) {
            Logger.b("onCustomTabsServiceConnected %s", componentName);
            fph.this.a.onNext(ddVar);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            Logger.b("onServiceDisconnected %s", componentName);
            fph.this.a.onComplete();
        }
    }

    fph(fpj fpj) {
        this.b = fpj;
    }

    /* access modifiers changed from: private */
    public void c() {
        Logger.b("doUnbindService", new Object[0]);
        fpj fpj = this.b;
        fpj.a.unbindService(this.c);
    }

    /* access modifiers changed from: 0000 */
    public Consumer<? super Disposable> a() {
        return new $$Lambda$fph$zVKP7f_XxIzDfdJH8LE0nYgS89c(this);
    }

    /* access modifiers changed from: 0000 */
    public Action b() {
        return new $$Lambda$fph$PoMaTckeLGPNY2mR6vKby1AaYc(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        Logger.b("doBindService", new Object[0]);
        fpj fpj = this.b;
        dd.a(fpj.a, "com.android.chrome", this.c);
    }
}

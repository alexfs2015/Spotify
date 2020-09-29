package defpackage;

import android.content.ComponentName;
import com.spotify.base.java.logging.Logger;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: fqb reason: default package */
final class fqb {
    final BehaviorSubject<dd> a = BehaviorSubject.a();
    private final fqd b;
    private final df c = new a(this, 0);

    /* renamed from: fqb$a */
    class a extends df {
        private a() {
        }

        /* synthetic */ a(fqb fqb, byte b) {
            this();
        }

        public final void a(ComponentName componentName, dd ddVar) {
            Logger.b("onCustomTabsServiceConnected %s", componentName);
            fqb.this.a.onNext(ddVar);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            Logger.b("onServiceDisconnected %s", componentName);
            fqb.this.a.onComplete();
        }
    }

    fqb(fqd fqd) {
        this.b = fqd;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Disposable disposable) {
        Logger.b("doBindService", new Object[0]);
        fqd fqd = this.b;
        dd.a(fqd.a, "com.android.chrome", this.c);
    }

    /* access modifiers changed from: private */
    public void c() {
        Logger.b("doUnbindService", new Object[0]);
        fqd fqd = this.b;
        fqd.a.unbindService(this.c);
    }

    /* access modifiers changed from: 0000 */
    public Consumer<? super Disposable> a() {
        return new $$Lambda$fqb$jMsx6KFWxEqiH79ALosNycYNYto(this);
    }

    /* access modifiers changed from: 0000 */
    public Action b() {
        return new $$Lambda$fqb$lVi6HAzGxdqTDdzNO8kl92tbMU(this);
    }
}

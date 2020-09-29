package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.common.base.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: vwa reason: default package */
public final class vwa {
    private Optional<Runnable> a = Optional.e();

    vwa() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new ServiceConnection() {
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                fow a2 = a.a(iBinder);
                if (a2 == null) {
                    observableEmitter.a((Throwable) new Exception("Failed to create ISAService"));
                }
                observableEmitter.a(a2);
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                observableEmitter.a((Throwable) new Exception("Service disconnected"));
            }
        };
        this.a = Optional.b(new $$Lambda$vwa$ACYJgtvGEwYjAOwsC1U2O6KKQ3M(this, context, observableEmitter, r0));
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_SERVICE");
        intent.setPackage("com.osp.app.signin");
        if (!applicationContext.bindService(intent, r0, 1)) {
            observableEmitter.a((Throwable) new Exception("Couldn't bind service!"));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, ObservableEmitter observableEmitter, ServiceConnection serviceConnection) {
        observableEmitter.c();
        context.getApplicationContext().unbindService(serviceConnection);
        this.a = Optional.e();
    }

    /* access modifiers changed from: 0000 */
    public final Observable<fow> a(Context context) {
        if (!this.a.b()) {
            return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$vwa$hCWxgko7giJ1A8VT3Fyo2HKMF0<T>(this, context));
        }
        throw new RuntimeException("bind can only be called once!");
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.a.b()) {
            ((Runnable) this.a.c()).run();
        }
    }
}

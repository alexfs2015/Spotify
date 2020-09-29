package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: vhw reason: default package */
public final class vhw {
    private final hhc a;

    public vhw(hhc hhc) {
        this.a = hhc;
    }

    public final Observable<IBinder> a(Intent intent, String str) {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$vhw$FSicOxuGVslp04n1fpF25jv5cM<T>(this, intent, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, String str, final ObservableEmitter observableEmitter) {
        jrh.b("Must subscribe to service binding on main thread!");
        AnonymousClass1 r0 = new ServiceConnection() {
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (iBinder != null) {
                    observableEmitter.a(iBinder);
                }
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                observableEmitter.c();
            }
        };
        this.a.a(intent, r0, str);
        observableEmitter.a((Cancellable) new $$Lambda$vhw$J6kt48Jlw_ENc0o0KFsC1G2GbE(this, r0, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ServiceConnection serviceConnection, String str) {
        this.a.a(serviceConnection, str);
    }
}

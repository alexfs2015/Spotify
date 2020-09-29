package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: vvm reason: default package */
public final class vvm extends Observable<Intent> {
    private final Context a;
    private final IntentFilter b;

    /* renamed from: vvm$a */
    static final class a extends MainThreadDisposable {
        /* access modifiers changed from: private */
        public final Observer<? super Intent> a;
        private final Context b;
        private final IntentFilter c;
        private final BroadcastReceiver d = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                a.this.a.onNext(intent);
            }
        };

        public a(Observer<? super Intent> observer, Context context, IntentFilter intentFilter) {
            this.a = observer;
            this.b = context;
            this.c = intentFilter;
            this.b.registerReceiver(this.d, this.c);
        }

        public final void T_() {
            this.b.unregisterReceiver(this.d);
        }
    }

    vvm(Context context, IntentFilter intentFilter) {
        this.a = context;
        this.b = intentFilter;
    }

    public final void a(Observer<? super Intent> observer) {
        observer.onSubscribe(new a(observer, this.a, this.b));
    }
}

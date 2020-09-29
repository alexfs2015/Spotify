package defpackage;

import android.app.Activity;
import android.os.Bundle;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: sfz reason: default package */
public final class sfz extends jyr {
    private final gnb a;
    private String b;
    private String c;
    private xip d;

    public sfz(gnb gnb) {
        this.a = gnb;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rmb rmb) {
        if (!this.a.a) {
            if (!(rmb instanceof rmc) || this.b != null) {
                boolean z = rmb instanceof a;
                if (!z || this.c != null) {
                    if (z) {
                        this.a.a("first_view_cancel", (String) null);
                    }
                    return;
                }
                this.c = ((a) rmb).a();
                return;
            }
            this.b = ((rmc) rmb).a();
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        if (!this.a.a) {
            if (activity instanceof b) {
                this.d = wit.a((ObservableSource<T>) ((b) activity).af().a, BackpressureStrategy.BUFFER).a((xis<? super T>) new $$Lambda$sfz$IscBlnC5uN1yqhqJY4GOFGU1dQ<Object>(this), (xis<Throwable>) $$Lambda$sfz$d8XbW68h8vM5eepZw5bF48CbUZQ.INSTANCE);
            } else {
                this.a.a("no_main_activity", (String) null);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        xip xip = this.d;
        if (xip != null) {
            xip.unsubscribe();
        }
    }
}

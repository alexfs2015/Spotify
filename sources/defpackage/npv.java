package defpackage;

import android.os.Handler;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState;

/* renamed from: npv reason: default package */
public abstract class npv {
    SubscriptionState a;
    public SubscriptionState b;
    private final a c;

    /* renamed from: npv$a */
    public interface a {
        void b(SubscriptionState subscriptionState);
    }

    /* renamed from: npv$b */
    static class b extends npv implements Runnable {
        private final Handler c = new Handler();
        private final int d;

        public b(a aVar, int i) {
            super(aVar);
            this.d = i;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            this.c.postDelayed(this, (long) this.d);
        }

        /* access modifiers changed from: protected */
        public final void b() {
            this.c.removeCallbacks(this);
        }

        public final void run() {
            SubscriptionState subscriptionState = (SubscriptionState) fay.a(this.a);
            this.a = null;
            npv.super.a(subscriptionState);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    public npv(a aVar) {
        this.c = (a) fay.a(aVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(SubscriptionState subscriptionState) {
        fay.a(subscriptionState);
        fay.b(subscriptionState != this.b);
        this.b = subscriptionState;
        this.c.b(subscriptionState);
    }

    /* access modifiers changed from: 0000 */
    public void b(SubscriptionState subscriptionState) {
        fay.b(this.a == null);
        this.a = (SubscriptionState) fay.a(subscriptionState);
        a();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        fay.b(this.a != null);
        this.a = null;
        b();
    }
}

package defpackage;

import android.os.Handler;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState;

/* renamed from: nvy reason: default package */
public abstract class nvy {
    SubscriptionState a;
    public SubscriptionState b;
    private final a c;

    /* renamed from: nvy$a */
    public interface a {
        void b(SubscriptionState subscriptionState);
    }

    /* renamed from: nvy$b */
    static class b extends nvy implements Runnable {
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
            SubscriptionState subscriptionState = (SubscriptionState) fbp.a(this.a);
            this.a = null;
            nvy.super.a(subscriptionState);
        }
    }

    public nvy(a aVar) {
        this.c = (a) fbp.a(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: 0000 */
    public void a(SubscriptionState subscriptionState) {
        fbp.a(subscriptionState);
        fbp.b(subscriptionState != this.b);
        this.b = subscriptionState;
        this.c.b(subscriptionState);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: 0000 */
    public void b(SubscriptionState subscriptionState) {
        fbp.b(this.a == null);
        this.a = (SubscriptionState) fbp.a(subscriptionState);
        a();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        fbp.b(this.a != null);
        this.a = null;
        b();
    }
}

package defpackage;

import com.spotify.music.R;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.a;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.b;

/* renamed from: nvu reason: default package */
public final class nvu implements a<nvr>, b, a, a {
    final rzk a;
    public final ListSubscriber<nut, nvr> b;
    public final nvp c;
    public final nvk d;
    public nvy e;
    public xip f = xon.b();
    public nwd g;
    private final szp h;
    private final jlz i;

    /* renamed from: nvu$2 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[SubscriptionState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.languagepicker.presenter.ListSubscriber$SubscriptionState[] r0 = com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.languagepicker.presenter.ListSubscriber$SubscriptionState r1 = com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.languagepicker.presenter.ListSubscriber$SubscriptionState r1 = com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState.LOADED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.languagepicker.presenter.ListSubscriber$SubscriptionState r1 = com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.languagepicker.presenter.ListSubscriber$SubscriptionState r1 = com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nvu.AnonymousClass2.<clinit>():void");
        }
    }

    public nvu(rzk rzk, szp szp, ListSubscriber<nut, nvr> listSubscriber, jlz jlz, nvp nvp, nvk nvk) {
        this.a = (rzk) fbp.a(rzk);
        this.h = (szp) fbp.a(szp);
        this.b = (ListSubscriber) fbp.a(listSubscriber);
        this.i = (jlz) fbp.a(jlz);
        this.c = (nvp) fbp.a(nvp);
        this.d = (nvk) fbp.a(nvk);
        this.e = new b(this, 2000);
    }

    private void a(int i2, boolean z) {
        ((nwd) fbp.a(this.g)).a(i2, z);
        this.g.a(false);
        this.g.b(false);
        if (z) {
            this.d.f();
        }
    }

    private void d() {
        int a2 = a();
        a(a2 > 0);
        ((nwd) fbp.a(this.g)).d(a2);
    }

    public final int a() {
        int i2 = 0;
        for (D d2 : this.b.a.a) {
            if (d2.d()) {
                i2++;
            }
        }
        return i2;
    }

    public final void a(SubscriptionState subscriptionState) {
        fbp.a(subscriptionState);
        boolean z = subscriptionState == SubscriptionState.NO_CONNECTION;
        nvy nvy = this.e;
        fbp.a(subscriptionState);
        if (nvy.a != null) {
            if (nvy.a != subscriptionState || !z) {
                nvy.c();
            }
        }
        if (subscriptionState != nvy.b) {
            if (z) {
                nvy.b(subscriptionState);
                return;
            }
            nvy.a(subscriptionState);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str) {
        this.i.a.finish();
        if (str != null) {
            this.h.a(str);
        }
    }

    public void a(boolean z) {
        boolean i2 = ((nwd) fbp.a(this.g)).i(z);
        if (z && i2) {
            this.d.e();
        }
    }

    public final boolean a(int i2) {
        nvr nvr = (nvr) this.b.a(i2);
        nvr a2 = nvr.a(!nvr.d());
        this.b.a(i2, a2);
        this.d.b(a2, i2);
        return true;
    }

    public final void b() {
        d();
    }

    public final void b(SubscriptionState subscriptionState) {
        int i2 = AnonymousClass2.a[subscriptionState.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            ((nwd) fbp.a(this.g)).a();
            this.g.a(false);
            this.g.b(true);
            a(false);
            this.d.a();
        } else if (i2 == 2) {
            ((nwd) fbp.a(this.g)).a();
            this.g.a(true);
            this.g.b(false);
            if (a() <= 0) {
                z = false;
            }
            a(z);
            this.d.d();
        } else if (i2 == 3) {
            a(R.string.error_view_something_went_wrong, true);
            a(false);
            this.d.b();
        } else if (i2 == 4) {
            a(R.string.error_view_no_internet_connection, false);
            a(false);
            this.d.c();
        } else {
            throw new AssertionError("unuspported state");
        }
    }

    public final void c() {
        d();
    }
}
package defpackage;

import com.spotify.music.R;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.SubscriptionState;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.a;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber.b;

/* renamed from: nps reason: default package */
public final class nps implements a<npo>, b, a {
    final rpz a;
    public final ListSubscriber<nos, npo> b;
    public final npm c;
    public final nph d;
    public wuk e = xaj.b();
    public npx f;

    /* renamed from: nps$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[SubscriptionState.values().length];

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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nps.AnonymousClass2.<clinit>():void");
        }
    }

    public final void b() {
    }

    public final void c() {
    }

    public nps(rpz rpz, ListSubscriber<nos, npo> listSubscriber, npm npm, nph nph) {
        this.a = (rpz) fay.a(rpz);
        this.b = (ListSubscriber) fay.a(listSubscriber);
        this.c = (npm) fay.a(npm);
        this.d = (nph) fay.a(nph);
    }

    public final void a(npx npx) {
        fay.b(this.f == null);
        this.f = (npx) fay.a(npx);
        this.b.a(this.c.a().f($$Lambda$nps$4z25WLVnKmNSTjKvkiNdLUFzYY.INSTANCE), this, this);
    }

    public final boolean a(int i) {
        if (((npo) this.b.a(i)).d()) {
            int i2 = 0;
            for (D d2 : this.b.a.a) {
                if (d2.d()) {
                    i2++;
                }
            }
            if (i2 == 1) {
                ((npx) fay.a(this.f)).b();
                return false;
            }
        }
        npo npo = (npo) this.b.a(i);
        npo a2 = npo.a(!npo.d());
        this.b.a(i, a2);
        this.d.b(a2, i);
        return true;
    }

    public final void a(SubscriptionState subscriptionState) {
        int i = AnonymousClass2.a[subscriptionState.ordinal()];
        if (i == 1) {
            ((npx) fay.a(this.f)).a();
            this.f.a(false);
            this.f.b(true);
            this.d.a();
        } else if (i == 2) {
            ((npx) fay.a(this.f)).a();
            this.f.a(true);
            this.f.b(false);
            this.d.d();
        } else if (i == 3) {
            a(R.string.error_view_something_went_wrong, true);
            this.d.b();
        } else if (i == 4) {
            a(R.string.error_view_no_internet_connection, false);
            this.d.c();
        } else {
            throw new AssertionError("unuspported state");
        }
    }

    private void a(int i, boolean z) {
        ((npx) fay.a(this.f)).a(i, z);
        this.f.a(false);
        this.f.b(false);
        if (z) {
            this.d.f();
        }
    }
}

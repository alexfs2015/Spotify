package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.R;
import com.spotify.music.features.payfail.BannerModel;
import com.spotify.music.features.payfail.BannerModel.Content;
import com.spotify.music.features.payfail.PaymentFailureRepository;
import java.util.concurrent.Callable;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: oag reason: default package */
public final class oag {
    static final b<Object, Integer> a = b.b("pay_fail_impression_count");
    private static b<Object, Long> b = b.b("pay_fail_first_impression_timestamp");
    private static b<Object, Integer> c = b.b("pay_fail_impression_check_count");
    private static b<Object, Boolean> d = b.b("pay_fail_last_impression_had_interaction");
    private final Context e;
    /* access modifiers changed from: private */
    public final SpSharedPreferences<Object> f;
    private final PaymentFailureRepository g;
    /* access modifiers changed from: private */
    public final oai h;
    private final oam i;
    private final jrp j;
    private final heg k;
    private final xag l = new xag();
    /* access modifiers changed from: private */
    public oal m;
    private Intent n;
    /* access modifiers changed from: private */
    public hdd o;

    /* renamed from: oag$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[Content.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.payfail.BannerModel$Content[] r0 = com.spotify.music.features.payfail.BannerModel.Content.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.payfail.BannerModel$Content r1 = com.spotify.music.features.payfail.BannerModel.Content.GENERIC     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.payfail.BannerModel$Content r1 = com.spotify.music.features.payfail.BannerModel.Content.DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.payfail.BannerModel$Content r1 = com.spotify.music.features.payfail.BannerModel.Content.PREMIUM_BENEFITS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.AnonymousClass2.<clinit>():void");
        }
    }

    public oag(Context context, SpSharedPreferences<Object> spSharedPreferences, PaymentFailureRepository paymentFailureRepository, oai oai, oam oam, jrp jrp, heg heg) {
        this.e = context;
        this.f = spSharedPreferences;
        this.g = paymentFailureRepository;
        this.h = oai;
        this.i = oam;
        this.j = jrp;
        this.k = heg;
    }

    public final void a(oal oal, Intent intent, hdd hdd) {
        this.n = intent;
        this.o = hdd;
        hdd hdd2 = this.o;
        boolean z = true;
        if (hdd2 == null || !hdd2.a()) {
            Logger.b("No payment failure (%s)", this.o);
            this.f.a().a(b).a(c).a(d).a(a).b();
            z = false;
        } else {
            Logger.b("Has payment failure (%s)", this.o);
        }
        if (!z) {
            oal.a(false);
            return;
        }
        this.l.a(wud.a((Callable<? extends T>) new $$Lambda$oag$G3sLAehoaWD_6ZV9kSfTfDrV2o8<Object>(this)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$oag$AqZd1XofeQPt5xR1SLyVzlaQhY<Object,Object>(this)).b(vun.a(this.k.a())).a(vun.a(this.k.c())).a((wun<? super T>) new $$Lambda$oag$TOTisUqG1w0XoH_detswZHbXDLo<Object>(this, oal), (wun<Throwable>) $$Lambda$oag$U7VOjYcAVYjT9_TNV1i4Kis3EQg.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oal oal, BannerModel bannerModel) {
        this.m = oal;
        oal.b = new a() {
            public final void a() {
                Logger.b("Payment failure banner CTA click", new Object[0]);
                hdd a2 = oag.this.o;
                if (a2 != null) {
                    oag.this.h.a("cta-click", (long) oag.this.f.a(oag.a, 1));
                    if (oag.this.m != null) {
                        oag.this.m.a(false);
                    }
                    oag.this.f.a().a(oag.d, true).b();
                    oag.this.m = null;
                    oag.this.l.a(oam.a(a2).b(vun.a(oag.this.k.a())).a(vun.a(oag.this.k.c())).a((wun<? super T>) new $$Lambda$oag$tJdUlTrv3XKKnalimEzF29T4rU<Object>(oag.this), (wun<Throwable>) $$Lambda$oag$vwahCHycaU0fYXx_UthgO99amyM.INSTANCE));
                }
            }

            public final void b() {
                Logger.b("Payment failure banner dismissed", new Object[0]);
                if (oag.this.o != null) {
                    oag.this.h.a("dismiss-click", (long) oag.this.f.a(oag.a, 1));
                    if (oag.this.m != null) {
                        oag.this.m.a(false);
                    }
                    oag.this.f.a().a(oag.d, true).b();
                    oag.this.m = null;
                }
            }
        };
        if (bannerModel.a() == Content.NONE) {
            oal.a(false);
            return;
        }
        int i2 = AnonymousClass2.a[bannerModel.a().ordinal()];
        if (i2 == 1) {
            oal.a((int) R.string.payment_failure_banner_title_generic_content);
            oal.b((int) R.string.payment_failure_banner_description_generic_content);
            oal.c(R.string.payment_failure_banner_cta_ab_test);
        } else if (i2 == 2) {
            int b2 = bannerModel.b();
            if (b2 < 10) {
                oal.a((int) R.string.payment_failure_banner_title_downloaded_content);
            } else {
                String string = this.e.getString(R.string.payment_failure_banner_title_downloaded_content_with_x, new Object[]{Integer.valueOf(b2)});
                if (oal.c != null) {
                    oal.c.setText(string);
                }
            }
            oal.b((int) R.string.payment_failure_banner_description_downloaded_content);
            oal.c(R.string.payment_failure_banner_cta_ab_test);
        } else if (i2 == 3) {
            oal.a((int) R.string.payment_failure_banner_title_benefit_content);
            oal.b((int) R.string.payment_failure_banner_description_benefit_content);
            oal.c(R.string.payment_failure_banner_cta_ab_test);
        }
        oal.a(true);
        int a2 = this.f.a(a, 0) + 1;
        this.h.a("impression", (long) a2);
        this.f.a().a(b, this.j.a()).a(a, a2).a(d).b();
    }

    /* access modifiers changed from: private */
    public wud<? extends BannerModel> a(BannerModel bannerModel) {
        if (bannerModel.a() != Content.DOWNLOAD) {
            return ScalarSynchronousObservable.d(bannerModel);
        }
        return this.g.a().f($$Lambda$oag$w5w8HdDw7Rg89NAbf2KONA3Ba4c.INSTANCE).h($$Lambda$oag$Go6tzQI_PK6XnANtOkKhbqn0IYo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri) {
        ((Intent) fay.a(this.n)).setData(uri);
        this.e.startActivity(this.n);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.spotify.music.features.payfail.BannerModel a() {
        /*
            r7 = this;
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r7.f
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Long> r1 = b
            r2 = -1
            long r0 = r0.a(r1, r2)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x002c
            jrp r2 = r7.j
            java.util.Calendar r2 = r2.f()
            jrp r3 = r7.j
            java.util.Calendar r3 = r3.f()
            r3.setTimeInMillis(r0)
            r0 = 5
            int r1 = r2.get(r0)
            int r0 = r3.get(r0)
            if (r1 != r0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r0 = r0 ^ r5
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r7.f
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r2 = d
            boolean r1 = r1.a(r2, r4)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r7.f
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Integer> r3 = c
            r4 = -1
            int r2 = r2.a(r3, r4)
            if (r0 == 0) goto L_0x0052
            int r2 = r2 + 1
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r3 = r7.f
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r3 = r3.a()
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Integer> r5 = c
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r3 = r3.a(r5, r2)
            r3.b()
        L_0x0052:
            if (r1 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.NONE
            com.spotify.music.features.payfail.BannerModel r0 = com.spotify.music.features.payfail.BannerModel.a(r0, r4)
            return r0
        L_0x005e:
            if (r2 != 0) goto L_0x0067
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.GENERIC
            com.spotify.music.features.payfail.BannerModel r0 = com.spotify.music.features.payfail.BannerModel.a(r0, r4)
            return r0
        L_0x0067:
            r0 = 3
            if (r2 > r0) goto L_0x0071
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.DOWNLOAD
            com.spotify.music.features.payfail.BannerModel r0 = com.spotify.music.features.payfail.BannerModel.a(r0, r4)
            return r0
        L_0x0071:
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.PREMIUM_BENEFITS
            com.spotify.music.features.payfail.BannerModel r0 = com.spotify.music.features.payfail.BannerModel.a(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oag.a():com.spotify.music.features.payfail.BannerModel");
    }
}

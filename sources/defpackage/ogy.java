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

/* renamed from: ogy reason: default package */
public final class ogy {
    static final b<Object, Integer> a = b.b("pay_fail_impression_count");
    private static b<Object, Long> b = b.b("pay_fail_first_impression_timestamp");
    private static b<Object, Integer> c = b.b("pay_fail_impression_check_count");
    private static b<Object, Boolean> d = b.b("pay_fail_last_impression_had_interaction");
    private final Context e;
    /* access modifiers changed from: private */
    public final SpSharedPreferences<Object> f;
    private final PaymentFailureRepository g;
    /* access modifiers changed from: private */
    public final oha h;
    private final ohe i;
    private final jtz j;
    private final hhc k;
    private final xok l = new xok();
    /* access modifiers changed from: private */
    public ohd m;
    private Intent n;
    /* access modifiers changed from: private */
    public hfz o;

    /* renamed from: ogy$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ogy.AnonymousClass2.<clinit>():void");
        }
    }

    public ogy(Context context, SpSharedPreferences<Object> spSharedPreferences, PaymentFailureRepository paymentFailureRepository, oha oha, ohe ohe, jtz jtz, hhc hhc) {
        this.e = context;
        this.f = spSharedPreferences;
        this.g = paymentFailureRepository;
        this.h = oha;
        this.i = ohe;
        this.j = jtz;
        this.k = hhc;
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
            jtz r2 = r7.j
            java.util.Calendar r2 = r2.f()
            jtz r3 = r7.j
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogy.a():com.spotify.music.features.payfail.BannerModel");
    }

    /* access modifiers changed from: private */
    public xii<? extends BannerModel> a(BannerModel bannerModel) {
        return bannerModel.a() != Content.DOWNLOAD ? ScalarSynchronousObservable.d(bannerModel) : this.g.a().e((xiy<? super T, ? extends R>) $$Lambda$ogy$qEAeqy4tK3aBSrfbi3UOOjCVOUI.INSTANCE).g($$Lambda$ogy$YNYeSE0iBUniwAaxhLc4130rZgc.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri) {
        ((Intent) fbp.a(this.n)).setData(uri);
        this.e.startActivity(this.n);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ohd ohd, BannerModel bannerModel) {
        this.m = ohd;
        ohd.b = new a() {
            public final void a() {
                Logger.b("Payment failure banner CTA click", new Object[0]);
                hfz a2 = ogy.this.o;
                if (a2 != null) {
                    ogy.this.h.a("cta-click", (long) ogy.this.f.a(ogy.a, 1));
                    if (ogy.this.m != null) {
                        ogy.this.m.a(false);
                    }
                    ogy.this.f.a().a(ogy.d, true).b();
                    ogy.this.m = null;
                    ogy.this.l.a(ohe.a(a2).b(wit.a(ogy.this.k.a())).a(wit.a(ogy.this.k.c())).a((xis<? super T>) new $$Lambda$ogy$OmoXeR9_BIAiPe1CwSUBdT8ctc<Object>(ogy.this), (xis<Throwable>) $$Lambda$ogy$EdZvkIP5P51niQP27bxBJxWa4M.INSTANCE));
                }
            }

            public final void b() {
                Logger.b("Payment failure banner dismissed", new Object[0]);
                if (ogy.this.o != null) {
                    ogy.this.h.a("dismiss-click", (long) ogy.this.f.a(ogy.a, 1));
                    if (ogy.this.m != null) {
                        ogy.this.m.a(false);
                    }
                    ogy.this.f.a().a(ogy.d, true).b();
                    ogy.this.m = null;
                }
            }
        };
        if (bannerModel.a() == Content.NONE) {
            ohd.a(false);
            return;
        }
        int i2 = AnonymousClass2.a[bannerModel.a().ordinal()];
        if (i2 == 1) {
            ohd.a((int) R.string.payment_failure_banner_title_generic_content);
            ohd.b((int) R.string.payment_failure_banner_description_generic_content);
            ohd.c(R.string.payment_failure_banner_cta_ab_test);
        } else if (i2 == 2) {
            int b2 = bannerModel.b();
            if (b2 < 10) {
                ohd.a((int) R.string.payment_failure_banner_title_downloaded_content);
            } else {
                String string = this.e.getString(R.string.payment_failure_banner_title_downloaded_content_with_x, new Object[]{Integer.valueOf(b2)});
                if (ohd.c != null) {
                    ohd.c.setText(string);
                }
            }
            ohd.b((int) R.string.payment_failure_banner_description_downloaded_content);
            ohd.c(R.string.payment_failure_banner_cta_ab_test);
        } else if (i2 == 3) {
            ohd.a((int) R.string.payment_failure_banner_title_benefit_content);
            ohd.b((int) R.string.payment_failure_banner_description_benefit_content);
            ohd.c(R.string.payment_failure_banner_cta_ab_test);
        }
        ohd.a(true);
        int a2 = this.f.a(a, 0) + 1;
        this.h.a("impression", (long) a2);
        this.f.a().a(b, this.j.a()).a(a, a2).a(d).b();
    }

    public final void a(ohd ohd, Intent intent, hfz hfz) {
        this.n = intent;
        this.o = hfz;
        hfz hfz2 = this.o;
        boolean z = true;
        if (hfz2 == null || !hfz2.a()) {
            Logger.b("No payment failure (%s)", this.o);
            this.f.a().a(b).a(c).a(d).a(a).b();
            z = false;
        } else {
            Logger.b("Has payment failure (%s)", this.o);
        }
        if (!z) {
            ohd.a(false);
            return;
        }
        this.l.a(xii.a((Callable<? extends T>) new $$Lambda$ogy$DNQTi_qfI4Jq0Ve0ySp2a20xrY<Object>(this)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$ogy$EpC2hrnFIZ8H8HPCZQ8AW4xQKmg<Object,Object>(this)).b(wit.a(this.k.a())).a(wit.a(this.k.c())).a((xis<? super T>) new $$Lambda$ogy$QemWxcK72djHV2Q1jvs2wOjBc<Object>(this, ohd), (xis<Throwable>) $$Lambda$ogy$ijcX2HoVuN249_vuqOLGiY6N0N4.INSTANCE));
    }
}

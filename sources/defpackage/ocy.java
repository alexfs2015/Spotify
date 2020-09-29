package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.placebobanner.BannerEvent;
import com.spotify.music.features.placebobanner.BannerEvent.Type;
import com.spotify.music.features.placebobanner.BannerEventService;
import com.spotify.music.features.placebobanner.PlaceboBannerService;
import com.spotify.music.features.placebobanner.models.BannerConfiguration;
import com.spotify.music.libs.viewuri.ViewUris.SubView;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ocy reason: default package */
public final class ocy {
    protected BannerConfiguration a;
    public odd b;
    public odg c;
    public final CompositeDisposable d;
    public String e;
    private final Context f;
    private final Scheduler g;
    private final Scheduler h;
    private final ocx i;
    private final ode j;
    private final jjf k;
    private final ocv l;
    private final ocr m;
    private final jro n;
    private final gbd o;
    private boolean p;
    private Long q;
    private String r = "";
    private kyh s = new $$Lambda$ocy$QYrgi6gW1yyR7BJYmM5ePxh02I(this);

    /* renamed from: ocy$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.placebobanner.BannerEvent$Type[] r0 = com.spotify.music.features.placebobanner.BannerEvent.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.placebobanner.BannerEvent$Type r1 = com.spotify.music.features.placebobanner.BannerEvent.Type.CTA_CLICK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.placebobanner.BannerEvent$Type r1 = com.spotify.music.features.placebobanner.BannerEvent.Type.CTA_CLICK_1     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.placebobanner.BannerEvent$Type r1 = com.spotify.music.features.placebobanner.BannerEvent.Type.CTA_CLICK_2     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.placebobanner.BannerEvent$Type r1 = com.spotify.music.features.placebobanner.BannerEvent.Type.CLOSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ocy.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ BannerConfiguration a(BannerConfiguration bannerConfiguration, Long l2) {
        return bannerConfiguration;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Fragment fragment, String str) {
        if (!this.r.equals(str)) {
            a(str);
            this.r = str;
        }
    }

    public ocy(Context context, Scheduler scheduler, Scheduler scheduler2, ocx ocx, ode ode, jjf jjf, ocv ocv, ocr ocr, jro jro, gbd gbd) {
        this.f = context;
        this.g = scheduler;
        this.h = scheduler2;
        this.i = ocx;
        this.j = ode;
        this.k = jjf;
        this.l = ocv;
        this.m = ocr;
        this.d = new CompositeDisposable();
        this.n = jro;
        this.o = gbd;
    }

    public final void a(kyi kyi) {
        Logger.b("onStart", new Object[0]);
        Long l2 = this.q;
        if (l2 != null) {
            long longValue = l2.longValue() - gbd.a().a();
            if (longValue <= 0) {
                a();
            } else {
                a(longValue);
            }
        }
        b(kyi);
        this.d.a(this.i.a().a(this.h).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ocy$FKHmD8QFMzuo6CivA8_w5JKH2r4<Object,Object>(this, kyi), false).a(this.g).h($$Lambda$ocy$5GO3DxBRCEsT1jC0aKzQROpgqfg.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$ocy$bdOH7jf5vVWJpTplFL8aRla5KIg<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocy$lz8YJP9Nyz7zBBAQVIgVKzrXDFU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(kyi kyi, Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.c();
        }
        kyi.a((kyh) fay.a(this.s));
        return this.j.a();
    }

    public final void b(kyi kyi) {
        kyi.b((kyh) fay.a(this.s));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(PlaceboBannerService placeboBannerService) {
        Logger.b("toBannerConfiguration %s", placeboBannerService);
        Logger.b("getBannerConfiguration", new Object[0]);
        Logger.b("getFromCache", new Object[0]);
        return Observable.b(placeboBannerService.b()).h(placeboBannerService.a()).b(placeboBannerService.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(BannerConfiguration bannerConfiguration) {
        Logger.b("updateBannerConfiguration %s", bannerConfiguration);
        this.a = bannerConfiguration;
        a((String) null);
    }

    private void a(String str) {
        if (!(this.b == null || this.c == null)) {
            BannerConfiguration bannerConfiguration = this.a;
            if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                a();
            } else if (!this.b.aH_() && !this.c.aH_() && !this.p) {
                this.d.a(this.i.a().h(new $$Lambda$ocy$Ou1rnC4HPUTTcRPvJj6TAvxz3_A(this, str)).a((Action) new $$Lambda$ocy$J1TuVaWaUoBy0P69nBCdPS6Z1Q(this)).a(this.h).a((Consumer<? super T>) new $$Lambda$ocy$QUq56aRE97IRc_RykJGoYpUh4s<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocy$HuKSekUZgx7TvZv4SM9XawpWBtw.INSTANCE));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str, Boolean bool) {
        BannerConfiguration bannerConfiguration = this.a;
        Logger.b("refreshBanner %s, %s", bannerConfiguration, bool);
        if (bannerConfiguration == null) {
            return Observable.c();
        }
        if (this.b == null || this.c == null) {
            return Observable.c();
        }
        if ((bannerConfiguration.targetUris() == null && str != null) || (bannerConfiguration.targetUris() != null && !bannerConfiguration.targetUris().contains(str))) {
            return Observable.c();
        }
        if (!bool.booleanValue()) {
            return Observable.c();
        }
        List placeboBannerViews = bannerConfiguration.placeboBannerViews();
        if (placeboBannerViews == null || placeboBannerViews.isEmpty()) {
            return Observable.c();
        }
        this.p = true;
        int showDelaySeconds = bannerConfiguration.showDelaySeconds();
        if (showDelaySeconds > 0) {
            return Observable.a((long) showDelaySeconds, TimeUnit.SECONDS, this.g).c((Function<? super T, ? extends R>) new $$Lambda$ocy$P26onL24eDDw6iM8FPrdWp6sZYA<Object,Object>(bannerConfiguration));
        }
        return Observable.b(bannerConfiguration);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.p = false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void b(com.spotify.music.features.placebobanner.models.BannerConfiguration r7) {
        /*
            r6 = this;
            java.util.List r0 = r7.placeboBannerViews()
            java.lang.Object r0 = defpackage.fay.a(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.spotify.music.features.placebobanner.models.PlaceboBannerView r0 = (com.spotify.music.features.placebobanner.models.PlaceboBannerView) r0
            java.lang.String r2 = r0.type()
            int r3 = r2.hashCode()
            r4 = -1239674955(0xffffffffb61c0fb5, float:-2.3254954E-6)
            r5 = 1
            if (r3 == r4) goto L_0x002e
            r4 = 3707(0xe7b, float:5.195E-42)
            if (r3 == r4) goto L_0x0024
            goto L_0x0038
        L_0x0024:
            java.lang.String r3 = "v1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0038
            r2 = 0
            goto L_0x0039
        L_0x002e:
            java.lang.String r3 = "twobuttons"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0038
            r2 = 1
            goto L_0x0039
        L_0x0038:
            r2 = -1
        L_0x0039:
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x0041
            r6.a()
            goto L_0x0078
        L_0x0041:
            odg r2 = r6.c
            java.lang.Object r2 = defpackage.fay.a(r2)
            odg r2 = (defpackage.odg) r2
            int r3 = r7.backgroundColor()
            r2.a(r0, r3)
            odg r0 = r6.c
            r0.a(r5)
            java.lang.String r0 = r6.r
            r6.e = r0
            r6.a(r7)
            goto L_0x0078
        L_0x005d:
            odd r2 = r6.b
            java.lang.Object r2 = defpackage.fay.a(r2)
            odd r2 = (defpackage.odd) r2
            int r3 = r7.backgroundColor()
            r2.a(r0, r3)
            odd r0 = r6.b
            r0.a(r5)
            java.lang.String r0 = r6.r
            r6.e = r0
            r6.a(r7)
        L_0x0078:
            r6.p = r1
            long r0 = r7.timeWindowSeconds()
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x009c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r7.toMillis(r0)
            jrp r7 = defpackage.gbd.a()
            long r2 = r7.a()
            long r2 = r2 + r0
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r6.q = r7
            r6.a(r0)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocy.b(com.spotify.music.features.placebobanner.models.BannerConfiguration):void");
    }

    private void a(long j2) {
        this.d.a(Observable.a(j2, TimeUnit.MILLISECONDS, this.g).a(this.h).a((Consumer<? super T>) new $$Lambda$ocy$HrJDF64Y47zaGzV_UhU0B5Wkg<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocy$VDzGiw1T_6IUsC_F7t_4KGXPgjs.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        a();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.q = null;
        this.a = null;
        odd odd = this.b;
        if (odd != null) {
            odd.a(false);
        }
        odg odg = this.c;
        if (odg != null) {
            odg.a(false);
        }
    }

    private void a(BannerConfiguration bannerConfiguration) {
        this.k.a(new ar(bannerConfiguration.configurationId(), "shown", this.e));
    }

    static /* synthetic */ void a(ocy ocy, String str, Type type) {
        String str2;
        Logger.b("onUserInteraction %s, with config id %s", type.mId, str);
        ocy.m.a();
        ocv ocv = ocy.l;
        Logger.b("notify %s, %s", type, str);
        BannerEvent create = BannerEvent.create(type.mId, str);
        Context context = ocv.a;
        Logger.b("createSendEventIntent %s", create);
        Intent intent = new Intent(context, BannerEventService.class);
        intent.putExtra("placebo_event", create);
        ocv.a.startService(intent);
        int i2 = AnonymousClass3.a[type.ordinal()];
        if (i2 == 1) {
            str2 = "cta-click";
        } else if (i2 == 2) {
            str2 = "cta-click-1";
        } else if (i2 == 3) {
            str2 = "cta-click-2";
        } else if (i2 == 4) {
            str2 = "banner-close";
        } else {
            throw new UnsupportedOperationException(String.format("Unknown banner event type %s", new Object[]{type}));
        }
        ocy.k.a(new as(str, str2, ocy.e));
    }

    static /* synthetic */ void a(ocy ocy, String str) {
        StringBuilder sb = new StringBuilder(str);
        String str2 = ocy.e;
        if (str2 != null && !str2.isEmpty()) {
            sb.append("&interactionUri=");
            sb.append(ocy.e);
        }
        ocy.f.startActivity(PremiumSignupActivity.a(ocy.f, mbt.g().a(SubView.PLACEBO_BANNER).a("").a(Uri.parse(sb.toString())).a(false).a(ocy.n).a()));
    }
}

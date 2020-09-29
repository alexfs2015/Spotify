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

/* renamed from: oke reason: default package */
public final class oke {
    protected BannerConfiguration a;
    public okj b;
    public okm c;
    public final CompositeDisposable d;
    public String e;
    private final Context f;
    private final Scheduler g;
    private final Scheduler h;
    private final okd i;
    private final okk j;
    private final jlr k;
    private final okb l;
    private final ojx m;
    private final jty n;
    private final gcb o;
    private boolean p;
    private Long q;
    private String r = "";
    private lbq s = new $$Lambda$oke$hjq7ezzfzSAMIfFmIYyn2XqbBDY(this);

    /* renamed from: oke$3 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.AnonymousClass3.<clinit>():void");
        }
    }

    public oke(Context context, Scheduler scheduler, Scheduler scheduler2, okd okd, okk okk, jlr jlr, okb okb, ojx ojx, jty jty, gcb gcb) {
        this.f = context;
        this.g = scheduler;
        this.h = scheduler2;
        this.i = okd;
        this.j = okk;
        this.k = jlr;
        this.l = okb;
        this.m = ojx;
        this.d = new CompositeDisposable();
        this.n = jty;
        this.o = gcb;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ BannerConfiguration a(BannerConfiguration bannerConfiguration, Long l2) {
        return bannerConfiguration;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(PlaceboBannerService placeboBannerService) {
        Logger.b("toBannerConfiguration %s", placeboBannerService);
        Logger.b("getBannerConfiguration", new Object[0]);
        Logger.b("getFromCache", new Object[0]);
        return Observable.b(placeboBannerService.b()).h(placeboBannerService.a()).b(placeboBannerService.b);
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
        return showDelaySeconds > 0 ? Observable.a((long) showDelaySeconds, TimeUnit.SECONDS, this.g).c((Function<? super T, ? extends R>) new $$Lambda$oke$vge0tfx8rou4ftoqNlWlyhac2O8<Object,Object>(bannerConfiguration)) : Observable.b(bannerConfiguration);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(lbr lbr, Boolean bool) {
        if (!bool.booleanValue()) {
            return Observable.c();
        }
        lbr.a((lbq) fbp.a(this.s));
        return this.j.a();
    }

    private void a(long j2) {
        this.d.a(Observable.a(j2, TimeUnit.MILLISECONDS, this.g).a(this.h).a((Consumer<? super T>) new $$Lambda$oke$mlnfCYztB42LXtIPGsFSQ1rPing<Object>(this), (Consumer<? super Throwable>) $$Lambda$oke$qvbLqRV8q7DfdIqVBsg5EsISU8.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Fragment fragment, String str) {
        if (!this.r.equals(str)) {
            a(str);
            this.r = str;
        }
    }

    private void a(BannerConfiguration bannerConfiguration) {
        this.k.a(new aq(bannerConfiguration.configurationId(), "shown", this.e));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        a();
    }

    private void a(String str) {
        if (!(this.b == null || this.c == null)) {
            BannerConfiguration bannerConfiguration = this.a;
            if (bannerConfiguration == null || bannerConfiguration.configurationId() == null) {
                a();
            } else if (!this.b.aF_() && !this.c.aF_() && !this.p) {
                this.d.a(this.i.a().h(new $$Lambda$oke$YFaYmn8aWirGaCP7Kb4dmbsc7D0(this, str)).a((Action) new $$Lambda$oke$P5oW5M_I41oxlB8_5Cbwthdhqw(this)).a(this.h).a((Consumer<? super T>) new $$Lambda$oke$M1H_S8f8ADqmmoLWxzqZf_AIYE<Object>(this), (Consumer<? super Throwable>) $$Lambda$oke$5p1rrYQnPLkL6TNHq_62hMA_D7U.INSTANCE));
            }
        }
    }

    static /* synthetic */ void a(oke oke, String str) {
        StringBuilder sb = new StringBuilder(str);
        String str2 = oke.e;
        if (str2 != null && !str2.isEmpty()) {
            sb.append("&interactionUri=");
            sb.append(oke.e);
        }
        oke.f.startActivity(PremiumSignupActivity.a(oke.f, mfw.g().a(SubView.PLACEBO_BANNER).a("").a(Uri.parse(sb.toString())).a(false).a(oke.n).a()));
    }

    static /* synthetic */ void a(oke oke, String str, Type type) {
        String str2;
        Logger.b("onUserInteraction %s, with config id %s", type.mId, str);
        oke.m.a();
        okb okb = oke.l;
        Logger.b("notify %s, %s", type, str);
        BannerEvent create = BannerEvent.create(type.mId, str);
        Context context = okb.a;
        Logger.b("createSendEventIntent %s", create);
        Intent intent = new Intent(context, BannerEventService.class);
        intent.putExtra("placebo_event", create);
        okb.a.startService(intent);
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
        oke.k.a(new ar(str, str2, oke.e));
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
            java.lang.Object r0 = defpackage.fbp.a(r0)
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
            okm r2 = r6.c
            java.lang.Object r2 = defpackage.fbp.a(r2)
            okm r2 = (defpackage.okm) r2
            int r3 = r7.backgroundColor()
            r2.a(r0, r3)
            okm r0 = r6.c
            r0.a(r5)
            java.lang.String r0 = r6.r
            r6.e = r0
            r6.a(r7)
            goto L_0x0078
        L_0x005d:
            okj r2 = r6.b
            java.lang.Object r2 = defpackage.fbp.a(r2)
            okj r2 = (defpackage.okj) r2
            int r3 = r7.backgroundColor()
            r2.a(r0, r3)
            okj r0 = r6.b
            r0.a(r5)
            java.lang.String r0 = r6.r
            r6.e = r0
            r6.a(r7)
        L_0x0078:
            r6.p = r1
            long r0 = r7.timeWindowSeconds()
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x009a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r7.toMillis(r0)
            jtz r7 = defpackage.jtp.a
            long r2 = r7.a()
            long r2 = r2 + r0
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r6.q = r7
            r6.a(r0)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.b(com.spotify.music.features.placebobanner.models.BannerConfiguration):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(BannerConfiguration bannerConfiguration) {
        Logger.b("updateBannerConfiguration %s", bannerConfiguration);
        this.a = bannerConfiguration;
        a((String) null);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.q = null;
        this.a = null;
        okj okj = this.b;
        if (okj != null) {
            okj.a(false);
        }
        okm okm = this.c;
        if (okm != null) {
            okm.a(false);
        }
    }

    public final void a(lbr lbr) {
        Logger.b("onStart", new Object[0]);
        Long l2 = this.q;
        if (l2 != null) {
            long longValue = l2.longValue() - jtp.a.a();
            if (longValue <= 0) {
                a();
            } else {
                a(longValue);
            }
        }
        b(lbr);
        this.d.a(this.i.a().a(this.h).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$oke$RGzREs3v3I22mcD3zr1Z4yctg<Object,Object>(this, lbr), false).a(this.g).h($$Lambda$oke$bjRgp1Hl58JGAh_Z8lk6FQlK5ME.INSTANCE).a(this.h).a((Consumer<? super T>) new $$Lambda$oke$qwXVmTpvm_FouXUF7qluFDRQvBw<Object>(this), (Consumer<? super Throwable>) $$Lambda$oke$tRrpatCl6Kw4B_DIdETbIBTlVYA.INSTANCE));
    }

    public final void b(lbr lbr) {
        lbr.b((lbq) fbp.a(this.s));
    }
}

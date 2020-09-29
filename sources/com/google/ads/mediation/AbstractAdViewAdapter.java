package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Date;
import java.util.Set;

@cfp
public abstract class AbstractAdViewAdapter implements blm, blt, MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgw;
    private bfj zzgx;
    private bfg zzgy;
    private Context zzgz;
    /* access modifiers changed from: private */
    public bfj zzha;
    /* access modifiers changed from: private */
    public blw zzhb;
    private final blv zzhc = new aqj(this);

    static class a extends blj {
        private final bfs j;

        public a(bfs bfs) {
            this.j = bfs;
            this.b = bfs.b().toString();
            this.c = bfs.c();
            this.d = bfs.d().toString();
            this.e = bfs.e();
            this.f = bfs.f().toString();
            if (bfs.g() != null) {
                this.g = bfs.g().doubleValue();
            }
            if (bfs.h() != null) {
                this.h = bfs.h().toString();
            }
            if (bfs.i() != null) {
                this.i = bfs.i().toString();
            }
            a(true);
            b(true);
            this.a = bfs.j();
        }

        public final void a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).a((bfp) this.j);
            }
            bfr bfr = (bfr) bfr.a.get(view);
            if (bfr != null) {
                bfr.a((bfp) this.j);
            }
        }
    }

    static class b extends blk {
        private final bft h;

        public b(bft bft) {
            this.h = bft;
            this.b = bft.b().toString();
            this.c = bft.c();
            this.d = bft.d().toString();
            if (bft.e() != null) {
                this.e = bft.e();
            }
            this.f = bft.f().toString();
            this.g = bft.g().toString();
            a(true);
            b(true);
            this.a = bft.h();
        }

        public final void a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).a((bfp) this.h);
            }
            bfr bfr = (bfr) bfr.a.get(view);
            if (bfr != null) {
                bfr.a((bfp) this.h);
            }
        }
    }

    static class c extends bln {
        private final bfw o;

        public c(bfw bfw) {
            this.o = bfw;
            this.a = bfw.a();
            this.b = bfw.b();
            this.c = bfw.c();
            this.d = bfw.d();
            this.e = bfw.e();
            this.f = bfw.f();
            this.g = bfw.g();
            this.h = bfw.h();
            this.i = bfw.i();
            this.k = bfw.l();
            this.j = bfw.j();
        }

        public final void a(View view) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).a(this.o);
                return;
            }
            bfr bfr = (bfr) bfr.a.get(view);
            if (bfr != null) {
                bfr.a(this.o);
            }
        }
    }

    static final class d extends bff implements bfn, dpj {
        private final AbstractAdViewAdapter a;
        private final blf b;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, blf blf) {
            this.a = abstractAdViewAdapter;
            this.b = blf;
        }

        public final void a() {
            this.b.a();
        }

        public final void a(int i) {
            this.b.a(i);
        }

        public final void a(String str, String str2) {
            this.b.a(str, str2);
        }

        public final void b() {
            this.b.b();
        }

        public final void c() {
            this.b.c();
        }

        public final void d() {
            this.b.d();
        }

        public final void e() {
            this.b.e();
        }
    }

    static final class e extends bff implements dpj {
        private final AbstractAdViewAdapter a;
        private final blg b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, blg blg) {
            this.a = abstractAdViewAdapter;
            this.b = blg;
        }

        public final void a() {
            this.b.f();
        }

        public final void a(int i) {
            this.b.b(i);
        }

        public final void b() {
            this.b.g();
        }

        public final void c() {
            this.b.h();
        }

        public final void d() {
            this.b.i();
        }

        public final void e() {
            this.b.j();
        }
    }

    static final class f extends bff implements defpackage.bfs.a, defpackage.bft.a, defpackage.bfu.a, defpackage.bfu.b, defpackage.bfw.a {
        private final AbstractAdViewAdapter a;
        private final blh b;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, blh blh) {
            this.a = abstractAdViewAdapter;
            this.b = blh;
        }

        public final void a() {
        }

        public final void a(int i) {
            this.b.c(i);
        }

        public final void a(bfs bfs) {
            this.b.a((MediationNativeAdapter) this.a, (bli) new a(bfs));
        }

        public final void a(bft bft) {
            this.b.a((MediationNativeAdapter) this.a, (bli) new b(bft));
        }

        public final void a(bfu bfu) {
            this.b.a(bfu);
        }

        public final void a(bfu bfu, String str) {
            this.b.a(bfu, str);
        }

        public final void a(bfw bfw) {
            this.b.a((MediationNativeAdapter) this.a, (bln) new c(bfw));
        }

        public final void b() {
            this.b.k();
        }

        public final void c() {
            this.b.l();
        }

        public final void d() {
            this.b.m();
        }

        public final void e() {
            this.b.n();
        }

        public final void f() {
            this.b.o();
        }
    }

    private final bfh zza(Context context, bld bld, Bundle bundle, Bundle bundle2) {
        defpackage.bfh.a aVar = new defpackage.bfh.a();
        Date a2 = bld.a();
        if (a2 != null) {
            aVar.a.g = a2;
        }
        int b2 = bld.b();
        if (b2 != 0) {
            aVar.a.h = b2;
        }
        Set<String> c2 = bld.c();
        if (c2 != null) {
            for (String add : c2) {
                aVar.a.a.add(add);
            }
        }
        Location d2 = bld.d();
        if (d2 != null) {
            aVar.a.i = d2;
        }
        if (bld.f()) {
            dqe.a();
            aVar.a.a(cpc.a(context));
        }
        if (bld.e() != -1) {
            int i = 1;
            if (bld.e() != 1) {
                i = 0;
            }
            aVar.a.j = i;
        }
        aVar.a.k = bld.g();
        Bundle zza = zza(bundle, bundle2);
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        aVar.a.b.putBundle(cls.getName(), zza);
        if (cls.equals(AdMobAdapter.class) && zza.getBoolean("_emulatorLiveAds")) {
            aVar.a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new bfh(aVar, 0);
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgw;
    }

    public Bundle getInterstitialAdapterInfo() {
        defpackage.ble.a aVar = new defpackage.ble.a();
        aVar.a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", aVar.a);
        return bundle;
    }

    public drq getVideoController() {
        AdView adView = this.zzgw;
        if (adView != null) {
            bfl a2 = adView.a();
            if (a2 != null) {
                return a2.a();
            }
        }
        return null;
    }

    public void initialize(Context context, bld bld, String str, blw blw, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = blw;
        this.zzhb.a((MediationRewardedVideoAdAdapter) this);
    }

    public boolean isInitialized() {
        return this.zzhb != null;
    }

    public void loadAd(bld bld, Bundle bundle, Bundle bundle2) {
        Context context = this.zzgz;
        if (context == null || this.zzhb == null) {
            cpn.a("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzha = new bfj(context);
        this.zzha.a.a = true;
        this.zzha.a(getAdUnitId(bundle));
        bfj bfj = this.zzha;
        bfj.a.a(this.zzhc);
        bfj bfj2 = this.zzha;
        bfj2.a.a((blx) new aqk(this));
        this.zzha.a(zza(this.zzgz, bld, bundle2, bundle));
    }

    public void onDestroy() {
        AdView adView = this.zzgw;
        if (adView != null) {
            adView.e();
            this.zzgw = null;
        }
        if (this.zzgx != null) {
            this.zzgx = null;
        }
        if (this.zzgy != null) {
            this.zzgy = null;
        }
        if (this.zzha != null) {
            this.zzha = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        bfj bfj = this.zzgx;
        if (bfj != null) {
            bfj.a(z);
        }
        bfj bfj2 = this.zzha;
        if (bfj2 != null) {
            bfj2.a(z);
        }
    }

    public void onPause() {
        AdView adView = this.zzgw;
        if (adView != null) {
            adView.c();
        }
    }

    public void onResume() {
        AdView adView = this.zzgw;
        if (adView != null) {
            adView.b();
        }
    }

    public void requestBannerAd(Context context, blf blf, Bundle bundle, bfi bfi, bld bld, Bundle bundle2) {
        this.zzgw = new AdView(context);
        this.zzgw.a(new bfi(bfi.j, bfi.k));
        this.zzgw.a(getAdUnitId(bundle));
        this.zzgw.a((bff) new d(this, blf));
        this.zzgw.a(zza(context, bld, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, blg blg, Bundle bundle, bld bld, Bundle bundle2) {
        this.zzgx = new bfj(context);
        this.zzgx.a(getAdUnitId(bundle));
        bfj bfj = this.zzgx;
        e eVar = new e(this, blg);
        bfj.a.a((bff) eVar);
        bfj.a.a((dpj) eVar);
        this.zzgx.a(zza(context, bld, bundle2, bundle));
    }

    public void requestNativeAd(Context context, blh blh, Bundle bundle, bll bll, Bundle bundle2) {
        f fVar = new f(this, blh);
        defpackage.bfg.a a2 = new defpackage.bfg.a(context, bundle.getString(AD_UNIT_ID_PARAMETER)).a((bff) fVar);
        bfq h = bll.h();
        if (h != null) {
            a2.a(h);
        }
        if (bll.j()) {
            a2.a((defpackage.bfw.a) fVar);
        }
        if (bll.i()) {
            a2.a((defpackage.bfs.a) fVar);
        }
        if (bll.k()) {
            a2.a((defpackage.bft.a) fVar);
        }
        if (bll.l()) {
            for (String str : bll.m().keySet()) {
                a2.a(str, fVar, ((Boolean) bll.m().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzgy = a2.a();
        this.zzgy.a(zza(context, bll, bundle2, bundle).a);
    }

    public void showInterstitial() {
        this.zzgx.a.b();
    }

    public void showVideo() {
        this.zzha.a.b();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}

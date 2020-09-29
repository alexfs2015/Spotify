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

@cey
public abstract class AbstractAdViewAdapter implements bkv, blc, MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzatm {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgw;
    private bes zzgx;
    private bep zzgy;
    private Context zzgz;
    /* access modifiers changed from: private */
    public bes zzha;
    /* access modifiers changed from: private */
    public blf zzhb;
    private final ble zzhc = new aps(this);

    static class a extends bks {
        private final bfb j;

        public final void a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).a((bey) this.j);
            }
            bfa bfa = (bfa) bfa.a.get(view);
            if (bfa != null) {
                bfa.a((bey) this.j);
            }
        }

        public a(bfb bfb) {
            this.j = bfb;
            this.b = bfb.b().toString();
            this.c = bfb.c();
            this.d = bfb.d().toString();
            this.e = bfb.e();
            this.f = bfb.f().toString();
            if (bfb.g() != null) {
                this.g = bfb.g().doubleValue();
            }
            if (bfb.h() != null) {
                this.h = bfb.h().toString();
            }
            if (bfb.i() != null) {
                this.i = bfb.i().toString();
            }
            a(true);
            b(true);
            this.a = bfb.j();
        }
    }

    static class b extends bkt {
        private final bfc h;

        public final void a(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).a((bey) this.h);
            }
            bfa bfa = (bfa) bfa.a.get(view);
            if (bfa != null) {
                bfa.a((bey) this.h);
            }
        }

        public b(bfc bfc) {
            this.h = bfc;
            this.b = bfc.b().toString();
            this.c = bfc.c();
            this.d = bfc.d().toString();
            if (bfc.e() != null) {
                this.e = bfc.e();
            }
            this.f = bfc.f().toString();
            this.g = bfc.g().toString();
            a(true);
            b(true);
            this.a = bfc.h();
        }
    }

    static class c extends bkw {
        private final bff o;

        public final void a(View view) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).a(this.o);
                return;
            }
            bfa bfa = (bfa) bfa.a.get(view);
            if (bfa != null) {
                bfa.a(this.o);
            }
        }

        public c(bff bff) {
            this.o = bff;
            this.a = bff.a();
            this.b = bff.b();
            this.c = bff.c();
            this.d = bff.d();
            this.e = bff.e();
            this.f = bff.f();
            this.g = bff.g();
            this.h = bff.h();
            this.i = bff.i();
            this.k = bff.l();
            this.j = bff.j();
        }
    }

    static final class d extends beo implements bew, dos {
        private final AbstractAdViewAdapter a;
        private final bko b;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, bko bko) {
            this.a = abstractAdViewAdapter;
            this.b = bko;
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

    static final class e extends beo implements dos {
        private final AbstractAdViewAdapter a;
        private final bkp b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, bkp bkp) {
            this.a = abstractAdViewAdapter;
            this.b = bkp;
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

    static final class f extends beo implements defpackage.bfb.a, defpackage.bfc.a, defpackage.bfd.a, defpackage.bfd.b, defpackage.bff.a {
        private final AbstractAdViewAdapter a;
        private final bkq b;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, bkq bkq) {
            this.a = abstractAdViewAdapter;
            this.b = bkq;
        }

        public final void a() {
        }

        public final void a(int i) {
            this.b.c(i);
        }

        public final void a(bfb bfb) {
            this.b.a((MediationNativeAdapter) this.a, (bkr) new a(bfb));
        }

        public final void a(bfc bfc) {
            this.b.a((MediationNativeAdapter) this.a, (bkr) new b(bfc));
        }

        public final void a(bfd bfd) {
            this.b.a(bfd);
        }

        public final void a(bfd bfd, String str) {
            this.b.a(bfd, str);
        }

        public final void a(bff bff) {
            this.b.a((MediationNativeAdapter) this.a, (bkw) new c(bff));
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

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgw;
    }

    public dqz getVideoController() {
        AdView adView = this.zzgw;
        if (adView != null) {
            beu a2 = adView.a();
            if (a2 != null) {
                return a2.a();
            }
        }
        return null;
    }

    public void initialize(Context context, bkm bkm, String str, blf blf, Bundle bundle, Bundle bundle2) {
        this.zzgz = context.getApplicationContext();
        this.zzhb = blf;
        this.zzhb.a((MediationRewardedVideoAdAdapter) this);
    }

    public boolean isInitialized() {
        return this.zzhb != null;
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
        bes bes = this.zzgx;
        if (bes != null) {
            bes.a(z);
        }
        bes bes2 = this.zzha;
        if (bes2 != null) {
            bes2.a(z);
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

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final beq zza(Context context, bkm bkm, Bundle bundle, Bundle bundle2) {
        defpackage.beq.a aVar = new defpackage.beq.a();
        Date a2 = bkm.a();
        if (a2 != null) {
            aVar.a.g = a2;
        }
        int b2 = bkm.b();
        if (b2 != 0) {
            aVar.a.h = b2;
        }
        Set<String> c2 = bkm.c();
        if (c2 != null) {
            for (String add : c2) {
                aVar.a.a.add(add);
            }
        }
        Location d2 = bkm.d();
        if (d2 != null) {
            aVar.a.i = d2;
        }
        if (bkm.f()) {
            dpn.a();
            aVar.a.a(col.a(context));
        }
        if (bkm.e() != -1) {
            int i = 1;
            if (bkm.e() != 1) {
                i = 0;
            }
            aVar.a.j = i;
        }
        aVar.a.k = bkm.g();
        Bundle zza = zza(bundle, bundle2);
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        aVar.a.b.putBundle(cls.getName(), zza);
        if (cls.equals(AdMobAdapter.class) && zza.getBoolean("_emulatorLiveAds")) {
            aVar.a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new beq(aVar, 0);
    }

    public void requestBannerAd(Context context, bko bko, Bundle bundle, ber ber, bkm bkm, Bundle bundle2) {
        this.zzgw = new AdView(context);
        this.zzgw.a(new ber(ber.j, ber.k));
        this.zzgw.a(getAdUnitId(bundle));
        this.zzgw.a((beo) new d(this, bko));
        this.zzgw.a(zza(context, bkm, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, bkp bkp, Bundle bundle, bkm bkm, Bundle bundle2) {
        this.zzgx = new bes(context);
        this.zzgx.a(getAdUnitId(bundle));
        bes bes = this.zzgx;
        e eVar = new e(this, bkp);
        bes.a.a((beo) eVar);
        bes.a.a((dos) eVar);
        this.zzgx.a(zza(context, bkm, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgx.a.b();
    }

    public Bundle getInterstitialAdapterInfo() {
        defpackage.bkn.a aVar = new defpackage.bkn.a();
        aVar.a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", aVar.a);
        return bundle;
    }

    public void requestNativeAd(Context context, bkq bkq, Bundle bundle, bku bku, Bundle bundle2) {
        f fVar = new f(this, bkq);
        defpackage.bep.a a2 = new defpackage.bep.a(context, bundle.getString(AD_UNIT_ID_PARAMETER)).a((beo) fVar);
        bez h = bku.h();
        if (h != null) {
            a2.a(h);
        }
        if (bku.j()) {
            a2.a((defpackage.bff.a) fVar);
        }
        if (bku.i()) {
            a2.a((defpackage.bfb.a) fVar);
        }
        if (bku.k()) {
            a2.a((defpackage.bfc.a) fVar);
        }
        if (bku.l()) {
            for (String str : bku.m().keySet()) {
                a2.a(str, fVar, ((Boolean) bku.m().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzgy = a2.a();
        this.zzgy.a(zza(context, bku, bundle2, bundle).a);
    }

    public void loadAd(bkm bkm, Bundle bundle, Bundle bundle2) {
        Context context = this.zzgz;
        if (context == null || this.zzhb == null) {
            cow.a("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzha = new bes(context);
        this.zzha.a.a = true;
        this.zzha.a(getAdUnitId(bundle));
        bes bes = this.zzha;
        bes.a.a(this.zzhc);
        bes bes2 = this.zzha;
        bes2.a.a((blg) new apt(this));
        this.zzha.a(zza(this.zzgz, bkm, bundle2, bundle));
    }

    public void showVideo() {
        this.zzha.a.b();
    }
}

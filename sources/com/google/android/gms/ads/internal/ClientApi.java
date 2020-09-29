package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;

@cey
public class ClientApi extends dqq {
    public dpy createAdLoaderBuilder(car car, String str, ecp ecp, int i) {
        Context context = (Context) cas.a(car);
        bjl.e();
        bhz bhz = new bhz(context, str, ecp, new coy(i, cmd.j(context)), bki.a(context));
        return bhz;
    }

    public cci createAdOverlay(car car) {
        Activity activity = (Activity) cas.a(car);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.a(activity.getIntent());
        if (a == null) {
            return new bhg(activity);
        }
        int i = a.k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new bhg(activity) : new bhh(activity, a) : new bhn(activity) : new bhm(activity) : new bhf(activity);
    }

    public dqd createBannerAdManager(car car, dpc dpc, String str, ecp ecp, int i) {
        Context context = (Context) cas.a(car);
        bjl.e();
        bkk bkk = new bkk(context, dpc, str, ecp, new coy(i, cmd.j(context)), bki.a(context));
        return bkk;
    }

    public ccr createInAppPurchaseManager(car car) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (((java.lang.Boolean) defpackage.dpn.f().a(defpackage.dsp.aR)).booleanValue() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        if (((java.lang.Boolean) defpackage.dpn.f().a(defpackage.dsp.aS)).booleanValue() != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.dqd createInterstitialAdManager(defpackage.car r8, defpackage.dpc r9, java.lang.String r10, defpackage.ecp r11, int r12) {
        /*
            r7 = this;
            java.lang.Object r8 = defpackage.cas.a(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            defpackage.dsp.a(r1)
            coy r5 = new coy
            defpackage.bjl.e()
            boolean r8 = defpackage.cmd.j(r1)
            r5.<init>(r12, r8)
            java.lang.String r8 = r9.a
            java.lang.String r12 = "reward_mb"
            boolean r8 = r12.equals(r8)
            if (r8 != 0) goto L_0x0032
            dsf<java.lang.Boolean> r12 = defpackage.dsp.aR
            dsn r0 = defpackage.dpn.f()
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0046
        L_0x0032:
            if (r8 == 0) goto L_0x0048
            dsf<java.lang.Boolean> r8 = defpackage.dsp.aS
            dsn r12 = defpackage.dpn.f()
            java.lang.Object r8 = r12.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0048
        L_0x0046:
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            if (r8 == 0) goto L_0x005a
            dzd r8 = new dzd
            bki r9 = defpackage.bki.a(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005a:
            bia r8 = new bia
            bki r6 = defpackage.bki.a(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(car, dpc, java.lang.String, ecp, int):dqd");
    }

    public dve createNativeAdViewDelegate(car car, car car2) {
        return new dur((FrameLayout) cas.a(car), (FrameLayout) cas.a(car2));
    }

    public dvj createNativeAdViewHolderDelegate(car car, car car2, car car3) {
        return new dut((View) cas.a(car), (HashMap) cas.a(car2), (HashMap) cas.a(car3));
    }

    public ciq createRewardedVideoAd(car car, ecp ecp, int i) {
        Context context = (Context) cas.a(car);
        bjl.e();
        return new cih(context, bki.a(context), ecp, new coy(i, cmd.j(context)));
    }

    public dqd createSearchAdManager(car car, dpc dpc, String str, int i) {
        Context context = (Context) cas.a(car);
        bjl.e();
        return new bjf(context, dpc, str, new coy(i, cmd.j(context)));
    }

    public dqu getMobileAdsSettingsManager(car car) {
        return null;
    }

    public dqu getMobileAdsSettingsManagerWithClientJarVersion(car car, int i) {
        Context context = (Context) cas.a(car);
        bjl.e();
        return bin.a(context, new coy(i, cmd.j(context)));
    }
}

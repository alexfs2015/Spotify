package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;

@cfp
public class ClientApi extends drh {
    public dqp createAdLoaderBuilder(cbi cbi, String str, edg edg, int i) {
        Context context = (Context) cbj.a(cbi);
        bkc.e();
        biq biq = new biq(context, str, edg, new cpp(i, cmu.j(context)), bkz.a(context));
        return biq;
    }

    public ccz createAdOverlay(cbi cbi) {
        Activity activity = (Activity) cbj.a(cbi);
        AdOverlayInfoParcel a = AdOverlayInfoParcel.a(activity.getIntent());
        if (a == null) {
            return new bhx(activity);
        }
        int i = a.k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new bhx(activity) : new bhy(activity, a) : new bie(activity) : new bid(activity) : new bhw(activity);
    }

    public dqu createBannerAdManager(cbi cbi, dpt dpt, String str, edg edg, int i) {
        Context context = (Context) cbj.a(cbi);
        bkc.e();
        blb blb = new blb(context, dpt, str, edg, new cpp(i, cmu.j(context)), bkz.a(context));
        return blb;
    }

    public cdi createInAppPurchaseManager(cbi cbi) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (((java.lang.Boolean) defpackage.dqe.f().a(defpackage.dtg.aR)).booleanValue() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        if (((java.lang.Boolean) defpackage.dqe.f().a(defpackage.dtg.aS)).booleanValue() != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r8 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.dqu createInterstitialAdManager(defpackage.cbi r8, defpackage.dpt r9, java.lang.String r10, defpackage.edg r11, int r12) {
        /*
            r7 = this;
            java.lang.Object r8 = defpackage.cbj.a(r8)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            defpackage.dtg.a(r1)
            cpp r5 = new cpp
            defpackage.bkc.e()
            boolean r8 = defpackage.cmu.j(r1)
            r5.<init>(r12, r8)
            java.lang.String r8 = r9.a
            java.lang.String r12 = "reward_mb"
            boolean r8 = r12.equals(r8)
            if (r8 != 0) goto L_0x0032
            dsw<java.lang.Boolean> r12 = defpackage.dtg.aR
            dte r0 = defpackage.dqe.f()
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0046
        L_0x0032:
            if (r8 == 0) goto L_0x0048
            dsw<java.lang.Boolean> r8 = defpackage.dtg.aS
            dte r12 = defpackage.dqe.f()
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
            dzu r8 = new dzu
            bkz r9 = defpackage.bkz.a(r1)
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
        L_0x005a:
            bir r8 = new bir
            bkz r6 = defpackage.bkz.a(r1)
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(cbi, dpt, java.lang.String, edg, int):dqu");
    }

    public dvv createNativeAdViewDelegate(cbi cbi, cbi cbi2) {
        return new dvi((FrameLayout) cbj.a(cbi), (FrameLayout) cbj.a(cbi2));
    }

    public dwa createNativeAdViewHolderDelegate(cbi cbi, cbi cbi2, cbi cbi3) {
        return new dvk((View) cbj.a(cbi), (HashMap) cbj.a(cbi2), (HashMap) cbj.a(cbi3));
    }

    public cjh createRewardedVideoAd(cbi cbi, edg edg, int i) {
        Context context = (Context) cbj.a(cbi);
        bkc.e();
        return new ciy(context, bkz.a(context), edg, new cpp(i, cmu.j(context)));
    }

    public dqu createSearchAdManager(cbi cbi, dpt dpt, String str, int i) {
        Context context = (Context) cbj.a(cbi);
        bkc.e();
        return new bjw(context, dpt, str, new cpp(i, cmu.j(context)));
    }

    public drl getMobileAdsSettingsManager(cbi cbi) {
        return null;
    }

    public drl getMobileAdsSettingsManagerWithClientJarVersion(cbi cbi, int i) {
        Context context = (Context) cbj.a(cbi);
        bkc.e();
        return bje.a(context, new cpp(i, cmu.j(context)));
    }
}

package defpackage;

import android.os.IInterface;

/* renamed from: drg reason: default package */
public interface drg extends IInterface {
    dqp createAdLoaderBuilder(cbi cbi, String str, edg edg, int i);

    ccz createAdOverlay(cbi cbi);

    dqu createBannerAdManager(cbi cbi, dpt dpt, String str, edg edg, int i);

    cdi createInAppPurchaseManager(cbi cbi);

    dqu createInterstitialAdManager(cbi cbi, dpt dpt, String str, edg edg, int i);

    dvv createNativeAdViewDelegate(cbi cbi, cbi cbi2);

    dwa createNativeAdViewHolderDelegate(cbi cbi, cbi cbi2, cbi cbi3);

    cjh createRewardedVideoAd(cbi cbi, edg edg, int i);

    dqu createSearchAdManager(cbi cbi, dpt dpt, String str, int i);

    drl getMobileAdsSettingsManager(cbi cbi);

    drl getMobileAdsSettingsManagerWithClientJarVersion(cbi cbi, int i);
}

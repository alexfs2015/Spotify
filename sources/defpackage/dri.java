package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dri reason: default package */
public final class dri extends dko implements drg {
    dri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final dqp createAdLoaderBuilder(cbi cbi, String str, edg edg, int i) {
        dqp dqp;
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edg);
        K_.writeInt(i);
        Parcel a = a(3, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqp = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            dqp = queryLocalInterface instanceof dqp ? (dqp) queryLocalInterface : new dqr(readStrongBinder);
        }
        a.recycle();
        return dqp;
    }

    public final ccz createAdOverlay(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        Parcel a = a(8, K_);
        ccz a2 = cda.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqu createBannerAdManager(cbi cbi, dpt dpt, String str, edg edg, int i) {
        dqu dqu;
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpt);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edg);
        K_.writeInt(i);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dqu = queryLocalInterface instanceof dqu ? (dqu) queryLocalInterface : new dqw(readStrongBinder);
        }
        a.recycle();
        return dqu;
    }

    public final cdi createInAppPurchaseManager(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        Parcel a = a(7, K_);
        cdi a2 = cdk.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqu createInterstitialAdManager(cbi cbi, dpt dpt, String str, edg edg, int i) {
        dqu dqu;
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpt);
        K_.writeString(str);
        dkq.a(K_, (IInterface) edg);
        K_.writeInt(i);
        Parcel a = a(2, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dqu = queryLocalInterface instanceof dqu ? (dqu) queryLocalInterface : new dqw(readStrongBinder);
        }
        a.recycle();
        return dqu;
    }

    public final dvv createNativeAdViewDelegate(cbi cbi, cbi cbi2) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) cbi2);
        Parcel a = a(5, K_);
        dvv a2 = dvw.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dwa createNativeAdViewHolderDelegate(cbi cbi, cbi cbi2, cbi cbi3) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) cbi2);
        dkq.a(K_, (IInterface) cbi3);
        Parcel a = a(11, K_);
        dwa a2 = dwb.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final cjh createRewardedVideoAd(cbi cbi, edg edg, int i) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) edg);
        K_.writeInt(i);
        Parcel a = a(6, K_);
        cjh a2 = cjj.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqu createSearchAdManager(cbi cbi, dpt dpt, String str, int i) {
        dqu dqu;
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) dpt);
        K_.writeString(str);
        K_.writeInt(i);
        Parcel a = a(10, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dqu = queryLocalInterface instanceof dqu ? (dqu) queryLocalInterface : new dqw(readStrongBinder);
        }
        a.recycle();
        return dqu;
    }

    public final drl getMobileAdsSettingsManager(cbi cbi) {
        drl drl;
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        Parcel a = a(4, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            drl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            drl = queryLocalInterface instanceof drl ? (drl) queryLocalInterface : new drn(readStrongBinder);
        }
        a.recycle();
        return drl;
    }

    public final drl getMobileAdsSettingsManagerWithClientJarVersion(cbi cbi, int i) {
        drl drl;
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeInt(i);
        Parcel a = a(9, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            drl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            drl = queryLocalInterface instanceof drl ? (drl) queryLocalInterface : new drn(readStrongBinder);
        }
        a.recycle();
        return drl;
    }
}

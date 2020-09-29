package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dqr reason: default package */
public final class dqr extends djx implements dqp {
    dqr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final dpy createAdLoaderBuilder(car car, String str, ecp ecp, int i) {
        dpy dpy;
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecp);
        K_.writeInt(i);
        Parcel a = a(3, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dpy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            dpy = queryLocalInterface instanceof dpy ? (dpy) queryLocalInterface : new dqa(readStrongBinder);
        }
        a.recycle();
        return dpy;
    }

    public final cci createAdOverlay(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        Parcel a = a(8, K_);
        cci a2 = ccj.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqd createBannerAdManager(car car, dpc dpc, String str, ecp ecp, int i) {
        dqd dqd;
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) dpc);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecp);
        K_.writeInt(i);
        Parcel a = a(1, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dqd = queryLocalInterface instanceof dqd ? (dqd) queryLocalInterface : new dqf(readStrongBinder);
        }
        a.recycle();
        return dqd;
    }

    public final ccr createInAppPurchaseManager(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        Parcel a = a(7, K_);
        ccr a2 = cct.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqd createInterstitialAdManager(car car, dpc dpc, String str, ecp ecp, int i) {
        dqd dqd;
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) dpc);
        K_.writeString(str);
        djz.a(K_, (IInterface) ecp);
        K_.writeInt(i);
        Parcel a = a(2, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dqd = queryLocalInterface instanceof dqd ? (dqd) queryLocalInterface : new dqf(readStrongBinder);
        }
        a.recycle();
        return dqd;
    }

    public final dve createNativeAdViewDelegate(car car, car car2) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) car2);
        Parcel a = a(5, K_);
        dve a2 = dvf.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dvj createNativeAdViewHolderDelegate(car car, car car2, car car3) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) car2);
        djz.a(K_, (IInterface) car3);
        Parcel a = a(11, K_);
        dvj a2 = dvk.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final ciq createRewardedVideoAd(car car, ecp ecp, int i) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) ecp);
        K_.writeInt(i);
        Parcel a = a(6, K_);
        ciq a2 = cis.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final dqd createSearchAdManager(car car, dpc dpc, String str, int i) {
        dqd dqd;
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) dpc);
        K_.writeString(str);
        K_.writeInt(i);
        Parcel a = a(10, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dqd = queryLocalInterface instanceof dqd ? (dqd) queryLocalInterface : new dqf(readStrongBinder);
        }
        a.recycle();
        return dqd;
    }

    public final dqu getMobileAdsSettingsManager(car car) {
        dqu dqu;
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        Parcel a = a(4, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            dqu = queryLocalInterface instanceof dqu ? (dqu) queryLocalInterface : new dqw(readStrongBinder);
        }
        a.recycle();
        return dqu;
    }

    public final dqu getMobileAdsSettingsManagerWithClientJarVersion(car car, int i) {
        dqu dqu;
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeInt(i);
        Parcel a = a(9, K_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            dqu = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            dqu = queryLocalInterface instanceof dqu ? (dqu) queryLocalInterface : new dqw(readStrongBinder);
        }
        a.recycle();
        return dqu;
    }
}

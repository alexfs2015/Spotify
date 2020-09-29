package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dqq reason: default package */
public abstract class dqq extends djy implements dqp {
    public dqq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static dqp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof dqp ? (dqp) queryLocalInterface : new dqr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = createBannerAdManager(a.a(parcel.readStrongBinder()), (dpc) djz.a(parcel, dpc.CREATOR), parcel.readString(), ecq.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = createInterstitialAdManager(a.a(parcel.readStrongBinder()), (dpc) djz.a(parcel, dpc.CREATOR), parcel.readString(), ecq.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = createAdLoaderBuilder(a.a(parcel.readStrongBinder()), parcel.readString(), ecq.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = getMobileAdsSettingsManager(a.a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = createNativeAdViewDelegate(a.a(parcel.readStrongBinder()), a.a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = createRewardedVideoAd(a.a(parcel.readStrongBinder()), ecq.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = createInAppPurchaseManager(a.a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = createAdOverlay(a.a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = getMobileAdsSettingsManagerWithClientJarVersion(a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = createSearchAdManager(a.a(parcel.readStrongBinder()), (dpc) djz.a(parcel, dpc.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = createNativeAdViewHolderDelegate(a.a(parcel.readStrongBinder()), a.a(parcel.readStrongBinder()), a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        djz.a(parcel2, iInterface);
        return true;
    }
}

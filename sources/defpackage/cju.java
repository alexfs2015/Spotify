package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cju reason: default package */
public abstract class cju extends djy implements cjt {
    public cju() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static cjt a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof cjt ? (cjt) queryLocalInterface : new cjv(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a(a.a(parcel.readStrongBinder()));
                break;
            case 2:
                a(a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                b(a.a(parcel.readStrongBinder()));
                break;
            case 4:
                c(a.a(parcel.readStrongBinder()));
                break;
            case 5:
                d(a.a(parcel.readStrongBinder()));
                break;
            case 6:
                e(a.a(parcel.readStrongBinder()));
                break;
            case 7:
                a(a.a(parcel.readStrongBinder()), (cjx) djz.a(parcel, cjx.CREATOR));
                break;
            case 8:
                f(a.a(parcel.readStrongBinder()));
                break;
            case 9:
                b(a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                g(a.a(parcel.readStrongBinder()));
                break;
            case 11:
                h(a.a(parcel.readStrongBinder()));
                break;
            case 12:
                a((Bundle) djz.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cjo reason: default package */
public abstract class cjo extends dkp implements cjn {
    public cjo() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        cjc cjc;
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                c();
                break;
            case 4:
                d();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cjc = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    cjc = queryLocalInterface instanceof cjc ? (cjc) queryLocalInterface : new cje(readStrongBinder);
                }
                a(cjc);
                break;
            case 6:
                e();
                break;
            case 7:
                a(parcel.readInt());
                break;
            case 8:
                f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

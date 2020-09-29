package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: edn reason: default package */
public abstract class edn extends dkp implements edm {
    public edn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static edm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof edm ? (edm) queryLocalInterface : new edo(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        edp edp;
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                a(parcel.readInt());
                break;
            case 4:
                c();
                break;
            case 5:
                d();
                break;
            case 6:
                e();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    edp = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    edp = queryLocalInterface instanceof edp ? (edp) queryLocalInterface : new edr(readStrongBinder);
                }
                a(edp);
                break;
            case 8:
                f();
                break;
            case 9:
                a(parcel.readString(), parcel.readString());
                break;
            case 10:
                a(dwo.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                g();
                break;
            case 12:
                a(parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

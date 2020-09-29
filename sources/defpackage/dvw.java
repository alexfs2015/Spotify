package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvw reason: default package */
public abstract class dvw extends dkp implements dvv {
    public dvw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static dvv a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof dvv ? (dvv) queryLocalInterface : new dvx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a(parcel.readString(), a.a(parcel.readStrongBinder()));
                break;
            case 2:
                cbi a = a(parcel.readString());
                parcel2.writeNoException();
                dkq.a(parcel2, (IInterface) a);
                break;
            case 3:
                a(a.a(parcel.readStrongBinder()));
                break;
            case 4:
                a();
                break;
            case 5:
                a(a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                b(a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

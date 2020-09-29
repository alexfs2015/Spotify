package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvf reason: default package */
public abstract class dvf extends djy implements dve {
    public dvf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static dve a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof dve ? (dve) queryLocalInterface : new dvg(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a(parcel.readString(), a.a(parcel.readStrongBinder()));
                break;
            case 2:
                car a = a(parcel.readString());
                parcel2.writeNoException();
                djz.a(parcel2, (IInterface) a);
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

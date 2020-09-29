package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqj reason: default package */
public abstract class bqj extends egx implements bqk {
    public bqj() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                cbi a = a();
                parcel2.writeNoException();
                ehz.a(parcel2, (IInterface) a);
                break;
            case 2:
                b((Bundle) ehz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                d((Bundle) ehz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a(ehz.a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                long b = b();
                parcel2.writeNoException();
                parcel2.writeLong(b);
                break;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            case 7:
                a((Bundle) ehz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                c((Bundle) ehz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

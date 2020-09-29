package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bps reason: default package */
public abstract class bps extends egg implements bpt {
    public bps() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                car a = a();
                parcel2.writeNoException();
                ehi.a(parcel2, (IInterface) a);
                break;
            case 2:
                b((Bundle) ehi.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                d((Bundle) ehi.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a(ehi.a(parcel));
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
                a((Bundle) ehi.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                c((Bundle) ehi.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqq reason: default package */
public abstract class bqq extends egg implements bqr {
    public bqq() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                car a = a();
                parcel2.writeNoException();
                ehi.a(parcel2, (IInterface) a);
                break;
            case 2:
                a(a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 3:
                a(a.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                a(a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                b(a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 6:
                b(a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                b(a.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 8:
                a(a.a(parcel.readStrongBinder()), ehi.a(parcel));
                parcel2.writeNoException();
                break;
            case 9:
                c(a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 10:
                d(a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            default:
                return false;
        }
        return true;
    }
}

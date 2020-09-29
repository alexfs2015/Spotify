package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ein reason: default package */
public abstract class ein extends egg implements eio {
    public ein() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        eiq eiq;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) ehi.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    eiq = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    if (queryLocalInterface instanceof eiq) {
                        eiq = (eiq) queryLocalInterface;
                    } else {
                        eiq = new eip(readStrongBinder);
                    }
                }
                a(bundle, eiq);
                parcel2.writeNoException();
                break;
            case 2:
                a((Bundle) ehi.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 3:
                a((Bundle) ehi.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                boolean b = b((Bundle) ehi.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                ehi.a(parcel2, b);
                break;
            case 5:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                a();
                parcel2.writeNoException();
                break;
            case 7:
                boolean b2 = b();
                parcel2.writeNoException();
                ehi.a(parcel2, b2);
                break;
            case 8:
                Bundle b3 = b(parcel.readString());
                parcel2.writeNoException();
                ehi.b(parcel2, b3);
                break;
            case 9:
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                break;
            case 11:
                d();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

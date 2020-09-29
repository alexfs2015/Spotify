package defpackage;

import android.os.Parcel;
import java.util.List;

/* renamed from: erf reason: default package */
public abstract class erf extends elf implements ere {
    public erf() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((erb) elg.a(parcel, erb.CREATOR), (ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a((ewa) elg.a(parcel, ewa.CREATOR), (ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a((ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                a((erb) elg.a(parcel, erb.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                b((ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = a((ewh) elg.a(parcel, ewh.CREATOR), elg.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = a((erb) elg.a(parcel, erb.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = c((ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                a((ewl) elg.a(parcel, ewl.CREATOR), (ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                a((ewl) elg.a(parcel, ewl.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = a(parcel.readString(), parcel.readString(), elg.a(parcel), (ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), elg.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = a(parcel.readString(), parcel.readString(), (ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                d((ewh) elg.a(parcel, ewh.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

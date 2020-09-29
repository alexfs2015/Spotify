package defpackage;

import android.os.Parcel;
import java.util.List;

/* renamed from: eqo reason: default package */
public abstract class eqo extends eko implements eqn {
    public eqo() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((eqk) ekp.a(parcel, eqk.CREATOR), (evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a((evj) ekp.a(parcel, evj.CREATOR), (evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a((evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                a((eqk) ekp.a(parcel, eqk.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                b((evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = a((evq) ekp.a(parcel, evq.CREATOR), ekp.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = a((eqk) ekp.a(parcel, eqk.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = c((evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                a((evu) ekp.a(parcel, evu.CREATOR), (evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                a((evu) ekp.a(parcel, evu.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = a(parcel.readString(), parcel.readString(), ekp.a(parcel), (evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), ekp.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = a(parcel.readString(), parcel.readString(), (evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                d((evq) ekp.a(parcel, evq.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

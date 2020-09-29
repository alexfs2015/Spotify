package defpackage;

import android.os.Parcel;

/* renamed from: eij reason: default package */
public abstract class eij extends egx implements eig {
    public eij() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a(parcel.readInt());
                break;
            case 2:
                a((bnx) ehz.a(parcel, bnx.CREATOR), parcel.readString(), parcel.readString(), ehz.a(parcel));
                break;
            case 3:
                b(parcel.readInt());
                break;
            case 4:
                parcel.readString();
                parcel.readDouble();
                ehz.a(parcel);
                c();
                break;
            case 5:
                a(parcel.readString(), parcel.readString());
                break;
            case 6:
                a(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                d(parcel.readInt());
                break;
            case 8:
                c(parcel.readInt());
                break;
            case 9:
                e(parcel.readInt());
                break;
            case 10:
                parcel.readString();
                a(parcel.readLong(), parcel.readInt());
                break;
            case 11:
                parcel.readString();
                a(parcel.readLong());
                break;
            case 12:
                a((ehl) ehz.a(parcel, ehl.CREATOR));
                break;
            case 13:
                a((eib) ehz.a(parcel, eib.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}

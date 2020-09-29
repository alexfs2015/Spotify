package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: eid reason: default package */
public final class eid implements Creator<eib> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        bnx bnx = null;
        bro bro = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    d = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 5:
                    bnx = (bnx) SafeParcelReader.a(parcel2, readInt, bnx.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 7:
                    bro = (bro) SafeParcelReader.a(parcel2, readInt, bro.CREATOR);
                    break;
                case 8:
                    d2 = SafeParcelReader.g(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        eib eib = new eib(d, z, i, bnx, i2, bro, d2);
        return eib;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new eib[i];
    }
}

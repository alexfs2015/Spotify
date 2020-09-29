package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: eww reason: default package */
public final class eww implements Creator<ewv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ewv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        bwy bwy = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bwy = (bwy) SafeParcelReader.a(parcel, readInt, bwy.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ewv(i, bwy);
    }
}

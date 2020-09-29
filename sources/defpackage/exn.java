package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: exn reason: default package */
public final class exn implements Creator<exm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        bxp bxp = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bxp = (bxp) SafeParcelReader.a(parcel, readInt, bxp.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new exm(i, bxp);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new exm[i];
    }
}

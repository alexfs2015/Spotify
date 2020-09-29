package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cae reason: default package */
public final class cae implements Creator<brw> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new brw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i2 == 2) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                j = SafeParcelReader.e(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new brw(str, i, j);
    }
}

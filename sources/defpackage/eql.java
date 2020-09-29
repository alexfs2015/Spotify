package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: eql reason: default package */
public final class eql implements Creator<eqk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new eqk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        eqh eqh = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i == 3) {
                eqh = (eqh) SafeParcelReader.a(parcel, readInt, eqh.CREATOR);
            } else if (i == 4) {
                str2 = SafeParcelReader.h(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                j = SafeParcelReader.e(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        eqk eqk = new eqk(str, eqh, str2, j);
        return eqk;
    }
}

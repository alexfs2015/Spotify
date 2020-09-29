package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: erc reason: default package */
public final class erc implements Creator<erb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        eqy eqy = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i == 3) {
                eqy = (eqy) SafeParcelReader.a(parcel, readInt, eqy.CREATOR);
            } else if (i == 4) {
                str2 = SafeParcelReader.h(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                j = SafeParcelReader.e(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        erb erb = new erb(str, eqy, str2, j);
        return erb;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new erb[i];
    }
}

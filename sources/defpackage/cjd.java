package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cjd reason: default package */
public final class cjd implements Creator<cjc> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new cjc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        doy doy = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                doy = (doy) SafeParcelReader.a(parcel, readInt, doy.CREATOR);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cjc(doy, str);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bmc reason: default package */
public final class bmc implements Creator<blz> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new blz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i3 == 2) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i3 != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bundle = SafeParcelReader.j(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new blz(i, i2, bundle);
    }
}

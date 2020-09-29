package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ewp reason: default package */
public final class ewp implements Creator<ewo> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ewo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        Intent intent = null;
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
                intent = (Intent) SafeParcelReader.a(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new ewo(i, i2, intent);
    }
}

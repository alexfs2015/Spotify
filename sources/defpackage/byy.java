package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: byy reason: default package */
public final class byy implements Creator<bxr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i4 == 2) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i4 == 3) {
                i3 = SafeParcelReader.d(parcel, readInt);
            } else if (i4 != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.b(parcel, readInt, Scope.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bxr(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bxr[i];
    }
}

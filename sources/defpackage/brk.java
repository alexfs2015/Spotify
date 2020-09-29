package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brk reason: default package */
public final class brk implements Creator<bnt> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 2) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i4 == 3) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i4 != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                i3 = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bnt(i, i2, i3);
    }
}

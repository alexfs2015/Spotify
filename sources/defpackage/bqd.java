package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bqd reason: default package */
public final class bqd implements Creator<bpc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i2 == 3) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str2 = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bpc(str, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bpc[i];
    }
}

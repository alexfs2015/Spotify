package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dxi reason: default package */
public final class dxi implements Creator<dxh> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new dxh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i == 2) {
                strArr = SafeParcelReader.m(parcel, readInt);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                strArr2 = SafeParcelReader.m(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new dxh(str, strArr, strArr2);
    }
}

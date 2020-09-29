package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ckp reason: default package */
public final class ckp implements Creator<cko> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i2 != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                i = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cko(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cko[i];
    }
}

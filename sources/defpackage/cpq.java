package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cpq reason: default package */
public final class cpq implements Creator<cpp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i3 == 3) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i3 == 4) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i3 == 5) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i3 != 6) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                z2 = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        cpp cpp = new cpp(str, i, i2, z, z2);
        return cpp;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cpp[i];
    }
}

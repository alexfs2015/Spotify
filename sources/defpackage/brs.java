package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brs reason: default package */
public final class brs implements Creator<boa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new boa(z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new boa[i];
    }
}

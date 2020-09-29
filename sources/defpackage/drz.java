package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: drz reason: default package */
public final class drz implements Creator<dry> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new dry[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = SafeParcelReader.c(parcel, readInt);
            } else if (i == 3) {
                z2 = SafeParcelReader.c(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                z3 = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new dry(z, z2, z3);
    }
}

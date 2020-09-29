package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brn reason: default package */
public final class brn implements Creator<bro> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        brm brm = null;
        brm brm2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                brm = (brm) SafeParcelReader.a(parcel, readInt, brm.CREATOR);
            } else if (i != 3) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                brm2 = (brm) SafeParcelReader.a(parcel, readInt, brm.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bro(brm, brm2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bro[i];
    }
}

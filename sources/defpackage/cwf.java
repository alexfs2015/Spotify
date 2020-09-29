package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: cwf reason: default package */
public final class cwf implements Creator<cwe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i2 != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                bArr = SafeParcelReader.k(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new cwe(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cwe[i];
    }
}

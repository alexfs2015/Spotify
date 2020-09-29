package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brq reason: default package */
public final class brq implements Creator<brr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                i = SafeParcelReader.d(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new brr(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new brr[i];
    }
}

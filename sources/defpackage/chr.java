package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: chr reason: default package */
public final class chr implements Creator<chq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new chq(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new chq[i];
    }
}

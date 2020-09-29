package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dsm reason: default package */
public final class dsm implements Creator<dsl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 15) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                str = SafeParcelReader.h(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new dsl(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dsl[i];
    }
}

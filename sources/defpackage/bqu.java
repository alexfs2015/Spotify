package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bqu reason: default package */
public final class bqu implements Creator<bqv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bqv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                f = SafeParcelReader.f(parcel, readInt);
            } else if (i == 3) {
                f2 = SafeParcelReader.f(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                f3 = SafeParcelReader.f(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bqv(f, f2, f3);
    }
}

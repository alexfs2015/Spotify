package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: big reason: default package */
public final class big implements Creator<bif> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bif[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 3:
                    z2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.h(parcel, readInt);
                    break;
                case 5:
                    z3 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    f = SafeParcelReader.f(parcel, readInt);
                    break;
                case 7:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 8:
                    z4 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 9:
                    z5 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 10:
                    z6 = SafeParcelReader.c(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        bif bif = new bif(z, z2, str, z3, f, i, z4, z5, z6);
        return bif;
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dpu reason: default package */
public final class dpu implements Creator<dpt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        dpt[] dptArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.h(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    i3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    i4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 8:
                    dptArr = (dpt[]) SafeParcelReader.b(parcel, readInt, dpt.CREATOR);
                    break;
                case 9:
                    z2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 10:
                    z3 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 11:
                    z4 = SafeParcelReader.c(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        dpt dpt = new dpt(str, i, i2, z, i3, i4, dptArr, z2, z3, z4);
        return dpt;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dpt[i];
    }
}
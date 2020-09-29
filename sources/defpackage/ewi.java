package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ewi reason: default package */
public final class ewi implements Creator<ewh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j5 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 4:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 7:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 8:
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 9:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 10:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 11:
                    j5 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 12:
                    str6 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 13:
                    j3 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 14:
                    j4 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 15:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 16:
                    z3 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 17:
                    z4 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 18:
                    z5 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 19:
                    str7 = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        ewh ewh = new ewh(str, str2, str3, str4, j, j2, str5, z, z2, j5, str6, j3, j4, i, z3, z4, z5, str7);
        return ewh;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ewh[i];
    }
}

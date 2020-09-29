package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brk reason: default package */
public final class brk implements Creator<bnu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boj boj = null;
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
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    str6 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 9:
                    str7 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 10:
                    str8 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 11:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 12:
                    str9 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 13:
                    boj = (boj) SafeParcelReader.a(parcel2, readInt, boj.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        bnu bnu = new bnu(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, boj);
        return bnu;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bnu[i];
    }
}

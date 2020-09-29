package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: evv reason: default package */
public final class evv implements Creator<evu> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new evu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        evj evj = null;
        String str3 = null;
        eqk eqk = null;
        eqk eqk2 = null;
        eqk eqk3 = null;
        boolean z = false;
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
                    evj = (evj) SafeParcelReader.a(parcel2, readInt, evj.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    eqk = (eqk) SafeParcelReader.a(parcel2, readInt, eqk.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 10:
                    eqk2 = (eqk) SafeParcelReader.a(parcel2, readInt, eqk.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 12:
                    eqk3 = (eqk) SafeParcelReader.a(parcel2, readInt, eqk.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        evu evu = new evu(str, str2, evj, j, z, str3, eqk, j2, eqk2, j3, eqk3);
        return evu;
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dns reason: default package */
public final class dns implements Creator<dnr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 7:
                    bundle = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 8:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 9:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        dnr dnr = new dnr(str, j, str2, str3, str4, bundle, z, j2);
        return dnr;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dnr[i];
    }
}

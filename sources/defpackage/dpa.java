package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: dpa reason: default package */
public final class dpa implements Creator<doy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new doy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        List list = null;
        String str = null;
        dru dru = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 3:
                    bundle = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 5:
                    list = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 7:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 8:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 9:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 10:
                    dru = (dru) SafeParcelReader.a(parcel2, readInt, dru.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.a(parcel2, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 15:
                    list2 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 16:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 17:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 18:
                    z3 = SafeParcelReader.c(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        doy doy = new doy(i, j, bundle, i2, list, z, i3, z2, str, dru, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        return doy;
    }
}

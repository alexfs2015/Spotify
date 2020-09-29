package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: cfw reason: default package */
public final class cfw implements Creator<cfu> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new cfu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        Bundle bundle = null;
        doy doy = null;
        dpc dpc = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        coy coy = null;
        Bundle bundle2 = null;
        int i2 = 0;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        dup dup = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        drf drf = null;
        boolean z6 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z7 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        ArrayList arrayList6 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 2:
                    bundle = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 3:
                    doy = (doy) SafeParcelReader.a(parcel2, readInt, doy.CREATOR);
                    break;
                case 4:
                    dpc = (dpc) SafeParcelReader.a(parcel2, readInt, dpc.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.a(parcel2, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.a(parcel2, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 9:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 10:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 11:
                    coy = (coy) SafeParcelReader.a(parcel2, readInt, coy.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 13:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 14:
                    arrayList = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 16:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 18:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 19:
                    i4 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 20:
                    f = SafeParcelReader.f(parcel2, readInt);
                    break;
                case 21:
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 25:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 26:
                    str6 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 28:
                    str7 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 29:
                    dup = (dup) SafeParcelReader.a(parcel2, readInt, dup.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 31:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 33:
                    str8 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 34:
                    f2 = SafeParcelReader.f(parcel2, readInt);
                    break;
                case 35:
                    i5 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 36:
                    i6 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 37:
                    z3 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 38:
                    z4 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 39:
                    str9 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 40:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 41:
                    str10 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 42:
                    z5 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 43:
                    i7 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 45:
                    str11 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 46:
                    drf = (drf) SafeParcelReader.a(parcel2, readInt, drf.CREATOR);
                    break;
                case 47:
                    z6 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 49:
                    str12 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 50:
                    str13 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 51:
                    str14 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 52:
                    z7 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 53:
                    int a2 = SafeParcelReader.a(parcel2, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i9 = 0; i9 < readInt2; i9++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel2.setDataPosition(dataPosition + a2);
                        arrayList4 = arrayList7;
                        break;
                    } else {
                        arrayList4 = null;
                        break;
                    }
                case 54:
                    str15 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 55:
                    arrayList5 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 56:
                    i8 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 57:
                    z8 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 58:
                    z9 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 59:
                    z10 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case b.bo /*60*/:
                    arrayList6 = SafeParcelReader.n(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        cfu cfu = new cfu(i, bundle, doy, dpc, str, applicationInfo, packageInfo, str2, str3, str4, coy, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, dup, arrayList3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, drf, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i8, z8, z9, z10, arrayList6);
        return cfu;
    }
}

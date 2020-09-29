package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: cfz reason: default package */
public final class cfz implements Creator<cfy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new cfy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        cgk cgk = null;
        String str7 = null;
        String str8 = null;
        cjx cjx = null;
        List list4 = null;
        List list5 = null;
        cga cga = null;
        String str9 = null;
        List list6 = null;
        String str10 = null;
        ckh ckh = null;
        String str11 = null;
        Bundle bundle = null;
        List list7 = null;
        String str12 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        boolean z16 = false;
        boolean z17 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 4:
                    list = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 5:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 6:
                    list2 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 7:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 8:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 9:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 10:
                    list3 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 11:
                    j3 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 12:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 13:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 14:
                    j4 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 15:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 18:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 19:
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 21:
                    str6 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 22:
                    z3 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 23:
                    z4 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 24:
                    z5 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 25:
                    z6 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 26:
                    z7 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 28:
                    cgk = (cgk) SafeParcelReader.a(parcel2, readInt, cgk.CREATOR);
                    break;
                case 29:
                    str7 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 30:
                    str8 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 31:
                    z8 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 32:
                    z9 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 33:
                    cjx = (cjx) SafeParcelReader.a(parcel2, readInt, cjx.CREATOR);
                    break;
                case 34:
                    list4 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 35:
                    list5 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 36:
                    z10 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 37:
                    cga = (cga) SafeParcelReader.a(parcel2, readInt, cga.CREATOR);
                    break;
                case 38:
                    z11 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 39:
                    str9 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 40:
                    list6 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 42:
                    z12 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 43:
                    str10 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 44:
                    ckh = (ckh) SafeParcelReader.a(parcel2, readInt, ckh.CREATOR);
                    break;
                case 45:
                    str11 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 46:
                    z13 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 47:
                    z14 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 48:
                    bundle = SafeParcelReader.j(parcel2, readInt);
                    break;
                case 49:
                    z15 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 50:
                    i4 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 51:
                    z16 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 52:
                    list7 = SafeParcelReader.n(parcel2, readInt);
                    break;
                case 53:
                    z17 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 54:
                    str12 = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        cfy cfy = new cfy(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, cgk, str7, str8, z8, z9, cjx, list4, list5, z10, cga, z11, str9, list6, z12, str10, ckh, str11, z13, z14, bundle, z15, i4, z16, list7, z17, str12);
        return cfy;
    }
}

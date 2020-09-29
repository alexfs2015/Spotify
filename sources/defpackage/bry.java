package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bry reason: default package */
public final class bry implements Creator<bnv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String[] strArr = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = SafeParcelReader.e(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.h(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.e(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    strArr = SafeParcelReader.m(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.c(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        bnv bnv = new bnv(j, str, j2, z, strArr, z2);
        return bnv;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bnv[i];
    }
}

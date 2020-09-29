package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: ckz reason: default package */
public final class ckz implements Creator<cky> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        boolean z = false;
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
                    str2 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    list = SafeParcelReader.n(parcel, readInt);
                    break;
                case 7:
                    z3 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 8:
                    z4 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 9:
                    list2 = SafeParcelReader.n(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        cky cky = new cky(str, str2, z, z2, list, z3, z4, list2);
        return cky;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cky[i];
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: evk reason: default package */
public final class evk implements Creator<evj> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new evj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
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
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 4:
                    int a2 = SafeParcelReader.a(parcel2, readInt);
                    if (a2 != 0) {
                        SafeParcelReader.a(parcel2, a2, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l = null;
                        break;
                    }
                case 5:
                    int a3 = SafeParcelReader.a(parcel2, readInt);
                    if (a3 != 0) {
                        SafeParcelReader.a(parcel2, a3, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case 6:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    int a4 = SafeParcelReader.a(parcel2, readInt);
                    if (a4 != 0) {
                        SafeParcelReader.a(parcel2, a4, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        evj evj = new evj(i, str, j, l, f, str2, str3, d);
        return evj;
    }
}

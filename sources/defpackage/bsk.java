package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: bsk reason: default package */
public final class bsk implements Creator<CastDevice> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
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
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 7:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 8:
                    list = SafeParcelReader.c(parcel2, readInt, bwu.CREATOR);
                    break;
                case 9:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 10:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 11:
                    str6 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 12:
                    str7 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 13:
                    i4 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 14:
                    str8 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 15:
                    bArr = SafeParcelReader.k(parcel2, readInt);
                    break;
                case 16:
                    str9 = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        CastDevice castDevice = new CastDevice(str, str2, str3, str4, str5, i, list, i2, i3, str6, str7, i4, str8, bArr, str9);
        return castDevice;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}

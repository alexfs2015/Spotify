package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bgr reason: default package */
public final class bgr implements Creator<bgs> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bgs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
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
                    str3 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 7:
                    str6 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 8:
                    str7 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) SafeParcelReader.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        bgs bgs = new bgs(str, str2, str3, str4, str5, str6, str7, intent);
        return bgs;
    }
}

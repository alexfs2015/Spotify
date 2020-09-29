package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brz reason: default package */
public final class brz implements Creator<boi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    f = SafeParcelReader.f(parcel2, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 4:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 5:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 6:
                    i4 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 7:
                    i5 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 8:
                    i6 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 9:
                    i7 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 10:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 11:
                    i8 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 12:
                    i9 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 13:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        boi boi = new boi(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
        return boi;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new boi[i];
    }
}

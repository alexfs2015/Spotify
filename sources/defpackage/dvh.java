package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: dvh reason: default package */
public final class dvh implements Creator<dvg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        dsp dsp = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 3:
                    i2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    z2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    i3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    dsp = (dsp) SafeParcelReader.a(parcel, readInt, dsp.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        dvg dvg = new dvg(i, z, i2, z2, i3, dsp);
        return dvg;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dvg[i];
    }
}

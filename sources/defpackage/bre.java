package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bre reason: default package */
public final class bre implements Creator<bno> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bno[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 6:
                    d2 = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 7:
                    d3 = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 8:
                    jArr = SafeParcelReader.l(parcel2, readInt);
                    break;
                case 9:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        bno bno = new bno(mediaInfo, i, z, d, d2, d3, jArr, str);
        return bno;
    }
}

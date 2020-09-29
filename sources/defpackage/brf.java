package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: brf reason: default package */
public final class brf implements Creator<bnq> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        List list = null;
        bnf bnf = null;
        bnt bnt = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.a(parcel2, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 7:
                    i3 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 8:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 9:
                    j3 = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 10:
                    d2 = SafeParcelReader.g(parcel2, readInt);
                    break;
                case 11:
                    z = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 12:
                    jArr = SafeParcelReader.l(parcel2, readInt);
                    break;
                case 13:
                    i4 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 14:
                    i5 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 15:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 16:
                    i6 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 17:
                    list = SafeParcelReader.c(parcel2, readInt, bno.CREATOR);
                    break;
                case 18:
                    z2 = SafeParcelReader.c(parcel2, readInt);
                    break;
                case 19:
                    bnf = (bnf) SafeParcelReader.a(parcel2, readInt, bnf.CREATOR);
                    break;
                case 20:
                    bnt = (bnt) SafeParcelReader.a(parcel2, readInt, bnt.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        bnq bnq = new bnq(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, list, z2, bnf, bnt);
        return bnq;
    }
}

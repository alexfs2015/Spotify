package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: brt reason: default package */
public final class brt implements Creator<MediaInfo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        boc boc = null;
        List list = null;
        boi boi = null;
        String str3 = null;
        List list2 = null;
        List list3 = null;
        String str4 = null;
        boj boj = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 5:
                    boc = (boc) SafeParcelReader.a(parcel2, readInt, boc.CREATOR);
                    break;
                case 6:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 7:
                    list = SafeParcelReader.c(parcel2, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    boi = (boi) SafeParcelReader.a(parcel2, readInt, boi.CREATOR);
                    break;
                case 9:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 10:
                    list2 = SafeParcelReader.c(parcel2, readInt, bnv.CREATOR);
                    break;
                case 11:
                    list3 = SafeParcelReader.c(parcel2, readInt, bnu.CREATOR);
                    break;
                case 12:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 13:
                    boj = (boj) SafeParcelReader.a(parcel2, readInt, boj.CREATOR);
                    break;
                case 14:
                    j2 = SafeParcelReader.e(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        MediaInfo mediaInfo = new MediaInfo(str, i, str2, boc, j, list, boi, str3, list2, list3, str4, boj, j2);
        return mediaInfo;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}

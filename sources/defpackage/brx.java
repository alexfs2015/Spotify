package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: brx reason: default package */
public final class brx implements Creator<MediaTrack> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 7:
                    str4 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    i2 = SafeParcelReader.d(parcel2, readInt);
                    break;
                case 9:
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        MediaTrack mediaTrack = new MediaTrack(j, i, str, str2, str3, str4, i2, str5);
        return mediaTrack;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }
}

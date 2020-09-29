package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: bsd reason: default package */
public final class bsd implements Creator<bnx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
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
                    SafeParcelReader.c(parcel, readInt, bwu.CREATOR);
                    break;
                case 5:
                    list = SafeParcelReader.n(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) SafeParcelReader.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        bnx bnx = new bnx(str, str2, list, str3, uri, str4);
        return bnx;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bnx[i];
    }
}

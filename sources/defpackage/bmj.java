package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: bmj reason: default package */
public final class bmj implements Creator<Credential> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = SafeParcelReader.h(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    list = SafeParcelReader.c(parcel, readInt, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 9:
                    str5 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 10:
                    str6 = SafeParcelReader.h(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        Credential credential = new Credential(str, str2, uri, list, str3, str4, str5, str6);
        return credential;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}

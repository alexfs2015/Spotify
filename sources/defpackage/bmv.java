package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: bmv reason: default package */
public final class bmv implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel2, readInt);
                    break;
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
                    uri = (Uri) SafeParcelReader.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 8:
                    j = SafeParcelReader.e(parcel2, readInt);
                    break;
                case 9:
                    str6 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 10:
                    list = SafeParcelReader.c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.h(parcel2, readInt);
                    break;
                case 12:
                    str8 = SafeParcelReader.h(parcel2, readInt);
                    break;
                default:
                    SafeParcelReader.b(parcel2, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel2, a);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
        return googleSignInAccount;
    }
}

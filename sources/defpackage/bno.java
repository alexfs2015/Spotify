package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: bno reason: default package */
public final class bno implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    arrayList = SafeParcelReader.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    z2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    z3 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 7:
                    str = SafeParcelReader.h(parcel, readInt);
                    break;
                case 8:
                    str2 = SafeParcelReader.h(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.c(parcel, readInt, bmq.CREATOR);
                    break;
                default:
                    SafeParcelReader.b(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
        return googleSignInOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}

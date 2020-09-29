package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: byw reason: default package */
public final class byw implements Creator<bxp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) SafeParcelReader.a(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (i3 != 4) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bxp(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new bxp[i];
    }
}

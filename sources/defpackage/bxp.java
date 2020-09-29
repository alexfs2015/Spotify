package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bxp reason: default package */
public final class bxp extends bxw {
    public static final Creator<bxp> CREATOR = new byw();
    private final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    bxp(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public bxp(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.a(parcel, 2, (Parcelable) this.b, i, false);
        bxx.b(parcel, 3, this.c);
        bxx.a(parcel, 4, (Parcelable) this.d, i, false);
        bxx.b(parcel, a2);
    }
}

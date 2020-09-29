package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: bwy reason: default package */
public final class bwy extends bxf {
    public static final Creator<bwy> CREATOR = new byf();
    private final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    bwy(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public bwy(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.a(parcel, 2, (Parcelable) this.b, i, false);
        bxg.b(parcel, 3, this.c);
        bxg.a(parcel, 4, (Parcelable) this.d, i, false);
        bxg.b(parcel, a2);
    }
}

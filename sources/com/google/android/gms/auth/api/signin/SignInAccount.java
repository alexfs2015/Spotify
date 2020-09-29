package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends bxf implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new bmy();
    public GoogleSignInAccount a;
    @Deprecated
    private String b;
    @Deprecated
    private String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.a = googleSignInAccount;
        this.b = bwx.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.c = bwx.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 4, this.b, false);
        bxg.a(parcel, 7, (Parcelable) this.a, i, false);
        bxg.a(parcel, 8, this.c, false);
        bxg.b(parcel, a2);
    }
}

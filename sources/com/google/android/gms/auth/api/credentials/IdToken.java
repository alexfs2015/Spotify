package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class IdToken extends bxf implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new blw();
    private final String a;
    private final String b;

    public IdToken(String str, String str2) {
        bwx.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        bwx.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return bwv.a(this.a, idToken.a) && bwv.a(this.b, idToken.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a, false);
        bxg.a(parcel, 2, this.b, false);
        bxg.b(parcel, a2);
    }
}

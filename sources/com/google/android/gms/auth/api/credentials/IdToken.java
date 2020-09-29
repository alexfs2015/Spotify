package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class IdToken extends bxw implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new bmn();
    private final String a;
    private final String b;

    public IdToken(String str, String str2) {
        bxo.b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        bxo.b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
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
        return bxm.a(this.a, idToken.a) && bxm.a(this.b, idToken.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a, false);
        bxx.a(parcel, 2, this.b, false);
        bxx.b(parcel, a2);
    }
}

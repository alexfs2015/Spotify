package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends bxw implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new bnk();
    GoogleSignInOptions a;
    private final String b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.b = bxo.a(str);
        this.a = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.b.equals(signInConfiguration.b)) {
            GoogleSignInOptions googleSignInOptions = this.a;
            if (googleSignInOptions != null ? googleSignInOptions.equals(signInConfiguration.a) : signInConfiguration.a == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new bmr().a((Object) this.b).a((Object) this.a).a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.b, false);
        bxx.a(parcel, 5, (Parcelable) this.a, i, false);
        bxx.b(parcel, a2);
    }
}

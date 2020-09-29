package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bnk reason: default package */
public final class bnk implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.h(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.b(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.a(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}

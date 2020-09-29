package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ews reason: default package */
public abstract class ews extends egc implements ewr {
    public ews() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            egd.a(parcel, ConnectionResult.CREATOR);
            egd.a(parcel, ewo.CREATOR);
        } else if (i == 4) {
            egd.a(parcel, Status.CREATOR);
        } else if (i == 6) {
            egd.a(parcel, Status.CREATOR);
        } else if (i == 7) {
            egd.a(parcel, Status.CREATOR);
            egd.a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            a((ewx) egd.a(parcel, ewx.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

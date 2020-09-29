package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: exj reason: default package */
public abstract class exj extends egt implements exi {
    public exj() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            egu.a(parcel, ConnectionResult.CREATOR);
            egu.a(parcel, exf.CREATOR);
        } else if (i == 4) {
            egu.a(parcel, Status.CREATOR);
        } else if (i == 6) {
            egu.a(parcel, Status.CREATOR);
        } else if (i == 7) {
            egu.a(parcel, Status.CREATOR);
            egu.a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            a((exo) egu.a(parcel, exo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

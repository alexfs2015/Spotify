package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: bng reason: default package */
public abstract class bng extends efs implements bnf {
    public bng() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                eft.a(parcel, GoogleSignInAccount.CREATOR);
                eft.a(parcel, Status.CREATOR);
                a();
                break;
            case 102:
                eft.a(parcel, Status.CREATOR);
                b();
                break;
            case 103:
                a((Status) eft.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

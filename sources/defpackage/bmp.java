package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: bmp reason: default package */
public abstract class bmp extends efb implements bmo {
    public bmp() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                efc.a(parcel, GoogleSignInAccount.CREATOR);
                efc.a(parcel, Status.CREATOR);
                a();
                break;
            case 102:
                efc.a(parcel, Status.CREATOR);
                b();
                break;
            case 103:
                a((Status) efc.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

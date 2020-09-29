package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: efr reason: default package */
public abstract class efr extends efb implements efq {
    public efr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) efc.a(parcel, Status.CREATOR), (Credential) efc.a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            a((Status) efc.a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            efc.a(parcel, Status.CREATOR);
            parcel.readString();
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}

package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: egi reason: default package */
public abstract class egi extends efs implements egh {
    public egi() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) eft.a(parcel, Status.CREATOR), (Credential) eft.a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            a((Status) eft.a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            eft.a(parcel, Status.CREATOR);
            parcel.readString();
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}

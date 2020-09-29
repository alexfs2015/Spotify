package defpackage;

import android.os.Parcel;

/* renamed from: bne reason: default package */
public abstract class bne extends efs implements bnd {
    public bne() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a();
        } else if (i != 2) {
            return false;
        } else {
            b();
        }
        return true;
    }
}

package defpackage;

import android.os.Parcel;

/* renamed from: bmn reason: default package */
public abstract class bmn extends efb implements bmm {
    public bmn() {
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

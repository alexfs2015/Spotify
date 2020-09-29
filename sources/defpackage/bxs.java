package defpackage;

import android.os.Parcel;

/* renamed from: bxs reason: default package */
public abstract class bxs extends egc implements bxr {
    public bxs() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}

package defpackage;

import android.os.Parcel;

/* renamed from: byj reason: default package */
public abstract class byj extends egt implements byi {
    public byj() {
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

package defpackage;

import android.os.Parcel;

/* renamed from: cgg reason: default package */
public abstract class cgg extends djy implements cgf {
    public cgg() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((cfy) djz.a(parcel, cfy.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

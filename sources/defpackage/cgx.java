package defpackage;

import android.os.Parcel;

/* renamed from: cgx reason: default package */
public abstract class cgx extends dkp implements cgw {
    public cgx() {
        super("com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((cgp) dkq.a(parcel, cgp.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

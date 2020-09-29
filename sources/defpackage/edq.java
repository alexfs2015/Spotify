package defpackage;

import android.os.Parcel;

/* renamed from: edq reason: default package */
public abstract class edq extends dkp implements edp {
    public edq() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int a = a();
        parcel2.writeNoException();
        parcel2.writeInt(a);
        return true;
    }
}

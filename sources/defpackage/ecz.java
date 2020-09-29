package defpackage;

import android.os.Parcel;

/* renamed from: ecz reason: default package */
public abstract class ecz extends djy implements ecy {
    public ecz() {
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

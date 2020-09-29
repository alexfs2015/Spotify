package defpackage;

import android.os.Parcel;

/* renamed from: dqj reason: default package */
public abstract class dqj extends djy implements dqi {
    public dqj() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }
}

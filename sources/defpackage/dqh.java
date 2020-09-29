package defpackage;

import android.os.Parcel;

/* renamed from: dqh reason: default package */
public abstract class dqh extends dkp implements dqg {
    public dqh() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
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

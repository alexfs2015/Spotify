package defpackage;

import android.os.Parcel;

/* renamed from: cjd reason: default package */
public abstract class cjd extends dkp implements cjc {
    public cjd() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String a = a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i != 2) {
            return false;
        } else {
            int b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}

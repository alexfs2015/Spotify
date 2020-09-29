package defpackage;

import android.os.Parcel;

/* renamed from: dru reason: default package */
public abstract class dru extends dkp implements drt {
    public dru() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a();
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            c();
        } else if (i == 4) {
            d();
        } else if (i != 5) {
            return false;
        } else {
            a(dkq.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}

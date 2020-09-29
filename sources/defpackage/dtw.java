package defpackage;

import android.os.Parcel;

/* renamed from: dtw reason: default package */
public abstract class dtw extends dkp implements dtv {
    public dtw() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = a();
        } else if (i != 2) {
            if (i == 3) {
                a(a.a(parcel.readStrongBinder()));
            } else if (i == 4) {
                c();
            } else if (i != 5) {
                return false;
            } else {
                d();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = b();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}

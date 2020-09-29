package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvs reason: default package */
public abstract class dvs extends dkp implements dvr {
    public dvs() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static dvr a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof dvr ? (dvr) queryLocalInterface : new dvt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            cbi a = a();
            parcel2.writeNoException();
            dkq.a(parcel2, (IInterface) a);
        } else if (i == 2) {
            Uri b = b();
            parcel2.writeNoException();
            dkq.b(parcel2, b);
        } else if (i != 3) {
            return false;
        } else {
            double c = c();
            parcel2.writeNoException();
            parcel2.writeDouble(c);
        }
        return true;
    }
}

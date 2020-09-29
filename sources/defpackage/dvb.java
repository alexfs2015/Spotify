package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvb reason: default package */
public abstract class dvb extends djy implements dva {
    public dvb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static dva a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof dva ? (dva) queryLocalInterface : new dvc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            car a = a();
            parcel2.writeNoException();
            djz.a(parcel2, (IInterface) a);
        } else if (i == 2) {
            Uri b = b();
            parcel2.writeNoException();
            djz.b(parcel2, b);
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

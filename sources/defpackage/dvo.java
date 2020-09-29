package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: dvo reason: default package */
public abstract class dvo extends dkp implements dvn {
    public dvo() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static dvn a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof dvn ? (dvn) queryLocalInterface : new dvp(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String a = a();
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i != 3) {
            return false;
        } else {
            List b = b();
            parcel2.writeNoException();
            parcel2.writeList(b);
        }
        return true;
    }
}

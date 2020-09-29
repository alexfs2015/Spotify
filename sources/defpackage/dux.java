package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: dux reason: default package */
public abstract class dux extends djy implements duw {
    public dux() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static duw a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof duw ? (duw) queryLocalInterface : new duy(iBinder);
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

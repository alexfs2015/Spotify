package defpackage;

import android.os.Parcel;

/* renamed from: dpw reason: default package */
public abstract class dpw extends djy implements dpv {
    public dpw() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i != 1) {
            if (i == 2) {
                str = a();
            } else if (i == 3) {
                boolean c = c();
                parcel2.writeNoException();
                djz.a(parcel2, c);
                return true;
            } else if (i == 4) {
                str = b();
            } else if (i != 5) {
                return false;
            } else {
                a((doy) djz.a(parcel, doy.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        a((doy) djz.a(parcel, doy.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

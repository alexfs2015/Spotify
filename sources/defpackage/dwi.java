package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwi reason: default package */
public abstract class dwi extends djy implements dwh {
    public dwi() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        dvw dvw;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            dvw = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            dvw = queryLocalInterface instanceof dvw ? (dvw) queryLocalInterface : new dvy(readStrongBinder);
        }
        a(dvw, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}

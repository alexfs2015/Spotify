package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: byt reason: default package */
public final class byt extends eiw implements bws {
    byt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        Parcel c = c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        eiy.a(c, (Parcelable) bundle);
        b(1, c);
    }

    public final void a(int i, Bundle bundle) {
        Parcel c = c();
        c.writeInt(i);
        eiy.a(c, (Parcelable) bundle);
        b(2, c);
    }

    public final void a(int i, IBinder iBinder, byj byj) {
        Parcel c = c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        eiy.a(c, (Parcelable) byj);
        b(3, c);
    }
}

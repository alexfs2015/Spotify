package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bzk reason: default package */
public final class bzk extends ejn implements bxj {
    bzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void a(int i, Bundle bundle) {
        Parcel c = c();
        c.writeInt(i);
        ejp.a(c, (Parcelable) bundle);
        b(2, c);
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        Parcel c = c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        ejp.a(c, (Parcelable) bundle);
        b(1, c);
    }

    public final void a(int i, IBinder iBinder, bza bza) {
        Parcel c = c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        ejp.a(c, (Parcelable) bza);
        b(3, c);
    }
}

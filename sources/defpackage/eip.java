package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: eip reason: default package */
public final class eip extends egt implements eiq {
    eip(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    public final void a(String str, Bundle bundle) {
        Parcel e = e();
        e.writeString(str);
        ehi.a(e, (Parcelable) bundle);
        b(1, e);
    }

    public final void b(String str, Bundle bundle) {
        Parcel e = e();
        e.writeString(str);
        ehi.a(e, (Parcelable) bundle);
        b(2, e);
    }

    public final void c(String str, Bundle bundle) {
        Parcel e = e();
        e.writeString(str);
        ehi.a(e, (Parcelable) bundle);
        b(3, e);
    }

    public final void d(String str, Bundle bundle) {
        Parcel e = e();
        e.writeString(str);
        ehi.a(e, (Parcelable) bundle);
        b(4, e);
    }

    public final void a(String str, Bundle bundle, int i) {
        Parcel e = e();
        e.writeString(str);
        ehi.a(e, (Parcelable) bundle);
        e.writeInt(i);
        b(6, e);
    }
}

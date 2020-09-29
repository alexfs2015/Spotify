package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: emz reason: default package */
public final class emz extends ekn implements elm {
    emz(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle a(Bundle bundle) {
        Parcel a = a();
        ekp.a(a, (Parcelable) bundle);
        Parcel a2 = a(1, a);
        Bundle bundle2 = (Bundle) ekp.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle2;
    }
}

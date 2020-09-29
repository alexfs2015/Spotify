package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dvc reason: default package */
public final class dvc extends djx implements dva {
    dvc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final car a() {
        Parcel a = a(1, K_());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Uri b() {
        Parcel a = a(2, K_());
        Uri uri = (Uri) djz.a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    public final double c() {
        Parcel a = a(3, K_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}

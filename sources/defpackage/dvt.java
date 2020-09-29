package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dvt reason: default package */
public final class dvt extends dko implements dvr {
    dvt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final cbi a() {
        Parcel a = a(1, K_());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Uri b() {
        Parcel a = a(2, K_());
        Uri uri = (Uri) dkq.a(a, Uri.CREATOR);
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

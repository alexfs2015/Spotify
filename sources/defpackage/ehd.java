package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ehd reason: default package */
public final class ehd extends ehk implements ehb {
    ehd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    public final Bitmap a(Uri uri) {
        Parcel e = e();
        ehz.a(e, (Parcelable) uri);
        Parcel a = a(1, e);
        Bitmap bitmap = (Bitmap) ehz.a(a, Bitmap.CREATOR);
        a.recycle();
        return bitmap;
    }
}

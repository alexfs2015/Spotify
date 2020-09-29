package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: egm reason: default package */
public final class egm extends egt implements egk {
    egm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    public final Bitmap a(Uri uri) {
        Parcel e = e();
        ehi.a(e, (Parcelable) uri);
        Parcel a = a(1, e);
        Bitmap bitmap = (Bitmap) ehi.a(a, Bitmap.CREATOR);
        a.recycle();
        return bitmap;
    }
}

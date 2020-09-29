package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ehb reason: default package */
public interface ehb extends IInterface {

    /* renamed from: ehb$a */
    public static abstract class a extends egx implements ehb {
        public static ehb a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            return queryLocalInterface instanceof ehb ? (ehb) queryLocalInterface : new ehd(iBinder);
        }
    }

    Bitmap a(Uri uri);
}

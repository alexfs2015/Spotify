package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: egk reason: default package */
public interface egk extends IInterface {

    /* renamed from: egk$a */
    public static abstract class a extends egg implements egk {
        public static egk a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof egk) {
                return (egk) queryLocalInterface;
            }
            return new egm(iBinder);
        }
    }

    Bitmap a(Uri uri);
}

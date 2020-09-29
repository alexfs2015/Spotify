package defpackage;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.util.Map;

/* renamed from: eiw reason: default package */
public final class eiw {
    private static final ein a = new ein("CastDynamiteModule", 0);

    public static bqt a(Context context, bon bon, ejf ejf, Map<String, IBinder> map) {
        try {
            return a(context).a(cbj.a(context.getApplicationContext()), bon, ejf, map);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newCastContextImpl", ejd.class.getSimpleName());
            return null;
        }
    }

    public static bqu a(Context context, bon bon, cbi cbi, bqs bqs) {
        try {
            return a(context).a(bon, cbi, bqs);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", ejd.class.getSimpleName());
            return null;
        }
    }

    public static brb a(Service service, cbi cbi, cbi cbi2) {
        try {
            return a(service.getApplicationContext()).a(cbj.a(service), cbi, cbi2);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", ejd.class.getSimpleName());
            return null;
        }
    }

    public static brc a(Context context, String str, String str2, bqk bqk) {
        try {
            return a(context).a(str, str2, bqk);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newSessionImpl", ejd.class.getSimpleName());
            return null;
        }
    }

    public static ehb a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, ehc ehc, int i, int i2, boolean z) {
        try {
            return a(context.getApplicationContext()).a(cbj.a(asyncTask), ehc, i, i2, z, 2097152, 5, 333, 10000);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", ejd.class.getSimpleName());
            return null;
        }
    }

    private static ejd a(Context context) {
        try {
            IBinder a2 = DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.cast.framework.dynamite").a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof ejd ? (ejd) queryLocalInterface : new ejc(a2);
        } catch (LoadingException e) {
            throw new RuntimeException(e);
        }
    }
}

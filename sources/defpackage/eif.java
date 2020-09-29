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

/* renamed from: eif reason: default package */
public final class eif {
    private static final ehw a = new ehw("CastDynamiteModule", 0);

    public static bqc a(Context context, bnw bnw, eio eio, Map<String, IBinder> map) {
        try {
            return a(context).a(cas.a(context.getApplicationContext()), bnw, eio, map);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newCastContextImpl", eim.class.getSimpleName());
            return null;
        }
    }

    public static bql a(Context context, String str, String str2, bpt bpt) {
        try {
            return a(context).a(str, str2, bpt);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newSessionImpl", eim.class.getSimpleName());
            return null;
        }
    }

    public static bqd a(Context context, bnw bnw, car car, bqb bqb) {
        try {
            return a(context).a(bnw, car, bqb);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newCastSessionImpl", eim.class.getSimpleName());
            return null;
        }
    }

    public static bqk a(Service service, car car, car car2) {
        try {
            return a(service.getApplicationContext()).a(cas.a(service), car, car2);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", eim.class.getSimpleName());
            return null;
        }
    }

    public static egk a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, egl egl, int i, int i2, boolean z) {
        try {
            return a(context.getApplicationContext()).a(cas.a(asyncTask), egl, i, i2, z, 2097152, 5, 333, 10000);
        } catch (RemoteException e) {
            a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", eim.class.getSimpleName());
            return null;
        }
    }

    private static eim a(Context context) {
        try {
            IBinder a2 = DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.cast.framework.dynamite").a("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            if (queryLocalInterface instanceof eim) {
                return (eim) queryLocalInterface;
            }
            return new eil(a2);
        } catch (LoadingException e) {
            throw new RuntimeException(e);
        }
    }
}

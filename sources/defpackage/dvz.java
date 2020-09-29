package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import java.util.WeakHashMap;

@cey
/* renamed from: dvz reason: default package */
public final class dvz implements bfd {
    private static WeakHashMap<IBinder, dvz> b = new WeakHashMap<>();
    final dvw a;
    private final MediaView c;
    private final beu d = new beu();

    private dvz(dvw dvw) {
        Context context;
        String str = "";
        this.a = dvw;
        MediaView mediaView = null;
        try {
            context = (Context) cas.a(dvw.e());
        } catch (RemoteException | NullPointerException e) {
            cow.a(str, e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.a.a(cas.a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                cow.a(str, e2);
            }
        }
        this.c = mediaView;
    }

    public static dvz a(dvw dvw) {
        synchronized (b) {
            dvz dvz = (dvz) b.get(dvw.asBinder());
            if (dvz != null) {
                return dvz;
            }
            dvz dvz2 = new dvz(dvw);
            b.put(dvw.asBinder(), dvz2);
            return dvz2;
        }
    }

    public final String a() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            cow.a("", e);
            return null;
        }
    }
}

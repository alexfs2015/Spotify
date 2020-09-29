package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import java.util.WeakHashMap;

@cfp
/* renamed from: dwq reason: default package */
public final class dwq implements bfu {
    private static WeakHashMap<IBinder, dwq> b = new WeakHashMap<>();
    final dwn a;
    private final MediaView c;
    private final bfl d = new bfl();

    private dwq(dwn dwn) {
        Context context;
        String str = "";
        this.a = dwn;
        MediaView mediaView = null;
        try {
            context = (Context) cbj.a(dwn.e());
        } catch (RemoteException | NullPointerException e) {
            cpn.a(str, e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.a.a(cbj.a(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                cpn.a(str, e2);
            }
        }
        this.c = mediaView;
    }

    public static dwq a(dwn dwn) {
        synchronized (b) {
            dwq dwq = (dwq) b.get(dwn.asBinder());
            if (dwq != null) {
                return dwq;
            }
            dwq dwq2 = new dwq(dwn);
            b.put(dwn.asBinder(), dwq2);
            return dwq2;
        }
    }

    public final String a() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            cpn.a("", e);
            return null;
        }
    }
}

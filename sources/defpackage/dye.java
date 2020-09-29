package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.zzae;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@cfp
/* renamed from: dye reason: default package */
public final class dye implements dsc {
    dxx a;
    boolean b;
    final Object c = new Object();
    private final Context d;

    public dye(Context context) {
        this.d = context;
    }

    private final Future<ParcelFileDescriptor> a(dxy dxy) {
        dyf dyf = new dyf(this);
        dyg dyg = new dyg(this, dyf, dxy);
        dyj dyj = new dyj(this, dyf);
        synchronized (this.c) {
            this.a = new dxx(this.d, bkc.t().a(), dyg, dyj);
            this.a.l();
        }
        return dyf;
    }

    static /* synthetic */ void a(dye dye) {
        synchronized (dye.c) {
            if (dye.a != null) {
                dye.a.f();
                dye.a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final duu a(dwv<?> dwv) {
        duu duu;
        String str = "ms";
        String str2 = "Http assets remote cache took ";
        dxy a2 = dxy.a(dwv);
        long intValue = (long) ((Integer) dqe.f().a(dtg.cI)).intValue();
        long b2 = bkc.l().b();
        try {
            dya dya = (dya) new chb((ParcelFileDescriptor) a(a2).get(intValue, TimeUnit.MILLISECONDS)).a(dya.CREATOR);
            if (!dya.a) {
                if (dya.e.length != dya.f.length) {
                    duu = null;
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < dya.e.length; i++) {
                        hashMap.put(dya.e[i], dya.f[i]);
                    }
                    duu = new duu(dya.c, dya.d, (Map<String, String>) hashMap, dya.g, dya.h);
                }
                long b3 = bkc.l().b() - b2;
                StringBuilder sb = new StringBuilder(52);
                sb.append(str2);
                sb.append(b3);
                sb.append(str);
                sb.toString();
                cml.a();
                return duu;
            }
            throw new zzae(dya.b);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            long b4 = bkc.l().b() - b2;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append(str2);
            sb2.append(b4);
            sb2.append(str);
            sb2.toString();
            cml.a();
            return null;
        } catch (Throwable th) {
            long b5 = bkc.l().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append(str2);
            sb3.append(b5);
            sb3.append(str);
            sb3.toString();
            cml.a();
            throw th;
        }
    }
}

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

@cey
/* renamed from: dxn reason: default package */
public final class dxn implements drl {
    dxg a;
    boolean b;
    final Object c = new Object();
    private final Context d;

    public dxn(Context context) {
        this.d = context;
    }

    private final Future<ParcelFileDescriptor> a(dxh dxh) {
        dxo dxo = new dxo(this);
        dxp dxp = new dxp(this, dxo, dxh);
        dxs dxs = new dxs(this, dxo);
        synchronized (this.c) {
            this.a = new dxg(this.d, bjl.t().a(), dxp, dxs);
            this.a.l();
        }
        return dxo;
    }

    /* JADX INFO: finally extract failed */
    public final dud a(dwe<?> dwe) {
        dud dud;
        String str = "ms";
        String str2 = "Http assets remote cache took ";
        dxh a2 = dxh.a(dwe);
        long intValue = (long) ((Integer) dpn.f().a(dsp.cI)).intValue();
        long b2 = bjl.l().b();
        try {
            dxj dxj = (dxj) new cgk((ParcelFileDescriptor) a(a2).get(intValue, TimeUnit.MILLISECONDS)).a(dxj.CREATOR);
            if (!dxj.a) {
                if (dxj.e.length != dxj.f.length) {
                    dud = null;
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < dxj.e.length; i++) {
                        hashMap.put(dxj.e[i], dxj.f[i]);
                    }
                    dud = new dud(dxj.c, dxj.d, (Map<String, String>) hashMap, dxj.g, dxj.h);
                }
                long b3 = bjl.l().b() - b2;
                StringBuilder sb = new StringBuilder(52);
                sb.append(str2);
                sb.append(b3);
                sb.append(str);
                sb.toString();
                clu.a();
                return dud;
            }
            throw new zzae(dxj.b);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            long b4 = bjl.l().b() - b2;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append(str2);
            sb2.append(b4);
            sb2.append(str);
            sb2.toString();
            clu.a();
            return null;
        } catch (Throwable th) {
            long b5 = bjl.l().b() - b2;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append(str2);
            sb3.append(b5);
            sb3.append(str);
            sb3.toString();
            clu.a();
            throw th;
        }
    }

    static /* synthetic */ void a(dxn dxn) {
        synchronized (dxn.c) {
            if (dxn.a != null) {
                dxn.a.f();
                dxn.a = null;
                Binder.flushPendingCommands();
            }
        }
    }
}

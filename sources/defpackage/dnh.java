package defpackage;

import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@cey
/* renamed from: dnh reason: default package */
public final class dnh {
    private final dnl a;
    private final dnw b;
    private final boolean c;

    public dnh() {
        this.c = false;
        this.a = new dnl();
        this.b = new dnw();
        a();
    }

    public dnh(dnl dnl) {
        this.a = dnl;
        this.c = ((Boolean) dpn.f().a(dsp.cZ)).booleanValue();
        this.b = new dnw();
        a();
    }

    private final synchronized void a() {
        this.b.d = new dnp();
        this.b.d.b = new dns();
        this.b.c = new dnu();
    }

    public final synchronized void a(zzb zzb) {
        if (this.c) {
            if (((Boolean) dpn.f().a(dsp.da)).booleanValue()) {
                c(zzb);
            } else {
                b(zzb);
            }
        }
    }

    public final synchronized void a(dni dni) {
        if (this.c) {
            try {
                dni.a(this.b);
            } catch (NullPointerException e) {
                bjl.i().a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private final synchronized void b(zzb zzb) {
        this.b.b = b();
        dnm a2 = this.a.a(dgf.a((dgf) this.b));
        a2.b = zzb.value;
        a2.a();
        String str = "Logging Event with event code : ";
        String valueOf = String.valueOf(Integer.toString(zzb.value, 10));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            new String(str);
        }
        clu.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|29|30) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:20|31|32|33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:21|22|23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        defpackage.clu.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        defpackage.clu.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        defpackage.clu.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        defpackage.clu.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0046, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void c(com.google.android.gms.internal.ads.zzhu.zza.zzb r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "clearcut_events.txt"
            r1.<init>(r0, r2)     // Catch:{ all -> 0x004c }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0047 }
            r2 = 1
            r0.<init>(r1, r2)     // Catch:{ FileNotFoundException -> 0x0047 }
            java.lang.String r4 = r3.d(r4)     // Catch:{ IOException -> 0x0032 }
            byte[] r4 = r4.getBytes()     // Catch:{ IOException -> 0x0032 }
            r0.write(r4)     // Catch:{ IOException -> 0x0032 }
            r4 = 10
            r0.write(r4)     // Catch:{ IOException -> 0x0032 }
            r0.close()     // Catch:{ IOException -> 0x002b }
            monitor-exit(r3)
            return
        L_0x002b:
            defpackage.clu.a()     // Catch:{ FileNotFoundException -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            goto L_0x003f
        L_0x0032:
            defpackage.clu.a()     // Catch:{ all -> 0x0030 }
            r0.close()     // Catch:{ IOException -> 0x003a }
            monitor-exit(r3)
            return
        L_0x003a:
            defpackage.clu.a()     // Catch:{ FileNotFoundException -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x003f:
            r0.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            defpackage.clu.a()     // Catch:{ FileNotFoundException -> 0x0047 }
        L_0x0046:
            throw r4     // Catch:{ FileNotFoundException -> 0x0047 }
        L_0x0047:
            defpackage.clu.a()     // Catch:{ all -> 0x004c }
            monitor-exit(r3)
            return
        L_0x004c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnh.c(com.google.android.gms.internal.ads.zzhu$zza$zzb):void");
    }

    private final synchronized String d(zzb zzb) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.b.a, Long.valueOf(bjl.l().b()), Integer.valueOf(zzb.value)});
    }

    private static long[] b() {
        int i;
        List b2 = dsp.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = ((String) it.next()).split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    clu.a();
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}

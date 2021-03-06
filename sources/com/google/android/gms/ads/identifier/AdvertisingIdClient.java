package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AdvertisingIdClient {
    private final Context mContext;
    private bru zze;
    private eex zzf;
    private boolean zzg;
    private final Object zzh;
    private zza zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzm;
        private long zzn;
        CountDownLatch zzo = new CountDownLatch(1);
        boolean zzp = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j) {
            this.zzm = new WeakReference<>(advertisingIdClient);
            this.zzn = j;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        public final void run() {
            try {
                if (!this.zzo.await(this.zzn, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzh = new Object();
        bwx.a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        zzb zzb = new zzb(context);
        boolean z = zzb.getBoolean("gads:ad_id_app_context:enabled", false);
        float f = zzb.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        String string = zzb.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, z, zzb.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, z, f, SystemClock.elapsedRealtime() - elapsedRealtime, string, null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzb = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, zzb.getBoolean("gads:ad_id_app_context:enabled", false), zzb.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static bru zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int b = bry.b().b(context, brz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (b == 0 || b == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                bru bru = new bru();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (bzb.a().b(context, intent, bru, 1)) {
                        return bru;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.zzo     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzi     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.zzk     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$zza     // Catch:{ all -> 0x0026 }
            long r2 = r6.zzk     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.zzi = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final void zza(boolean z) {
        bwx.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            this.zze = zza(this.mContext, this.zzj);
            this.zzf = zza(this.mContext, this.zze);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        String str3 = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        hashMap.put("app_context", z ? str2 : str3);
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = str3;
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put(LogMessage.SEVERITY_ERROR, th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new zza(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.bwx.c(r0)
            monitor-enter(r3)
            boolean r0 = r3.zzg     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r3.zzh     // Catch:{ all -> 0x005a }
            monitor-enter(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r3.zzi     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r3.zzi     // Catch:{ all -> 0x003a }
            boolean r1 = r1.zzp     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r3.zza(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r3.zzg     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x005a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x003d:
            bru r0 = r3.zze     // Catch:{ all -> 0x005a }
            defpackage.bwx.a(r0)     // Catch:{ all -> 0x005a }
            eex r0 = r3.zzf     // Catch:{ all -> 0x005a }
            defpackage.bwx.a(r0)     // Catch:{ all -> 0x005a }
            eex r0 = r3.zzf     // Catch:{ RemoteException -> 0x0052 }
            boolean r0 = r0.c()     // Catch:{ RemoteException -> 0x0052 }
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            r3.zza()
            return r0
        L_0x0052:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zzb():boolean");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r2 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.bwx.c(r0)
            monitor-enter(r2)
            android.content.Context r0 = r2.mContext     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            bru r0 = r2.zze     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0027
        L_0x000f:
            boolean r0 = r2.zzg     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001d
            defpackage.bzb.a()     // Catch:{ all -> 0x001d }
            android.content.Context r0 = r2.mContext     // Catch:{ all -> 0x001d }
            bru r1 = r2.zze     // Catch:{ all -> 0x001d }
            defpackage.bzb.a(r0, r1)     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = 0
            r2.zzg = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            r2.zzf = r0     // Catch:{ all -> 0x0029 }
            r2.zze = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            defpackage.bwx.c(r0)
            monitor-enter(r3)
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r3.zzh     // Catch:{ all -> 0x0065 }
            monitor-enter(r0)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r3.zzi     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r3.zzi     // Catch:{ all -> 0x003a }
            boolean r1 = r1.zzp     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r3.zza(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r3.zzg     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0065 }
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x003d:
            bru r0 = r3.zze     // Catch:{ all -> 0x0065 }
            defpackage.bwx.a(r0)     // Catch:{ all -> 0x0065 }
            eex r0 = r3.zzf     // Catch:{ all -> 0x0065 }
            defpackage.bwx.a(r0)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch:{ RemoteException -> 0x005d }
            eex r1 = r3.zzf     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r1 = r1.a()     // Catch:{ RemoteException -> 0x005d }
            eex r2 = r3.zzf     // Catch:{ RemoteException -> 0x005d }
            boolean r2 = r2.b()     // Catch:{ RemoteException -> 0x005d }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005d }
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            r3.zza()
            return r0
        L_0x005d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0065 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getInfo():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public void start() {
        zza(true);
    }

    private static eex zza(Context context, bru bru) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bwx.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (!bru.a) {
                bru.a = true;
                IBinder iBinder = (IBinder) bru.b.poll(10000, timeUnit);
                if (iBinder != null) {
                    return eey.a(iBinder);
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            throw new IllegalStateException("Cannot call get on this connection more than once");
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}

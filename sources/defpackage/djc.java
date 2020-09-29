package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: djc reason: default package */
public class djc {
    protected Context a;
    ExecutorService b;
    DexClassLoader c;
    dip d;
    byte[] e;
    /* access modifiers changed from: 0000 */
    public volatile dci f = null;
    Future g = null;
    dii h;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    /* access modifiers changed from: 0000 */
    public boolean l;
    private volatile AdvertisingIdClient m = null;
    private volatile boolean n = false;
    private Future o = null;
    private boolean p;
    private Map<Pair<String, String>, dkl> q;
    private boolean r;

    /* renamed from: djc$a */
    final class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(djc djc, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                djc.this.l = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                djc.this.l = false;
            }
        }
    }

    static {
        djc.class.getSimpleName();
    }

    private djc(Context context) {
        boolean z = true;
        this.l = true;
        this.r = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.p = z;
        if (this.p) {
            context = applicationContext;
        }
        this.a = context;
        this.q = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|(15:28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48|69)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ zzcl -> 0x0150, zzcw -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ zzcl -> 0x0150, zzcw -> 0x0157 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.djc a(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            djc r1 = new djc
            r1.<init>(r9)
            dje r9 = new dje     // Catch:{ zzcw -> 0x0157 }
            r9.<init>()     // Catch:{ zzcw -> 0x0157 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzcw -> 0x0157 }
            r1.b = r9     // Catch:{ zzcw -> 0x0157 }
            r1.n = r12     // Catch:{ zzcw -> 0x0157 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.b     // Catch:{ zzcw -> 0x0157 }
            djf r12 = new djf     // Catch:{ zzcw -> 0x0157 }
            r12.<init>(r1)     // Catch:{ zzcw -> 0x0157 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzcw -> 0x0157 }
            r1.o = r9     // Catch:{ zzcw -> 0x0157 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.b     // Catch:{ zzcw -> 0x0157 }
            djh r12 = new djh     // Catch:{ zzcw -> 0x0157 }
            r12.<init>(r1)     // Catch:{ zzcw -> 0x0157 }
            r9.execute(r12)     // Catch:{ zzcw -> 0x0157 }
            r9 = 1
            r12 = 0
            bsp r2 = defpackage.bsp.b()     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x004d }
            int r3 = defpackage.bsp.d(r3)     // Catch:{ all -> 0x004d }
            if (r3 <= 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r1.i = r3     // Catch:{ all -> 0x004d }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x004d }
            int r2 = r2.a(r3)     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.j = r2     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1.a(r12, r9)     // Catch:{ zzcw -> 0x0157 }
            boolean r2 = defpackage.djk.a()     // Catch:{ zzcw -> 0x0157 }
            if (r2 == 0) goto L_0x0071
            dsw<java.lang.Boolean> r2 = defpackage.dtg.bK     // Catch:{ zzcw -> 0x0157 }
            dte r3 = defpackage.dqe.f()     // Catch:{ zzcw -> 0x0157 }
            java.lang.Object r2 = r3.a(r2)     // Catch:{ zzcw -> 0x0157 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ zzcw -> 0x0157 }
            boolean r2 = r2.booleanValue()     // Catch:{ zzcw -> 0x0157 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzcw -> 0x0157 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzcw -> 0x0157 }
            throw r9     // Catch:{ zzcw -> 0x0157 }
        L_0x0071:
            dip r2 = new dip     // Catch:{ zzcw -> 0x0157 }
            r2.<init>()     // Catch:{ zzcw -> 0x0157 }
            r1.d = r2     // Catch:{ zzcw -> 0x0157 }
            dip r2 = r1.d     // Catch:{ zzcl -> 0x0150 }
            byte[] r10 = r2.a(r10)     // Catch:{ zzcl -> 0x0150 }
            r1.e = r10     // Catch:{ zzcl -> 0x0150 }
            android.content.Context r10 = r1.a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            if (r10 != 0) goto L_0x0099
            android.content.Context r10 = r1.a     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r12)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            if (r10 == 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            com.google.android.gms.internal.ads.zzcw r9 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            throw r9     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
        L_0x0099:
            java.lang.String r2 = "1521499837408"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r4 = "%s/%s.jar"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r6[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r6[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            boolean r4 = r3.exists()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            if (r4 != 0) goto L_0x00ca
            dip r4 = r1.d     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r6 = r1.e     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r11 = r4.a(r6, r11)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            int r6 = r11.length     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r4.write(r11, r12, r6)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
        L_0x00ca:
            r1.b(r10, r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x011f }
            java.lang.String r6 = r10.getAbsolutePath()     // Catch:{ all -> 0x011f }
            r7 = 0
            android.content.Context r8 = r1.a     // Catch:{ all -> 0x011f }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x011f }
            r11.<init>(r4, r6, r7, r8)     // Catch:{ all -> 0x011f }
            r1.c = r11     // Catch:{ all -> 0x011f }
            a(r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r1.a(r10, r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r11[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r11[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r10 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            a(r10)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            boolean r10 = r1.r     // Catch:{ zzcw -> 0x0157 }
            if (r10 != 0) goto L_0x0115
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ zzcw -> 0x0157 }
            r10.<init>()     // Catch:{ zzcw -> 0x0157 }
            java.lang.String r11 = "android.intent.action.USER_PRESENT"
            r10.addAction(r11)     // Catch:{ zzcw -> 0x0157 }
            java.lang.String r11 = "android.intent.action.SCREEN_OFF"
            r10.addAction(r11)     // Catch:{ zzcw -> 0x0157 }
            android.content.Context r11 = r1.a     // Catch:{ zzcw -> 0x0157 }
            djc$a r0 = new djc$a     // Catch:{ zzcw -> 0x0157 }
            r0.<init>(r1, r12)     // Catch:{ zzcw -> 0x0157 }
            r11.registerReceiver(r0, r10)     // Catch:{ zzcw -> 0x0157 }
            r1.r = r9     // Catch:{ zzcw -> 0x0157 }
        L_0x0115:
            dii r10 = new dii     // Catch:{ zzcw -> 0x0157 }
            r10.<init>(r1)     // Catch:{ zzcw -> 0x0157 }
            r1.h = r10     // Catch:{ zzcw -> 0x0157 }
            r1.k = r9     // Catch:{ zzcw -> 0x0157 }
            goto L_0x0157
        L_0x011f:
            r11 = move-exception
            a(r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r1.a(r10, r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r3[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            r3[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            a(r9)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzcl -> 0x013b, NullPointerException -> 0x0134 }
        L_0x0134:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcw r10 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzcw -> 0x0157 }
            throw r10     // Catch:{ zzcw -> 0x0157 }
        L_0x013b:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcw r10 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzcw -> 0x0157 }
            throw r10     // Catch:{ zzcw -> 0x0157 }
        L_0x0142:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcw r10 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzcw -> 0x0157 }
            throw r10     // Catch:{ zzcw -> 0x0157 }
        L_0x0149:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcw r10 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzcw -> 0x0157 }
            throw r10     // Catch:{ zzcw -> 0x0157 }
        L_0x0150:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzcw r10 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzcw -> 0x0157 }
            throw r10     // Catch:{ zzcw -> 0x0157 }
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djc.a(android.content.Context, java.lang.String, java.lang.String, boolean):djc");
    }

    static /* synthetic */ void a(djc djc) {
        try {
            if (djc.m == null && djc.p) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(djc.a);
                advertisingIdClient.start();
                djc.m = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            djc.m = null;
        }
    }

    private static void a(File file) {
        if (!file.exists()) {
            String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()});
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[SYNTHETIC, Splitter:B:39:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa A[SYNTHETIC, Splitter:B:43:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4 A[SYNTHETIC, Splitter:B:52:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bb A[SYNTHETIC, Splitter:B:56:0x00bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r9, java.lang.String r10) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            r4 = 1
            r2[r4] = r10
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x001b
            return
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r4] = r10
            java.lang.String r9 = "%s/%s.dex"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r2.<init>(r9)
            boolean r9 = r2.exists()
            if (r9 != 0) goto L_0x0033
            return
        L_0x0033:
            long r4 = r2.length()
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x003e
            return
        L_0x003e:
            int r9 = (int) r4
            byte[] r9 = new byte[r9]
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b1, all -> 0x009f }
            r4.<init>(r2)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b1, all -> 0x009f }
            int r5 = r4.read(r9)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            if (r5 > 0) goto L_0x0054
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            a(r2)
            return
        L_0x0054:
            dfx r5 = new dfx     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r5.<init>()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            byte[] r6 = r6.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r5.d = r6     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            byte[] r10 = r10.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r5.c = r10     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            dip r10 = r8.d     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            byte[] r6 = r8.e     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            java.lang.String r9 = r10.a(r6, r9)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            byte[] r9 = r9.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r5.a = r9     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            byte[] r9 = defpackage.dhr.a(r9)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r5.b = r9     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r0.createNewFile()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            r9.<init>(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x009d }
            byte[] r10 = defpackage.dgw.a(r5)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            int r0 = r10.length     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r9.write(r10, r3, r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r9.close()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r4.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r9.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            a(r2)
            return
        L_0x0098:
            r10 = move-exception
            r1 = r9
            goto L_0x00a1
        L_0x009b:
            r1 = r9
            goto L_0x00b2
        L_0x009d:
            r10 = move-exception
            goto L_0x00a1
        L_0x009f:
            r10 = move-exception
            r4 = r1
        L_0x00a1:
            if (r4 == 0) goto L_0x00a8
            r4.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00a8
        L_0x00a7:
        L_0x00a8:
            if (r1 == 0) goto L_0x00ad
            r1.close()     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            a(r2)
            throw r10
        L_0x00b1:
            r4 = r1
        L_0x00b2:
            if (r4 == 0) goto L_0x00b9
            r4.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00b9
        L_0x00b8:
        L_0x00b9:
            if (r1 == 0) goto L_0x00be
            r1.close()     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djc.a(java.io.File, java.lang.String):void");
    }

    private static void a(String str) {
        a(new File(str));
    }

    static /* synthetic */ boolean a(int i2, dci dci) {
        if (i2 < 4) {
            if (dci == null) {
                return true;
            }
            if (((Boolean) dqe.f().a(dtg.bN)).booleanValue() && (dci.n == null || dci.n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) dqe.f().a(dtg.bO)).booleanValue() && (dci.X == null || dci.X.a == null || dci.X.a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ab */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c1 A[SYNTHETIC, Splitter:B:52:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8 A[SYNTHETIC, Splitter:B:56:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cf A[SYNTHETIC, Splitter:B:64:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d6 A[SYNTHETIC, Splitter:B:68:0x00d6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00bd }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            a(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00bd }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00bd }
            byte[] r1 = new byte[r1]     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00bd }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00bd }
            r5.<init>(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00bd }
            int r6 = r5.read(r1)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            if (r6 > 0) goto L_0x0057
            a(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r5.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r3
        L_0x0057:
            dfx r6 = new dfx     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r6.<init>()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            int r7 = r1.length     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            dgw r1 = defpackage.dgw.a(r6, r1, r7)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            dfx r1 = (defpackage.dfx) r1     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r7 = r1.c     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r6.<init>(r7)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            boolean r11 = r11.equals(r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            if (r11 == 0) goto L_0x00b4
            byte[] r11 = r1.b     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r6 = r1.a     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r6 = defpackage.dhr.a(r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            if (r11 == 0) goto L_0x00b4
            byte[] r11 = r1.d     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r6 = r6.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            if (r11 != 0) goto L_0x008d
            goto L_0x00b4
        L_0x008d:
            dip r11 = r9.d     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r0 = r9.e     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r1 = r1.a     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r6.<init>(r1)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            byte[] r11 = r11.a(r0, r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r2.createNewFile()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r0.<init>(r2)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            int r10 = r11.length     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x00af }
            r0.write(r11, r3, r10)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b2, all -> 0x00af }
            r5.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            r0.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            return r4
        L_0x00af:
            r11 = move-exception
            r10 = r0
            goto L_0x00bf
        L_0x00b2:
            r10 = r0
            goto L_0x00cd
        L_0x00b4:
            a(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00cd, all -> 0x00bb }
            r5.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            return r3
        L_0x00bb:
            r11 = move-exception
            goto L_0x00bf
        L_0x00bd:
            r11 = move-exception
            r5 = r10
        L_0x00bf:
            if (r5 == 0) goto L_0x00c6
            r5.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00c6
        L_0x00c5:
        L_0x00c6:
            if (r10 == 0) goto L_0x00cb
            r10.close()     // Catch:{ IOException -> 0x00cb }
        L_0x00cb:
            throw r11
        L_0x00cc:
            r5 = r10
        L_0x00cd:
            if (r5 == 0) goto L_0x00d4
            r5.close()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00d4
        L_0x00d3:
        L_0x00d4:
            if (r10 == 0) goto L_0x00d9
            r10.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djc.b(java.io.File, java.lang.String):boolean");
    }

    private final dci d() {
        try {
            return new cwa(this.a, this.a.getPackageName(), Integer.toString(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode)).a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Context a() {
        return this.a;
    }

    public final Method a(String str, String str2) {
        dkl dkl = (dkl) this.q.get(new Pair(str, str2));
        if (dkl == null) {
            return null;
        }
        return dkl.a();
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, boolean z) {
        if (this.j) {
            Future submit = this.b.submit(new djg(this, i2, z));
            if (i2 == 0) {
                this.g = submit;
            }
        }
    }

    public final boolean a(String str, String str2, Class<?>... clsArr) {
        if (this.q.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.q.put(new Pair(str, str2), new dkl(this, str, str2, clsArr));
        return true;
    }

    public final AdvertisingIdClient b() {
        if (!this.n) {
            return null;
        }
        if (this.m != null) {
            return this.m;
        }
        Future future = this.o;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.o = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.o.cancel(true);
            }
        }
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final dci b(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return d();
    }

    public final int c() {
        if (this.h != null) {
            return dii.a();
        }
        return Integer.MIN_VALUE;
    }
}

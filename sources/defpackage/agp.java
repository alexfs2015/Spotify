package defpackage;

import android.os.Environment;
import java.io.BufferedWriter;
import java.io.File;
import java.text.SimpleDateFormat;

/* renamed from: agp reason: default package */
public final class agp implements agr {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
    private static final String b;
    private String c;
    private File d;
    private BufferedWriter e;
    private String f;

    static {
        new SimpleDateFormat("MM-dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        sb.append("connected_app");
        sb.append(File.separator);
        sb.append("log");
        sb.append(File.separator);
        b = sb.toString();
    }

    agp(String str) {
        this.f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.c     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x0018
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = b     // Catch:{ all -> 0x00c2 }
            r4.c = r0     // Catch:{ all -> 0x00c2 }
            goto L_0x0018
        L_0x0010:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "LogFileWriter - init() : No External Storage"
            r0.<init>(r1)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x0018:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r4.c     // Catch:{ all -> 0x00c2 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c2 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x00c2 }
            if (r1 != 0) goto L_0x0049
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x00c2 }
            boolean r1 = r1.canWrite()     // Catch:{ all -> 0x00c2 }
            if (r1 == 0) goto L_0x0041
            r0.mkdirs()     // Catch:{ all -> 0x00c2 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0039
            goto L_0x0049
        L_0x0039:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "LogFileWriter - init() : Cannot create folder on ExternalStorage"
            r0.<init>(r1)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x0041:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "LogFileWriter - init() : Cannot Write on ExternalStorage - missing permission"
            r0.<init>(r1)     // Catch:{ all -> 0x00c2 }
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x0049:
            java.lang.String r0 = r4.c     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00c0
            java.io.File r0 = r4.d     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x0093
            java.text.SimpleDateFormat r0 = a     // Catch:{ all -> 0x00c2 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x00c2 }
            r1.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.format(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c2 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r2.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = r4.c     // Catch:{ all -> 0x00c2 }
            r2.append(r3)     // Catch:{ all -> 0x00c2 }
            r2.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "_"
            r2.append(r0)     // Catch:{ all -> 0x00c2 }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x00c2 }
            r2.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "_"
            r2.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r4.f     // Catch:{ all -> 0x00c2 }
            r2.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = ".txt"
            r2.append(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c2 }
            r4.d = r1     // Catch:{ all -> 0x00c2 }
        L_0x0093:
            java.io.File r0 = r4.d     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            boolean r0 = r0.exists()     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            if (r0 != 0) goto L_0x00a0
            java.io.File r0 = r4.d     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            r0.createNewFile()     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
        L_0x00a0:
            java.io.BufferedWriter r0 = r4.e     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            if (r0 != 0) goto L_0x00b3
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            java.io.File r2 = r4.d     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
            r4.e = r0     // Catch:{ FileNotFoundException -> 0x00ba, IOException -> 0x00b5 }
        L_0x00b3:
            monitor-exit(r4)
            return
        L_0x00b5:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x00c2 }
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r0.getMessage()     // Catch:{ all -> 0x00c2 }
            monitor-exit(r4)
            return
        L_0x00c0:
            monitor-exit(r4)
            return
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agp.b():void");
    }

    public final synchronized void a() {
        if (this.e != null) {
            this.e.close();
        }
        this.e = null;
        this.d = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:16|15|17|18|(2:20|21)|22|23|24|25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.io.BufferedWriter r0 = r2.e     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x000b
            r2.b()     // Catch:{ Exception -> 0x0009 }
            goto L_0x000b
        L_0x0009:
            monitor-exit(r2)
            return
        L_0x000b:
            java.io.BufferedWriter r0 = r2.e     // Catch:{ Exception -> 0x001b }
            if (r0 == 0) goto L_0x0019
            java.io.BufferedWriter r0 = r2.e     // Catch:{ Exception -> 0x001b }
            r0.write(r3)     // Catch:{ Exception -> 0x001b }
            java.io.BufferedWriter r0 = r2.e     // Catch:{ Exception -> 0x001b }
            r0.flush()     // Catch:{ Exception -> 0x001b }
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r0 = 0
            r2.d = r0     // Catch:{ all -> 0x0046 }
            r2.c = r0     // Catch:{ all -> 0x0046 }
            java.io.BufferedWriter r1 = r2.e     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0029
            java.io.BufferedWriter r1 = r2.e     // Catch:{ Exception -> 0x0029 }
            r1.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            r2.e = r0     // Catch:{ all -> 0x0046 }
            r2.b()     // Catch:{ Exception -> 0x0044 }
            java.io.BufferedWriter r0 = r2.e     // Catch:{ Exception -> 0x003a }
            r0.write(r3)     // Catch:{ Exception -> 0x003a }
            java.io.BufferedWriter r3 = r2.e     // Catch:{ Exception -> 0x003a }
            r3.flush()     // Catch:{ Exception -> 0x003a }
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            java.lang.String r0 = "LogFileWriter"
            java.lang.String r1 = "An exception occurred"
            android.util.Log.e(r0, r1, r3)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x0044:
            monitor-exit(r2)
            return
        L_0x0046:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agp.a(java.lang.String):void");
    }
}

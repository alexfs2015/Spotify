package defpackage;

import android.content.Context;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.rcs.model.GranularConfiguration;
import java.io.File;

/* renamed from: vhs reason: default package */
public final class vhs implements vht {
    private final File a;

    private vhs(File file) {
        this.a = file;
    }

    private static vhs a(File file, String str) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return new vhs(new File(file, str));
    }

    public static vhs a(Context context, String str) {
        return a(context.getDir("remote-config", 0), str);
    }

    public final synchronized vhk a() {
        if (!this.a.exists() || this.a.length() == 0) {
            xal.b("No existing configuration. Returning the default one.", new Object[0]);
            return vhk.d();
        }
        try {
            return vhk.a(GranularConfiguration.a(c()));
        } catch (InvalidProtocolBufferException e) {
            xal.a(e, "Can't parse protobuf", new Object[0]);
            return vhk.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.vhk r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "Storing raw configuration"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0059 }
            defpackage.xal.a(r0, r2)     // Catch:{ all -> 0x0059 }
            boolean r0 = r6.c()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0014
            r5.d()     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)
            return
        L_0x0014:
            com.spotify.rcs.model.GranularConfiguration r6 = r6.a     // Catch:{ all -> 0x0059 }
            byte[] r6 = r6.b()     // Catch:{ all -> 0x0059 }
            r0 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0047 }
            java.io.File r3 = r5.a     // Catch:{ Exception -> 0x0047 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0047 }
            r2.write(r6)     // Catch:{ all -> 0x0040 }
            java.lang.String r3 = "Writing <%d> bytes to file <%s>"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0040 }
            int r6 = r6.length     // Catch:{ all -> 0x0040 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0040 }
            r4[r1] = r6     // Catch:{ all -> 0x0040 }
            java.io.File r6 = r5.a     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0040 }
            r4[r0] = r6     // Catch:{ all -> 0x0040 }
            defpackage.xal.a(r3, r4)     // Catch:{ all -> 0x0040 }
            r2.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x0057
        L_0x0040:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r6 = move-exception
            r2.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r6     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            r6 = move-exception
            java.lang.String r2 = "Can't write to file <%s>"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0059 }
            java.io.File r3 = r5.a     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0059 }
            r0[r1] = r3     // Catch:{ all -> 0x0059 }
            defpackage.xal.a(r6, r2, r0)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r5)
            return
        L_0x0059:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhs.a(vhk):void");
    }

    public final void b() {
        xal.a("Cleaning configuration store.", new Object[0]);
        d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] c() {
        /*
            r5 = this;
            java.io.File r0 = r5.a
            long r0 = r0.length()
            int r1 = (int) r0
            byte[] r0 = new byte[r1]
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0023 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0023 }
            java.io.File r3 = r5.a     // Catch:{ Exception -> 0x0023 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0023 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0023 }
            r1.readFully(r0)     // Catch:{ all -> 0x001c }
            r1.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0035
        L_0x001c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001e }
        L_0x001e:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r2     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.io.File r4 = r5.a
            java.lang.String r4 = r4.getAbsolutePath()
            r2[r3] = r4
            java.lang.String r3 = "Can't read from file <%s>"
            defpackage.xal.a(r1, r3, r2)
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhs.c():byte[]");
    }

    private void d() {
        if (this.a.exists()) {
            if (!this.a.delete()) {
                xal.c("Can't delete file <%s>", this.a.getAbsolutePath());
                return;
            }
            xal.a("File <%s> deleted", this.a.getAbsolutePath());
        }
    }
}

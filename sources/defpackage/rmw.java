package defpackage;

import android.content.Context;

/* renamed from: rmw reason: default package */
public final class rmw {
    public final Context a;

    rmw(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045 A[SYNTHETIC, Splitter:B:26:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0052 A[SYNTHETIC, Splitter:B:33:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r7) {
        /*
            java.lang.String r0 = "Error closing the file."
            boolean r1 = r7.exists()
            r2 = 1
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 0
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004f, all -> 0x0041 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ IOException -> 0x004f, all -> 0x0041 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x004f, all -> 0x0041 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x004f, all -> 0x0041 }
            r7 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            if (r5 == 0) goto L_0x002d
            java.lang.String r6 = "autologin.username"
            boolean r6 = a(r5, r6)     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            r7 = r7 | r6
            java.lang.String r6 = "autologin.blob"
            boolean r5 = a(r5, r6)     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            r1 = r1 | r5
            goto L_0x0018
        L_0x002d:
            if (r7 == 0) goto L_0x0033
            if (r1 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            r4.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003c
        L_0x0037:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.e(r0, r7)
        L_0x003c:
            return r2
        L_0x003d:
            r7 = move-exception
            goto L_0x0043
        L_0x003f:
            r1 = r4
            goto L_0x0050
        L_0x0041:
            r7 = move-exception
            r4 = r1
        L_0x0043:
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.e(r0, r1)
        L_0x004e:
            throw r7
        L_0x004f:
        L_0x0050:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005b
        L_0x0056:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.spotify.base.java.logging.Logger.e(r0, r7)
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmw.a(java.io.File):boolean");
    }

    private static boolean a(String str, String str2) {
        if (str.trim().startsWith(str2)) {
            String[] split = str.split("=", 2);
            if (split.length != 2 || split[1].length() <= 1) {
                return false;
            }
            return true;
        }
        return false;
    }
}

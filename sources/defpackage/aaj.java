package defpackage;

import android.content.Context;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: aaj reason: default package */
final class aaj {
    final Context a;
    final String b;

    aaj(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ho<com.airbnb.lottie.network.FileExtension, java.io.InputStream> a() {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r6.b     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0073 }
            android.content.Context r3 = r6.a     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.File r3 = r3.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0073 }
            com.airbnb.lottie.network.FileExtension r4 = com.airbnb.lottie.network.FileExtension.Json     // Catch:{ FileNotFoundException -> 0x0073 }
            r5 = 0
            java.lang.String r4 = a(r1, r4, r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException -> 0x0073 }
            boolean r3 = r2.exists()     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r3 == 0) goto L_0x001c
            goto L_0x0035
        L_0x001c:
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0073 }
            android.content.Context r3 = r6.a     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.File r3 = r3.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0073 }
            com.airbnb.lottie.network.FileExtension r4 = com.airbnb.lottie.network.FileExtension.Zip     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r1 = a(r1, r4, r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>(r3, r1)     // Catch:{ FileNotFoundException -> 0x0073 }
            boolean r1 = r2.exists()     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0038
            return r0
        L_0x0038:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x004c
            com.airbnb.lottie.network.FileExtension r0 = com.airbnb.lottie.network.FileExtension.Zip
            goto L_0x004e
        L_0x004c:
            com.airbnb.lottie.network.FileExtension r0 = com.airbnb.lottie.network.FileExtension.Json
        L_0x004e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cache hit for "
            r3.<init>(r4)
            java.lang.String r4 = r6.b
            r3.append(r4)
            java.lang.String r4 = " at "
            r3.append(r4)
            java.lang.String r2 = r2.getAbsolutePath()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.wz.a(r2)
            ho r2 = new ho
            r2.<init>(r0, r1)
            return r2
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaj.a():ho");
    }

    /* access modifiers changed from: 0000 */
    public final File a(InputStream inputStream, FileExtension fileExtension) {
        FileOutputStream fileOutputStream;
        File file = new File(this.a.getCacheDir(), a(this.b, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    static String a(String str, FileExtension fileExtension, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.extension : fileExtension.a());
        return sb.toString();
    }
}

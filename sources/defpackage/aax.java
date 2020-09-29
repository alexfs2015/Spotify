package defpackage;

import android.content.Context;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: aax reason: default package */
final class aax {
    final Context a;
    final String b;

    aax(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    static String a(String str, FileExtension fileExtension, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? fileExtension.extension : fileExtension.a());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final ho<FileExtension, InputStream> a() {
        try {
            String str = this.b;
            File file = new File(this.a.getCacheDir(), a(str, FileExtension.Json, false));
            if (!file.exists()) {
                file = new File(this.a.getCacheDir(), a(str, FileExtension.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileExtension fileExtension = file.getAbsolutePath().endsWith(".zip") ? FileExtension.Zip : FileExtension.Json;
            StringBuilder sb = new StringBuilder("Cache hit for ");
            sb.append(this.b);
            sb.append(" at ");
            sb.append(file.getAbsolutePath());
            xn.a(sb.toString());
            return new ho<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
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
}

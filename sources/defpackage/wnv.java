package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: wnv reason: default package */
public interface wnv {
    public static final wnv a = new wnv() {
        public final wpa a(File file) {
            return wou.a(file);
        }

        public final woz b(File file) {
            try {
                return wou.b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return wou.b(file);
            }
        }

        public final woz c(File file) {
            try {
                return wou.c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return wou.c(file);
            }
        }

        public final void d(File file) {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        public final boolean e(File file) {
            return file.exists();
        }

        public final long f(File file) {
            return file.length();
        }

        public final void a(File file, File file2) {
            d(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }

        public final void g(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        g(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("failed to delete ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }
    };

    wpa a(File file);

    void a(File file, File file2);

    woz b(File file);

    woz c(File file);

    void d(File file);

    boolean e(File file);

    long f(File file);

    void g(File file);
}

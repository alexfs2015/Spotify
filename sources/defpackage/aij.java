package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: aij reason: default package */
final class aij extends FileOutputStream {
    public static final FilenameFilter a = new FilenameFilter() {
        public final boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    };
    private final String b;
    private File c;
    private File d;
    private boolean e = false;

    public aij(File file, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".cls_temp";
        sb.append(str2);
        super(new File(file, sb.toString()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        sb2.append(File.separator);
        sb2.append(str);
        this.b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append(str2);
        this.c = new File(sb3.toString());
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            super.flush();
            super.close();
        }
    }

    public final synchronized void close() {
        if (!this.e) {
            this.e = true;
            super.flush();
            super.close();
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(".cls");
            File file = new File(sb.toString());
            if (this.c.renameTo(file)) {
                this.c = null;
                this.d = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.c.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder sb2 = new StringBuilder("Could not rename temp file: ");
            sb2.append(this.c);
            sb2.append(" -> ");
            sb2.append(file);
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }
}

package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bcv reason: default package */
public final class bcv {
    public final File a;
    public final File b;

    /* renamed from: bcv$a */
    static final class a extends OutputStream {
        private final FileOutputStream a;
        private boolean b = false;

        public a(File file) {
            this.a = new FileOutputStream(file);
        }

        public final void close() {
            if (!this.b) {
                this.b = true;
                flush();
                try {
                    this.a.getFD().sync();
                } catch (IOException e) {
                    bdd.a("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.a.close();
            }
        }

        public final void flush() {
            this.a.flush();
        }

        public final void write(int i) {
            this.a.write(i);
        }

        public final void write(byte[] bArr) {
            this.a.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }
    }

    public bcv(File file) {
        this.a = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.b = new File(sb.toString());
    }

    public final OutputStream a() {
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                StringBuilder sb = new StringBuilder("Couldn't rename file ");
                sb.append(this.a);
                sb.append(" to backup file ");
                sb.append(this.b);
                bdd.c("AtomicFile", sb.toString());
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException e) {
            File parentFile = this.a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder sb2 = new StringBuilder("Couldn't create directory ");
                sb2.append(this.a);
                throw new IOException(sb2.toString(), e);
            }
            try {
                return new a(this.a);
            } catch (FileNotFoundException e2) {
                StringBuilder sb3 = new StringBuilder("Couldn't create ");
                sb3.append(this.a);
                throw new IOException(sb3.toString(), e2);
            }
        }
    }
}

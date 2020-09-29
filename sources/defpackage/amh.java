package defpackage;

import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: amh reason: default package */
public final class amh {
    static final String a = amh.class.getSimpleName();
    /* access modifiers changed from: private */
    public static final AtomicLong d = new AtomicLong();
    public final File b;
    public AtomicLong c = new AtomicLong(0);
    private final String e;
    private final d f;
    private boolean g;
    private boolean h;
    private final Object i;

    /* renamed from: amh$a */
    public static class a {
        private static final FilenameFilter a = new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return !str.startsWith("buffer");
            }
        };
        private static final FilenameFilter b = new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        };

        public static FilenameFilter a() {
            return a;
        }

        static File b(File file) {
            StringBuilder sb = new StringBuilder("buffer");
            sb.append(Long.valueOf(amh.d.incrementAndGet()).toString());
            return new File(file, sb.toString());
        }

        static void a(File file) {
            File[] listFiles = file.listFiles(b);
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    /* renamed from: amh$b */
    static class b extends OutputStream {
        private OutputStream a;
        private f b;

        b(OutputStream outputStream, f fVar) {
            this.a = outputStream;
            this.b = fVar;
        }

        public final void close() {
            try {
                this.a.close();
            } finally {
                this.b.a();
            }
        }

        public final void flush() {
            this.a.flush();
        }

        public final void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }

        public final void write(byte[] bArr) {
            this.a.write(bArr);
        }

        public final void write(int i) {
            this.a.write(i);
        }
    }

    /* renamed from: amh$c */
    static final class c extends InputStream {
        private InputStream a;
        private OutputStream b;

        public final boolean markSupported() {
            return false;
        }

        c(InputStream inputStream, OutputStream outputStream) {
            this.a = inputStream;
            this.b = outputStream;
        }

        public final int available() {
            return this.a.available();
        }

        public final void close() {
            try {
                this.a.close();
            } finally {
                this.b.close();
            }
        }

        public final void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public final int read(byte[] bArr) {
            int read = this.a.read(bArr);
            if (read > 0) {
                this.b.write(bArr, 0, read);
            }
            return read;
        }

        public final int read() {
            int read = this.a.read();
            if (read >= 0) {
                this.b.write(read);
            }
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            int read = this.a.read(bArr, i, i2);
            if (read > 0) {
                this.b.write(bArr, i, read);
            }
            return read;
        }

        public final synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public final long skip(long j) {
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j) {
                int read = read(bArr, 0, (int) Math.min(j - j2, 1024));
                if (read < 0) {
                    return j2;
                }
                j2 += (long) read;
            }
            return j2;
        }
    }

    /* renamed from: amh$d */
    public static final class d {
        int a = 1048576;
        int b = 1024;
    }

    /* renamed from: amh$e */
    static final class e implements Comparable<e> {
        final File a;
        final long b;

        e(File file) {
            this.a = file;
            this.b = file.lastModified();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof e) && compareTo((e) obj) == 0;
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 1073) * 37) + ((int) (this.b % 2147483647L));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(e eVar) {
            long j = this.b;
            long j2 = eVar.b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.a.compareTo(eVar.a);
        }
    }

    /* renamed from: amh$f */
    interface f {
        void a();
    }

    /* renamed from: amh$g */
    static final class g {
        static JSONObject a(InputStream inputStream) {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    amp.a(LoggingBehavior.CACHE, amh.a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = inputStream.read(bArr, i, i2 - i);
                if (read2 <= 0) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = amh.a;
                    StringBuilder sb = new StringBuilder("readHeader: stream.read stopped at ");
                    sb.append(Integer.valueOf(i));
                    sb.append(" when expected ");
                    sb.append(i2);
                    amp.a(loggingBehavior, str, sb.toString());
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str2 = amh.a;
                StringBuilder sb2 = new StringBuilder("readHeader: expected JSONObject, got ");
                sb2.append(nextValue.getClass().getCanonicalName());
                amp.a(loggingBehavior2, str2, sb2.toString());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public amh(String str, d dVar) {
        this.e = str;
        this.f = dVar;
        this.b = new File(akc.q(), str);
        this.i = new Object();
        if (this.b.mkdirs() || this.b.isDirectory()) {
            a.a(this.b);
        }
    }

    public final InputStream a(String str, String str2) {
        File file = new File(this.b, amw.b(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a2 = g.a(bufferedInputStream);
                if (a2 == null) {
                    return null;
                }
                String optString = a2.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        String optString2 = a2.optString("tag", null);
                        if ((str2 != null || optString2 == null) && (str2 == null || str2.equals(optString2))) {
                            long time = new Date().getTime();
                            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                            String str3 = a;
                            StringBuilder sb = new StringBuilder("Setting lastModified to ");
                            sb.append(Long.valueOf(time));
                            sb.append(" for ");
                            sb.append(file.getName());
                            amp.a(loggingBehavior, str3, sb.toString());
                            file.setLastModified(time);
                            return bufferedInputStream;
                        }
                        bufferedInputStream.close();
                        return null;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final OutputStream b(String str, String str2) {
        final File b2 = a.b(this.b);
        b2.delete();
        if (b2.createNewFile()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(b2);
                final long currentTimeMillis = System.currentTimeMillis();
                final String str3 = str;
                AnonymousClass1 r1 = new f() {
                    public final void a() {
                        if (currentTimeMillis < amh.this.c.get()) {
                            b2.delete();
                        } else {
                            amh.a(amh.this, str3, b2);
                        }
                    }
                };
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(fileOutputStream, r1), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!amw.a(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    byte[] bytes = jSONObject.toString().getBytes();
                    bufferedOutputStream.write(0);
                    bufferedOutputStream.write((bytes.length >> 16) & 255);
                    bufferedOutputStream.write((bytes.length >> 8) & 255);
                    bufferedOutputStream.write(bytes.length & 255);
                    bufferedOutputStream.write(bytes);
                    return bufferedOutputStream;
                } catch (JSONException e2) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str4 = a;
                    StringBuilder sb = new StringBuilder("Error creating JSON header for cache file: ");
                    sb.append(e2);
                    amp.a(loggingBehavior, 5, str4, sb.toString());
                    throw new IOException(e2.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str5 = a;
                StringBuilder sb2 = new StringBuilder("Error creating buffer output stream: ");
                sb2.append(e3);
                amp.a(loggingBehavior2, 5, str5, sb2.toString());
                throw new IOException(e3.getMessage());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Could not create file at ");
            sb3.append(b2.getAbsolutePath());
            throw new IOException(sb3.toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FileLruCache: tag:");
        sb.append(this.e);
        sb.append(" file:");
        sb.append(this.b.getName());
        sb.append("}");
        return sb.toString();
    }

    static /* synthetic */ void a(amh amh, String str, File file) {
        if (!file.renameTo(new File(amh.b, amw.b(str)))) {
            file.delete();
        }
        synchronized (amh.i) {
            if (!amh.g) {
                amh.g = true;
                akc.e().execute(new Runnable() {
                    public final void run() {
                        amh.b(amh.this);
                    }
                });
            }
        }
    }

    static /* synthetic */ void b(amh amh) {
        long j;
        amh amh2 = amh;
        synchronized (amh2.i) {
            amh2.g = false;
            amh2.h = true;
        }
        try {
            amp.a(LoggingBehavior.CACHE, a, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = amh2.b.listFiles(a.a());
            long j2 = 0;
            if (listFiles != null) {
                long j3 = 0;
                j = 0;
                for (File file : listFiles) {
                    e eVar = new e(file);
                    priorityQueue.add(eVar);
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = a;
                    StringBuilder sb = new StringBuilder("  trim considering time=");
                    sb.append(Long.valueOf(eVar.b));
                    sb.append(" name=");
                    sb.append(eVar.a.getName());
                    amp.a(loggingBehavior, str, sb.toString());
                    j3 += file.length();
                    j++;
                }
                j2 = j3;
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > ((long) amh2.f.a) || j > ((long) amh2.f.b)) {
                    File file2 = ((e) priorityQueue.remove()).a;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String str2 = a;
                    StringBuilder sb2 = new StringBuilder("  trim removing ");
                    sb2.append(file2.getName());
                    amp.a(loggingBehavior2, str2, sb2.toString());
                    j2 -= file2.length();
                    j--;
                    file2.delete();
                } else {
                    synchronized (amh2.i) {
                        amh2.h = false;
                        amh2.i.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (amh2.i) {
                amh2.h = false;
                amh2.i.notifyAll();
                throw th;
            }
        }
    }
}

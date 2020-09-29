package defpackage;

import com.spotify.android.storage.SyncError;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/* renamed from: gak reason: default package */
public final class gak {
    final File a;
    private final Map<String, String> b;

    public gak(File file) {
        this.b = new HashMap();
        this.a = file;
        c();
    }

    public gak(String str) {
        this(new File(str));
    }

    private void c() {
        BufferedReader a2;
        File file = new File(this.a, ".tag");
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                a2 = fdv.a(file, far.c);
                Properties properties = new Properties();
                properties.load(a2);
                for (Entry entry : properties.entrySet()) {
                    this.b.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
                wpf.a((Reader) a2);
            } catch (IOException e) {
                throw new SyncError(e.getMessage());
            } catch (Throwable th) {
                wpf.a((Reader) a2);
                throw th;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        BufferedWriter b2;
        File file = new File(this.a, ".tag");
        if (this.a.exists() && this.a.isDirectory() && this.a.canWrite()) {
            try {
                b2 = fdv.b(file, far.c);
                Properties properties = new Properties();
                properties.putAll(this.b);
                properties.store(b2, String.valueOf(System.currentTimeMillis()));
                wpf.a((Writer) b2);
            } catch (IOException e) {
                throw new SyncError(e.getMessage());
            } catch (Throwable th) {
                wpf.a((Writer) b2);
                throw th;
            }
        }
    }

    public final String a(String str) {
        return (String) this.b.get(str);
    }

    public final gak a(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    public final void b() {
        this.b.clear();
        File file = new File(this.a, ".tag");
        if (file.exists() && !wpd.b(file)) {
            try {
                new PrintWriter(file, far.c.name()).close();
            } catch (FileNotFoundException unused) {
            } catch (UnsupportedEncodingException unused2) {
                throw new AssertionError();
            }
        }
    }
}

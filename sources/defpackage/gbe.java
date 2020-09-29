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

/* renamed from: gbe reason: default package */
public final class gbe {
    final File a;
    private final Map<String, String> b;

    public gbe(File file) {
        this.b = new HashMap();
        this.a = file;
        c();
    }

    public gbe(String str) {
        this(new File(str));
    }

    private void c() {
        BufferedReader a2;
        File file = new File(this.a, ".tag");
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                a2 = fen.a(file, fbi.c);
                Properties properties = new Properties();
                properties.load(a2);
                for (Entry entry : properties.entrySet()) {
                    this.b.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
                xdl.a((Reader) a2);
            } catch (IOException e) {
                throw new SyncError(e.getMessage());
            } catch (Throwable th) {
                xdl.a((Reader) a2);
                throw th;
            }
        }
    }

    public final gbe a(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    public final String a(String str) {
        return (String) this.b.get(str);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        BufferedWriter b2;
        File file = new File(this.a, ".tag");
        if (this.a.exists() && this.a.isDirectory() && this.a.canWrite()) {
            try {
                b2 = fen.b(file, fbi.c);
                Properties properties = new Properties();
                properties.putAll(this.b);
                properties.store(b2, String.valueOf(System.currentTimeMillis()));
                xdl.a((Writer) b2);
            } catch (IOException e) {
                throw new SyncError(e.getMessage());
            } catch (Throwable th) {
                xdl.a((Writer) b2);
                throw th;
            }
        }
    }

    public final void b() {
        this.b.clear();
        File file = new File(this.a, ".tag");
        if (file.exists() && !xdj.b(file)) {
            try {
                new PrintWriter(file, fbi.c.name()).close();
            } catch (FileNotFoundException unused) {
            } catch (UnsupportedEncodingException unused2) {
                throw new AssertionError();
            }
        }
    }
}

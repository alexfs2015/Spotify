package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/* renamed from: jsi reason: default package */
public final class jsi {
    public String a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;

    public jsi() {
        String str = "";
        this.d = str;
        this.e = str;
        this.a = str;
    }

    public synchronized void a() {
        if (!this.c) {
            String property = System.getProperty("ro.csc.spotify.music.partnerid");
            if (property == null) {
                property = "";
            }
            this.d = property;
            String property2 = System.getProperty("ro.csc.spotify.music.referrerid");
            if (property2 == null) {
                property2 = "";
            }
            this.e = property2;
            this.a = Boolean.TRUE.toString();
            boolean z = false;
            this.b = !this.d.isEmpty() && !this.e.isEmpty();
            if (!this.b) {
                this.d = a("ro.csc.spotify.music.partnerid");
                this.e = a("ro.csc.spotify.music.referrerid");
                if (!this.d.isEmpty() && !this.e.isEmpty()) {
                    z = true;
                }
                this.b = z;
            }
            if (!this.b) {
                this.b = e();
            }
        }
        this.c = true;
    }

    private boolean e() {
        String str = "";
        Properties properties = new Properties();
        String str2 = "/oem/etc/spotify.preload";
        if (!new File(str2).exists()) {
            str2 = "/system/etc/spotify.preload";
        }
        boolean z = false;
        Reader reader = null;
        try {
            FileReader fileReader = new FileReader(str2);
            try {
                properties.load(fileReader);
                z = true;
                wpf.a((Reader) fileReader);
            } catch (FileNotFoundException unused) {
                reader = fileReader;
                wpf.a(reader);
                this.d = properties.getProperty("partner", str);
                this.e = properties.getProperty("referrer", str);
                this.a = properties.getProperty("allow_get_premium", str);
                return z;
            } catch (IOException e2) {
                e = e2;
                reader = fileReader;
                try {
                    Logger.e(e, str, new Object[0]);
                    wpf.a(reader);
                    this.d = properties.getProperty("partner", str);
                    this.e = properties.getProperty("referrer", str);
                    this.a = properties.getProperty("allow_get_premium", str);
                    return z;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                reader = fileReader;
                wpf.a(reader);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            wpf.a(reader);
            this.d = properties.getProperty("partner", str);
            this.e = properties.getProperty("referrer", str);
            this.a = properties.getProperty("allow_get_premium", str);
            return z;
        } catch (IOException e3) {
            e = e3;
            Logger.e(e, str, new Object[0]);
            wpf.a(reader);
            this.d = properties.getProperty("partner", str);
            this.e = properties.getProperty("referrer", str);
            this.a = properties.getProperty("allow_get_premium", str);
            return z;
        }
        this.d = properties.getProperty("partner", str);
        this.e = properties.getProperty("referrer", str);
        this.a = properties.getProperty("allow_get_premium", str);
        return z;
    }

    public final String b() {
        a();
        return this.d;
    }

    public final String c() {
        a();
        return this.e;
    }

    public final boolean d() {
        a();
        return this.b;
    }

    private String a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"getprop", str}).getInputStream()));
            try {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    readLine = str2;
                }
                wpf.a((Reader) bufferedReader2);
                return readLine;
            } catch (IOException | NullPointerException | SecurityException unused) {
                bufferedReader = bufferedReader2;
                wpf.a((Reader) bufferedReader);
                return str2;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                wpf.a((Reader) bufferedReader);
                throw th;
            }
        } catch (IOException | NullPointerException | SecurityException unused2) {
            wpf.a((Reader) bufferedReader);
            return str2;
        } catch (Throwable th2) {
            th = th2;
            wpf.a((Reader) bufferedReader);
            throw th;
        }
    }
}

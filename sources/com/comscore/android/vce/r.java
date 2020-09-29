package com.comscore.android.vce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;

class r {
    static final String a = "Network";
    final p b;
    final HashMap<String, a> c = new HashMap<>();
    final File d = new File(this.e.c().getCacheDir(), "comscore/vce");
    final s e;

    static class a implements Serializable {
        static final long a = 1;
        boolean b;
        String c;
        String d;
        String e;
        long f;
        long g;

        a() {
        }
    }

    r(p pVar, s sVar) {
        this.b = pVar;
        this.e = sVar;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, String str2) {
        a aVar;
        if (this.c.containsKey(str)) {
            aVar = (a) this.c.get(str);
        } else {
            a aVar2 = new a();
            StringBuilder sb = new StringBuilder();
            sb.append(ad.d(str));
            sb.append(".tmp");
            aVar2.c = sb.toString();
            aVar2.d = str2;
            if (d(aVar2)) {
                e(aVar2);
            }
            this.c.put(str, aVar2);
            aVar = aVar2;
        }
        if (a(aVar)) {
            b(aVar);
        }
        return aVar.e;
    }

    /* access modifiers changed from: 0000 */
    public HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("Connection", "Close");
        return httpURLConnection;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(a aVar) {
        boolean z = !aVar.b;
        if (aVar.f < System.currentTimeMillis()) {
            return true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        if (this.c.containsKey(str)) {
            return ((a) this.c.get(str)).b;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar) {
        c(aVar);
        if (aVar.b) {
            f(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str) {
        return this.c.containsKey(str) && !a((a) this.c.get(str));
    }

    /* access modifiers changed from: 0000 */
    public String c(String str) {
        if (this.c.containsKey(str)) {
            a aVar = (a) this.c.get(str);
            if (aVar.b) {
                return aVar.e;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void c(a aVar) {
        String str = aVar.d;
        System.currentTimeMillis();
        InputStream inputStream = null;
        try {
            HttpURLConnection a2 = a(new URL(str));
            inputStream = a2.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            if (sb.length() > 0) {
                aVar.e = sb.toString();
                long currentTimeMillis = System.currentTimeMillis();
                aVar.f = a2.getHeaderFieldDate("Expires", currentTimeMillis);
                aVar.g = a2.getHeaderFieldDate("Last-Modified", currentTimeMillis);
                aVar.b = true;
                if (aVar.f <= currentTimeMillis) {
                    aVar.f = currentTimeMillis + 432000000;
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
        } catch (IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused3) {
                }
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused4) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean d(a aVar) {
        File file = new File(this.d, aVar.c);
        return file.exists() && file.canRead();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r1 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r1 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r1.disconnect();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.System.currentTimeMillis()
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0021, all -> 0x0023 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0021, all -> 0x0023 }
            java.net.HttpURLConnection r1 = r3.a(r2)     // Catch:{ Exception -> 0x0021, all -> 0x0023 }
            int r4 = r1.getResponseCode()     // Catch:{ Exception -> 0x0021, all -> 0x0023 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r4 == r2) goto L_0x001a
            r2 = 204(0xcc, float:2.86E-43)
            if (r4 != r2) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r1 == 0) goto L_0x002d
        L_0x001d:
            r1.disconnect()
            goto L_0x002d
        L_0x0021:
            goto L_0x002a
        L_0x0023:
            r4 = move-exception
            if (r1 == 0) goto L_0x0029
            r1.disconnect()
        L_0x0029:
            throw r4
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            goto L_0x001d
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.r.d(java.lang.String):boolean");
    }

    /* access modifiers changed from: 0000 */
    public void e(a aVar) {
        try {
            File file = new File(this.d, aVar.c);
            if (file.exists()) {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                a aVar2 = (a) objectInputStream.readObject();
                objectInputStream.close();
                aVar.e = aVar2.e;
                aVar.f = aVar2.f;
                aVar.g = aVar2.g;
                aVar.b = true;
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void e(final String str) {
        this.e.c(new Runnable() {
            public void run() {
                r.this.d(str);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void f(a aVar) {
        try {
            if (!this.d.exists()) {
                this.d.mkdirs();
            }
            File file = new File(this.d, aVar.c);
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(aVar);
            objectOutputStream.close();
        } catch (IOException unused) {
        }
    }
}

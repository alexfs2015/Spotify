package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: wjc reason: default package */
final class wjc implements Callable<Map<String, wjh>> {
    private String a;

    wjc(String str) {
        this.a = str;
    }

    private static Map<String, wjh> a() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            wjh wjh = new wjh("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(wjh.a, wjh);
            wja.a().b("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private static wjh a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder sb = new StringBuilder("Invalid format of fabric file,");
                    sb.append(zipEntry.getName());
                    throw new IllegalStateException(sb.toString());
                }
                wjh wjh = new wjh(property, property2, property3);
                CommonUtils.a((Closeable) inputStream);
                return wjh;
            } catch (IOException e) {
                e = e;
                try {
                    StringBuilder sb2 = new StringBuilder("Error when parsing fabric properties ");
                    sb2.append(zipEntry.getName());
                    wja.a().c("Fabric", sb2.toString(), e);
                    CommonUtils.a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb22 = new StringBuilder("Error when parsing fabric properties ");
            sb22.append(zipEntry.getName());
            wja.a().c("Fabric", sb22.toString(), e);
            CommonUtils.a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            CommonUtils.a((Closeable) inputStream);
            throw th;
        }
    }

    private Map<String, wjh> b() {
        HashMap hashMap = new HashMap();
        ZipFile zipFile = new ZipFile(this.a);
        Enumeration entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                wjh a2 = a(zipEntry, zipFile);
                if (a2 != null) {
                    hashMap.put(a2.a, a2);
                    wja.a().b("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a2.a, a2.b}));
                }
            }
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
        return hashMap;
    }

    public final /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(a());
        hashMap.putAll(b());
        wji a2 = wja.a();
        StringBuilder sb = new StringBuilder("finish scanning in ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        a2.b("Fabric", sb.toString());
        return hashMap;
    }
}

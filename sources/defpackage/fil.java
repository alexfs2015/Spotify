package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.iid.zzaa;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: fil reason: default package */
final class fil {
    fil() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r8 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        a(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a0, code lost:
        throw r10;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0056=Splitter:B:16:0x0056, B:28:0x008d=Splitter:B:28:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.fim a(android.content.Context r8, java.lang.String r9, defpackage.fim r10, boolean r11) {
        /*
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            android.util.Log.isLoggable(r1, r0)
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = r10.a()
            java.lang.String r4 = "pub"
            r2.setProperty(r4, r3)
            java.lang.String r3 = r10.b()
            java.lang.String r4 = "pri"
            r2.setProperty(r4, r3)
            long r3 = r10.b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r8 = d(r8, r9)
            r9 = 0
            r8.createNewFile()     // Catch:{ IOException -> 0x00a1 }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00a1 }
            java.lang.String r4 = "rw"
            r3.<init>(r8, r4)     // Catch:{ IOException -> 0x00a1 }
            java.nio.channels.FileChannel r8 = r3.getChannel()     // Catch:{ all -> 0x009a }
            r8.lock()     // Catch:{ all -> 0x0091 }
            r4 = 0
            if (r11 == 0) goto L_0x007e
            long r6 = r8.size()     // Catch:{ all -> 0x0091 }
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x007e
            r8.position(r4)     // Catch:{ IOException -> 0x005c, zzaa -> 0x005a }
            fim r10 = a(r8)     // Catch:{ IOException -> 0x005c, zzaa -> 0x005a }
            if (r8 == 0) goto L_0x0056
            a(r9, r8)     // Catch:{ all -> 0x009a }
        L_0x0056:
            a(r9, r3)     // Catch:{ IOException -> 0x00a1 }
            return r10
        L_0x005a:
            r11 = move-exception
            goto L_0x005d
        L_0x005c:
            r11 = move-exception
        L_0x005d:
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0091 }
            int r0 = r0.length()     // Catch:{ all -> 0x0091 }
            int r0 = r0 + 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r1.<init>(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "Tried reading key pair before writing new one, but failed with: "
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r11)     // Catch:{ all -> 0x0091 }
        L_0x007e:
            r8.position(r4)     // Catch:{ all -> 0x0091 }
            java.io.OutputStream r11 = java.nio.channels.Channels.newOutputStream(r8)     // Catch:{ all -> 0x0091 }
            r2.store(r11, r9)     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x008d
            a(r9, r8)     // Catch:{ all -> 0x009a }
        L_0x008d:
            a(r9, r3)     // Catch:{ IOException -> 0x00a1 }
            return r10
        L_0x0091:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r11 = move-exception
            if (r8 == 0) goto L_0x0099
            a(r10, r8)     // Catch:{ all -> 0x009a }
        L_0x0099:
            throw r11     // Catch:{ all -> 0x009a }
        L_0x009a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x009c }
        L_0x009c:
            r10 = move-exception
            a(r8, r3)     // Catch:{ IOException -> 0x00a1 }
            throw r10     // Catch:{ IOException -> 0x00a1 }
        L_0x00a1:
            r8 = move-exception
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            int r10 = r10 + 21
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Failed to write key: "
            r11.append(r10)
            r11.append(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fil.a(android.content.Context, java.lang.String, fim, boolean):fim");
    }

    private static fim a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(fhj.a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(fhj.a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new fim(a(string, string2), b(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r7 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.fim a(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            java.nio.channels.FileChannel r7 = r0.getChannel()     // Catch:{ all -> 0x002c }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r7
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0023 }
            fim r1 = a(r7)     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r7 == 0) goto L_0x001f
            a(r2, r7)     // Catch:{ all -> 0x002c }
        L_0x001f:
            a(r2, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            if (r7 == 0) goto L_0x002b
            a(r1, r7)     // Catch:{ all -> 0x002c }
        L_0x002b:
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fil.a(java.io.File):fim");
    }

    private static fim a(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new fim(a(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new zzaa((Exception) e);
        }
    }

    static File a(Context context) {
        File b = fr.b(context);
        return (b == null || !b.isDirectory()) ? context.getFilesDir() : b;
    }

    private static KeyPair a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                throw new zzaa((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzaa((Exception) e2);
        }
    }

    private static void a(Context context, String str, fim fim) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (fim.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (zzaa unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        Editor edit = sharedPreferences.edit();
        edit.putString(fhj.a(str, "|P|"), fim.a());
        edit.putString(fhj.a(str, "|K|"), fim.b());
        edit.putString(fhj.a(str, "cre"), String.valueOf(fim.b));
        edit.commit();
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                eju.a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                eju.a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                eju.a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    private static long b(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(fhj.a(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    private final fim c(Context context, String str) {
        File d = d(context, str);
        if (!d.exists()) {
            return null;
        }
        try {
            return a(d);
        } catch (zzaa | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
            }
            try {
                return a(d);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                throw new zzaa((Exception) e2);
            }
        }
    }

    private static File d(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(a(context), str2);
    }

    /* access modifiers changed from: 0000 */
    public final fim a(Context context, String str) {
        fim fim = new fim(fgp.a(), System.currentTimeMillis());
        fim a = a(context, str, fim, true);
        String str2 = "FirebaseInstanceId";
        if (a == null || a.equals(fim)) {
            Log.isLoggable(str2, 3);
            a(context, str, fim);
            return fim;
        }
        Log.isLoggable(str2, 3);
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final fim b(Context context, String str) {
        try {
            fim c = c(context, str);
            if (c != null) {
                a(context, str, c);
                return c;
            }
            e = null;
            try {
                fim a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    a(context, str, a, false);
                    return a;
                }
            } catch (zzaa e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (zzaa e2) {
            e = e2;
        }
    }
}

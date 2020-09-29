package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okio.ByteString;

/* renamed from: wmk reason: default package */
public final class wmk {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final wmg c = wmg.a(null, a);
    public static final Charset d = Charset.forName("UTF-8");
    public static final Charset e = Charset.forName("ISO-8859-1");
    public static final TimeZone f = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> g = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };
    private static final ByteString h = ByteString.c("efbbbf");
    private static final ByteString i = ByteString.c("feff");
    private static final ByteString j = ByteString.c("fffe");
    private static final ByteString k = ByteString.c("0000ffff");
    private static final ByteString l = ByteString.c("ffff0000");
    private static final Charset m = Charset.forName("UTF-16BE");
    private static final Charset n = Charset.forName("UTF-16LE");
    private static final Charset o = Charset.forName("UTF-32BE");
    private static final Charset p = Charset.forName("UTF-32LE");
    private static final Method q;
    private static final Pattern r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    static {
        Method method = null;
        wme.a((wlz) null, a);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        q = method;
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = q;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(wpa wpa, int i2, TimeUnit timeUnit) {
        try {
            return b(wpa, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean b(wpa wpa, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = wpa.a().bl_() ? wpa.a().c() - nanoTime : Long.MAX_VALUE;
        wpa.a().a(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            wok wok = new wok();
            while (wpa.a(wok, 8192) != -1) {
                wok.r();
            }
            if (c2 == Long.MAX_VALUE) {
                wpa.a().bk_();
            } else {
                wpa.a().a(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                wpa.a().bk_();
            } else {
                wpa.a().a(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                wpa.a().bk_();
            } else {
                wpa.a().a(nanoTime + c2);
            }
            throw th;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static int a(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int b(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static String c(String str, int i2, int i3) {
        int a2 = a(str, i2, i3);
        return str.substring(a2, b(str, a2, i3));
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String a(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            int i2 = 0;
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = d(str, 0, str.length());
            } else {
                inetAddress = d(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = -1;
                int i5 = 0;
                while (i3 < address.length) {
                    int i6 = i3;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i3;
                    if (i7 > i5 && i7 >= 4) {
                        i4 = i3;
                        i5 = i7;
                    }
                    i3 = i6 + 2;
                }
                wok wok = new wok();
                while (i2 < address.length) {
                    if (i2 == i4) {
                        wok.j(58);
                        i2 += i5;
                        if (i2 == 16) {
                            wok.j(58);
                        }
                    } else {
                        if (i2 > 0) {
                            wok.j(58);
                        }
                        wok.m((long) (((address[i2] & 255) << 8) | (address[i2 + 1] & 255)));
                        i2 += 2;
                    }
                }
                return wok.o();
            }
            StringBuilder sb = new StringBuilder("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean d(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean c(String str) {
        return r.matcher(str).matches();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(wom wom, Charset charset) {
        if (wom.a(0, h)) {
            wom.i((long) h.h());
            return d;
        } else if (wom.a(0, i)) {
            wom.i((long) i.h());
            return m;
        } else if (wom.a(0, j)) {
            wom.i((long) j.h());
            return n;
        } else if (wom.a(0, k)) {
            wom.i((long) k.h());
            return o;
        } else if (!wom.a(0, l)) {
            return charset;
        } else {
            wom.i((long) l.h());
            return p;
        }
    }

    public static int a(String str, long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString());
            } else if (millis != 0 || j2 <= 0) {
                return (int) millis;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" too small.");
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if ((r14 - r9) != 0) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress d(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00cd
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            if (r11 > r1) goto L_0x0030
            r13 = 2
            java.lang.String r14 = "::"
            boolean r13 = r0.regionMatches(r6, r14, r5, r13)
            if (r13 == 0) goto L_0x0030
            if (r8 == r4) goto L_0x0026
            return r10
        L_0x0026:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r1) goto L_0x002d
            goto L_0x00cd
        L_0x002d:
            r9 = r11
            goto L_0x00a0
        L_0x0030:
            if (r7 == 0) goto L_0x009f
            r11 = 1
            java.lang.String r13 = ":"
            boolean r13 = r0.regionMatches(r6, r13, r5, r11)
            if (r13 == 0) goto L_0x003f
            int r6 = r6 + 1
            goto L_0x009f
        L_0x003f:
            java.lang.String r13 = "."
            boolean r6 = r0.regionMatches(r6, r13, r5, r11)
            if (r6 == 0) goto L_0x009e
            int r6 = r7 + -2
            r13 = r6
        L_0x004a:
            if (r9 >= r1) goto L_0x0092
            if (r13 != r2) goto L_0x004f
            goto L_0x0098
        L_0x004f:
            if (r13 == r6) goto L_0x005c
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005a
            goto L_0x0098
        L_0x005a:
            int r9 = r9 + 1
        L_0x005c:
            r14 = r9
            r15 = 0
        L_0x005e:
            if (r14 >= r1) goto L_0x0081
            char r11 = r0.charAt(r14)
            r5 = 48
            if (r11 < r5) goto L_0x0081
            r2 = 57
            if (r11 > r2) goto L_0x0081
            if (r15 != 0) goto L_0x0071
            if (r9 == r14) goto L_0x0071
            goto L_0x0095
        L_0x0071:
            int r15 = r15 * 10
            int r15 = r15 + r11
            int r15 = r15 - r5
            r2 = 255(0xff, float:3.57E-43)
            if (r15 <= r2) goto L_0x007a
            goto L_0x0095
        L_0x007a:
            int r14 = r14 + 1
            r2 = 16
            r5 = 0
            r11 = 1
            goto L_0x005e
        L_0x0081:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0086
            goto L_0x0095
        L_0x0086:
            int r2 = r13 + 1
            byte r5 = (byte) r15
            r3[r13] = r5
            r13 = r2
            r9 = r14
            r2 = 16
            r5 = 0
            r11 = 1
            goto L_0x004a
        L_0x0092:
            int r6 = r6 + r12
            if (r13 == r6) goto L_0x0097
        L_0x0095:
            r5 = 0
            goto L_0x0098
        L_0x0097:
            r5 = 1
        L_0x0098:
            if (r5 != 0) goto L_0x009b
            return r10
        L_0x009b:
            int r7 = r7 + 2
            goto L_0x00cd
        L_0x009e:
            return r10
        L_0x009f:
            r9 = r6
        L_0x00a0:
            r6 = r9
            r2 = 0
        L_0x00a2:
            if (r6 >= r1) goto L_0x00b4
            char r5 = r0.charAt(r6)
            int r5 = a(r5)
            if (r5 == r4) goto L_0x00b4
            int r2 = r2 << 4
            int r2 = r2 + r5
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00b4:
            int r5 = r6 - r9
            if (r5 == 0) goto L_0x00cc
            if (r5 <= r12) goto L_0x00bb
            goto L_0x00cc
        L_0x00bb:
            int r5 = r7 + 1
            int r10 = r2 >>> 8
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r5 + 1
            byte r2 = (byte) r2
            r3[r5] = r2
            r2 = 16
            r5 = 0
            goto L_0x000f
        L_0x00cc:
            return r10
        L_0x00cd:
            r0 = 16
            if (r7 == r0) goto L_0x00e2
            if (r8 != r4) goto L_0x00d4
            return r10
        L_0x00d4:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00e2:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00e7 }
            return r0
        L_0x00e7:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            goto L_0x00ee
        L_0x00ed:
            throw r0
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmk.d(java.lang.String, int, int):java.net.InetAddress");
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e2) {
            throw a("No System TLS", (Exception) e2);
        }
    }

    public static wlw b(List<wnk> list) {
        a aVar = new a();
        for (wnk wnk : list) {
            wmi.a.a(aVar, wnk.g.a(), wnk.h.a());
        }
        return aVar.a();
    }

    public static String a(wlx wlx, boolean z) {
        String str;
        String str2 = ":";
        if (wlx.b.contains(str2)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(wlx.b);
            sb.append("]");
            str = sb.toString();
        } else {
            str = wlx.b;
        }
        if (!z && wlx.c == wlx.a(wlx.a)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(wlx.c);
        return sb2.toString();
    }
}

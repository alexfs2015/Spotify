package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: evm reason: default package */
public final class evm extends esv {
    private static final String[] b = {"firebase_", "google_", "ga_"};
    Integer a = null;
    private SecureRandom c;
    private final AtomicLong d = new AtomicLong(0);
    private int e;

    evm(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                q().f.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final long f() {
        long andIncrement;
        long j;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nextLong = new Random(System.nanoTime() ^ l().a()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1, 1);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: 0000 */
    public final SecureRandom g() {
        c();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    static boolean a(String str) {
        bwx.a(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            String str5 = "gclid";
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter(str5);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str5, str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String str6 = "aclid";
            String queryParameter3 = uri.getQueryParameter(str6);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(str6, queryParameter3);
            }
            String str7 = "cp1";
            String queryParameter4 = uri.getQueryParameter(str7);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str7, queryParameter4);
            }
            String str8 = "anid";
            String queryParameter5 = uri.getQueryParameter(str8);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(str8, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            q().f.a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(String str, String str2) {
        if (str2 == null) {
            q().c.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            q().c.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                q().c.a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    q().c.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    private final boolean d(String str, String str2) {
        if (str2 == null) {
            q().c.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            q().c.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        q().c.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            q().c.a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            q().c.a("Name is required and can't be null. Type", str);
            return false;
        }
        bwx.a(str2);
        String[] strArr2 = b;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            q().c.a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            bwx.a(strArr);
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (c(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                q().c.a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            q().c.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            q().c.a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int b(String str) {
        String str2 = "event";
        if (!d(str2, str)) {
            return 2;
        }
        if (!a(str2, esx.a, str)) {
            return 13;
        }
        if (!a(str2, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int c(String str) {
        String str2 = "user property";
        if (!d(str2, str)) {
            return 6;
        }
        if (!a(str2, esz.a, str)) {
            return 15;
        }
        if (!a(str2, 24, str)) {
            return 6;
        }
        return 0;
    }

    private final boolean a(String str, String str2, int i, Object obj, boolean z) {
        Parcelable[] parcelableArr;
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    q().f.a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            q().f.a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            q().f.a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!g(str)) {
                if (TextUtils.isEmpty(this.r.a)) {
                    q().c.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", eqw.a(str));
                }
                return false;
            }
        } else if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(this.r.a)) {
                q().c.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (!g(str2)) {
            q().c.a("Invalid admob_app_id. Analytics disabled.", eqw.a(str2));
            return false;
        }
        return true;
    }

    static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean g(String str) {
        bwx.a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private static Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String a(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) > i) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
            str = null;
        }
        return str;
    }

    static Object a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true);
        }
        if (!e(str)) {
            i = 100;
        }
        return a(i, obj, false);
    }

    static Bundle[] a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (a(r2, 40, r14) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (a(r2, 40, r14) == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(java.lang.String r19, java.lang.String r20, android.os.Bundle r21, java.util.List<java.lang.String> r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r6 = r18
            r7 = r21
            r8 = r22
            r9 = 0
            if (r7 == 0) goto L_0x016e
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r7)
            java.util.Set r0 = r21.keySet()
            java.util.Iterator r11 = r0.iterator()
            r13 = 0
        L_0x0017:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r0 = r11.next()
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            r15 = 40
            r0 = 3
            if (r8 == 0) goto L_0x0032
            boolean r1 = r8.contains(r14)
            if (r1 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x006a
        L_0x0032:
            r1 = 14
            java.lang.String r2 = "event param"
            if (r23 == 0) goto L_0x0050
            boolean r3 = r6.a(r2, r14)
            if (r3 != 0) goto L_0x0040
        L_0x003e:
            r3 = 3
            goto L_0x0051
        L_0x0040:
            boolean r3 = r6.a(r2, r9, r14)
            if (r3 != 0) goto L_0x0049
            r3 = 14
            goto L_0x0051
        L_0x0049:
            boolean r3 = r6.a(r2, r15, r14)
            if (r3 != 0) goto L_0x0050
            goto L_0x003e
        L_0x0050:
            r3 = 0
        L_0x0051:
            if (r3 != 0) goto L_0x0069
            boolean r3 = r6.d(r2, r14)
            if (r3 != 0) goto L_0x005b
        L_0x0059:
            r1 = 3
            goto L_0x006a
        L_0x005b:
            boolean r3 = r6.a(r2, r9, r14)
            if (r3 != 0) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            boolean r1 = r6.a(r2, r15, r14)
            if (r1 != 0) goto L_0x0030
            goto L_0x0059
        L_0x0069:
            r1 = r3
        L_0x006a:
            java.lang.String r5 = "_ev"
            r4 = 1
            if (r1 == 0) goto L_0x0086
            boolean r2 = a(r10, r1)
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = a(r14, r15, r4)
            r10.putString(r5, r2)
            if (r1 != r0) goto L_0x0081
            a(r10, r14)
        L_0x0081:
            r10.remove(r14)
            goto L_0x0129
        L_0x0086:
            java.lang.Object r3 = r7.get(r14)
            r18.c()
            if (r24 == 0) goto L_0x00c2
            boolean r0 = r3 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x0098
            r0 = r3
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
            goto L_0x00a3
        L_0x0098:
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00ba
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
        L_0x00a3:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x00ba
            eqw r1 = r18.q()
            eqy r1 = r1.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "param"
            java.lang.String r4 = "Parameter array is too long; discarded. Value kind, name, array length"
            r1.a(r4, r2, r14, r0)
            r0 = 0
            goto L_0x00bb
        L_0x00ba:
            r0 = 1
        L_0x00bb:
            if (r0 != 0) goto L_0x00c2
            r0 = 17
            r12 = r5
            r9 = 1
            goto L_0x010a
        L_0x00c2:
            evw r0 = r18.s()
            eqm$a<java.lang.Boolean> r1 = defpackage.eqm.S
            r4 = r19
            boolean r0 = r0.c(r4, r1)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = e(r20)
            if (r0 != 0) goto L_0x00dc
        L_0x00d6:
            boolean r0 = e(r14)
            if (r0 == 0) goto L_0x00f2
        L_0x00dc:
            r16 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "param"
            r0 = r18
            r2 = r14
            r17 = r3
            r3 = r16
            r9 = 1
            r4 = r17
            r12 = r5
            r5 = r24
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x0105
        L_0x00f2:
            r17 = r3
            r12 = r5
            r9 = 1
            r3 = 100
            java.lang.String r1 = "param"
            r0 = r18
            r2 = r14
            r4 = r17
            r5 = r24
            boolean r0 = r0.a(r1, r2, r3, r4, r5)
        L_0x0105:
            if (r0 == 0) goto L_0x0109
            r0 = 0
            goto L_0x010a
        L_0x0109:
            r0 = 4
        L_0x010a:
            if (r0 == 0) goto L_0x012c
            boolean r1 = r12.equals(r14)
            if (r1 != 0) goto L_0x012c
            boolean r0 = a(r10, r0)
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = a(r14, r15, r9)
            r10.putString(r12, r0)
            java.lang.Object r0 = r7.get(r14)
            a(r10, r0)
        L_0x0126:
            r10.remove(r14)
        L_0x0129:
            r9 = 0
            goto L_0x0017
        L_0x012c:
            boolean r0 = a(r14)
            if (r0 == 0) goto L_0x016b
            int r13 = r13 + 1
            r0 = 25
            if (r13 <= r0) goto L_0x016b
            r0 = 48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Event can't contain more than 25 params"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            eqw r1 = r18.q()
            eqy r1 = r1.c
            equ r2 = r18.n()
            r3 = r20
            java.lang.String r2 = r2.a(r3)
            equ r4 = r18.n()
            java.lang.String r4 = r4.a(r7)
            r1.a(r0, r2, r4)
            r0 = 5
            a(r10, r0)
            r10.remove(r14)
            goto L_0x0129
        L_0x016b:
            r3 = r20
            goto L_0x0129
        L_0x016e:
            r10 = 0
        L_0x016f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evm.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    private static boolean a(Bundle bundle, int i) {
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    private static void a(Bundle bundle, Object obj) {
        bwx.a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    private static int h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    /* access modifiers changed from: 0000 */
    public final int b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = a("user property referrer", str, h(str), obj, false);
        } else {
            z = a("user property", str, h(str), obj, false);
        }
        return z ? 0 : 7;
    }

    static Object c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return a(h(str), obj, true);
        }
        return a(h(str), obj, false);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    q().h.a("Not putting event parameter. Invalid value type. name, type", n().b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    public final void a(int i, String str, String str2, int i2) {
        b(i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.r.d().a("auto", "_err", bundle);
    }

    static MessageDigest h() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    static long a(byte[] bArr) {
        bwx.a(bArr);
        int i = 0;
        bwx.a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    static boolean a(Context context) {
        bwx.a(context);
        if (VERSION.SDK_INT >= 24) {
            return b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    private static boolean b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean d(String str) {
        c();
        if (cab.a(m()).a(str) == 0) {
            return true;
        }
        q().j.a("Permission not granted", str);
        return false;
    }

    static boolean e(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return s().i().equals(str);
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    q().f.a("Param value can't be null", n().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    public final eqk a(String str, String str2, Bundle bundle, String str3, long j) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (b(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            String str4 = "_o";
            bundle3.putString(str4, str3);
            String str5 = str2;
            eqk eqk = new eqk(str5, new eqh(a(a(str, str2, bundle3, Collections.singletonList(str4), false, false))), str3, j);
            return eqk;
        }
        q().c.a("Invalid conditional property event name", n().c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    public final long a(Context context, String str) {
        c();
        bwx.a(context);
        bwx.a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h = h();
        if (h == null) {
            q().c.a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo b2 = cab.a(context).b(m().getPackageName(), 64);
                    if (b2.signatures != null && b2.signatures.length > 0) {
                        return a(h.digest(b2.signatures[0].toByteArray()));
                    }
                    q().f.a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e2) {
                q().c.a("Package name not found", e2);
            }
        }
        return 0;
    }

    private final boolean c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = cab.a(context).b(str, 64);
            if (!(b2 == null || b2.signatures == null || b2.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e2) {
            q().c.a("Error obtaining certificate", e2);
        } catch (NameNotFoundException e3) {
            q().c.a("Package name not found", e3);
        }
        return true;
    }

    static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: 0000 */
    public final String i() {
        byte[] bArr = new byte[16];
        g().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: 0000 */
    public final void a(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            q().f.a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}

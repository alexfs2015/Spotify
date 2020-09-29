package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wjn reason: default package */
public final class wjn {
    public static final String a = System.getProperty("line.separator");
    private static final String[] b = new String[256];
    private static final String[] c = new String[256];

    private static boolean a(char c2) {
        return c2 == '\"';
    }

    static {
        String str;
        wjn.class.desiredAssertionStatus();
        int i = 0;
        while (true) {
            str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
            if (i >= 10) {
                break;
            }
            String[] strArr = b;
            StringBuilder sb = new StringBuilder(str);
            sb.append(i);
            strArr[i] = sb.toString();
            c[i] = String.valueOf(i);
            i++;
        }
        while (i < 16) {
            char c2 = (char) ((i + 97) - 10);
            String[] strArr2 = b;
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(c2);
            strArr2[i] = sb2.toString();
            c[i] = String.valueOf(c2);
            i++;
        }
        while (i < 256) {
            String hexString = Integer.toHexString(i);
            b[i] = hexString;
            c[i] = hexString;
            i++;
        }
    }

    private wjn() {
    }

    public static String a(int i) {
        return b[i & 255];
    }

    public static String a(Object obj) {
        return obj == null ? "null_object" : a(obj.getClass());
    }

    public static String a(Class<?> cls) {
        String name = ((Class) wjk.a(cls, "clazz")).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf + 1) : name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r9 != ',') goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence a(java.lang.CharSequence r13) {
        /*
            java.lang.String r0 = "value"
            java.lang.Object r0 = defpackage.wjk.a(r13, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000f
            return r13
        L_0x000f:
            int r1 = r0 + -1
            r2 = 0
            char r3 = r13.charAt(r2)
            boolean r3 = a(r3)
            r4 = 1
            if (r3 == 0) goto L_0x002b
            char r3 = r13.charAt(r1)
            boolean r3 = a(r3)
            if (r3 == 0) goto L_0x002b
            if (r0 == r4) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r0 + 7
            r5.<init>(r6)
            r6 = 34
            r5.append(r6)
            r7 = 0
            r8 = 0
        L_0x003a:
            if (r2 >= r0) goto L_0x007f
            char r9 = r13.charAt(r2)
            r10 = 10
            if (r9 == r10) goto L_0x0078
            r10 = 13
            if (r9 == r10) goto L_0x0078
            if (r9 == r6) goto L_0x004f
            r10 = 44
            if (r9 == r10) goto L_0x0078
            goto L_0x0079
        L_0x004f:
            if (r2 == 0) goto L_0x0073
            if (r2 != r1) goto L_0x0054
            goto L_0x0073
        L_0x0054:
            int r10 = r2 + 1
            char r11 = r13.charAt(r10)
            boolean r11 = a(r11)
            int r12 = r2 + -1
            char r12 = r13.charAt(r12)
            boolean r12 = a(r12)
            if (r12 != 0) goto L_0x0079
            if (r11 == 0) goto L_0x006e
            if (r10 != r1) goto L_0x0079
        L_0x006e:
            r5.append(r6)
            r7 = 1
            goto L_0x0079
        L_0x0073:
            if (r3 != 0) goto L_0x007c
            r5.append(r6)
        L_0x0078:
            r8 = 1
        L_0x0079:
            r5.append(r9)
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x003a
        L_0x007f:
            if (r7 != 0) goto L_0x0087
            if (r8 == 0) goto L_0x0086
            if (r3 != 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            return r13
        L_0x0087:
            r5.append(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjn.a(java.lang.CharSequence):java.lang.CharSequence");
    }

    public static List<CharSequence> b(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList(2);
        wjc b2 = wjc.b();
        StringBuilder sb = b2.k;
        if (sb == null) {
            sb = new StringBuilder(512);
            b2.k = sb;
        } else {
            sb.setLength(0);
        }
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = charSequence.charAt(i);
            if (!z) {
                if (!(charAt == 10 || charAt == 13)) {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            sb.append(charAt);
                        } else {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        }
                    } else if (sb.length() == 0) {
                        z = true;
                    }
                }
                throw a(charSequence, i);
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else if (i == length) {
                arrayList.add(sb.toString());
                return arrayList;
            } else {
                i++;
                char charAt2 = charSequence.charAt(i);
                if (charAt2 == '\"') {
                    sb.append('\"');
                } else if (charAt2 == ',') {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    z = false;
                } else {
                    throw a(charSequence, i - 1);
                }
            }
            i++;
        }
        if (!z) {
            arrayList.add(sb.toString());
            return arrayList;
        }
        throw a(charSequence, length);
    }

    private static IllegalArgumentException a(CharSequence charSequence, int i) {
        StringBuilder sb = new StringBuilder("invalid escaped CSV field: ");
        sb.append(charSequence);
        sb.append(" index: ");
        sb.append(i);
        return new IllegalArgumentException(sb.toString());
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }
}

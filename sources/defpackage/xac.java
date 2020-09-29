package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: xac reason: default package */
public final class xac {
    public final String[] a;

    /* renamed from: xac$a */
    public static final class a {
        final List<String> a = new ArrayList(20);

        /* access modifiers changed from: 0000 */
        public final a a(String str) {
            String str2 = ":";
            int indexOf = str.indexOf(str2, 1);
            if (indexOf != -1) {
                return c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            String str3 = "";
            return str.startsWith(str2) ? c(str3, str.substring(1)) : c(str3, str);
        }

        public final a a(String str, String str2) {
            xac.c(str);
            xac.a(str2, str);
            return c(str, str2);
        }

        public final xac a() {
            return new xac(this);
        }

        public final a b(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase((String) this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a b(String str, String str2) {
            xac.c(str);
            return c(str, str2);
        }

        public final String c(String str) {
            for (int size = this.a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.a.get(size))) {
                    return (String) this.a.get(size + 1);
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final a c(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public final a d(String str, String str2) {
            xac.c(str);
            xac.a(str2, str);
            b(str);
            c(str, str2);
            return this;
        }
    }

    xac(a aVar) {
        this.a = (String[]) aVar.a.toArray(new String[aVar.a.size()]);
    }

    private xac(String[] strArr) {
        this.a = strArr;
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static xac a(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                c(str);
                a(str2, str);
            }
            return new xac(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(xaq.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }

    static void c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(xaq.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public final String a(int i) {
        return this.a[i << 1];
    }

    public final String a(String str) {
        return a(this.a, str);
    }

    public final Set<String> a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final String b(int i) {
        return this.a[(i << 1) + 1];
    }

    public final List<String> b(String str) {
        int length = this.a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final a b() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public final Map<String, List<String>> c() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            String lowerCase = a(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(b(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xac) && Arrays.equals(((xac) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}

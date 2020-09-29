package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bcq reason: default package */
public final class bcq implements bcn {
    public static final bcq a = new bcq(Collections.emptyMap());
    final Map<String, byte[]> b;
    private int c;

    public static bcq a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0 || readInt2 > 10485760) {
                StringBuilder sb = new StringBuilder("Invalid value size: ");
                sb.append(readInt2);
                throw new IOException(sb.toString());
            }
            byte[] bArr = new byte[readInt2];
            dataInputStream.readFully(bArr);
            hashMap.put(readUTF, bArr);
        }
        return new bcq(hashMap);
    }

    private bcq(Map<String, byte[]> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final bcq a(bcp bcp) {
        Map a2 = a(this.b, bcp);
        if (a(a2)) {
            return this;
        }
        return new bcq(a2);
    }

    public final String a(String str, String str2) {
        if (this.b.containsKey(str)) {
            return new String((byte[]) this.b.get(str), Charset.forName("UTF-8"));
        }
        return null;
    }

    public final long a(String str, long j) {
        if (this.b.containsKey(str)) {
            return ByteBuffer.wrap((byte[]) this.b.get(str)).getLong();
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a(((bcq) obj).b);
    }

    private boolean a(Map<String, byte[]> map) {
        if (this.b.size() != map.size()) {
            return false;
        }
        for (Entry entry : this.b.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.c == 0) {
            int i = 0;
            for (Entry entry : this.b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.c = i;
        }
        return this.c;
    }

    private static Map<String, byte[]> a(Map<String, byte[]> map, bcp bcp) {
        HashMap hashMap = new HashMap(map);
        a(hashMap, bcp.a());
        a(hashMap, bcp.b());
        return hashMap;
    }

    private static void a(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    private static void a(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        byte[] bArr;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else {
                throw new IllegalArgumentException();
            }
            if (bArr.length <= 10485760) {
                hashMap.put(str, bArr);
            } else {
                StringBuilder sb = new StringBuilder("The size of ");
                sb.append(str);
                sb.append(" (");
                sb.append(bArr.length);
                sb.append(") is greater than maximum allowed: 10485760");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}

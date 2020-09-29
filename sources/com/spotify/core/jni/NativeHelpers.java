package com.spotify.core.jni;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class NativeHelpers {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private static int nextNull(byte[] bArr, int i) {
        while (bArr[i] != 0) {
            try {
                i++;
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("Invalid character found at offset ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
        return i;
    }

    private static void writeStringToStream(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byteArrayOutputStream.write(str.getBytes(UTF_8));
        byteArrayOutputStream.write(0);
    }

    public static Map<String, String> byteArrayToMap(byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (bArr == null) {
            return hashMap;
        }
        int i = 0;
        while (i < bArr.length) {
            int nextNull = nextNull(bArr, i);
            String str = new String(bArr, i, nextNull - i, UTF_8);
            int i2 = nextNull + 1;
            int nextNull2 = nextNull(bArr, i2);
            i = nextNull2 + 1;
            hashMap.put(str, new String(bArr, i2, nextNull2 - i2, UTF_8));
        }
        return hashMap;
    }

    public static byte[] mapToByteArray(Map<String, String> map) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                writeStringToStream(byteArrayOutputStream, (String) entry.getKey());
                writeStringToStream(byteArrayOutputStream, (String) entry.getValue());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    protected NativeHelpers() {
        throw new UnsupportedOperationException("This class should not be directly instantiated");
    }
}

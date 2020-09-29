package com.comscore.android.vce;

import android.os.Looper;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ad {
    private ad() {
    }

    static String a(String str) {
        String[] split;
        StringBuilder sb;
        String str2 = str;
        String str3 = "=";
        String str4 = "&";
        String str5 = "#";
        String str6 = "?";
        String str7 = "";
        if (str2 == null) {
            return str7;
        }
        try {
            String decode = URLDecoder.decode(str2, "UTF-8");
            int indexOf = decode.indexOf(str6);
            int indexOf2 = decode.indexOf(str5);
            if (indexOf == -1) {
                return decode;
            }
            String substring = decode.substring(0, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = decode.length();
            }
            String substring2 = decode.substring(indexOf2, indexOf2);
            String str8 = str7;
            for (String str9 : decode.substring(indexOf + 1, indexOf2).split(str4)) {
                String[] split2 = str9.split(str3);
                if (str8.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str8);
                    sb2.append(str4);
                    str8 = sb2.toString();
                }
                if (split2.length == 2) {
                    sb = new StringBuilder();
                    sb.append(str8);
                    sb.append(b(split2[0]));
                    sb.append(str3);
                    sb.append(b(split2[1]));
                } else {
                    sb = new StringBuilder();
                    sb.append(str8);
                    sb.append(str9);
                }
                str8 = sb.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(substring);
            sb3.append(str6);
            sb3.append(str8);
            String sb4 = sb3.toString();
            if (!substring2.equals(str7)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(str5);
                sb5.append(substring2);
                sb4 = sb5.toString();
            }
            return sb4;
        } catch (Exception unused) {
            return str2;
        }
    }

    static String a(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        return a(strArr, str, 0, strArr.length);
    }

    private static String a(String[] strArr, String str, int i, int i2) {
        if (strArr == null) {
            return null;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(i3 * ((strArr[i] == null ? 16 : strArr[i].length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                sb.append(str);
            }
            if (strArr[i4] != null) {
                sb.append(strArr[i4]);
            }
        }
        return sb.toString();
    }

    private static JSONArray a(Object obj) {
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray.put(b(Array.get(obj, i)));
            }
            return jSONArray;
        }
        StringBuilder sb = new StringBuilder("Not a primitive data: ");
        sb.append(obj.getClass());
        throw new JSONException(sb.toString());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.Object>, for r2v0, types: [java.util.Collection<java.lang.Object>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray a(java.util.Collection<java.lang.Object> r2) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r2 == 0) goto L_0x001d
            java.util.Iterator r2 = r2.iterator()
        L_0x000b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = b(r1)
            r0.put(r1)
            goto L_0x000b
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.ad.a(java.util.Collection):org.json.JSONArray");
    }

    static JSONObject a(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                try {
                    jSONObject.put(str, b(entry.getValue()));
                } catch (JSONException unused) {
                }
            } else {
                throw new NullPointerException("key == null");
            }
        }
        return jSONObject;
    }

    static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    static String[] a(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                strArr[i] = jSONArray.getString(i);
                i++;
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    private static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return a((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return a(obj);
            }
            if (obj instanceof Map) {
                return a((Map) obj);
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    obj = obj.toString();
                }
                return null;
            }
            return obj;
        } catch (Exception unused) {
        }
    }

    static String b(String str) {
        if (str == null) {
            return "";
        }
        try {
            str = URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (Exception unused) {
        }
        return str;
    }

    static Set<String> b(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                hashSet.add(jSONArray.getString(i));
                i++;
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    static String c(String str) {
        if (str == null) {
            return "";
        }
        try {
            str = str.replaceAll("'", "%27");
        } catch (Exception unused) {
        }
        return str;
    }

    static String d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.toUpperCase().getBytes("UTF-8"));
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return str;
        }
    }
}

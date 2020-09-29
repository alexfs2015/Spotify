package defpackage;

import com.facebook.FacebookRequestError.Category;
import com.facebook.internal.FacebookRequestErrorClassification$1;
import com.facebook.internal.FacebookRequestErrorClassification$2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: amq reason: default package */
public final class amq {
    private static amq g;
    public final Map<Integer, Set<Integer>> a;
    public final Map<Integer, Set<Integer>> b;
    public final Map<Integer, Set<Integer>> c;
    public final String d;
    public final String e;
    public final String f;

    /* renamed from: amq$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[Category.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.FacebookRequestError$Category[] r0 = com.facebook.FacebookRequestError.Category.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.FacebookRequestError$Category r1 = com.facebook.FacebookRequestError.Category.OTHER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.FacebookRequestError$Category r1 = com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.FacebookRequestError$Category r1 = com.facebook.FacebookRequestError.Category.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.amq.AnonymousClass1.<clinit>():void");
        }
    }

    private amq(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public static synchronized amq a() {
        amq amq;
        synchronized (amq.class) {
            if (g == null) {
                amq amq2 = new amq(null, new FacebookRequestErrorClassification$1(), new FacebookRequestErrorClassification$2(), null, null, null);
                g = amq2;
            }
            amq = g;
        }
        return amq;
    }

    public static amq a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    String str4 = "recovery_message";
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString(str4, null);
                        map = a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString(str4, null);
                        map2 = a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString(str4, null);
                        map3 = a(optJSONObject);
                    }
                }
            }
        }
        amq amq = new amq(map, map2, map3, str, str2, str3);
        return amq;
    }

    private static Map<Integer, Set<Integer>> a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }
}

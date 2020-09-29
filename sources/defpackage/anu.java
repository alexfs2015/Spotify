package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: anu reason: default package */
public final class anu {
    private static final Map<Class<?>, a> a;

    /* renamed from: anu$a */
    public interface a {
        void a(JSONObject jSONObject, String str, Object obj);
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(String.class, new a() {
            public final void a(JSONObject jSONObject, String str, Object obj) {
                jSONObject.put(str, obj);
            }
        });
        a.put(String[].class, new a() {
            public final void a(JSONObject jSONObject, String str, Object obj) {
                JSONArray jSONArray = new JSONArray();
                for (String put : (String[]) obj) {
                    jSONArray.put(put);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        a.put(JSONArray.class, new a() {
            public final void a(JSONObject jSONObject, String str, Object obj) {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    public static JSONObject a(aok aok) {
        if (aok == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : aok.a.keySet()) {
            Object obj = aok.a.get(str);
            if (obj != null) {
                a aVar = (a) a.get(obj.getClass());
                if (aVar != null) {
                    aVar.a(jSONObject, str, obj);
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported type: ");
                    sb.append(obj.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return jSONObject;
    }
}

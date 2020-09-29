package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: duo reason: default package */
final class duo implements bgl<Object> {
    private final /* synthetic */ ced a;
    private final /* synthetic */ duj b;

    duo(duj duj, ced ced) {
        this.b = duj;
        this.a = ced;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.b.b);
            this.a.a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            clu.a("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}

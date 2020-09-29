package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dvf reason: default package */
final class dvf implements bhc<Object> {
    private final /* synthetic */ ceu a;
    private final /* synthetic */ dva b;

    dvf(dva dva, ceu ceu) {
        this.b = dva;
        this.a = ceu;
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
            cml.a("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}

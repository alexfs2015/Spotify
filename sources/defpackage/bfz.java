package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: bfz reason: default package */
public final class bfz implements bhc<Object> {
    public final HashMap<String, cqt<JSONObject>> a = new HashMap<>();

    public final void a(String str) {
        cqt cqt = (cqt) this.a.get(str);
        if (cqt == null) {
            cml.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!cqt.isDone()) {
            cqt.cancel(true);
        }
        this.a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        cpn.a(3);
        cqt cqt = (cqt) this.a.get(str);
        if (cqt == null) {
            cml.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            cqt.b(new JSONObject(str2));
        } catch (JSONException e) {
            cml.a("Failed constructing JSON object from value passed from javascript", e);
            cqt.b(null);
        } finally {
            this.a.remove(str);
        }
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: bfi reason: default package */
public final class bfi implements bgl<Object> {
    public final HashMap<String, cqc<JSONObject>> a = new HashMap<>();

    public final void a(String str) {
        cqc cqc = (cqc) this.a.get(str);
        if (cqc == null) {
            clu.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!cqc.isDone()) {
            cqc.cancel(true);
        }
        this.a.remove(str);
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        cow.a(3);
        cqc cqc = (cqc) this.a.get(str);
        if (cqc == null) {
            clu.a("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            cqc.b(new JSONObject(str2));
        } catch (JSONException e) {
            clu.a("Failed constructing JSON object from value passed from javascript", e);
            cqc.b(null);
        } finally {
            this.a.remove(str);
        }
    }
}

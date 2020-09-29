package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: agn reason: default package */
final class agn {
    private Map<String, Object> a;

    public final String toString() {
        return new JSONObject(this.a).toString();
    }
}

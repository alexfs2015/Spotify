package defpackage;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: ahb reason: default package */
final class ahb {
    private Map<String, Object> a;

    public final String toString() {
        return new JSONObject(this.a).toString();
    }
}

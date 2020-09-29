package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: ccv reason: default package */
public class ccv {
    private final String a;
    final cti q;

    public ccv(cti cti) {
        this(cti, "");
    }

    public ccv(cti cti, String str) {
        this.q = cti;
        this.a = str;
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            this.q.a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            cml.a("Error occured while dispatching size change.", e);
        }
    }

    public final void a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.q.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            cml.a("Error occured while obtaining screen information.", e);
        }
    }

    public final void a(String str) {
        try {
            this.q.a("onError", new JSONObject().put("message", str).put("action", this.a));
        } catch (JSONException e) {
            cml.a("Error occurred while dispatching error event.", e);
        }
    }

    public final void b(String str) {
        try {
            this.q.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            cml.a("Error occured while dispatching state change.", e);
        }
    }
}

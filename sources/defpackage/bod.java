package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bod reason: default package */
public final class bod {
    int a;
    String b;
    List<boc> c;
    List<bwu> d;
    double e;

    /* renamed from: bod$a */
    public static class a {
        final bod a = new bod(0);

        public final a a(JSONObject jSONObject) {
            bod bod = this.a;
            bod.a();
            if (jSONObject != null) {
                String optString = jSONObject.optString("containerType", "");
                char c = 65535;
                int hashCode = optString.hashCode();
                if (hashCode != 6924225) {
                    if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                        c = 0;
                    }
                } else if (optString.equals("AUDIOBOOK_CONTAINER")) {
                    c = 1;
                }
                if (c == 0) {
                    bod.a = 0;
                } else if (c == 1) {
                    bod.a = 1;
                }
                bod.b = jSONObject.optString("title", null);
                JSONArray optJSONArray = jSONObject.optJSONArray("sections");
                if (optJSONArray != null) {
                    bod.c = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            boc boc = new boc();
                            boc.a(optJSONObject);
                            bod.c.add(boc);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
                if (optJSONArray2 != null) {
                    bod.d = new ArrayList();
                    eiv.a(bod.d, optJSONArray2);
                }
                bod.e = jSONObject.optDouble("containerDuration", bod.e);
            }
            return this;
        }
    }

    private bod() {
        a();
    }

    /* synthetic */ bod(byte b2) {
        this();
    }

    private bod(bod bod) {
        this.a = bod.a;
        this.b = bod.b;
        this.c = bod.c;
        this.d = bod.d;
        this.e = bod.e;
    }

    /* synthetic */ bod(bod bod, byte b2) {
        this(bod);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bod)) {
            return false;
        }
        bod bod = (bod) obj;
        return this.a == bod.a && TextUtils.equals(this.b, bod.b) && bxm.a(this.c, bod.c) && bxm.a(this.d, bod.d) && this.e == bod.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }
}

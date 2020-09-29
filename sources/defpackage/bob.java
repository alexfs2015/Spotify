package defpackage;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bob reason: default package */
public final class bob {
    private static final ein c = new ein("MediaLiveSeekableRange", 0);
    public final long a;
    public final boolean b;
    private final long d;
    private final boolean e;

    private bob(long j, long j2, boolean z, boolean z2) {
        this.d = Math.max(j, 0);
        this.a = Math.max(j2, 0);
        this.e = z;
        this.b = z2;
    }

    static bob a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String str = "start";
        if (jSONObject.has(str)) {
            String str2 = "end";
            if (jSONObject.has(str2)) {
                try {
                    bob bob = new bob((long) (jSONObject.getDouble(str) * 1000.0d), (long) (jSONObject.getDouble(str2) * 1000.0d), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
                    return bob;
                } catch (JSONException unused) {
                    ein ein = c;
                    String valueOf = String.valueOf(jSONObject);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                    sb.append(valueOf);
                    ein.b(sb.toString(), new Object[0]);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bob)) {
            return false;
        }
        bob bob = (bob) obj;
        return this.d == bob.d && this.a == bob.a && this.e == bob.e && this.b == bob.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.d), Long.valueOf(this.a), Boolean.valueOf(this.e), Boolean.valueOf(this.b)});
    }
}

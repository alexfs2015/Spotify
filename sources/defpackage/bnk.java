package defpackage;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnk reason: default package */
public final class bnk {
    private static final ehw c = new ehw("MediaLiveSeekableRange", 0);
    public final long a;
    public final boolean b;
    private final long d;
    private final boolean e;

    private bnk(long j, long j2, boolean z, boolean z2) {
        this.d = Math.max(j, 0);
        this.a = Math.max(j2, 0);
        this.e = z;
        this.b = z2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.d), Long.valueOf(this.a), Boolean.valueOf(this.e), Boolean.valueOf(this.b)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnk)) {
            return false;
        }
        bnk bnk = (bnk) obj;
        return this.d == bnk.d && this.a == bnk.a && this.e == bnk.e && this.b == bnk.b;
    }

    static bnk a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String str = "start";
        if (jSONObject.has(str)) {
            String str2 = "end";
            if (jSONObject.has(str2)) {
                try {
                    bnk bnk = new bnk((long) (jSONObject.getDouble(str) * 1000.0d), (long) (jSONObject.getDouble(str2) * 1000.0d), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
                    return bnk;
                } catch (JSONException unused) {
                    ehw ehw = c;
                    String valueOf = String.valueOf(jSONObject);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                    sb.append(valueOf);
                    ehw.b(sb.toString(), new Object[0]);
                }
            }
        }
        return null;
    }
}

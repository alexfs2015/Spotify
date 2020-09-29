package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: bnp reason: default package */
public final class bnp {
    public final long a;
    public final int b;
    public final boolean c;
    public final JSONObject d;

    /* renamed from: bnp$a */
    public static class a {
        public long a;
        public int b = 0;
        public JSONObject c;

        public final bnp a() {
            bnp bnp = new bnp(this.a, this.b, false, this.c, 0);
            return bnp;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnp)) {
            return false;
        }
        bnp bnp = (bnp) obj;
        return this.a == bnp.a && this.b == bnp.b && this.c == bnp.c && bwv.a(this.d, bnp.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }

    private bnp(long j, int i, boolean z, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = jSONObject;
    }

    /* synthetic */ bnp(long j, int i, boolean z, JSONObject jSONObject, byte b2) {
        this(j, i, z, jSONObject);
    }
}

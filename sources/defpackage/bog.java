package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: bog reason: default package */
public final class bog {
    public final long a;
    public final int b;
    public final boolean c;
    public final JSONObject d;

    /* renamed from: bog$a */
    public static class a {
        public long a;
        public int b = 0;
        public JSONObject c;

        public final bog a() {
            bog bog = new bog(this.a, this.b, false, this.c, 0);
            return bog;
        }
    }

    private bog(long j, int i, boolean z, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = jSONObject;
    }

    /* synthetic */ bog(long j, int i, boolean z, JSONObject jSONObject, byte b2) {
        this(j, i, z, jSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bog)) {
            return false;
        }
        bog bog = (bog) obj;
        return this.a == bog.a && this.b == bog.b && this.c == bog.c && bxm.a(this.d, bog.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }
}

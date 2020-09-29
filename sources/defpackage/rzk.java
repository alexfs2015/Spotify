package defpackage;

import com.google.common.base.Optional;
import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.EntityType;

/* renamed from: rzk reason: default package */
public final class rzk extends rzv {
    private final String a;
    private final String b;
    private final EntityType c;
    private final Optional<Integer> d;
    private final DrillDownViewResponse e;

    public rzk(String str, String str2, EntityType entityType, Optional<Integer> optional, DrillDownViewResponse drillDownViewResponse) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (entityType != null) {
                    this.c = entityType;
                    if (optional != null) {
                        this.d = optional;
                        if (drillDownViewResponse != null) {
                            this.e = drillDownViewResponse;
                            return;
                        }
                        throw new NullPointerException("Null result");
                    }
                    throw new NullPointerException("Null lastOffset");
                }
                throw new NullPointerException("Null drilldownType");
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null requestId");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final EntityType c() {
        return this.c;
    }

    public final Optional<Integer> d() {
        return this.d;
    }

    public final DrillDownViewResponse e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDrilldownResponse{requestId=");
        sb.append(this.a);
        sb.append(", query=");
        sb.append(this.b);
        sb.append(", drilldownType=");
        sb.append(this.c);
        sb.append(", lastOffset=");
        sb.append(this.d);
        sb.append(", result=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rzv) {
            rzv rzv = (rzv) obj;
            return this.a.equals(rzv.a()) && this.b.equals(rzv.b()) && this.c.equals(rzv.c()) && this.d.equals(rzv.d()) && this.e.equals(rzv.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}

package defpackage;

import android.os.Bundle;

/* renamed from: my reason: default package */
public final class my {
    final Bundle a;
    private nc b;

    public my(nc ncVar, boolean z) {
        if (ncVar != null) {
            this.a = new Bundle();
            this.b = ncVar;
            this.a.putBundle("selector", ncVar.a);
            this.a.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final nc a() {
        c();
        return this.b;
    }

    private void c() {
        if (this.b == null) {
            this.b = nc.a(this.a.getBundle("selector"));
            if (this.b == null) {
                this.b = nc.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof my) {
            my myVar = (my) obj;
            if (a().equals(myVar.a()) && b() == myVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() ^ b() ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoveryRequest{ selector=");
        sb.append(a());
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        c();
        nc ncVar = this.b;
        ncVar.b();
        sb.append(!ncVar.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}

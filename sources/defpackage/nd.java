package defpackage;

import android.os.Bundle;

/* renamed from: nd reason: default package */
public final class nd {
    final Bundle a;
    private nh b;

    public nd(nh nhVar, boolean z) {
        if (nhVar != null) {
            this.a = new Bundle();
            this.b = nhVar;
            this.a.putBundle("selector", nhVar.a);
            this.a.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    private void c() {
        if (this.b == null) {
            this.b = nh.a(this.a.getBundle("selector"));
            if (this.b == null) {
                this.b = nh.c;
            }
        }
    }

    public final nh a() {
        c();
        return this.b;
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nd) {
            nd ndVar = (nd) obj;
            if (a().equals(ndVar.a()) && b() == ndVar.b()) {
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
        nh nhVar = this.b;
        nhVar.b();
        sb.append(!nhVar.b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}

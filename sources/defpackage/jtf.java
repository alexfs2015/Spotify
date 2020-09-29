package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: jtf reason: default package */
final class jtf extends jtq {
    private final ConnectionType a;
    private final boolean b;
    private final boolean c;

    /* renamed from: jtf$a */
    static final class a implements defpackage.jtq.a {
        private ConnectionType a;
        private Boolean b;
        private Boolean c;

        a() {
        }

        public final defpackage.jtq.a a(ConnectionType connectionType) {
            if (connectionType != null) {
                this.a = connectionType;
                return this;
            }
            throw new NullPointerException("Null connectionType");
        }

        public final defpackage.jtq.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.jtq.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final jtq a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" connectionType");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" flightModeEnabled");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" mobileDataDisabled");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new jtf(this.a, this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ jtf(ConnectionType connectionType, boolean z, boolean z2, byte b2) {
        this(connectionType, z, z2);
    }

    private jtf(ConnectionType connectionType, boolean z, boolean z2) {
        this.a = connectionType;
        this.b = z;
        this.c = z2;
    }

    public final ConnectionType a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternetState{connectionType=");
        sb.append(this.a);
        sb.append(", flightModeEnabled=");
        sb.append(this.b);
        sb.append(", mobileDataDisabled=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtq) {
            jtq jtq = (jtq) obj;
            return this.a.equals(jtq.a()) && this.b == jtq.b() && this.c == jtq.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }
}

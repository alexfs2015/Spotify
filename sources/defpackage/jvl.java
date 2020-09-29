package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;

/* renamed from: jvl reason: default package */
final class jvl extends jvy {
    private final ConnectionType a;
    private final boolean b;
    private final boolean c;

    /* renamed from: jvl$a */
    static final class a implements defpackage.jvy.a {
        private ConnectionType a;
        private Boolean b;
        private Boolean c;

        a() {
        }

        public final defpackage.jvy.a a(ConnectionType connectionType) {
            if (connectionType != null) {
                this.a = connectionType;
                return this;
            }
            throw new NullPointerException("Null connectionType");
        }

        public final defpackage.jvy.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final jvy a() {
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
                return new jvl(this.a, this.b.booleanValue(), this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        public final defpackage.jvy.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    private jvl(ConnectionType connectionType, boolean z, boolean z2) {
        this.a = connectionType;
        this.b = z;
        this.c = z2;
    }

    /* synthetic */ jvl(ConnectionType connectionType, boolean z, boolean z2, byte b2) {
        this(connectionType, z, z2);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvy) {
            jvy jvy = (jvy) obj;
            return this.a.equals(jvy.a()) && this.b == jvy.b() && this.c == jvy.c();
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
}

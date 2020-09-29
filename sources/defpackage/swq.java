package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: swq reason: default package */
abstract class swq extends swv {
    final SessionState a;
    final fqn b;
    final boolean c;

    /* renamed from: swq$a */
    static final class a implements defpackage.swv.a {
        private SessionState a;
        private fqn b;
        private Boolean c;

        a() {
        }

        private a(swv swv) {
            this.a = swv.a();
            this.b = swv.b();
            this.c = Boolean.valueOf(swv.c());
        }

        /* synthetic */ a(swv swv, byte b2) {
            this(swv);
        }

        public final defpackage.swv.a a(SessionState sessionState) {
            this.a = sessionState;
            return this;
        }

        public final defpackage.swv.a a(fqn fqn) {
            this.b = fqn;
            return this;
        }

        public final defpackage.swv.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final swv a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isLoggedInSessionStarted");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new swr(this.a, this.b, this.c.booleanValue());
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    swq(SessionState sessionState, fqn fqn, boolean z) {
        this.a = sessionState;
        this.b = fqn;
        this.c = z;
    }

    public final SessionState a() {
        return this.a;
    }

    public final fqn b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final defpackage.swv.a d() {
        return new a(this, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof swv) {
            swv swv = (swv) obj;
            SessionState sessionState = this.a;
            if (sessionState != null ? sessionState.equals(swv.a()) : swv.a() == null) {
                fqn fqn = this.b;
                if (fqn != null ? fqn.equals(swv.b()) : swv.b() == null) {
                    if (this.c == swv.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        SessionState sessionState = this.a;
        int i = 0;
        int hashCode = ((sessionState == null ? 0 : sessionState.hashCode()) ^ 1000003) * 1000003;
        fqn fqn = this.b;
        if (fqn != null) {
            i = fqn.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MainActivityModel{sessionState=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", isLoggedInSessionStarted=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: smj reason: default package */
abstract class smj extends smo {
    final SessionState a;
    final fpt b;
    final boolean c;

    /* renamed from: smj$a */
    static final class a implements defpackage.smo.a {
        private SessionState a;
        private fpt b;
        private Boolean c;

        /* synthetic */ a(smo smo, byte b2) {
            this(smo);
        }

        a() {
        }

        private a(smo smo) {
            this.a = smo.a();
            this.b = smo.b();
            this.c = Boolean.valueOf(smo.c());
        }

        public final defpackage.smo.a a(SessionState sessionState) {
            this.a = sessionState;
            return this;
        }

        public final defpackage.smo.a a(fpt fpt) {
            this.b = fpt;
            return this;
        }

        public final defpackage.smo.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final smo a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isLoggedInSessionStarted");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new smk(this.a, this.b, this.c.booleanValue());
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    smj(SessionState sessionState, fpt fpt, boolean z) {
        this.a = sessionState;
        this.b = fpt;
        this.c = z;
    }

    public final SessionState a() {
        return this.a;
    }

    public final fpt b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smo) {
            smo smo = (smo) obj;
            SessionState sessionState = this.a;
            if (sessionState != null ? sessionState.equals(smo.a()) : smo.a() == null) {
                fpt fpt = this.b;
                if (fpt != null ? fpt.equals(smo.b()) : smo.b() == null) {
                    if (this.c == smo.c()) {
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
        fpt fpt = this.b;
        if (fpt != null) {
            i = fpt.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final defpackage.smo.a d() {
        return new a(this, 0);
    }
}

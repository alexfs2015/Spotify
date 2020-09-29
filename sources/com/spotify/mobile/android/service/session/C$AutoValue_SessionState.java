package com.spotify.mobile.android.service.session;

/* renamed from: com.spotify.mobile.android.service.session.$AutoValue_SessionState reason: invalid class name */
abstract class C$AutoValue_SessionState extends SessionState {
    private final boolean canConnect;
    private final boolean canStream;
    private final boolean connected;
    private final String countryCode;
    private final int currentAccountType;
    private final String currentUser;
    private final String currentUserName;
    private final boolean loggedIn;
    private final boolean loggingIn;
    private final boolean loggingOut;
    private final hdd paymentState;
    private final String productType;

    /* renamed from: com.spotify.mobile.android.service.session.$AutoValue_SessionState$a */
    static final class a extends com.spotify.mobile.android.service.session.SessionState.a {
        String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Integer f;
        private String g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private hdd k;
        private String l;

        /* synthetic */ a(SessionState sessionState, byte b2) {
            this(sessionState);
        }

        a() {
        }

        private a(SessionState sessionState) {
            this.a = sessionState.currentUser();
            this.b = sessionState.currentUserName();
            this.c = Boolean.valueOf(sessionState.loggedIn());
            this.d = Boolean.valueOf(sessionState.loggingIn());
            this.e = Boolean.valueOf(sessionState.loggingOut());
            this.f = Integer.valueOf(sessionState.currentAccountType());
            this.g = sessionState.countryCode();
            this.h = Boolean.valueOf(sessionState.connected());
            this.i = Boolean.valueOf(sessionState.canConnect());
            this.j = Boolean.valueOf(sessionState.canStream());
            this.k = sessionState.paymentState();
            this.l = sessionState.productType();
        }

        public final com.spotify.mobile.android.service.session.SessionState.a a(String str) {
            this.b = str;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a a(boolean z) {
            this.c = Boolean.FALSE;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a b(boolean z) {
            this.d = Boolean.FALSE;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a c(boolean z) {
            this.e = Boolean.FALSE;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a a(int i2) {
            this.f = Integer.valueOf(0);
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a b(String str) {
            this.g = str;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a d(boolean z) {
            this.h = Boolean.FALSE;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a e(boolean z) {
            this.i = Boolean.FALSE;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a f(boolean z) {
            this.j = Boolean.FALSE;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a a(hdd hdd) {
            this.k = hdd;
            return this;
        }

        public final com.spotify.mobile.android.service.session.SessionState.a c(String str) {
            this.l = str;
            return this;
        }
    }

    C$AutoValue_SessionState(String str, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, boolean z5, boolean z6, hdd hdd, String str4) {
        if (str != null) {
            this.currentUser = str;
            if (str2 != null) {
                this.currentUserName = str2;
                this.loggedIn = z;
                this.loggingIn = z2;
                this.loggingOut = z3;
                this.currentAccountType = i;
                if (str3 != null) {
                    this.countryCode = str3;
                    this.connected = z4;
                    this.canConnect = z5;
                    this.canStream = z6;
                    if (hdd != null) {
                        this.paymentState = hdd;
                        if (str4 != null) {
                            this.productType = str4;
                            return;
                        }
                        throw new NullPointerException("Null productType");
                    }
                    throw new NullPointerException("Null paymentState");
                }
                throw new NullPointerException("Null countryCode");
            }
            throw new NullPointerException("Null currentUserName");
        }
        throw new NullPointerException("Null currentUser");
    }

    public String currentUser() {
        return this.currentUser;
    }

    public String currentUserName() {
        return this.currentUserName;
    }

    public boolean loggedIn() {
        return this.loggedIn;
    }

    public boolean loggingIn() {
        return this.loggingIn;
    }

    public boolean loggingOut() {
        return this.loggingOut;
    }

    public int currentAccountType() {
        return this.currentAccountType;
    }

    @Deprecated
    public String countryCode() {
        return this.countryCode;
    }

    public boolean connected() {
        return this.connected;
    }

    public boolean canConnect() {
        return this.canConnect;
    }

    @Deprecated
    public boolean canStream() {
        return this.canStream;
    }

    @Deprecated
    public hdd paymentState() {
        return this.paymentState;
    }

    @Deprecated
    public String productType() {
        return this.productType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SessionState{currentUser=");
        sb.append(this.currentUser);
        sb.append(", currentUserName=");
        sb.append(this.currentUserName);
        sb.append(", loggedIn=");
        sb.append(this.loggedIn);
        sb.append(", loggingIn=");
        sb.append(this.loggingIn);
        sb.append(", loggingOut=");
        sb.append(this.loggingOut);
        sb.append(", currentAccountType=");
        sb.append(this.currentAccountType);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", connected=");
        sb.append(this.connected);
        sb.append(", canConnect=");
        sb.append(this.canConnect);
        sb.append(", canStream=");
        sb.append(this.canStream);
        sb.append(", paymentState=");
        sb.append(this.paymentState);
        sb.append(", productType=");
        sb.append(this.productType);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionState) {
            SessionState sessionState = (SessionState) obj;
            return this.currentUser.equals(sessionState.currentUser()) && this.currentUserName.equals(sessionState.currentUserName()) && this.loggedIn == sessionState.loggedIn() && this.loggingIn == sessionState.loggingIn() && this.loggingOut == sessionState.loggingOut() && this.currentAccountType == sessionState.currentAccountType() && this.countryCode.equals(sessionState.countryCode()) && this.connected == sessionState.connected() && this.canConnect == sessionState.canConnect() && this.canStream == sessionState.canStream() && this.paymentState.equals(sessionState.paymentState()) && this.productType.equals(sessionState.productType());
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((((((this.currentUser.hashCode() ^ 1000003) * 1000003) ^ this.currentUserName.hashCode()) * 1000003) ^ (this.loggedIn ? 1231 : 1237)) * 1000003) ^ (this.loggingIn ? 1231 : 1237)) * 1000003) ^ (this.loggingOut ? 1231 : 1237)) * 1000003) ^ this.currentAccountType) * 1000003) ^ this.countryCode.hashCode()) * 1000003) ^ (this.connected ? 1231 : 1237)) * 1000003) ^ (this.canConnect ? 1231 : 1237)) * 1000003;
        if (!this.canStream) {
            i = 1237;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.paymentState.hashCode()) * 1000003) ^ this.productType.hashCode();
    }

    public com.spotify.mobile.android.service.session.SessionState.a toBuilder() {
        return new a(this, 0);
    }
}

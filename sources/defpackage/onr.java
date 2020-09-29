package defpackage;

/* renamed from: onr reason: default package */
final class onr extends ooe {
    private final boolean b;

    /* renamed from: onr$a */
    static final class a implements defpackage.ooe.a {
        private Boolean a;

        a() {
        }

        private a(ooe ooe) {
            this.a = Boolean.valueOf(ooe.a());
        }

        /* synthetic */ a(ooe ooe, byte b) {
            this(ooe);
        }

        public final defpackage.ooe.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ooe a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showEmptyViewAsASectionInsteadOfFullScreenForOwnPlaylist");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new onr(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private onr(boolean z) {
        this.b = z;
    }

    /* synthetic */ onr(boolean z, byte b2) {
        this(z);
    }

    public final boolean a() {
        return this.b;
    }

    public final defpackage.ooe.a b() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ooe) {
            if (this.b == ((ooe) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b ? 1231 : 1237) ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyConfiguration{showEmptyViewAsASectionInsteadOfFullScreenForOwnPlaylist=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}

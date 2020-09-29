package defpackage;

/* renamed from: ogn reason: default package */
final class ogn extends oha {
    private final boolean b;

    /* renamed from: ogn$a */
    static final class a implements defpackage.oha.a {
        private Boolean a;

        /* synthetic */ a(oha oha, byte b) {
            this(oha);
        }

        a() {
        }

        private a(oha oha) {
            this.a = Boolean.valueOf(oha.a());
        }

        public final defpackage.oha.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final oha a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showEmptyViewAsASectionInsteadOfFullScreenForOwnPlaylist");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new ogn(this.a.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ ogn(boolean z, byte b2) {
        this(z);
    }

    private ogn(boolean z) {
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyConfiguration{showEmptyViewAsASectionInsteadOfFullScreenForOwnPlaylist=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oha) {
            if (this.b == ((oha) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b ? 1231 : 1237) ^ 1000003;
    }

    public final defpackage.oha.a b() {
        return new a(this, 0);
    }
}

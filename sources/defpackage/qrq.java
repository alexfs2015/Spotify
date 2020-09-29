package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qrq reason: default package */
final class qrq extends qsh {
    private final TasteOnboardingItem a;
    private final qsc b;
    private final boolean c;

    /* renamed from: qrq$a */
    static final class a extends defpackage.qsh.a {
        private TasteOnboardingItem a;
        private qsc b;
        private Boolean c;

        a() {
        }

        public final defpackage.qsh.a a(TasteOnboardingItem tasteOnboardingItem) {
            if (tasteOnboardingItem != null) {
                this.a = tasteOnboardingItem;
                return this;
            }
            throw new NullPointerException("Null artist");
        }

        public final defpackage.qsh.a a(qsc qsc) {
            if (qsc != null) {
                this.b = qsc;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final defpackage.qsh.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final qsh a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artist");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" position");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" shouldBeLiked");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new qrq(this.a, this.b, this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private qrq(TasteOnboardingItem tasteOnboardingItem, qsc qsc, boolean z) {
        this.a = tasteOnboardingItem;
        this.b = qsc;
        this.c = z;
    }

    /* synthetic */ qrq(TasteOnboardingItem tasteOnboardingItem, qsc qsc, boolean z, byte b2) {
        this(tasteOnboardingItem, qsc, z);
    }

    public final TasteOnboardingItem a() {
        return this.a;
    }

    public final qsc b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qsh) {
            qsh qsh = (qsh) obj;
            return this.a.equals(qsh.a()) && this.b.equals(qsh.b()) && this.c == qsh.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectSearchArtistResult{artist=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", shouldBeLiked=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qjh reason: default package */
final class qjh extends qjy {
    private final TasteOnboardingItem a;
    private final qjt b;
    private final boolean c;

    /* renamed from: qjh$a */
    static final class a extends defpackage.qjy.a {
        private TasteOnboardingItem a;
        private qjt b;
        private Boolean c;

        a() {
        }

        public final defpackage.qjy.a a(TasteOnboardingItem tasteOnboardingItem) {
            if (tasteOnboardingItem != null) {
                this.a = tasteOnboardingItem;
                return this;
            }
            throw new NullPointerException("Null artist");
        }

        public final defpackage.qjy.a a(qjt qjt) {
            if (qjt != null) {
                this.b = qjt;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final defpackage.qjy.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final qjy a() {
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
                return new qjh(this.a, this.b, this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ qjh(TasteOnboardingItem tasteOnboardingItem, qjt qjt, boolean z, byte b2) {
        this(tasteOnboardingItem, qjt, z);
    }

    private qjh(TasteOnboardingItem tasteOnboardingItem, qjt qjt, boolean z) {
        this.a = tasteOnboardingItem;
        this.b = qjt;
        this.c = z;
    }

    public final TasteOnboardingItem a() {
        return this.a;
    }

    public final qjt b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjy) {
            qjy qjy = (qjy) obj;
            return this.a.equals(qjy.a()) && this.b.equals(qjy.b()) && this.c == qjy.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }
}

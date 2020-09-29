package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qje reason: default package */
final class qje extends qjj {
    private final List<TasteOnboardingItem> a;
    private final qjt b;

    /* renamed from: qje$a */
    static final class a extends defpackage.qjj.a {
        private List<TasteOnboardingItem> a;
        private qjt b;

        a() {
        }

        public final defpackage.qjj.a a(List<TasteOnboardingItem> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.qjj.a a(qjt qjt) {
            if (qjt != null) {
                this.b = qjt;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final qjj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" items");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" position");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new qje(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ qje(List list, qjt qjt, byte b2) {
        this(list, qjt);
    }

    private qje(List<TasteOnboardingItem> list, qjt qjt) {
        this.a = list;
        this.b = qjt;
    }

    public final List<TasteOnboardingItem> a() {
        return this.a;
    }

    public final qjt b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandArtistResult{items=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjj) {
            qjj qjj = (qjj) obj;
            return this.a.equals(qjj.a()) && this.b.equals(qjj.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}

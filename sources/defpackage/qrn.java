package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qrn reason: default package */
final class qrn extends qrs {
    private final List<TasteOnboardingItem> a;
    private final qsc b;

    /* renamed from: qrn$a */
    static final class a extends defpackage.qrs.a {
        private List<TasteOnboardingItem> a;
        private qsc b;

        a() {
        }

        public final defpackage.qrs.a a(List<TasteOnboardingItem> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.qrs.a a(qsc qsc) {
            if (qsc != null) {
                this.b = qsc;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final qrs a() {
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
                return new qrn(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private qrn(List<TasteOnboardingItem> list, qsc qsc) {
        this.a = list;
        this.b = qsc;
    }

    /* synthetic */ qrn(List list, qsc qsc, byte b2) {
        this(list, qsc);
    }

    public final List<TasteOnboardingItem> a() {
        return this.a;
    }

    public final qsc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qrs) {
            qrs qrs = (qrs) obj;
            return this.a.equals(qrs.a()) && this.b.equals(qrs.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandArtistResult{items=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}

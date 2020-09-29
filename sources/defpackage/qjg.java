package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qjg reason: default package */
final class qjg extends qjx {
    private final List<TasteOnboardingItem> a;
    private final boolean b;

    /* renamed from: qjg$a */
    static final class a extends defpackage.qjx.a {
        private List<TasteOnboardingItem> a;
        private Boolean b;

        a() {
        }

        public final defpackage.qjx.a a(List<TasteOnboardingItem> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.qjx.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final qjx a() {
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
                sb2.append(" expand");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new qjg(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ qjg(List list, boolean z, byte b2) {
        this(list, z);
    }

    private qjg(List<TasteOnboardingItem> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final List<TasteOnboardingItem> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectGridArtistResult{items=");
        sb.append(this.a);
        sb.append(", expand=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qjx) {
            qjx qjx = (qjx) obj;
            return this.a.equals(qjx.a()) && this.b == qjx.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }
}

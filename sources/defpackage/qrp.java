package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: qrp reason: default package */
final class qrp extends qsg {
    private final List<TasteOnboardingItem> a;
    private final boolean b;

    /* renamed from: qrp$a */
    static final class a extends defpackage.qsg.a {
        private List<TasteOnboardingItem> a;
        private Boolean b;

        a() {
        }

        public final defpackage.qsg.a a(List<TasteOnboardingItem> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public final defpackage.qsg.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final qsg a() {
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
                return new qrp(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private qrp(List<TasteOnboardingItem> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    /* synthetic */ qrp(List list, boolean z, byte b2) {
        this(list, z);
    }

    public final List<TasteOnboardingItem> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qsg) {
            qsg qsg = (qsg) obj;
            return this.a.equals(qsg.a()) && this.b == qsg.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectGridArtistResult{items=");
        sb.append(this.a);
        sb.append(", expand=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}

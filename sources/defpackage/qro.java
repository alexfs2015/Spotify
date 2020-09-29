package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: qro reason: default package */
final class qro extends qrt {
    private final ImmutableList<TasteOnboardingItem> a;
    private final boolean b;

    /* renamed from: qro$a */
    static final class a extends defpackage.qrt.a {
        private ImmutableList<TasteOnboardingItem> a;
        private Boolean b;

        a() {
        }

        public final defpackage.qrt.a a(ImmutableList<TasteOnboardingItem> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null artists");
        }

        public final defpackage.qrt.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final qrt a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" artists");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" hideGenre");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new qro(this.a, this.b.booleanValue(), 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private qro(ImmutableList<TasteOnboardingItem> immutableList, boolean z) {
        this.a = immutableList;
        this.b = z;
    }

    /* synthetic */ qro(ImmutableList immutableList, boolean z, byte b2) {
        this(immutableList, z);
    }

    public final ImmutableList<TasteOnboardingItem> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qrt) {
            qrt qrt = (qrt) obj;
            return this.a.equals(qrt.a()) && this.b == qrt.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandGenreResult{artists=");
        sb.append(this.a);
        sb.append(", hideGenre=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}

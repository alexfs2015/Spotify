package defpackage;

import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;

/* renamed from: tdv reason: default package */
final class tdv extends tee {
    private final String a;
    private final PivotSubtitleIcon b;
    private final boolean c;

    /* renamed from: tdv$a */
    static final class a implements defpackage.tee.a {
        private String a;
        private PivotSubtitleIcon b;
        private Boolean c;

        a() {
        }

        public final defpackage.tee.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null subtitleText");
        }

        public final defpackage.tee.a a(PivotSubtitleIcon pivotSubtitleIcon) {
            if (pivotSubtitleIcon != null) {
                this.b = pivotSubtitleIcon;
                return this;
            }
            throw new NullPointerException("Null subtitleIcon");
        }

        public final defpackage.tee.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final tee a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" subtitleText");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" subtitleIcon");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isAlwaysOnDemand");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new tdv(this.a, this.b, this.c.booleanValue(), 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ tdv(String str, PivotSubtitleIcon pivotSubtitleIcon, boolean z, byte b2) {
        this(str, pivotSubtitleIcon, z);
    }

    private tdv(String str, PivotSubtitleIcon pivotSubtitleIcon, boolean z) {
        this.a = str;
        this.b = pivotSubtitleIcon;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final PivotSubtitleIcon b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PivotSubtitleContent{subtitleText=");
        sb.append(this.a);
        sb.append(", subtitleIcon=");
        sb.append(this.b);
        sb.append(", isAlwaysOnDemand=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tee) {
            tee tee = (tee) obj;
            return this.a.equals(tee.a()) && this.b.equals(tee.b()) && this.c == tee.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }
}

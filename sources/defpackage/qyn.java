package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;

/* renamed from: qyn reason: default package */
final class qyn extends qyr {
    private final int a;
    private final Optional<String> b;
    private final Optional<PrefsModel> c;
    private final ImmutableList<ho<String, Long>> d;

    /* renamed from: qyn$a */
    public static final class a extends defpackage.qyr.a {
        private Integer a;
        private Optional<String> b;
        private Optional<PrefsModel> c;
        private ImmutableList<ho<String, Long>> d;

        /* synthetic */ a(qyr qyr, byte b2) {
            this(qyr);
        }

        public a() {
            this.b = Optional.e();
            this.c = Optional.e();
        }

        private a(qyr qyr) {
            this.b = Optional.e();
            this.c = Optional.e();
            this.a = Integer.valueOf(qyr.a());
            this.b = qyr.b();
            this.c = qyr.c();
            this.d = qyr.d();
        }

        public final defpackage.qyr.a a(int i) {
            this.a = Integer.valueOf(100);
            return this;
        }

        public final defpackage.qyr.a a(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final defpackage.qyr.a b(Optional<PrefsModel> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null prefsModel");
        }

        public final defpackage.qyr.a a(ImmutableList<ho<String, Long>> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null pendingPagePrefsAccess");
        }

        public final qyr a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" maxEntries");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" pendingPagePrefsAccess");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                qyn qyn = new qyn(this.a.intValue(), this.b, this.c, this.d, 0);
                return qyn;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ qyn(int i, Optional optional, Optional optional2, ImmutableList immutableList, byte b2) {
        this(i, optional, optional2, immutableList);
    }

    private qyn(int i, Optional<String> optional, Optional<PrefsModel> optional2, ImmutableList<ho<String, Long>> immutableList) {
        this.a = i;
        this.b = optional;
        this.c = optional2;
        this.d = immutableList;
    }

    public final int a() {
        return this.a;
    }

    public final Optional<String> b() {
        return this.b;
    }

    public final Optional<PrefsModel> c() {
        return this.c;
    }

    public final ImmutableList<ho<String, Long>> d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPagesPrefsModel{maxEntries=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", prefsModel=");
        sb.append(this.c);
        sb.append(", pendingPagePrefsAccess=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyr) {
            qyr qyr = (qyr) obj;
            return this.a == qyr.a() && this.b.equals(qyr.b()) && this.c.equals(qyr.c()) && this.d.equals(qyr.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final defpackage.qyr.a e() {
        return new a(this, 0);
    }
}

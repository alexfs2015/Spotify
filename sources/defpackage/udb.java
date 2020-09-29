package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: udb reason: default package */
final class udb extends udf {
    private final Optional<ImmutableList<Participant>> b;
    private final Optional<String> c;
    private final boolean d;

    /* renamed from: udb$a */
    static final class a extends defpackage.udf.a {
        private Optional<ImmutableList<Participant>> a;
        private Optional<String> b;
        private Boolean c;

        /* synthetic */ a(udf udf, byte b2) {
            this(udf);
        }

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
        }

        private a(udf udf) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.a = udf.a();
            this.b = udf.b();
            this.c = Boolean.valueOf(udf.c());
        }

        public final defpackage.udf.a a(Optional<ImmutableList<Participant>> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final defpackage.udf.a b(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final defpackage.udf.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final udf a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isClosing");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new udb(this.a, this.b, this.c.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* synthetic */ udb(Optional optional, Optional optional2, boolean z, byte b2) {
        this(optional, optional2, z);
    }

    private udb(Optional<ImmutableList<Participant>> optional, Optional<String> optional2, boolean z) {
        this.b = optional;
        this.c = optional2;
        this.d = z;
    }

    public final Optional<ImmutableList<Participant>> a() {
        return this.b;
    }

    public final Optional<String> b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticipantListModel{participants=");
        sb.append(this.b);
        sb.append(", username=");
        sb.append(this.c);
        sb.append(", isClosing=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udf) {
            udf udf = (udf) obj;
            return this.b.equals(udf.a()) && this.c.equals(udf.b()) && this.d == udf.c();
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final defpackage.udf.a d() {
        return new a(this, 0);
    }
}

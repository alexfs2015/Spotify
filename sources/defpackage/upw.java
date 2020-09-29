package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: upw reason: default package */
final class upw extends uqa {
    private final Optional<ImmutableList<Participant>> b;
    private final Optional<String> c;
    private final boolean d;

    /* renamed from: upw$a */
    static final class a extends defpackage.uqa.a {
        private Optional<ImmutableList<Participant>> a;
        private Optional<String> b;
        private Boolean c;

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
        }

        private a(uqa uqa) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.a = uqa.a();
            this.b = uqa.b();
            this.c = Boolean.valueOf(uqa.c());
        }

        /* synthetic */ a(uqa uqa, byte b2) {
            this(uqa);
        }

        public final defpackage.uqa.a a(Optional<ImmutableList<Participant>> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final defpackage.uqa.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final uqa a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isClosing");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new upw(this.a, this.b, this.c.booleanValue(), 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        public final defpackage.uqa.a b(Optional<String> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null username");
        }
    }

    private upw(Optional<ImmutableList<Participant>> optional, Optional<String> optional2, boolean z) {
        this.b = optional;
        this.c = optional2;
        this.d = z;
    }

    /* synthetic */ upw(Optional optional, Optional optional2, boolean z, byte b2) {
        this(optional, optional2, z);
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

    public final defpackage.uqa.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqa) {
            uqa uqa = (uqa) obj;
            return this.b.equals(uqa.a()) && this.c.equals(uqa.b()) && this.d == uqa.c();
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
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
}

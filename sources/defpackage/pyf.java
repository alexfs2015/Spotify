package defpackage;

import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import java.util.List;

/* renamed from: pyf reason: default package */
abstract class pyf extends pyk {
    final NoteMessage a;
    final List<qbg> b;
    final int c;
    final qag d;
    final long e;
    final boolean f;
    final boolean g;

    /* renamed from: pyf$a */
    static final class a implements defpackage.pyk.a {
        NoteMessage a;
        private List<qbg> b;
        private Integer c;
        private qag d;
        private Long e;
        private Boolean f;
        private Boolean g;

        a() {
        }

        private a(pyk pyk) {
            this.a = pyk.a();
            this.b = pyk.b();
            this.c = Integer.valueOf(pyk.c());
            this.d = pyk.d();
            this.e = Long.valueOf(pyk.e());
            this.f = Boolean.valueOf(pyk.f());
            this.g = Boolean.valueOf(pyk.g());
        }

        /* synthetic */ a(pyk pyk, byte b2) {
            this(pyk);
        }

        public final defpackage.pyk.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.pyk.a a(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        public final defpackage.pyk.a a(NoteMessage noteMessage) {
            this.a = noteMessage;
            return this;
        }

        public final defpackage.pyk.a a(List<qbg> list) {
            this.b = list;
            return this;
        }

        public final defpackage.pyk.a a(qag qag) {
            if (qag != null) {
                this.d = qag;
                return this;
            }
            throw new NullPointerException("Null trigger");
        }

        public final defpackage.pyk.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final pyk a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" noteHeight");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" trigger");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" timeReceived");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" hasLoggedImpression");
                str = sb4.toString();
            }
            if (this.g == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" isProcessingAction");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                pyg pyg = new pyg(this.a, this.b, this.c.intValue(), this.d, this.e.longValue(), this.f.booleanValue(), this.g.booleanValue());
                return pyg;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.pyk.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    pyf(NoteMessage noteMessage, List<qbg> list, int i, qag qag, long j, boolean z, boolean z2) {
        this.a = noteMessage;
        this.b = list;
        this.c = i;
        if (qag != null) {
            this.d = qag;
            this.e = j;
            this.f = z;
            this.g = z2;
            return;
        }
        throw new NullPointerException("Null trigger");
    }

    public final NoteMessage a() {
        return this.a;
    }

    public final List<qbg> b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final qag d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pyk) {
            pyk pyk = (pyk) obj;
            NoteMessage noteMessage = this.a;
            if (noteMessage != null ? noteMessage.equals(pyk.a()) : pyk.a() == null) {
                List<qbg> list = this.b;
                if (list != null ? list.equals(pyk.b()) : pyk.b() == null) {
                    return this.c == pyk.c() && this.d.equals(pyk.d()) && this.e == pyk.e() && this.f == pyk.f() && this.g == pyk.g();
                }
            }
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final defpackage.pyk.a h() {
        return new a(this, 0);
    }

    public int hashCode() {
        NoteMessage noteMessage = this.a;
        int i = 0;
        int hashCode = ((noteMessage == null ? 0 : noteMessage.hashCode()) ^ 1000003) * 1000003;
        List<qbg> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        long j = this.e;
        int i2 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i3 = 1231;
        int i4 = (i2 ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i3 = 1237;
        }
        return i4 ^ i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NoteModel{noteMessage=");
        sb.append(this.a);
        sb.append(", touchBoundaries=");
        sb.append(this.b);
        sb.append(", noteHeight=");
        sb.append(this.c);
        sb.append(", trigger=");
        sb.append(this.d);
        sb.append(", timeReceived=");
        sb.append(this.e);
        sb.append(", hasLoggedImpression=");
        sb.append(this.f);
        sb.append(", isProcessingAction=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}

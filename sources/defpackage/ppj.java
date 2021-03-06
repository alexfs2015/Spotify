package defpackage;

import com.spotify.music.features.quicksilver.messages.models.NoteMessage;
import java.util.List;

/* renamed from: ppj reason: default package */
abstract class ppj extends ppo {
    final NoteMessage a;
    final List<psk> b;
    final int c;
    final prk d;
    final long e;
    final boolean f;
    final boolean g;

    /* renamed from: ppj$a */
    static final class a implements defpackage.ppo.a {
        NoteMessage a;
        private List<psk> b;
        private Integer c;
        private prk d;
        private Long e;
        private Boolean f;
        private Boolean g;

        /* synthetic */ a(ppo ppo, byte b2) {
            this(ppo);
        }

        a() {
        }

        private a(ppo ppo) {
            this.a = ppo.a();
            this.b = ppo.b();
            this.c = Integer.valueOf(ppo.c());
            this.d = ppo.d();
            this.e = Long.valueOf(ppo.e());
            this.f = Boolean.valueOf(ppo.f());
            this.g = Boolean.valueOf(ppo.g());
        }

        public final defpackage.ppo.a a(NoteMessage noteMessage) {
            this.a = noteMessage;
            return this;
        }

        public final defpackage.ppo.a a(List<psk> list) {
            this.b = list;
            return this;
        }

        public final defpackage.ppo.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.ppo.a a(prk prk) {
            if (prk != null) {
                this.d = prk;
                return this;
            }
            throw new NullPointerException("Null trigger");
        }

        public final defpackage.ppo.a a(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        public final defpackage.ppo.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.ppo.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final ppo a() {
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
                ppk ppk = new ppk(this.a, this.b, this.c.intValue(), this.d, this.e.longValue(), this.f.booleanValue(), this.g.booleanValue());
                return ppk;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    ppj(NoteMessage noteMessage, List<psk> list, int i, prk prk, long j, boolean z, boolean z2) {
        this.a = noteMessage;
        this.b = list;
        this.c = i;
        if (prk != null) {
            this.d = prk;
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

    public final List<psk> b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final prk d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppo) {
            ppo ppo = (ppo) obj;
            NoteMessage noteMessage = this.a;
            if (noteMessage != null ? noteMessage.equals(ppo.a()) : ppo.a() == null) {
                List<psk> list = this.b;
                if (list != null ? list.equals(ppo.b()) : ppo.b() == null) {
                    return this.c == ppo.c() && this.d.equals(ppo.d()) && this.e == ppo.e() && this.f == ppo.f() && this.g == ppo.g();
                }
            }
        }
    }

    public int hashCode() {
        NoteMessage noteMessage = this.a;
        int i = 0;
        int hashCode = ((noteMessage == null ? 0 : noteMessage.hashCode()) ^ 1000003) * 1000003;
        List<psk> list = this.b;
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

    public final defpackage.ppo.a h() {
        return new a(this, 0);
    }
}

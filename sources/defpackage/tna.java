package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: tna reason: default package */
final class tna extends tnb {
    private final YourLibraryPageId a;
    private final String b;
    private final String c;
    private final CharSequence d;
    private final String e;
    private final ImmutableList<LinkType> f;

    /* renamed from: tna$a */
    static final class a implements defpackage.tnb.a {
        private YourLibraryPageId a;
        private String b;
        private String c;
        private CharSequence d;
        private String e;
        private ImmutableList<LinkType> f;

        a() {
        }

        public final defpackage.tnb.a a(YourLibraryPageId yourLibraryPageId) {
            if (yourLibraryPageId != null) {
                this.a = yourLibraryPageId;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.tnb.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.tnb.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null emptyTitle");
        }

        public final defpackage.tnb.a a(CharSequence charSequence) {
            if (charSequence != null) {
                this.d = charSequence;
                return this;
            }
            throw new NullPointerException("Null emptySubtitle");
        }

        public final defpackage.tnb.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null emptyActionText");
        }

        public final defpackage.tnb.a a(ImmutableList<LinkType> immutableList) {
            if (immutableList != null) {
                this.f = immutableList;
                return this;
            }
            throw new NullPointerException("Null acceptLinkTypes");
        }

        public final tnb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" emptyTitle");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" emptySubtitle");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" emptyActionText");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" acceptLinkTypes");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                tna tna = new tna(this.a, this.b, this.c, this.d, this.e, this.f, 0);
                return tna;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    /* synthetic */ tna(YourLibraryPageId yourLibraryPageId, String str, String str2, CharSequence charSequence, String str3, ImmutableList immutableList, byte b2) {
        this(yourLibraryPageId, str, str2, charSequence, str3, immutableList);
    }

    private tna(YourLibraryPageId yourLibraryPageId, String str, String str2, CharSequence charSequence, String str3, ImmutableList<LinkType> immutableList) {
        this.a = yourLibraryPageId;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = immutableList;
    }

    public final YourLibraryPageId a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final CharSequence d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final ImmutableList<LinkType> f() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastPage{id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", emptyTitle=");
        sb.append(this.c);
        sb.append(", emptySubtitle=");
        sb.append(this.d);
        sb.append(", emptyActionText=");
        sb.append(this.e);
        sb.append(", acceptLinkTypes=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tnb) {
            tnb tnb = (tnb) obj;
            return this.a.equals(tnb.a()) && this.b.equals(tnb.b()) && this.c.equals(tnb.c()) && this.d.equals(tnb.d()) && this.e.equals(tnb.e()) && this.f.equals(tnb.f());
        }
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: qrt reason: default package */
final class qrt extends qrx {
    private final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> b;
    private final Optional<YourLibraryPageId> c;
    private final uqu d;
    private final boolean e;
    private final ImmutableMap<YourLibraryPageId, LoadingState> f;

    /* renamed from: qrt$a */
    static final class a extends defpackage.qrx.a {
        private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a;
        private Optional<YourLibraryPageId> b;
        private uqu c;
        private Boolean d;
        private ImmutableMap<YourLibraryPageId, LoadingState> e;

        /* synthetic */ a(qrx qrx, byte b2) {
            this(qrx);
        }

        a() {
            this.b = Optional.e();
        }

        private a(qrx qrx) {
            this.b = Optional.e();
            this.a = qrx.a();
            this.b = qrx.b();
            this.c = qrx.c();
            this.d = Boolean.valueOf(qrx.d());
            this.e = qrx.e();
        }

        public final defpackage.qrx.a a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
            if (immutableSortedMap != null) {
                this.a = immutableSortedMap;
                return this;
            }
            throw new NullPointerException("Null pageConfiguration");
        }

        public final defpackage.qrx.a a(Optional<YourLibraryPageId> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null focusedPageId");
        }

        public final defpackage.qrx.a a(uqu uqu) {
            if (uqu != null) {
                this.c = uqu;
                return this;
            }
            throw new NullPointerException("Null yourLibraryState");
        }

        public final defpackage.qrx.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.qrx.a a(ImmutableMap<YourLibraryPageId, LoadingState> immutableMap) {
            if (immutableMap != null) {
                this.e = immutableMap;
                return this;
            }
            throw new NullPointerException("Null loadingStateMap");
        }

        public final qrx a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" pageConfiguration");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" yourLibraryState");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" initialNavigationPerformed");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" loadingStateMap");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                qrt qrt = new qrt(this.a, this.b, this.c, this.d.booleanValue(), this.e, 0);
                return qrt;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ qrt(ImmutableSortedMap immutableSortedMap, Optional optional, uqu uqu, boolean z, ImmutableMap immutableMap, byte b2) {
        this(immutableSortedMap, optional, uqu, z, immutableMap);
    }

    private qrt(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap, Optional<YourLibraryPageId> optional, uqu uqu, boolean z, ImmutableMap<YourLibraryPageId, LoadingState> immutableMap) {
        this.b = immutableSortedMap;
        this.c = optional;
        this.d = uqu;
        this.e = z;
        this.f = immutableMap;
    }

    public final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a() {
        return this.b;
    }

    public final Optional<YourLibraryPageId> b() {
        return this.c;
    }

    public final uqu c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final ImmutableMap<YourLibraryPageId, LoadingState> e() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YourLibraryModel{pageConfiguration=");
        sb.append(this.b);
        sb.append(", focusedPageId=");
        sb.append(this.c);
        sb.append(", yourLibraryState=");
        sb.append(this.d);
        sb.append(", initialNavigationPerformed=");
        sb.append(this.e);
        sb.append(", loadingStateMap=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qrx) {
            qrx qrx = (qrx) obj;
            return this.b.equals(qrx.a()) && this.c.equals(qrx.b()) && this.d.equals(qrx.c()) && this.e == qrx.d() && this.f.equals(qrx.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final defpackage.qrx.a f() {
        return new a(this, 0);
    }
}

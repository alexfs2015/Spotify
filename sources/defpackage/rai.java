package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: rai reason: default package */
final class rai extends ram {
    private final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> b;
    private final Optional<YourLibraryPageId> c;
    private final vbz d;
    private final boolean e;
    private final ImmutableMap<YourLibraryPageId, LoadingState> f;

    /* renamed from: rai$a */
    static final class a extends defpackage.ram.a {
        private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a;
        private Optional<YourLibraryPageId> b;
        private vbz c;
        private Boolean d;
        private ImmutableMap<YourLibraryPageId, LoadingState> e;

        a() {
            this.b = Optional.e();
        }

        private a(ram ram) {
            this.b = Optional.e();
            this.a = ram.a();
            this.b = ram.b();
            this.c = ram.c();
            this.d = Boolean.valueOf(ram.d());
            this.e = ram.e();
        }

        /* synthetic */ a(ram ram, byte b2) {
            this(ram);
        }

        public final defpackage.ram.a a(Optional<YourLibraryPageId> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null focusedPageId");
        }

        public final defpackage.ram.a a(ImmutableMap<YourLibraryPageId, LoadingState> immutableMap) {
            if (immutableMap != null) {
                this.e = immutableMap;
                return this;
            }
            throw new NullPointerException("Null loadingStateMap");
        }

        public final defpackage.ram.a a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
            if (immutableSortedMap != null) {
                this.a = immutableSortedMap;
                return this;
            }
            throw new NullPointerException("Null pageConfiguration");
        }

        public final defpackage.ram.a a(vbz vbz) {
            if (vbz != null) {
                this.c = vbz;
                return this;
            }
            throw new NullPointerException("Null yourLibraryState");
        }

        public final defpackage.ram.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final ram a() {
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
                rai rai = new rai(this.a, this.b, this.c, this.d.booleanValue(), this.e, 0);
                return rai;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    private rai(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap, Optional<YourLibraryPageId> optional, vbz vbz, boolean z, ImmutableMap<YourLibraryPageId, LoadingState> immutableMap) {
        this.b = immutableSortedMap;
        this.c = optional;
        this.d = vbz;
        this.e = z;
        this.f = immutableMap;
    }

    /* synthetic */ rai(ImmutableSortedMap immutableSortedMap, Optional optional, vbz vbz, boolean z, ImmutableMap immutableMap, byte b2) {
        this(immutableSortedMap, optional, vbz, z, immutableMap);
    }

    public final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a() {
        return this.b;
    }

    public final Optional<YourLibraryPageId> b() {
        return this.c;
    }

    public final vbz c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final ImmutableMap<YourLibraryPageId, LoadingState> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ram) {
            ram ram = (ram) obj;
            return this.b.equals(ram.a()) && this.c.equals(ram.b()) && this.d.equals(ram.c()) && this.e == ram.d() && this.f.equals(ram.e());
        }
    }

    public final defpackage.ram.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
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
}

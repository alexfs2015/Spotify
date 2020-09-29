package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.SortOption;
import java.util.Collection;
import java.util.List;

/* renamed from: rki reason: default package */
abstract class rki extends rkm {
    final ImmutableList<SortOption> a;
    final String b;
    final String c;
    final String d;
    final ImmutableList<b> e;

    /* renamed from: rki$a */
    static final class a extends defpackage.rkm.a {
        private ImmutableList<SortOption> a;
        private String b;
        private String c;
        private String d;
        private ImmutableList<b> e;

        a() {
        }

        private a(rkm rkm) {
            this.a = rkm.a();
            this.b = rkm.b();
            this.c = rkm.c();
            this.d = rkm.d();
            this.e = rkm.e();
        }

        /* synthetic */ a(rkm rkm, byte b2) {
            this(rkm);
        }

        public final defpackage.rkm.a a(ImmutableList<b> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null filterOptions");
        }

        public final defpackage.rkm.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null showSortOptionsTitle");
        }

        public final defpackage.rkm.a a(List<SortOption> list) {
            this.a = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final rkm a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sortOptions");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" showSortOptionsTitle");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showTextFilterTitle");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" textFilterHint");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" filterOptions");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                rkk rkk = new rkk(this.a, this.b, this.c, this.d, this.e);
                return rkk;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.rkm.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null showTextFilterTitle");
        }

        public final defpackage.rkm.a c(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null textFilterHint");
        }
    }

    rki(ImmutableList<SortOption> immutableList, String str, String str2, String str3, ImmutableList<b> immutableList2) {
        if (immutableList != null) {
            this.a = immutableList;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (str3 != null) {
                        this.d = str3;
                        if (immutableList2 != null) {
                            this.e = immutableList2;
                            return;
                        }
                        throw new NullPointerException("Null filterOptions");
                    }
                    throw new NullPointerException("Null textFilterHint");
                }
                throw new NullPointerException("Null showTextFilterTitle");
            }
            throw new NullPointerException("Null showSortOptionsTitle");
        }
        throw new NullPointerException("Null sortOptions");
    }

    public final ImmutableList<SortOption> a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final ImmutableList<b> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rkm) {
            rkm rkm = (rkm) obj;
            return this.a.equals(rkm.a()) && this.b.equals(rkm.b()) && this.c.equals(rkm.c()) && this.d.equals(rkm.d()) && this.e.equals(rkm.e());
        }
    }

    public final defpackage.rkm.a f() {
        return new a(this, 0);
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterAndSortConfiguration{sortOptions=");
        sb.append(this.a);
        sb.append(", showSortOptionsTitle=");
        sb.append(this.b);
        sb.append(", showTextFilterTitle=");
        sb.append(this.c);
        sb.append(", textFilterHint=");
        sb.append(this.d);
        sb.append(", filterOptions=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}

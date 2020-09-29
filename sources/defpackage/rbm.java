package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.SortOption;
import java.util.Collection;
import java.util.List;

/* renamed from: rbm reason: default package */
abstract class rbm extends rbq {
    final ImmutableList<SortOption> a;
    final String b;
    final String c;
    final String d;
    final ImmutableList<b> e;

    /* renamed from: rbm$a */
    static final class a extends defpackage.rbq.a {
        private ImmutableList<SortOption> a;
        private String b;
        private String c;
        private String d;
        private ImmutableList<b> e;

        /* synthetic */ a(rbq rbq, byte b2) {
            this(rbq);
        }

        a() {
        }

        private a(rbq rbq) {
            this.a = rbq.a();
            this.b = rbq.b();
            this.c = rbq.c();
            this.d = rbq.d();
            this.e = rbq.e();
        }

        public final defpackage.rbq.a a(List<SortOption> list) {
            this.a = ImmutableList.a((Collection<? extends E>) list);
            return this;
        }

        public final defpackage.rbq.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null showSortOptionsTitle");
        }

        public final defpackage.rbq.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null showTextFilterTitle");
        }

        public final defpackage.rbq.a c(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null textFilterHint");
        }

        public final defpackage.rbq.a a(ImmutableList<b> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null filterOptions");
        }

        public final rbq a() {
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
                rbo rbo = new rbo(this.a, this.b, this.c, this.d, this.e);
                return rbo;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    rbm(ImmutableList<SortOption> immutableList, String str, String str2, String str3, ImmutableList<b> immutableList2) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rbq) {
            rbq rbq = (rbq) obj;
            return this.a.equals(rbq.a()) && this.b.equals(rbq.b()) && this.c.equals(rbq.c()) && this.d.equals(rbq.d()) && this.e.equals(rbq.e());
        }
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final defpackage.rbq.a f() {
        return new a(this, 0);
    }
}

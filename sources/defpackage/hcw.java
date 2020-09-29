package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* renamed from: hcw reason: default package */
public class hcw implements Parcelable, hcl {
    public static final Creator<hcw> CREATOR = new Creator<hcw>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hcw.create((hcz) juo.b(parcel, hcz.CREATOR), (hcz) juo.b(parcel, hcz.CREATOR), juo.a(parcel, hcz.CREATOR), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hcw[i];
        }
    };
    private static final hcw EMPTY = create(null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hcw$a */
    final class a extends defpackage.hcl.a {
        public final hcz a;
        public final hcz b;
        public final ImmutableMap<String, hcz> c;
        public final String d;

        private a(hcz hcz, hcz hcz2, ImmutableMap<String, hcz> immutableMap, String str) {
            this.a = hcz;
            this.b = hcz2;
            this.c = immutableMap;
            this.d = str;
        }

        /* synthetic */ a(hcw hcw, hcz hcz, hcz hcz2, ImmutableMap immutableMap, String str, byte b2) {
            this(hcz, hcz2, immutableMap, str);
        }

        private defpackage.hcl.a b() {
            return new defpackage.hcl.a() {
                private hcp a = a.this.a;
                private hcp b = a.this.b;
                private hde<String, hcz> c = new hde<>(a.this.c);
                private String d = a.this.d;

                public final defpackage.hcl.a a(hcp hcp) {
                    this.a = hcp;
                    return this;
                }

                public final defpackage.hcl.a a(String str) {
                    this.d = str;
                    return this;
                }

                public final defpackage.hcl.a a(Map<String, ? extends hcp> map) {
                    this.c.a(hcw.immutableImageMap(map));
                    return this;
                }

                public final hcl a() {
                    return hcw.create(this.a, this.b, hdi.a(this.c.a), this.d);
                }

                public final defpackage.hcl.a b(hcp hcp) {
                    this.b = hcp;
                    return this;
                }
            };
        }

        public final defpackage.hcl.a a(hcp hcp) {
            return fbn.a(this.a, hcp) ? this : b().a(hcp);
        }

        public final defpackage.hcl.a a(String str) {
            return fbn.a(this.d, str) ? this : b().a(str);
        }

        public final defpackage.hcl.a a(Map<String, ? extends hcp> map) {
            return hcu.a((Map<?, ?>) this.c, map) ? this : b().a(map);
        }

        public final hcl a() {
            return hcw.this;
        }

        public final defpackage.hcl.a b(hcp hcp) {
            return fbn.a(this.b, hcp) ? this : b().b(hcp);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fbn.a(this.a, aVar.a) && fbn.a(this.b, aVar.b) && fbn.a(this.c, aVar.c) && fbn.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
        }
    }

    protected hcw(hcz hcz, hcz hcz2, ImmutableMap<String, hcz> immutableMap, String str) {
        a aVar = new a(this, hcz, hcz2, immutableMap, str, 0);
        this.mImpl = aVar;
    }

    public static defpackage.hcl.a builder() {
        return EMPTY.toBuilder();
    }

    public static hcw create(hcp hcp, hcp hcp2, Map<String, ? extends hcp> map, String str) {
        hcz hcz = null;
        hcz immutable = hcp != null ? hcz.immutable(hcp) : null;
        if (hcp2 != null) {
            hcz = hcz.immutable(hcp2);
        }
        return new hcw(immutable, hcz, ImmutableMap.a(immutableImageMap(map)), str);
    }

    static hcw empty() {
        return EMPTY;
    }

    public static hcw fromNullable(hcl hcl) {
        return hcl != null ? immutable(hcl) : empty();
    }

    public static hcw immutable(hcl hcl) {
        return hcl instanceof hcw ? (hcw) hcl : create(hcl.main(), hcl.background(), hcl.custom(), hcl.icon());
    }

    /* access modifiers changed from: private */
    public static hcz immutableAllowNull(hcp hcp) {
        if (hcp != null) {
            return hcz.immutable(hcp);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Map<String, hcz> immutableImageMap(Map<String, ? extends hcp> map) {
        return hdc.a(map, hcz.class, $$Lambda$hcw$K8MJeusILNmj5H2rftx_uwIrGUk.INSTANCE);
    }

    public hcz background() {
        return this.mImpl.b;
    }

    public ImmutableMap<String, hcz> custom() {
        return this.mImpl.c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcw)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hcw) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public String icon() {
        return this.mImpl.d;
    }

    public hcz main() {
        return this.mImpl.a;
    }

    public defpackage.hcl.a toBuilder() {
        return this.mImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, (Parcelable) this.mImpl.a, i);
        juo.a(parcel, (Parcelable) this.mImpl.b, i);
        juo.a(parcel, (Map<String, ? extends Parcelable>) this.mImpl.c, i);
        parcel.writeString(this.mImpl.d);
    }
}

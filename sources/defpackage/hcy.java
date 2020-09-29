package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: hcy reason: default package */
public class hcy implements Parcelable, hco {
    public static final Creator<hcy> CREATOR = new Creator<hcy>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hcy.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hcy[i];
        }
    };
    private static final hcy EMPTY = create(null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hcy$a */
    final class a implements defpackage.hco.a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        private defpackage.hco.a b() {
            return new defpackage.hco.a() {
                private String a = a.this.a;
                private String b = a.this.b;
                private String c = a.this.c;
                private String d = a.this.d;

                public final defpackage.hco.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final hco a() {
                    return hcy.create(this.a, this.b, this.c, this.d);
                }

                public final defpackage.hco.a b(String str) {
                    this.b = str;
                    return this;
                }

                public final defpackage.hco.a c(String str) {
                    this.c = str;
                    return this;
                }

                public final defpackage.hco.a d(String str) {
                    this.d = str;
                    return this;
                }
            };
        }

        public final defpackage.hco.a a(String str) {
            return fbn.a(this.a, str) ? this : b().a(str);
        }

        public final hco a() {
            return hcy.this;
        }

        public final defpackage.hco.a b(String str) {
            return fbn.a(this.b, str) ? this : b().b(str);
        }

        public final defpackage.hco.a c(String str) {
            return fbn.a(this.c, str) ? this : b().c(str);
        }

        public final defpackage.hco.a d(String str) {
            return fbn.a(this.d, str) ? this : b().d(str);
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

    protected hcy(String str, String str2, String str3, String str4) {
        a aVar = new a(str, str2, str3, str4);
        this.mImpl = aVar;
    }

    public static defpackage.hco.a builder() {
        return EMPTY.toBuilder();
    }

    public static hcy create(String str, String str2, String str3, String str4) {
        return new hcy(str, str2, str3, str4);
    }

    static hcy empty() {
        return EMPTY;
    }

    public static hcy fromNullable(hco hco) {
        return hco != null ? immutable(hco) : empty();
    }

    public static hcy immutable(hco hco) {
        return hco instanceof hcy ? (hcy) hco : create(hco.title(), hco.subtitle(), hco.accessory(), hco.description());
    }

    public String accessory() {
        return this.mImpl.c;
    }

    public int describeContents() {
        return 0;
    }

    public String description() {
        return this.mImpl.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcy)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hcy) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public String subtitle() {
        return this.mImpl.b;
    }

    public String title() {
        return this.mImpl.a;
    }

    public defpackage.hco.a toBuilder() {
        return this.mImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        parcel.writeString(this.mImpl.b);
        parcel.writeString(this.mImpl.c);
        parcel.writeString(this.mImpl.d);
    }
}

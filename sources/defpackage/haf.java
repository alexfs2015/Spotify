package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: haf reason: default package */
public class haf implements Parcelable, gzv {
    public static final Creator<haf> CREATOR = new Creator<haf>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new haf[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return haf.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    };
    private static final haf EMPTY = create(null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: haf$a */
    final class a implements defpackage.gzv.a {
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

        public final defpackage.gzv.a a(String str) {
            return faw.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.gzv.a b(String str) {
            return faw.a(this.b, str) ? this : b().b(str);
        }

        public final defpackage.gzv.a c(String str) {
            return faw.a(this.c, str) ? this : b().c(str);
        }

        public final defpackage.gzv.a d(String str) {
            return faw.a(this.d, str) ? this : b().d(str);
        }

        public final gzv a() {
            return haf.this;
        }

        private defpackage.gzv.a b() {
            return new defpackage.gzv.a() {
                private String a = a.this.a;
                private String b = a.this.b;
                private String c = a.this.c;
                private String d = a.this.d;

                public final defpackage.gzv.a c(String str) {
                    this.c = str;
                    return this;
                }

                public final defpackage.gzv.a d(String str) {
                    this.d = str;
                    return this;
                }

                public final defpackage.gzv.a b(String str) {
                    this.b = str;
                    return this;
                }

                public final defpackage.gzv.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final gzv a() {
                    return haf.create(this.a, this.b, this.c, this.d);
                }
            };
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return faw.a(this.a, aVar.a) && faw.a(this.b, aVar.b) && faw.a(this.c, aVar.c) && faw.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
        }
    }

    public int describeContents() {
        return 0;
    }

    static haf empty() {
        return EMPTY;
    }

    public static haf fromNullable(gzv gzv) {
        return gzv != null ? immutable(gzv) : empty();
    }

    public static haf immutable(gzv gzv) {
        if (gzv instanceof haf) {
            return (haf) gzv;
        }
        return create(gzv.title(), gzv.subtitle(), gzv.accessory(), gzv.description());
    }

    public static haf create(String str, String str2, String str3, String str4) {
        return new haf(str, str2, str3, str4);
    }

    protected haf(String str, String str2, String str3, String str4) {
        a aVar = new a(str, str2, str3, str4);
        this.mImpl = aVar;
    }

    public String title() {
        return this.mImpl.a;
    }

    public String subtitle() {
        return this.mImpl.b;
    }

    public String accessory() {
        return this.mImpl.c;
    }

    public String description() {
        return this.mImpl.d;
    }

    public defpackage.gzv.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzv.a builder() {
        return EMPTY.toBuilder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        parcel.writeString(this.mImpl.b);
        parcel.writeString(this.mImpl.c);
        parcel.writeString(this.mImpl.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haf)) {
            return false;
        }
        return faw.a(this.mImpl, ((haf) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }
}

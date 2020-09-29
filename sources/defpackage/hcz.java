package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: hcz reason: default package */
public class hcz implements Parcelable, hcp {
    public static final Creator<hcz> CREATOR = new Creator<hcz>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hcz.create(parcel.readString(), parcel.readString(), (HubsImmutableComponentBundle) juo.b(parcel, HubsImmutableComponentBundle.CREATOR));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hcz[i];
        }
    };
    private static final hcz EMPTY = create(null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hcz$a */
    final class a extends defpackage.hcp.a {
        public final String a;
        public final String b;
        public final HubsImmutableComponentBundle c;

        private a(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            this.a = str;
            this.c = hubsImmutableComponentBundle;
            this.b = str2;
        }

        /* synthetic */ a(hcz hcz, String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle, byte b2) {
            this(str, str2, hubsImmutableComponentBundle);
        }

        private defpackage.hcp.a b() {
            return new defpackage.hcp.a() {
                private String a = a.this.a;
                private String b = a.this.b;
                private defpackage.hcj.a c = a.this.c.toBuilder();

                public final defpackage.hcp.a a(hcj hcj) {
                    this.c = hcj != null ? hcj.toBuilder() : HubsImmutableComponentBundle.builder();
                    return this;
                }

                public final defpackage.hcp.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final defpackage.hcp.a a(String str, Serializable serializable) {
                    this.c = this.c.a(str, serializable);
                    return this;
                }

                public final hcp a() {
                    return hcz.create(this.a, this.b, this.c.a());
                }

                public final defpackage.hcp.a b(hcj hcj) {
                    this.c = this.c.a(hcj);
                    return this;
                }

                public final defpackage.hcp.a b(String str) {
                    this.b = str;
                    return this;
                }
            };
        }

        public final defpackage.hcp.a a(hcj hcj) {
            return hcu.a((hcj) this.c, hcj) ? this : b().a(hcj);
        }

        public final defpackage.hcp.a a(String str) {
            return fbn.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.hcp.a a(String str, Serializable serializable) {
            return hdi.a((hcj) this.c, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final hcp a() {
            return hcz.this;
        }

        public final defpackage.hcp.a b(hcj hcj) {
            return hcj.keySet().isEmpty() ? this : b().b(hcj);
        }

        public final defpackage.hcp.a b(String str) {
            return fbn.a(this.b, str) ? this : b().b(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fbn.a(this.a, aVar.a) && fbn.a(this.b, aVar.b) && fbn.a(this.c, aVar.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }
    }

    protected hcz(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        a aVar = new a(this, str, str2, hubsImmutableComponentBundle, 0);
        this.mImpl = aVar;
    }

    public static defpackage.hcp.a builder() {
        return EMPTY.toBuilder();
    }

    public static hcz create(String str, String str2, hcj hcj) {
        return new hcz(str, str2, HubsImmutableComponentBundle.fromNullable(hcj));
    }

    public static hcz immutable(hcp hcp) {
        return hcp instanceof hcz ? (hcz) hcp : create(hcp.uri(), hcp.placeholder(), hcp.custom());
    }

    public hcj custom() {
        return this.mImpl.c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcz)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hcz) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public String placeholder() {
        return this.mImpl.b;
    }

    public defpackage.hcp.a toBuilder() {
        return this.mImpl;
    }

    public String uri() {
        return this.mImpl.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        parcel.writeString(this.mImpl.b);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        if (!hcu.a((hcj) this.mImpl.c, (hcj) null)) {
            hubsImmutableComponentBundle = this.mImpl.c;
        }
        juo.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
    }
}

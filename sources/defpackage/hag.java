package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: hag reason: default package */
public class hag implements Parcelable, gzw {
    public static final Creator<hag> CREATOR = new Creator<hag>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hag[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hag.create(parcel.readString(), parcel.readString(), (HubsImmutableComponentBundle) jse.b(parcel, HubsImmutableComponentBundle.CREATOR));
        }
    };
    private static final hag EMPTY = create(null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hag$a */
    final class a extends defpackage.gzw.a {
        public final String a;
        public final String b;
        public final HubsImmutableComponentBundle c;

        /* synthetic */ a(hag hag, String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle, byte b2) {
            this(str, str2, hubsImmutableComponentBundle);
        }

        private a(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            this.a = str;
            this.c = hubsImmutableComponentBundle;
            this.b = str2;
        }

        public final defpackage.gzw.a a(String str) {
            return faw.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.gzw.a b(String str) {
            if (faw.a(this.b, str)) {
                return this;
            }
            return b().b(str);
        }

        public final defpackage.gzw.a a(gzq gzq) {
            return hab.a((gzq) this.c, gzq) ? this : b().a(gzq);
        }

        public final defpackage.gzw.a a(String str, Serializable serializable) {
            return hap.a((gzq) this.c, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final defpackage.gzw.a b(gzq gzq) {
            return gzq.keySet().isEmpty() ? this : b().b(gzq);
        }

        public final gzw a() {
            return hag.this;
        }

        private defpackage.gzw.a b() {
            return new defpackage.gzw.a() {
                private String a = a.this.a;
                private String b = a.this.b;
                private defpackage.gzq.a c = a.this.c.toBuilder();

                public final defpackage.gzw.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final defpackage.gzw.a b(String str) {
                    this.b = str;
                    return this;
                }

                public final defpackage.gzw.a a(gzq gzq) {
                    defpackage.gzq.a aVar;
                    if (gzq != null) {
                        aVar = gzq.toBuilder();
                    } else {
                        aVar = HubsImmutableComponentBundle.builder();
                    }
                    this.c = aVar;
                    return this;
                }

                public final defpackage.gzw.a a(String str, Serializable serializable) {
                    this.c = this.c.a(str, serializable);
                    return this;
                }

                public final defpackage.gzw.a b(gzq gzq) {
                    this.c = this.c.a(gzq);
                    return this;
                }

                public final gzw a() {
                    return hag.create(this.a, this.b, this.c.a());
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
            return faw.a(this.a, aVar.a) && faw.a(this.b, aVar.b) && faw.a(this.c, aVar.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }
    }

    public int describeContents() {
        return 0;
    }

    public static hag immutable(gzw gzw) {
        if (gzw instanceof hag) {
            return (hag) gzw;
        }
        return create(gzw.uri(), gzw.placeholder(), gzw.custom());
    }

    public static hag create(String str, String str2, gzq gzq) {
        return new hag(str, str2, HubsImmutableComponentBundle.fromNullable(gzq));
    }

    protected hag(String str, String str2, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        a aVar = new a(this, str, str2, hubsImmutableComponentBundle, 0);
        this.mImpl = aVar;
    }

    public String uri() {
        return this.mImpl.a;
    }

    public String placeholder() {
        return this.mImpl.b;
    }

    public gzq custom() {
        return this.mImpl.c;
    }

    public defpackage.gzw.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzw.a builder() {
        return EMPTY.toBuilder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        parcel.writeString(this.mImpl.b);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        if (!hab.a((gzq) this.mImpl.c, (gzq) null)) {
            hubsImmutableComponentBundle = this.mImpl.c;
        }
        jse.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hag)) {
            return false;
        }
        return faw.a(this.mImpl, ((hag) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }
}

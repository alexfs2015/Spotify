package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: haa reason: default package */
public class haa implements Parcelable, gzp {
    public static final Creator<haa> CREATOR = new Creator<haa>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new haa[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return haa.create(parcel.readString(), (HubsImmutableComponentBundle) jse.b(parcel, HubsImmutableComponentBundle.CREATOR));
        }
    };
    private static final haa EMPTY = create("", null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: haa$a */
    final class a extends defpackage.gzp.a {
        public final String a;
        public final HubsImmutableComponentBundle b;

        public a(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            this.a = (String) fay.a(str);
            this.b = (HubsImmutableComponentBundle) fay.a(hubsImmutableComponentBundle);
        }

        public final defpackage.gzp.a a(String str) {
            return faw.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.gzp.a a(gzq gzq) {
            return hab.a((gzq) this.b, gzq) ? this : b().a(gzq);
        }

        public final defpackage.gzp.a b(gzq gzq) {
            return gzq.keySet().isEmpty() ? this : b().b(gzq);
        }

        public final defpackage.gzp.a a(String str, Serializable serializable) {
            return hap.a((gzq) this.b, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final gzp a() {
            return haa.this;
        }

        private defpackage.gzp.a b() {
            return new defpackage.gzp.a() {
                private String a = a.this.a;
                private defpackage.gzq.a b = a.this.b.toBuilder();

                public final defpackage.gzp.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final defpackage.gzp.a a(gzq gzq) {
                    defpackage.gzq.a aVar;
                    if (gzq != null) {
                        aVar = gzq.toBuilder();
                    } else {
                        aVar = HubsImmutableComponentBundle.builder();
                    }
                    this.b = aVar;
                    return this;
                }

                public final defpackage.gzp.a a(String str, Serializable serializable) {
                    this.b = this.b.a(str, serializable);
                    return this;
                }

                public final defpackage.gzp.a b(gzq gzq) {
                    this.b = this.b.a(gzq);
                    return this;
                }

                public final gzp a() {
                    return haa.create(this.a, this.b.a());
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
            return faw.a(this.a, aVar.a) && faw.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    public int describeContents() {
        return 0;
    }

    static haa empty() {
        return EMPTY;
    }

    public static haa immutable(gzp gzp) {
        if (gzp instanceof haa) {
            return (haa) gzp;
        }
        return create(gzp.name(), gzp.data());
    }

    public static haa create(String str, gzq gzq) {
        return new haa(str, HubsImmutableComponentBundle.fromNullable(gzq));
    }

    protected haa(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.mImpl = new a(str, hubsImmutableComponentBundle);
    }

    public String name() {
        return this.mImpl.a;
    }

    public HubsImmutableComponentBundle data() {
        return this.mImpl.b;
    }

    public defpackage.gzp.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzp.a builder() {
        return EMPTY.toBuilder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        if (!hab.a((gzq) this.mImpl.b, (gzq) null)) {
            hubsImmutableComponentBundle = this.mImpl.b;
        }
        jse.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haa)) {
            return false;
        }
        return faw.a(this.mImpl, ((haa) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public static ImmutableMap<String, haa> asImmutableCommandMap(Map<String, ? extends gzp> map) {
        return haj.a(map, haa.class, $$Lambda$haa$Ddg9NnwfzcD6XkD6FjqlsIQzlQQ.INSTANCE);
    }

    static /* synthetic */ haa lambda$asImmutableCommandMap$0(gzp gzp) {
        if (gzp != null) {
            return immutable(gzp);
        }
        return null;
    }
}

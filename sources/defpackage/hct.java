package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: hct reason: default package */
public class hct implements Parcelable, hci {
    public static final Creator<hct> CREATOR = new Creator<hct>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hct.create(parcel.readString(), (HubsImmutableComponentBundle) juo.b(parcel, HubsImmutableComponentBundle.CREATOR));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hct[i];
        }
    };
    private static final hct EMPTY = create("", null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hct$a */
    final class a extends defpackage.hci.a {
        public final String a;
        public final HubsImmutableComponentBundle b;

        public a(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            this.a = (String) fbp.a(str);
            this.b = (HubsImmutableComponentBundle) fbp.a(hubsImmutableComponentBundle);
        }

        private defpackage.hci.a b() {
            return new defpackage.hci.a() {
                private String a = a.this.a;
                private defpackage.hcj.a b = a.this.b.toBuilder();

                public final defpackage.hci.a a(hcj hcj) {
                    this.b = hcj != null ? hcj.toBuilder() : HubsImmutableComponentBundle.builder();
                    return this;
                }

                public final defpackage.hci.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final defpackage.hci.a a(String str, Serializable serializable) {
                    this.b = this.b.a(str, serializable);
                    return this;
                }

                public final hci a() {
                    return hct.create(this.a, this.b.a());
                }

                public final defpackage.hci.a b(hcj hcj) {
                    this.b = this.b.a(hcj);
                    return this;
                }
            };
        }

        public final defpackage.hci.a a(hcj hcj) {
            return hcu.a((hcj) this.b, hcj) ? this : b().a(hcj);
        }

        public final defpackage.hci.a a(String str) {
            return fbn.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.hci.a a(String str, Serializable serializable) {
            return hdi.a((hcj) this.b, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final hci a() {
            return hct.this;
        }

        public final defpackage.hci.a b(hcj hcj) {
            return hcj.keySet().isEmpty() ? this : b().b(hcj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fbn.a(this.a, aVar.a) && fbn.a(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }
    }

    protected hct(String str, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        this.mImpl = new a(str, hubsImmutableComponentBundle);
    }

    public static ImmutableMap<String, hct> asImmutableCommandMap(Map<String, ? extends hci> map) {
        return hdc.a(map, hct.class, $$Lambda$hct$bc5WSl49Rsl_f1m_mPW_daiSPMA.INSTANCE);
    }

    public static defpackage.hci.a builder() {
        return EMPTY.toBuilder();
    }

    public static hct create(String str, hcj hcj) {
        return new hct(str, HubsImmutableComponentBundle.fromNullable(hcj));
    }

    static hct empty() {
        return EMPTY;
    }

    public static hct immutable(hci hci) {
        return hci instanceof hct ? (hct) hci : create(hci.name(), hci.data());
    }

    static /* synthetic */ hct lambda$asImmutableCommandMap$0(hci hci) {
        if (hci != null) {
            return immutable(hci);
        }
        return null;
    }

    public HubsImmutableComponentBundle data() {
        return this.mImpl.b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hct)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hct) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public String name() {
        return this.mImpl.a;
    }

    public defpackage.hci.a toBuilder() {
        return this.mImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        if (!hcu.a((hcj) this.mImpl.b, (hcj) null)) {
            hubsImmutableComponentBundle = this.mImpl.b;
        }
        juo.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
    }
}

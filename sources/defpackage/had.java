package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* renamed from: had reason: default package */
public class had implements Parcelable, gzs {
    public static final Creator<had> CREATOR = new Creator<had>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new had[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return had.create((hag) jse.b(parcel, hag.CREATOR), (hag) jse.b(parcel, hag.CREATOR), jse.a(parcel, hag.CREATOR), parcel.readString());
        }
    };
    private static final had EMPTY = create(null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: had$a */
    final class a extends defpackage.gzs.a {
        public final hag a;
        public final hag b;
        public final ImmutableMap<String, hag> c;
        public final String d;

        /* synthetic */ a(had had, hag hag, hag hag2, ImmutableMap immutableMap, String str, byte b2) {
            this(hag, hag2, immutableMap, str);
        }

        private a(hag hag, hag hag2, ImmutableMap<String, hag> immutableMap, String str) {
            this.a = hag;
            this.b = hag2;
            this.c = immutableMap;
            this.d = str;
        }

        public final defpackage.gzs.a a(gzw gzw) {
            return faw.a(this.a, gzw) ? this : b().a(gzw);
        }

        public final defpackage.gzs.a b(gzw gzw) {
            return faw.a(this.b, gzw) ? this : b().b(gzw);
        }

        public final defpackage.gzs.a a(Map<String, ? extends gzw> map) {
            return hab.a((Map<?, ?>) this.c, map) ? this : b().a(map);
        }

        public final defpackage.gzs.a a(String str) {
            return faw.a(this.d, str) ? this : b().a(str);
        }

        public final gzs a() {
            return had.this;
        }

        private defpackage.gzs.a b() {
            return new defpackage.gzs.a() {
                private gzw a = a.this.a;
                private gzw b = a.this.b;
                private hal<String, hag> c = new hal<>(a.this.c);
                private String d = a.this.d;

                public final defpackage.gzs.a a(gzw gzw) {
                    this.a = gzw;
                    return this;
                }

                public final defpackage.gzs.a b(gzw gzw) {
                    this.b = gzw;
                    return this;
                }

                public final defpackage.gzs.a a(Map<String, ? extends gzw> map) {
                    this.c.a(had.immutableImageMap(map));
                    return this;
                }

                public final defpackage.gzs.a a(String str) {
                    this.d = str;
                    return this;
                }

                public final gzs a() {
                    return had.create(this.a, this.b, hap.a(this.c.a), this.d);
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

    static had empty() {
        return EMPTY;
    }

    public static had fromNullable(gzs gzs) {
        return gzs != null ? immutable(gzs) : empty();
    }

    public static had immutable(gzs gzs) {
        if (gzs instanceof had) {
            return (had) gzs;
        }
        return create(gzs.main(), gzs.background(), gzs.custom(), gzs.icon());
    }

    public static had create(gzw gzw, gzw gzw2, Map<String, ? extends gzw> map, String str) {
        hag hag = null;
        hag immutable = gzw != null ? hag.immutable(gzw) : null;
        if (gzw2 != null) {
            hag = hag.immutable(gzw2);
        }
        return new had(immutable, hag, ImmutableMap.a(immutableImageMap(map)), str);
    }

    protected had(hag hag, hag hag2, ImmutableMap<String, hag> immutableMap, String str) {
        a aVar = new a(this, hag, hag2, immutableMap, str, 0);
        this.mImpl = aVar;
    }

    public hag main() {
        return this.mImpl.a;
    }

    public hag background() {
        return this.mImpl.b;
    }

    public ImmutableMap<String, hag> custom() {
        return this.mImpl.c;
    }

    public String icon() {
        return this.mImpl.d;
    }

    public defpackage.gzs.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzs.a builder() {
        return EMPTY.toBuilder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, (Parcelable) this.mImpl.a, i);
        jse.a(parcel, (Parcelable) this.mImpl.b, i);
        jse.a(parcel, (Map<String, ? extends Parcelable>) this.mImpl.c, i);
        parcel.writeString(this.mImpl.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof had)) {
            return false;
        }
        return faw.a(this.mImpl, ((had) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    /* access modifiers changed from: private */
    public static hag immutableAllowNull(gzw gzw) {
        if (gzw != null) {
            return hag.immutable(gzw);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Map<String, hag> immutableImageMap(Map<String, ? extends gzw> map) {
        return haj.a(map, hag.class, $$Lambda$had$hOZxTlzPq17tWOqf4DfE94F3lTY.INSTANCE);
    }
}

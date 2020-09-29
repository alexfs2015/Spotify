package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: hai reason: default package */
public class hai implements Parcelable, gzz {
    public static final Creator<hai> CREATOR = new Creator<hai>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hai[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            hai hai = new hai(parcel.readString(), parcel.readString(), (hae) jse.b(parcel, hae.CREATOR), hab.a(parcel), hab.a(parcel), parcel.readString(), HubsImmutableComponentBundle.fromNullable((gzq) jse.b(parcel, HubsImmutableComponentBundle.CREATOR)));
            return hai;
        }
    };
    public static final hai EMPTY = create(null, null, null, null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hai$a */
    final class a extends defpackage.gzz.a {
        public final String a;
        public final String b;
        public final hae c;
        public final ImmutableList<hae> d;
        public final ImmutableList<hae> e;
        public final String f;
        public final HubsImmutableComponentBundle g;

        /* synthetic */ a(hai hai, String str, String str2, hae hae, ImmutableList immutableList, ImmutableList immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle, byte b2) {
            this(str, str2, hae, immutableList, immutableList2, str3, hubsImmutableComponentBundle);
        }

        private a(String str, String str2, hae hae, ImmutableList<hae> immutableList, ImmutableList<hae> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            this.a = str;
            this.b = str2;
            this.c = hae;
            this.d = (ImmutableList) fay.a(immutableList);
            this.e = (ImmutableList) fay.a(immutableList2);
            this.f = str3;
            this.g = (HubsImmutableComponentBundle) fay.a(hubsImmutableComponentBundle);
        }

        public final defpackage.gzz.a a(String str) {
            return faw.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.gzz.a b(String str) {
            return faw.a(this.b, str) ? this : b().b(str);
        }

        public final defpackage.gzz.a a(gzt gzt) {
            return hab.a((gzt) this.c, gzt) ? this : b().a(gzt);
        }

        public final defpackage.gzz.a a(List<? extends gzt> list) {
            return hab.a((Collection<?>) this.d, (Collection<?>) list) ? this : b().a(list);
        }

        public final defpackage.gzz.a a(gzt... gztArr) {
            fay.a(gztArr);
            if (gztArr.length == 0) {
                return a((List<? extends gzt>) ImmutableList.d());
            }
            return b().a(gztArr);
        }

        public final defpackage.gzz.a b(List<? extends gzt> list) {
            fay.a(list);
            return list.isEmpty() ? this : b().b(list);
        }

        public final defpackage.gzz.a b(gzt... gztArr) {
            fay.a(gztArr);
            return gztArr.length == 0 ? this : b().b(gztArr);
        }

        public final defpackage.gzz.a c(List<? extends gzt> list) {
            if (hab.a((Collection<?>) this.e, (Collection<?>) list)) {
                return this;
            }
            return b().c(list);
        }

        public final defpackage.gzz.a c(gzt... gztArr) {
            fay.a(gztArr);
            if (gztArr.length == 0) {
                return c((List<? extends gzt>) ImmutableList.d());
            }
            return b().c(gztArr);
        }

        public final defpackage.gzz.a c(String str) {
            if (faw.a(this.f, str)) {
                return this;
            }
            return b().c(str);
        }

        public final defpackage.gzz.a a(gzq gzq) {
            return hab.a((gzq) this.g, gzq) ? this : b().a(gzq);
        }

        public final defpackage.gzz.a a(String str, Serializable serializable) {
            return hap.a((gzq) this.g, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final defpackage.gzz.a b(gzq gzq) {
            return gzq.keySet().isEmpty() ? this : b().b(gzq);
        }

        public final gzz a() {
            return hai.this;
        }

        private defpackage.gzz.a b() {
            return new defpackage.gzz.a() {
                private String a = a.this.a;
                private String b = a.this.b;
                private defpackage.gzt.a c;
                private final hak<hae> d;
                private final hak<hae> e;
                private String f;
                private defpackage.gzq.a g;

                {
                    this.c = a.this.c != null ? a.this.c.toBuilder() : null;
                    this.d = new hak<>(a.this.d);
                    this.e = new hak<>(a.this.e);
                    this.f = a.this.f;
                    this.g = a.this.g.toBuilder();
                }

                public final defpackage.gzz.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final defpackage.gzz.a b(String str) {
                    this.b = str;
                    return this;
                }

                public final defpackage.gzz.a a(gzt gzt) {
                    this.c = gzt != null ? gzt.toBuilder() : null;
                    return this;
                }

                public final defpackage.gzz.a a(List<? extends gzt> list) {
                    this.d.a(hab.b(list));
                    return this;
                }

                public final defpackage.gzz.a a(gzt... gztArr) {
                    this.d.a(hab.a(gztArr));
                    return this;
                }

                public final defpackage.gzz.a b(List<? extends gzt> list) {
                    this.d.b(hab.a((Iterable<? extends gzt>) list));
                    return this;
                }

                public final defpackage.gzz.a b(gzt... gztArr) {
                    this.d.b(hab.a(gztArr));
                    return this;
                }

                public final defpackage.gzz.a c(List<? extends gzt> list) {
                    this.e.a(hab.b(list));
                    return this;
                }

                public final defpackage.gzz.a c(gzt... gztArr) {
                    this.e.a(hab.a(gztArr));
                    return this;
                }

                public final defpackage.gzz.a c(String str) {
                    this.f = str;
                    return this;
                }

                public final defpackage.gzz.a a(gzq gzq) {
                    defpackage.gzq.a aVar;
                    if (gzq != null) {
                        aVar = gzq.toBuilder();
                    } else {
                        aVar = HubsImmutableComponentBundle.builder();
                    }
                    this.g = aVar;
                    return this;
                }

                public final defpackage.gzz.a a(String str, Serializable serializable) {
                    this.g = this.g.a(str, serializable);
                    return this;
                }

                public final defpackage.gzz.a b(gzq gzq) {
                    this.g = this.g.a(gzq);
                    return this;
                }

                public final gzz a() {
                    String str = this.a;
                    String str2 = this.b;
                    defpackage.gzt.a aVar = this.c;
                    hai hai = new hai(str, str2, aVar != null ? hae.immutable(aVar.a()) : null, ImmutableList.a((Collection<? extends E>) this.d.a), ImmutableList.a((Collection<? extends E>) this.e.a), this.f, HubsImmutableComponentBundle.fromNullable(this.g.a()));
                    return hai;
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
            return faw.a(this.a, aVar.a) && faw.a(this.b, aVar.b) && faw.a(this.c, aVar.c) && faw.a(this.d, aVar.d) && faw.a(this.e, aVar.e) && faw.a(this.f, aVar.f) && faw.a(this.g, aVar.g);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
        }
    }

    public final int describeContents() {
        return 0;
    }

    public static hai immutable(gzz gzz) {
        if (gzz instanceof hai) {
            return (hai) gzz;
        }
        return create(gzz.id(), gzz.title(), gzz.header(), gzz.body(), gzz.overlays(), gzz.extension(), gzz.custom());
    }

    public static hai create(String str, String str2, gzt gzt, List<? extends gzt> list, List<? extends gzt> list2, String str3, gzq gzq) {
        hae hae;
        if (gzt == null) {
            hae = null;
        } else {
            hae = hae.immutable(gzt);
        }
        hai hai = new hai(str, str2, hae, hab.a(list), hab.a(list2), str3, HubsImmutableComponentBundle.fromNullable(gzq));
        return hai;
    }

    protected hai(String str, String str2, hae hae, ImmutableList<hae> immutableList, ImmutableList<hae> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        a aVar = new a(this, str, str2, hae, immutableList, immutableList2, str3, hubsImmutableComponentBundle, 0);
        this.mImpl = aVar;
    }

    public String id() {
        return this.mImpl.a;
    }

    public String title() {
        return this.mImpl.b;
    }

    public hae header() {
        return this.mImpl.c;
    }

    public List<hae> body() {
        return this.mImpl.d;
    }

    public List<hae> overlays() {
        return this.mImpl.e;
    }

    public String extension() {
        return this.mImpl.f;
    }

    public HubsImmutableComponentBundle custom() {
        return this.mImpl.g;
    }

    public defpackage.gzz.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzz.a builder() {
        return EMPTY.toBuilder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        parcel.writeString(this.mImpl.b);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        jse.a(parcel, hab.a((gzt) this.mImpl.c, (gzt) null) ? null : this.mImpl.c, i);
        hab.a(parcel, (List<? extends hae>) this.mImpl.d);
        hab.a(parcel, (List<? extends hae>) this.mImpl.e);
        parcel.writeString(this.mImpl.f);
        if (!hab.a((gzq) this.mImpl.g, (gzq) null)) {
            hubsImmutableComponentBundle = this.mImpl.g;
        }
        jse.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hai)) {
            return false;
        }
        return faw.a(this.mImpl, ((hai) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }
}

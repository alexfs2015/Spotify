package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: hae reason: default package */
public class hae implements Parcelable, gzt {
    public static final Creator<hae> CREATOR = new Creator<hae>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hae[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hae.create((hac) jse.b(parcel, hac.CREATOR), (haf) jse.b(parcel, haf.CREATOR), (had) jse.b(parcel, had.CREATOR), (HubsImmutableComponentBundle) jse.b(parcel, HubsImmutableComponentBundle.CREATOR), (HubsImmutableComponentBundle) jse.b(parcel, HubsImmutableComponentBundle.CREATOR), (HubsImmutableComponentBundle) jse.b(parcel, HubsImmutableComponentBundle.CREATOR), (hah) jse.b(parcel, hah.CREATOR), parcel.readString(), parcel.readString(), jse.a(parcel, haa.CREATOR), hab.a(parcel));
        }
    };
    private static final hae EMPTY = create(null, null, null, null, null, null, null, null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hae$a */
    final class a extends defpackage.gzt.a {
        public final hac a;
        public final haf b;
        public final had c;
        public final HubsImmutableComponentBundle d;
        public final HubsImmutableComponentBundle e;
        public final HubsImmutableComponentBundle f;
        public final hah g;
        public final String h;
        public final String i;
        public final ImmutableMap<String, haa> j;
        public final ImmutableList<hae> k;

        /* synthetic */ a(hae hae, hac hac, haf haf, had had, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, hah hah, String str, String str2, ImmutableMap immutableMap, ImmutableList immutableList, byte b2) {
            this(hac, haf, had, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hah, str, str2, immutableMap, immutableList);
        }

        private a(hac hac, haf haf, had had, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, hah hah, String str, String str2, ImmutableMap<String, haa> immutableMap, ImmutableList<hae> immutableList) {
            this.a = (hac) fay.a(hac);
            this.b = (haf) fay.a(haf);
            this.c = (had) fay.a(had);
            this.d = (HubsImmutableComponentBundle) fay.a(hubsImmutableComponentBundle);
            this.e = (HubsImmutableComponentBundle) fay.a(hubsImmutableComponentBundle2);
            this.f = (HubsImmutableComponentBundle) fay.a(hubsImmutableComponentBundle3);
            this.g = hah;
            this.h = str;
            this.i = str2;
            this.j = (ImmutableMap) fay.a(immutableMap);
            this.k = (ImmutableList) fay.a(immutableList);
        }

        public final defpackage.gzt.a a(String str, String str2) {
            return a((gzr) hac.create(str, str2));
        }

        public final defpackage.gzt.a a(gzr gzr) {
            if (hab.a((gzr) this.a, gzr)) {
                return this;
            }
            return b().a(gzr);
        }

        public final defpackage.gzt.a a(gzv gzv) {
            return hab.a((gzv) this.b, gzv) ? this : b().a(gzv);
        }

        public final defpackage.gzt.a a(gzs gzs) {
            return hab.a((gzs) this.c, gzs) ? this : b().a(gzs);
        }

        public final defpackage.gzt.a a(gzq gzq) {
            if (hab.a((gzq) this.d, gzq)) {
                return this;
            }
            return b().a(gzq);
        }

        public final defpackage.gzt.a a(String str, Serializable serializable) {
            return hap.a((gzq) this.d, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final defpackage.gzt.a b(gzq gzq) {
            return gzq.keySet().isEmpty() ? this : b().b(gzq);
        }

        public final defpackage.gzt.a c(gzq gzq) {
            return hab.a((gzq) this.e, gzq) ? this : b().c(gzq);
        }

        public final defpackage.gzt.a b(String str, Serializable serializable) {
            return hap.a((gzq) this.e, str, (Object) serializable) ? this : b().b(str, serializable);
        }

        public final defpackage.gzt.a d(gzq gzq) {
            return gzq.keySet().isEmpty() ? this : b().d(gzq);
        }

        public final defpackage.gzt.a e(gzq gzq) {
            return hab.a((gzq) this.f, gzq) ? this : b().e(gzq);
        }

        public final defpackage.gzt.a c(String str, Serializable serializable) {
            return hap.a((gzq) this.f, str, (Object) serializable) ? this : b().c(str, serializable);
        }

        public final defpackage.gzt.a f(gzq gzq) {
            return gzq.keySet().isEmpty() ? this : b().f(gzq);
        }

        public final defpackage.gzt.a a(gzy gzy) {
            return faw.a(this.g, gzy) ? this : b().a(gzy);
        }

        public final defpackage.gzt.a a(String str) {
            return faw.a(this.h, str) ? this : b().a(str);
        }

        public final defpackage.gzt.a b(String str) {
            return faw.a(this.i, str) ? this : b().b(str);
        }

        public final defpackage.gzt.a a(Map<String, ? extends gzp> map) {
            return hab.a((Map<?, ?>) this.j, map) ? this : b().a(map);
        }

        public final defpackage.gzt.a b(Map<String, ? extends gzp> map) {
            return map.isEmpty() ? this : b().b(map);
        }

        public final defpackage.gzt.a a(String str, gzp gzp) {
            if (hap.a((Map<K, ?>) this.j, str, (Object) gzp)) {
                return this;
            }
            return b().a(str, gzp);
        }

        public final defpackage.gzt.a a(List<? extends gzt> list) {
            if (hab.a((Collection<?>) this.k, (Collection<?>) list)) {
                return this;
            }
            return b().a(list);
        }

        public final defpackage.gzt.a a(gzt... gztArr) {
            fay.a(gztArr);
            if (gztArr.length == 0) {
                return a((List<? extends gzt>) ImmutableList.d());
            }
            return b().a(gztArr);
        }

        public final defpackage.gzt.a b(List<? extends gzt> list) {
            fay.a(list);
            return list.isEmpty() ? this : b().b(list);
        }

        public final defpackage.gzt.a b(gzt... gztArr) {
            fay.a(gztArr);
            return gztArr.length == 0 ? this : b().b(gztArr);
        }

        public final gzt a() {
            return hae.this;
        }

        private defpackage.gzt.a b() {
            return new defpackage.gzt.a() {
                private gzr a = a.this.a;
                private defpackage.gzv.a b = a.this.b.toBuilder();
                private defpackage.gzs.a c = a.this.c.toBuilder();
                private defpackage.gzq.a d = a.this.d.toBuilder();
                private defpackage.gzq.a e = a.this.e.toBuilder();
                private defpackage.gzq.a f = a.this.f.toBuilder();
                private gzy g = a.this.g;
                private String h = a.this.h;
                private String i = a.this.i;
                private final hal<String, haa> j = new hal<>(a.this.j);
                private final hak<hae> k = new hak<>(a.this.k);

                public final defpackage.gzt.a a(String str, String str2) {
                    return a((gzr) hac.create(str, str2));
                }

                public final defpackage.gzt.a a(gzr gzr) {
                    this.a = (gzr) fay.a(gzr);
                    return this;
                }

                public final defpackage.gzt.a a(gzv gzv) {
                    this.b = gzv != null ? gzv.toBuilder() : haf.builder();
                    return this;
                }

                public final defpackage.gzt.a a(gzs gzs) {
                    defpackage.gzs.a aVar;
                    if (gzs != null) {
                        aVar = gzs.toBuilder();
                    } else {
                        aVar = had.builder();
                    }
                    this.c = aVar;
                    return this;
                }

                public final defpackage.gzt.a a(gzq gzq) {
                    defpackage.gzq.a aVar;
                    if (gzq != null) {
                        aVar = gzq.toBuilder();
                    } else {
                        aVar = HubsImmutableComponentBundle.builder();
                    }
                    this.d = aVar;
                    return this;
                }

                public final defpackage.gzt.a a(String str, Serializable serializable) {
                    this.d = this.d.a(str, serializable);
                    return this;
                }

                public final defpackage.gzt.a b(gzq gzq) {
                    this.d = this.d.a(gzq);
                    return this;
                }

                public final defpackage.gzt.a c(gzq gzq) {
                    defpackage.gzq.a aVar;
                    if (gzq != null) {
                        aVar = gzq.toBuilder();
                    } else {
                        aVar = HubsImmutableComponentBundle.builder();
                    }
                    this.e = aVar;
                    return this;
                }

                public final defpackage.gzt.a b(String str, Serializable serializable) {
                    this.e = this.e.a(str, serializable);
                    return this;
                }

                public final defpackage.gzt.a d(gzq gzq) {
                    this.e = this.e.a(gzq);
                    return this;
                }

                public final defpackage.gzt.a e(gzq gzq) {
                    defpackage.gzq.a aVar;
                    if (gzq != null) {
                        aVar = gzq.toBuilder();
                    } else {
                        aVar = HubsImmutableComponentBundle.builder();
                    }
                    this.f = aVar;
                    return this;
                }

                public final defpackage.gzt.a c(String str, Serializable serializable) {
                    this.f = this.f.a(str, serializable);
                    return this;
                }

                public final defpackage.gzt.a f(gzq gzq) {
                    this.f = this.f.a(gzq);
                    return this;
                }

                public final defpackage.gzt.a a(gzy gzy) {
                    this.g = gzy;
                    return this;
                }

                public final defpackage.gzt.a a(String str) {
                    this.h = str;
                    return this;
                }

                public final defpackage.gzt.a b(String str) {
                    this.i = str;
                    return this;
                }

                public final defpackage.gzt.a a(Map<String, ? extends gzp> map) {
                    this.j.a(haa.asImmutableCommandMap(map));
                    return this;
                }

                public final defpackage.gzt.a b(Map<String, ? extends gzp> map) {
                    hal<String, haa> hal = this.j;
                    ImmutableMap asImmutableCommandMap = haa.asImmutableCommandMap(map);
                    fay.a(asImmutableCommandMap);
                    hal.a();
                    hal.a.putAll(asImmutableCommandMap);
                    return this;
                }

                public final defpackage.gzt.a a(String str, gzp gzp) {
                    hal<String, haa> hal = this.j;
                    haa immutable = haa.immutable(gzp);
                    if (!hap.a(hal.a, str, (Object) immutable)) {
                        hal.a();
                        if (immutable == null) {
                            hal.a.remove(str);
                        } else {
                            hal.a.put(str, immutable);
                        }
                    }
                    return this;
                }

                public final defpackage.gzt.a a(List<? extends gzt> list) {
                    this.k.a(hab.b(list));
                    return this;
                }

                public final defpackage.gzt.a a(gzt... gztArr) {
                    this.k.a(hab.a(gztArr));
                    return this;
                }

                public final defpackage.gzt.a b(List<? extends gzt> list) {
                    this.k.b(hab.a((Iterable<? extends gzt>) list));
                    return this;
                }

                public final defpackage.gzt.a b(gzt... gztArr) {
                    this.k.b(hab.a(gztArr));
                    return this;
                }

                public final gzt a() {
                    return hae.create(this.a, this.b.a(), this.c.a(), this.d.a(), this.e.a(), this.f.a(), this.g, this.h, this.i, hap.a(this.j.a), ImmutableList.a((Collection<? extends E>) this.k.a));
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
            return faw.a(this.a, aVar.a) && faw.a(this.b, aVar.b) && faw.a(this.c, aVar.c) && faw.a(this.d, aVar.d) && faw.a(this.e, aVar.e) && faw.a(this.f, aVar.f) && faw.a(this.g, aVar.g) && faw.a(this.h, aVar.h) && faw.a(this.i, aVar.i) && faw.a(this.j, aVar.j) && faw.a(this.k, aVar.k);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
        }
    }

    public int describeContents() {
        return 0;
    }

    static hae empty() {
        return EMPTY;
    }

    public static hae immutable(gzt gzt) {
        if (gzt instanceof hae) {
            return (hae) gzt;
        }
        return create(gzt.componentId(), gzt.text(), gzt.images(), gzt.metadata(), gzt.logging(), gzt.custom(), gzt.target(), gzt.id(), gzt.group(), gzt.events(), gzt.children());
    }

    public static hae create(gzr gzr, gzv gzv, gzs gzs, gzq gzq, gzq gzq2, gzq gzq3, gzy gzy, String str, String str2, Map<String, ? extends gzp> map, List<? extends gzt> list) {
        hae hae = new hae(hac.fromNullable(gzr), haf.fromNullable(gzv), had.fromNullable(gzs), HubsImmutableComponentBundle.fromNullable(gzq), HubsImmutableComponentBundle.fromNullable(gzq2), HubsImmutableComponentBundle.fromNullable(gzq3), hah.immutableOrNull(gzy), str, str2, haa.asImmutableCommandMap(map), hab.a(list));
        return hae;
    }

    protected hae(hac hac, haf haf, had had, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, hah hah, String str, String str2, ImmutableMap<String, haa> immutableMap, ImmutableList<hae> immutableList) {
        a aVar = new a(this, hac, haf, had, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hah, str, str2, immutableMap, immutableList, 0);
        this.mImpl = aVar;
    }

    public hac componentId() {
        return this.mImpl.a;
    }

    public String id() {
        return this.mImpl.h;
    }

    public String group() {
        return this.mImpl.i;
    }

    public haf text() {
        return this.mImpl.b;
    }

    public had images() {
        return this.mImpl.c;
    }

    public HubsImmutableComponentBundle metadata() {
        return this.mImpl.d;
    }

    public HubsImmutableComponentBundle logging() {
        return this.mImpl.e;
    }

    public HubsImmutableComponentBundle custom() {
        return this.mImpl.f;
    }

    public hah target() {
        return this.mImpl.g;
    }

    public Map<String, haa> events() {
        return this.mImpl.j;
    }

    public List<hae> children() {
        return this.mImpl.k;
    }

    public gzt findChildById(String str) {
        return gzu.a((Iterable<M>) children(), str);
    }

    public List<hae> childGroup(String str) {
        return gzu.b((Iterable<M>) children(), str);
    }

    public defpackage.gzt.a toBuilder() {
        return this.mImpl;
    }

    public static defpackage.gzt.a builder() {
        return EMPTY.toBuilder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        jse.a(parcel, hab.a((gzr) this.mImpl.a, (gzr) null) ? null : this.mImpl.a, i);
        jse.a(parcel, hab.a((gzv) this.mImpl.b, (gzv) null) ? null : this.mImpl.b, i);
        jse.a(parcel, hab.a((gzs) this.mImpl.c, (gzs) null) ? null : this.mImpl.c, i);
        jse.a(parcel, hab.a((gzq) this.mImpl.d, (gzq) null) ? null : this.mImpl.d, i);
        jse.a(parcel, hab.a((gzq) this.mImpl.e, (gzq) null) ? null : this.mImpl.e, i);
        if (!hab.a((gzq) this.mImpl.f, (gzq) null)) {
            hubsImmutableComponentBundle = this.mImpl.f;
        }
        jse.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
        jse.a(parcel, (Parcelable) this.mImpl.g, i);
        parcel.writeString(this.mImpl.h);
        parcel.writeString(this.mImpl.i);
        jse.a(parcel, (Map<String, ? extends Parcelable>) this.mImpl.j, 0);
        hab.a(parcel, (List<? extends hae>) this.mImpl.k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hae)) {
            return false;
        }
        return faw.a(this.mImpl, ((hae) obj).mImpl);
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }
}

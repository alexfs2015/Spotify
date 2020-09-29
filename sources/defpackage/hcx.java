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

/* renamed from: hcx reason: default package */
public class hcx implements Parcelable, hcm {
    public static final Creator<hcx> CREATOR = new Creator<hcx>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return hcx.create((hcv) juo.b(parcel, hcv.CREATOR), (hcy) juo.b(parcel, hcy.CREATOR), (hcw) juo.b(parcel, hcw.CREATOR), (HubsImmutableComponentBundle) juo.b(parcel, HubsImmutableComponentBundle.CREATOR), (HubsImmutableComponentBundle) juo.b(parcel, HubsImmutableComponentBundle.CREATOR), (HubsImmutableComponentBundle) juo.b(parcel, HubsImmutableComponentBundle.CREATOR), (hda) juo.b(parcel, hda.CREATOR), parcel.readString(), parcel.readString(), juo.a(parcel, hct.CREATOR), hcu.a(parcel));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hcx[i];
        }
    };
    private static final hcx EMPTY = create(null, null, null, null, null, null, null, null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hcx$a */
    final class a extends defpackage.hcm.a {
        public final hcv a;
        public final hcy b;
        public final hcw c;
        public final HubsImmutableComponentBundle d;
        public final HubsImmutableComponentBundle e;
        public final HubsImmutableComponentBundle f;
        public final hda g;
        public final String h;
        public final String i;
        public final ImmutableMap<String, hct> j;
        public final ImmutableList<hcx> k;

        private a(hcv hcv, hcy hcy, hcw hcw, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, hda hda, String str, String str2, ImmutableMap<String, hct> immutableMap, ImmutableList<hcx> immutableList) {
            this.a = (hcv) fbp.a(hcv);
            this.b = (hcy) fbp.a(hcy);
            this.c = (hcw) fbp.a(hcw);
            this.d = (HubsImmutableComponentBundle) fbp.a(hubsImmutableComponentBundle);
            this.e = (HubsImmutableComponentBundle) fbp.a(hubsImmutableComponentBundle2);
            this.f = (HubsImmutableComponentBundle) fbp.a(hubsImmutableComponentBundle3);
            this.g = hda;
            this.h = str;
            this.i = str2;
            this.j = (ImmutableMap) fbp.a(immutableMap);
            this.k = (ImmutableList) fbp.a(immutableList);
        }

        /* synthetic */ a(hcx hcx, hcv hcv, hcy hcy, hcw hcw, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, hda hda, String str, String str2, ImmutableMap immutableMap, ImmutableList immutableList, byte b2) {
            this(hcv, hcy, hcw, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hda, str, str2, immutableMap, immutableList);
        }

        private defpackage.hcm.a b() {
            return new defpackage.hcm.a() {
                private hck a = a.this.a;
                private defpackage.hco.a b = a.this.b.toBuilder();
                private defpackage.hcl.a c = a.this.c.toBuilder();
                private defpackage.hcj.a d = a.this.d.toBuilder();
                private defpackage.hcj.a e = a.this.e.toBuilder();
                private defpackage.hcj.a f = a.this.f.toBuilder();
                private hcr g = a.this.g;
                private String h = a.this.h;
                private String i = a.this.i;
                private final hde<String, hct> j = new hde<>(a.this.j);
                private final hdd<hcx> k = new hdd<>(a.this.k);

                public final defpackage.hcm.a a(hcj hcj) {
                    this.d = hcj != null ? hcj.toBuilder() : HubsImmutableComponentBundle.builder();
                    return this;
                }

                public final defpackage.hcm.a a(hck hck) {
                    this.a = (hck) fbp.a(hck);
                    return this;
                }

                public final defpackage.hcm.a a(hcl hcl) {
                    this.c = hcl != null ? hcl.toBuilder() : hcw.builder();
                    return this;
                }

                public final defpackage.hcm.a a(hco hco) {
                    this.b = hco != null ? hco.toBuilder() : hcy.builder();
                    return this;
                }

                public final defpackage.hcm.a a(hcr hcr) {
                    this.g = hcr;
                    return this;
                }

                public final defpackage.hcm.a a(String str) {
                    this.h = str;
                    return this;
                }

                public final defpackage.hcm.a a(String str, hci hci) {
                    hde<String, hct> hde = this.j;
                    hct immutable = hct.immutable(hci);
                    if (!hdi.a(hde.a, str, (Object) immutable)) {
                        hde.a();
                        if (immutable == null) {
                            hde.a.remove(str);
                        } else {
                            hde.a.put(str, immutable);
                        }
                    }
                    return this;
                }

                public final defpackage.hcm.a a(String str, Serializable serializable) {
                    this.d = this.d.a(str, serializable);
                    return this;
                }

                public final defpackage.hcm.a a(String str, String str2) {
                    return a((hck) hcv.create(str, str2));
                }

                public final defpackage.hcm.a a(List<? extends hcm> list) {
                    this.k.a(hcu.b(list));
                    return this;
                }

                public final defpackage.hcm.a a(Map<String, ? extends hci> map) {
                    this.j.a(hct.asImmutableCommandMap(map));
                    return this;
                }

                public final defpackage.hcm.a a(hcm... hcmArr) {
                    this.k.a(hcu.a(hcmArr));
                    return this;
                }

                public final hcm a() {
                    return hcx.create(this.a, this.b.a(), this.c.a(), this.d.a(), this.e.a(), this.f.a(), this.g, this.h, this.i, hdi.a(this.j.a), ImmutableList.a((Collection<? extends E>) this.k.a));
                }

                public final defpackage.hcm.a b(hcj hcj) {
                    this.d = this.d.a(hcj);
                    return this;
                }

                public final defpackage.hcm.a b(String str) {
                    this.i = str;
                    return this;
                }

                public final defpackage.hcm.a b(String str, Serializable serializable) {
                    this.e = this.e.a(str, serializable);
                    return this;
                }

                public final defpackage.hcm.a b(List<? extends hcm> list) {
                    this.k.b(hcu.a((Iterable<? extends hcm>) list));
                    return this;
                }

                public final defpackage.hcm.a b(Map<String, ? extends hci> map) {
                    hde<String, hct> hde = this.j;
                    ImmutableMap asImmutableCommandMap = hct.asImmutableCommandMap(map);
                    fbp.a(asImmutableCommandMap);
                    hde.a();
                    hde.a.putAll(asImmutableCommandMap);
                    return this;
                }

                public final defpackage.hcm.a b(hcm... hcmArr) {
                    this.k.b(hcu.a(hcmArr));
                    return this;
                }

                public final defpackage.hcm.a c(hcj hcj) {
                    this.e = hcj != null ? hcj.toBuilder() : HubsImmutableComponentBundle.builder();
                    return this;
                }

                public final defpackage.hcm.a c(String str, Serializable serializable) {
                    this.f = this.f.a(str, serializable);
                    return this;
                }

                public final defpackage.hcm.a d(hcj hcj) {
                    this.e = this.e.a(hcj);
                    return this;
                }

                public final defpackage.hcm.a e(hcj hcj) {
                    this.f = hcj != null ? hcj.toBuilder() : HubsImmutableComponentBundle.builder();
                    return this;
                }

                public final defpackage.hcm.a f(hcj hcj) {
                    this.f = this.f.a(hcj);
                    return this;
                }
            };
        }

        public final defpackage.hcm.a a(hcj hcj) {
            return hcu.a((hcj) this.d, hcj) ? this : b().a(hcj);
        }

        public final defpackage.hcm.a a(hck hck) {
            return hcu.a((hck) this.a, hck) ? this : b().a(hck);
        }

        public final defpackage.hcm.a a(hcl hcl) {
            return hcu.a((hcl) this.c, hcl) ? this : b().a(hcl);
        }

        public final defpackage.hcm.a a(hco hco) {
            return hcu.a((hco) this.b, hco) ? this : b().a(hco);
        }

        public final defpackage.hcm.a a(hcr hcr) {
            return fbn.a(this.g, hcr) ? this : b().a(hcr);
        }

        public final defpackage.hcm.a a(String str) {
            return fbn.a(this.h, str) ? this : b().a(str);
        }

        public final defpackage.hcm.a a(String str, hci hci) {
            return hdi.a((Map<K, ?>) this.j, str, (Object) hci) ? this : b().a(str, hci);
        }

        public final defpackage.hcm.a a(String str, Serializable serializable) {
            return hdi.a((hcj) this.d, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final defpackage.hcm.a a(String str, String str2) {
            return a((hck) hcv.create(str, str2));
        }

        public final defpackage.hcm.a a(List<? extends hcm> list) {
            return hcu.a((Collection<?>) this.k, (Collection<?>) list) ? this : b().a(list);
        }

        public final defpackage.hcm.a a(Map<String, ? extends hci> map) {
            return hcu.a((Map<?, ?>) this.j, map) ? this : b().a(map);
        }

        public final defpackage.hcm.a a(hcm... hcmArr) {
            fbp.a(hcmArr);
            return hcmArr.length == 0 ? a((List<? extends hcm>) ImmutableList.d()) : b().a(hcmArr);
        }

        public final hcm a() {
            return hcx.this;
        }

        public final defpackage.hcm.a b(hcj hcj) {
            return hcj.keySet().isEmpty() ? this : b().b(hcj);
        }

        public final defpackage.hcm.a b(String str) {
            return fbn.a(this.i, str) ? this : b().b(str);
        }

        public final defpackage.hcm.a b(String str, Serializable serializable) {
            return hdi.a((hcj) this.e, str, (Object) serializable) ? this : b().b(str, serializable);
        }

        public final defpackage.hcm.a b(List<? extends hcm> list) {
            fbp.a(list);
            return list.isEmpty() ? this : b().b(list);
        }

        public final defpackage.hcm.a b(Map<String, ? extends hci> map) {
            return map.isEmpty() ? this : b().b(map);
        }

        public final defpackage.hcm.a b(hcm... hcmArr) {
            fbp.a(hcmArr);
            return hcmArr.length == 0 ? this : b().b(hcmArr);
        }

        public final defpackage.hcm.a c(hcj hcj) {
            return hcu.a((hcj) this.e, hcj) ? this : b().c(hcj);
        }

        public final defpackage.hcm.a c(String str, Serializable serializable) {
            return hdi.a((hcj) this.f, str, (Object) serializable) ? this : b().c(str, serializable);
        }

        public final defpackage.hcm.a d(hcj hcj) {
            return hcj.keySet().isEmpty() ? this : b().d(hcj);
        }

        public final defpackage.hcm.a e(hcj hcj) {
            return hcu.a((hcj) this.f, hcj) ? this : b().e(hcj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fbn.a(this.a, aVar.a) && fbn.a(this.b, aVar.b) && fbn.a(this.c, aVar.c) && fbn.a(this.d, aVar.d) && fbn.a(this.e, aVar.e) && fbn.a(this.f, aVar.f) && fbn.a(this.g, aVar.g) && fbn.a(this.h, aVar.h) && fbn.a(this.i, aVar.i) && fbn.a(this.j, aVar.j) && fbn.a(this.k, aVar.k);
        }

        public final defpackage.hcm.a f(hcj hcj) {
            return hcj.keySet().isEmpty() ? this : b().f(hcj);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
        }
    }

    protected hcx(hcv hcv, hcy hcy, hcw hcw, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, hda hda, String str, String str2, ImmutableMap<String, hct> immutableMap, ImmutableList<hcx> immutableList) {
        a aVar = new a(this, hcv, hcy, hcw, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hda, str, str2, immutableMap, immutableList, 0);
        this.mImpl = aVar;
    }

    public static defpackage.hcm.a builder() {
        return EMPTY.toBuilder();
    }

    public static hcx create(hck hck, hco hco, hcl hcl, hcj hcj, hcj hcj2, hcj hcj3, hcr hcr, String str, String str2, Map<String, ? extends hci> map, List<? extends hcm> list) {
        hcx hcx = new hcx(hcv.fromNullable(hck), hcy.fromNullable(hco), hcw.fromNullable(hcl), HubsImmutableComponentBundle.fromNullable(hcj), HubsImmutableComponentBundle.fromNullable(hcj2), HubsImmutableComponentBundle.fromNullable(hcj3), hda.immutableOrNull(hcr), str, str2, hct.asImmutableCommandMap(map), hcu.a(list));
        return hcx;
    }

    static hcx empty() {
        return EMPTY;
    }

    public static hcx immutable(hcm hcm) {
        return hcm instanceof hcx ? (hcx) hcm : create(hcm.componentId(), hcm.text(), hcm.images(), hcm.metadata(), hcm.logging(), hcm.custom(), hcm.target(), hcm.id(), hcm.group(), hcm.events(), hcm.children());
    }

    public List<hcx> childGroup(String str) {
        return hcn.b((Iterable<M>) children(), str);
    }

    public List<hcx> children() {
        return this.mImpl.k;
    }

    public hcv componentId() {
        return this.mImpl.a;
    }

    public HubsImmutableComponentBundle custom() {
        return this.mImpl.f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcx)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hcx) obj).mImpl);
    }

    public Map<String, hct> events() {
        return this.mImpl.j;
    }

    public hcm findChildById(String str) {
        return hcn.a((Iterable<M>) children(), str);
    }

    public String group() {
        return this.mImpl.i;
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public String id() {
        return this.mImpl.h;
    }

    public hcw images() {
        return this.mImpl.c;
    }

    public HubsImmutableComponentBundle logging() {
        return this.mImpl.e;
    }

    public HubsImmutableComponentBundle metadata() {
        return this.mImpl.d;
    }

    public hda target() {
        return this.mImpl.g;
    }

    public hcy text() {
        return this.mImpl.b;
    }

    public defpackage.hcm.a toBuilder() {
        return this.mImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        juo.a(parcel, hcu.a((hck) this.mImpl.a, (hck) null) ? null : this.mImpl.a, i);
        juo.a(parcel, hcu.a((hco) this.mImpl.b, (hco) null) ? null : this.mImpl.b, i);
        juo.a(parcel, hcu.a((hcl) this.mImpl.c, (hcl) null) ? null : this.mImpl.c, i);
        juo.a(parcel, hcu.a((hcj) this.mImpl.d, (hcj) null) ? null : this.mImpl.d, i);
        juo.a(parcel, hcu.a((hcj) this.mImpl.e, (hcj) null) ? null : this.mImpl.e, i);
        if (!hcu.a((hcj) this.mImpl.f, (hcj) null)) {
            hubsImmutableComponentBundle = this.mImpl.f;
        }
        juo.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
        juo.a(parcel, (Parcelable) this.mImpl.g, i);
        parcel.writeString(this.mImpl.h);
        parcel.writeString(this.mImpl.i);
        juo.a(parcel, (Map<String, ? extends Parcelable>) this.mImpl.j, 0);
        hcu.a(parcel, (List<? extends hcx>) this.mImpl.k);
    }
}

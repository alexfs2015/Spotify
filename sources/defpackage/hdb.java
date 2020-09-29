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

/* renamed from: hdb reason: default package */
public class hdb implements Parcelable, hcs {
    public static final Creator<hdb> CREATOR = new Creator<hdb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            hdb hdb = new hdb(parcel.readString(), parcel.readString(), (hcx) juo.b(parcel, hcx.CREATOR), hcu.a(parcel), hcu.a(parcel), parcel.readString(), HubsImmutableComponentBundle.fromNullable((hcj) juo.b(parcel, HubsImmutableComponentBundle.CREATOR)));
            return hdb;
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new hdb[i];
        }
    };
    public static final hdb EMPTY = create(null, null, null, null, null, null, null);
    private Integer mHashCode;
    private final a mImpl;

    /* renamed from: hdb$a */
    final class a extends defpackage.hcs.a {
        public final String a;
        public final String b;
        public final hcx c;
        public final ImmutableList<hcx> d;
        public final ImmutableList<hcx> e;
        public final String f;
        public final HubsImmutableComponentBundle g;

        private a(String str, String str2, hcx hcx, ImmutableList<hcx> immutableList, ImmutableList<hcx> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            this.a = str;
            this.b = str2;
            this.c = hcx;
            this.d = (ImmutableList) fbp.a(immutableList);
            this.e = (ImmutableList) fbp.a(immutableList2);
            this.f = str3;
            this.g = (HubsImmutableComponentBundle) fbp.a(hubsImmutableComponentBundle);
        }

        /* synthetic */ a(hdb hdb, String str, String str2, hcx hcx, ImmutableList immutableList, ImmutableList immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle, byte b2) {
            this(str, str2, hcx, immutableList, immutableList2, str3, hubsImmutableComponentBundle);
        }

        private defpackage.hcs.a b() {
            return new defpackage.hcs.a() {
                private String a = a.this.a;
                private String b = a.this.b;
                private defpackage.hcm.a c;
                private final hdd<hcx> d;
                private final hdd<hcx> e;
                private String f;
                private defpackage.hcj.a g;

                {
                    this.c = a.this.c != null ? a.this.c.toBuilder() : null;
                    this.d = new hdd<>(a.this.d);
                    this.e = new hdd<>(a.this.e);
                    this.f = a.this.f;
                    this.g = a.this.g.toBuilder();
                }

                public final defpackage.hcs.a a(hcj hcj) {
                    this.g = hcj != null ? hcj.toBuilder() : HubsImmutableComponentBundle.builder();
                    return this;
                }

                public final defpackage.hcs.a a(hcm hcm) {
                    this.c = hcm != null ? hcm.toBuilder() : null;
                    return this;
                }

                public final defpackage.hcs.a a(String str) {
                    this.a = str;
                    return this;
                }

                public final defpackage.hcs.a a(String str, Serializable serializable) {
                    this.g = this.g.a(str, serializable);
                    return this;
                }

                public final defpackage.hcs.a a(List<? extends hcm> list) {
                    this.d.a(hcu.b(list));
                    return this;
                }

                public final defpackage.hcs.a a(hcm... hcmArr) {
                    this.d.a(hcu.a(hcmArr));
                    return this;
                }

                public final hcs a() {
                    String str = this.a;
                    String str2 = this.b;
                    defpackage.hcm.a aVar = this.c;
                    hdb hdb = new hdb(str, str2, aVar != null ? hcx.immutable(aVar.a()) : null, ImmutableList.a((Collection<? extends E>) this.d.a), ImmutableList.a((Collection<? extends E>) this.e.a), this.f, HubsImmutableComponentBundle.fromNullable(this.g.a()));
                    return hdb;
                }

                public final defpackage.hcs.a b(hcj hcj) {
                    this.g = this.g.a(hcj);
                    return this;
                }

                public final defpackage.hcs.a b(String str) {
                    this.b = str;
                    return this;
                }

                public final defpackage.hcs.a b(List<? extends hcm> list) {
                    this.d.b(hcu.a((Iterable<? extends hcm>) list));
                    return this;
                }

                public final defpackage.hcs.a b(hcm... hcmArr) {
                    this.d.b(hcu.a(hcmArr));
                    return this;
                }

                public final defpackage.hcs.a c(String str) {
                    this.f = str;
                    return this;
                }

                public final defpackage.hcs.a c(List<? extends hcm> list) {
                    this.e.a(hcu.b(list));
                    return this;
                }

                public final defpackage.hcs.a c(hcm... hcmArr) {
                    this.e.a(hcu.a(hcmArr));
                    return this;
                }
            };
        }

        public final defpackage.hcs.a a(hcj hcj) {
            return hcu.a((hcj) this.g, hcj) ? this : b().a(hcj);
        }

        public final defpackage.hcs.a a(hcm hcm) {
            return hcu.a((hcm) this.c, hcm) ? this : b().a(hcm);
        }

        public final defpackage.hcs.a a(String str) {
            return fbn.a(this.a, str) ? this : b().a(str);
        }

        public final defpackage.hcs.a a(String str, Serializable serializable) {
            return hdi.a((hcj) this.g, str, (Object) serializable) ? this : b().a(str, serializable);
        }

        public final defpackage.hcs.a a(List<? extends hcm> list) {
            return hcu.a((Collection<?>) this.d, (Collection<?>) list) ? this : b().a(list);
        }

        public final defpackage.hcs.a a(hcm... hcmArr) {
            fbp.a(hcmArr);
            return hcmArr.length == 0 ? a((List<? extends hcm>) ImmutableList.d()) : b().a(hcmArr);
        }

        public final hcs a() {
            return hdb.this;
        }

        public final defpackage.hcs.a b(hcj hcj) {
            return hcj.keySet().isEmpty() ? this : b().b(hcj);
        }

        public final defpackage.hcs.a b(String str) {
            return fbn.a(this.b, str) ? this : b().b(str);
        }

        public final defpackage.hcs.a b(List<? extends hcm> list) {
            fbp.a(list);
            return list.isEmpty() ? this : b().b(list);
        }

        public final defpackage.hcs.a b(hcm... hcmArr) {
            fbp.a(hcmArr);
            return hcmArr.length == 0 ? this : b().b(hcmArr);
        }

        public final defpackage.hcs.a c(String str) {
            return fbn.a(this.f, str) ? this : b().c(str);
        }

        public final defpackage.hcs.a c(List<? extends hcm> list) {
            return hcu.a((Collection<?>) this.e, (Collection<?>) list) ? this : b().c(list);
        }

        public final defpackage.hcs.a c(hcm... hcmArr) {
            fbp.a(hcmArr);
            return hcmArr.length == 0 ? c((List<? extends hcm>) ImmutableList.d()) : b().c(hcmArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return fbn.a(this.a, aVar.a) && fbn.a(this.b, aVar.b) && fbn.a(this.c, aVar.c) && fbn.a(this.d, aVar.d) && fbn.a(this.e, aVar.e) && fbn.a(this.f, aVar.f) && fbn.a(this.g, aVar.g);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
        }
    }

    protected hdb(String str, String str2, hcx hcx, ImmutableList<hcx> immutableList, ImmutableList<hcx> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        a aVar = new a(this, str, str2, hcx, immutableList, immutableList2, str3, hubsImmutableComponentBundle, 0);
        this.mImpl = aVar;
    }

    public static defpackage.hcs.a builder() {
        return EMPTY.toBuilder();
    }

    public static hdb create(String str, String str2, hcm hcm, List<? extends hcm> list, List<? extends hcm> list2, String str3, hcj hcj) {
        hdb hdb = new hdb(str, str2, hcm == null ? null : hcx.immutable(hcm), hcu.a(list), hcu.a(list2), str3, HubsImmutableComponentBundle.fromNullable(hcj));
        return hdb;
    }

    public static hdb immutable(hcs hcs) {
        return hcs instanceof hdb ? (hdb) hcs : create(hcs.id(), hcs.title(), hcs.header(), hcs.body(), hcs.overlays(), hcs.extension(), hcs.custom());
    }

    public List<hcx> body() {
        return this.mImpl.d;
    }

    public HubsImmutableComponentBundle custom() {
        return this.mImpl.g;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdb)) {
            return false;
        }
        return fbn.a(this.mImpl, ((hdb) obj).mImpl);
    }

    public String extension() {
        return this.mImpl.f;
    }

    public int hashCode() {
        if (this.mHashCode == null) {
            this.mHashCode = Integer.valueOf(Arrays.hashCode(new Object[]{this.mImpl}));
        }
        return this.mHashCode.intValue();
    }

    public hcx header() {
        return this.mImpl.c;
    }

    public String id() {
        return this.mImpl.a;
    }

    public List<hcx> overlays() {
        return this.mImpl.e;
    }

    public String title() {
        return this.mImpl.b;
    }

    public defpackage.hcs.a toBuilder() {
        return this.mImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mImpl.a);
        parcel.writeString(this.mImpl.b);
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        juo.a(parcel, hcu.a((hcm) this.mImpl.c, (hcm) null) ? null : this.mImpl.c, i);
        hcu.a(parcel, (List<? extends hcx>) this.mImpl.d);
        hcu.a(parcel, (List<? extends hcx>) this.mImpl.e);
        parcel.writeString(this.mImpl.f);
        if (!hcu.a((hcj) this.mImpl.g, (hcj) null)) {
            hubsImmutableComponentBundle = this.mImpl.g;
        }
        juo.a(parcel, (Parcelable) hubsImmutableComponentBundle, i);
    }
}

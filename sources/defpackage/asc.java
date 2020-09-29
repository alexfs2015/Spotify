package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: asc reason: default package */
public final class asc implements Parcelable, Comparator<a> {
    public static final Creator<asc> CREATOR = new Creator<asc>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new asc[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new asc(parcel);
        }
    };
    public final a[] a;
    public final String b;
    public final int c;
    private int d;

    /* renamed from: asc$a */
    public static final class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        public final String a;
        public final String b;
        public final byte[] c;
        public final boolean d;
        private int e;
        /* access modifiers changed from: private */
        public final UUID f;

        public final int describeContents() {
            return 0;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        private a(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, false);
        }

        private a(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            this.f = (UUID) bcu.a(uuid);
            this.a = str;
            this.b = (String) bcu.a(str2);
            this.c = bArr;
            this.d = z;
        }

        a(Parcel parcel) {
            this.f = new UUID(parcel.readLong(), parcel.readLong());
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.createByteArray();
            this.d = parcel.readByte() != 0;
        }

        public final boolean a(UUID uuid) {
            return apv.a.equals(this.f) || uuid.equals(this.f);
        }

        public final boolean a() {
            return this.c != null;
        }

        public final a a(byte[] bArr) {
            a aVar = new a(this.f, this.a, this.b, bArr, this.d);
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return bdw.a((Object) this.a, (Object) aVar.a) && bdw.a((Object) this.b, (Object) aVar.b) && bdw.a((Object) this.f, (Object) aVar.f) && Arrays.equals(this.c, aVar.c);
        }

        public final int hashCode() {
            if (this.e == 0) {
                int hashCode = this.f.hashCode() * 31;
                String str = this.a;
                this.e = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.b.hashCode()) * 31) + Arrays.hashCode(this.c);
            }
            return this.e;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f.getMostSignificantBits());
            parcel.writeLong(this.f.getLeastSignificantBits());
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeByteArray(this.c);
            parcel.writeByte(this.d ? (byte) 1 : 0);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        if (apv.a.equals(aVar.f)) {
            return apv.a.equals(aVar2.f) ? 0 : 1;
        }
        return aVar.f.compareTo(aVar2.f);
    }

    public static asc a(asc asc, asc asc2) {
        String str;
        a[] aVarArr;
        a[] aVarArr2;
        ArrayList arrayList = new ArrayList();
        if (asc != null) {
            str = asc.b;
            for (a aVar : asc.a) {
                if (aVar.a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (asc2 != null) {
            if (str == null) {
                str = asc2.b;
            }
            int size = arrayList.size();
            for (a aVar2 : asc2.a) {
                if (aVar2.a() && !a(arrayList, size, aVar2.f)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new asc(str, (List<a>) arrayList);
    }

    public asc(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    private asc(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    public asc(a... aVarArr) {
        this((String) null, aVarArr);
    }

    public asc(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    private asc(String str, boolean z, a... aVarArr) {
        this.b = str;
        if (z) {
            aVarArr = (a[]) aVarArr.clone();
        }
        Arrays.sort(aVarArr, this);
        this.a = aVarArr;
        this.c = aVarArr.length;
    }

    asc(Parcel parcel) {
        this.b = parcel.readString();
        this.a = (a[]) parcel.createTypedArray(a.CREATOR);
        this.c = this.a.length;
    }

    public final asc a(String str) {
        if (bdw.a((Object) this.b, (Object) str)) {
            return this;
        }
        return new asc(str, false, this.a);
    }

    public final int hashCode() {
        if (this.d == 0) {
            String str = this.b;
            this.d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asc asc = (asc) obj;
            return bdw.a((Object) this.b, (Object) asc.b) && Arrays.equals(this.a, asc.a);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedArray(this.a, 0);
    }

    private static boolean a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((a) arrayList.get(i2)).f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }
}

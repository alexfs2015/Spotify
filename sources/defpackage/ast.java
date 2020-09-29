package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: ast reason: default package */
public final class ast implements Parcelable, Comparator<a> {
    public static final Creator<ast> CREATOR = new Creator<ast>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ast(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ast[i];
        }
    };
    public final a[] a;
    public final String b;
    public final int c;
    private int d;

    /* renamed from: ast$a */
    public static final class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final String a;
        public final String b;
        public final byte[] c;
        public final boolean d;
        private int e;
        /* access modifiers changed from: private */
        public final UUID f;

        a(Parcel parcel) {
            this.f = new UUID(parcel.readLong(), parcel.readLong());
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.createByteArray();
            this.d = parcel.readByte() != 0;
        }

        private a(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            this.f = (UUID) bdl.a(uuid);
            this.a = str;
            this.b = (String) bdl.a(str2);
            this.c = bArr;
            this.d = z;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        private a(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, false);
        }

        public final a a(byte[] bArr) {
            a aVar = new a(this.f, this.a, this.b, bArr, this.d);
            return aVar;
        }

        public final boolean a() {
            return this.c != null;
        }

        public final boolean a(UUID uuid) {
            return aqm.a.equals(this.f) || uuid.equals(this.f);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return ben.a((Object) this.a, (Object) aVar.a) && ben.a((Object) this.b, (Object) aVar.b) && ben.a((Object) this.f, (Object) aVar.f) && Arrays.equals(this.c, aVar.c);
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

    ast(Parcel parcel) {
        this.b = parcel.readString();
        this.a = (a[]) parcel.createTypedArray(a.CREATOR);
        this.c = this.a.length;
    }

    private ast(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    private ast(String str, boolean z, a... aVarArr) {
        this.b = str;
        if (z) {
            aVarArr = (a[]) aVarArr.clone();
        }
        Arrays.sort(aVarArr, this);
        this.a = aVarArr;
        this.c = aVarArr.length;
    }

    public ast(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    public ast(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public ast(a... aVarArr) {
        this((String) null, aVarArr);
    }

    public static ast a(ast ast, ast ast2) {
        String str;
        a[] aVarArr;
        a[] aVarArr2;
        ArrayList arrayList = new ArrayList();
        if (ast != null) {
            str = ast.b;
            for (a aVar : ast.a) {
                if (aVar.a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (ast2 != null) {
            if (str == null) {
                str = ast2.b;
            }
            int size = arrayList.size();
            for (a aVar2 : ast2.a) {
                if (aVar2.a() && !a(arrayList, size, aVar2.f)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ast(str, (List<a>) arrayList);
    }

    private static boolean a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((a) arrayList.get(i2)).f.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public final ast a(String str) {
        return ben.a((Object) this.b, (Object) str) ? this : new ast(str, false, this.a);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        return aqm.a.equals(aVar.f) ? aqm.a.equals(aVar2.f) ? 0 : 1 : aVar.f.compareTo(aVar2.f);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ast ast = (ast) obj;
            return ben.a((Object) this.b, (Object) ast.b) && Arrays.equals(this.a, ast.a);
        }
    }

    public final int hashCode() {
        if (this.d == 0) {
            String str = this.b;
            this.d = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeTypedArray(this.a, 0);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: pvl reason: default package */
public abstract class pvl implements Parcelable {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    /* renamed from: pvl$a */
    public static class a extends pvl {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }
        };
        public final String e;

        /* synthetic */ a(Parcel parcel, byte b) {
            this(parcel);
        }

        public a(String str, boolean z, boolean z2, boolean z3, String str2) {
            super(z, z2, z3, str2);
            this.e = (String) fay.a(str);
        }

        private a(Parcel parcel) {
            super(parcel, 0);
            this.e = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            pvl.super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || !pvl.super.equals(obj)) {
                return false;
            }
            return this.e.equals(((a) obj).e);
        }

        public final int hashCode() {
            return (pvl.super.hashCode() * 31) + this.e.hashCode();
        }
    }

    /* renamed from: pvl$b */
    public static class b extends pvl {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel, 0);
            }
        };
        public final String e;
        public final boolean f;

        /* synthetic */ b(Parcel parcel, byte b) {
            this(parcel);
        }

        public b(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            super(z2, z3, z4, str2);
            this.e = str;
            this.f = z;
        }

        private b(Parcel parcel) {
            super(parcel, 0);
            this.e = parcel.readString();
            this.f = jse.a(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            pvl.super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
            jse.a(parcel, this.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b) || !pvl.super.equals(obj)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f != bVar.f) {
                return false;
            }
            String str = this.e;
            String str2 = bVar.e;
            return str == null ? str2 == null : str.equals(str2);
        }

        public final int hashCode() {
            int hashCode = pvl.super.hashCode() * 31;
            String str = this.e;
            return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1 : 0);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ pvl(Parcel parcel, byte b2) {
        this(parcel);
    }

    protected pvl(boolean z, boolean z2, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }

    private pvl(Parcel parcel) {
        this.a = jse.a(parcel);
        this.b = jse.a(parcel);
        this.c = jse.a(parcel);
        this.d = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.a);
        jse.a(parcel, this.b);
        jse.a(parcel, this.c);
        parcel.writeString(this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvl)) {
            return false;
        }
        pvl pvl = (pvl) obj;
        return this.a == pvl.a && this.b == pvl.b && this.c == pvl.c && this.d.equals(pvl.d);
    }

    public int hashCode() {
        return ((((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode();
    }
}

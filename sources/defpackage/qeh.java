package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: qeh reason: default package */
public abstract class qeh implements Parcelable {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    /* renamed from: qeh$a */
    public static class a extends qeh {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final String e;

        private a(Parcel parcel) {
            super(parcel, 0);
            this.e = parcel.readString();
        }

        /* synthetic */ a(Parcel parcel, byte b) {
            this(parcel);
        }

        public a(String str, boolean z, boolean z2, boolean z3, String str2) {
            super(z, z2, z3, str2);
            this.e = (String) fbp.a(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || !qeh.super.equals(obj)) {
                return false;
            }
            return this.e.equals(((a) obj).e);
        }

        public final int hashCode() {
            return (qeh.super.hashCode() * 31) + this.e.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            qeh.super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
        }
    }

    /* renamed from: qeh$b */
    public static class b extends qeh {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel, 0);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }
        };
        public final String e;
        public final boolean f;

        private b(Parcel parcel) {
            super(parcel, 0);
            this.e = parcel.readString();
            this.f = juo.a(parcel);
        }

        /* synthetic */ b(Parcel parcel, byte b) {
            this(parcel);
        }

        public b(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            super(z2, z3, z4, str2);
            this.e = str;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b) || !qeh.super.equals(obj)) {
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
            int hashCode = qeh.super.hashCode() * 31;
            String str = this.e;
            return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1 : 0);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            qeh.super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
            juo.a(parcel, this.f);
        }
    }

    private qeh(Parcel parcel) {
        this.a = juo.a(parcel);
        this.b = juo.a(parcel);
        this.c = juo.a(parcel);
        this.d = parcel.readString();
    }

    /* synthetic */ qeh(Parcel parcel, byte b2) {
        this(parcel);
    }

    protected qeh(boolean z, boolean z2, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeh)) {
            return false;
        }
        qeh qeh = (qeh) obj;
        return this.a == qeh.a && this.b == qeh.b && this.c == qeh.c && this.d.equals(qeh.d);
    }

    public int hashCode() {
        return ((((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.a);
        juo.a(parcel, this.b);
        juo.a(parcel, this.c);
        parcel.writeString(this.d);
    }
}

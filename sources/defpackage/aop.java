package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aop reason: default package */
public final class aop extends aon<aop, a> {
    public static final Creator<aop> CREATOR = new Creator<aop>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aop[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aop(parcel);
        }
    };
    @Deprecated
    public final String a;
    @Deprecated
    public final String b;
    @Deprecated
    public final Uri c;
    public final String d;

    /* renamed from: aop$a */
    public static final class a extends defpackage.aon.a<aop, a> {
        /* access modifiers changed from: private */
        public String f;

        static /* synthetic */ String a(a aVar) {
            return null;
        }

        static /* synthetic */ String b(a aVar) {
            return null;
        }

        static /* synthetic */ Uri c(a aVar) {
            return null;
        }

        public final /* bridge */ /* synthetic */ defpackage.aon.a a(aon aon) {
            aop aop = (aop) aon;
            if (aop == null) {
                return this;
            }
            a aVar = (a) super.a(aop);
            aVar.f = aop.d;
            return aVar;
        }

        static {
            a.class.getSimpleName();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ aop(a aVar, byte b2) {
        this(aVar);
    }

    private aop(a aVar) {
        super((defpackage.aon.a) aVar);
        this.a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = aVar.f;
    }

    aop(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.d);
    }
}

package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apd reason: default package */
public final class apd extends apb<apd, a> {
    public static final Creator<apd> CREATOR = new Creator<apd>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apd(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apd[i];
        }
    };
    @Deprecated
    public final String a;
    @Deprecated
    public final String b;
    @Deprecated
    public final Uri c;
    public final String d;

    /* renamed from: apd$a */
    public static final class a extends defpackage.apb.a<apd, a> {
        /* access modifiers changed from: private */
        public String f;

        static {
            a.class.getSimpleName();
        }

        static /* synthetic */ String a(a aVar) {
            return null;
        }

        static /* synthetic */ String b(a aVar) {
            return null;
        }

        static /* synthetic */ Uri c(a aVar) {
            return null;
        }

        public final /* bridge */ /* synthetic */ defpackage.apb.a a(apb apb) {
            apd apd = (apd) apb;
            if (apd == null) {
                return this;
            }
            a aVar = (a) super.a(apd);
            aVar.f = apd.d;
            return aVar;
        }
    }

    apd(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readString();
    }

    private apd(a aVar) {
        super((defpackage.apb.a) aVar);
        this.a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = aVar.f;
    }

    public /* synthetic */ apd(a aVar, byte b2) {
        this(aVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.d);
    }
}

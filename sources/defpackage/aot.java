package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aot reason: default package */
public final class aot extends aon<aot, a> {
    public static final Creator<aot> CREATOR = new Creator<aot>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aot[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aot(parcel);
        }
    };
    public final Uri a;
    public final aor b;

    /* renamed from: aot$a */
    public static class a extends defpackage.aon.a<aot, a> {
        public Uri f;
        public aor g;

        public final /* bridge */ /* synthetic */ defpackage.aon.a a(aon aon) {
            aot aot = (aot) aon;
            if (aot == null) {
                return this;
            }
            a aVar = (a) super.a(aot);
            aVar.f = aot.a;
            aVar.g = aot.b;
            return aVar;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ aot(a aVar, byte b2) {
        this(aVar);
    }

    private aot(a aVar) {
        super((defpackage.aon.a) aVar);
        this.a = aVar.f;
        this.b = aVar.g;
    }

    aot(Parcel parcel) {
        super(parcel);
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = (aor) parcel.readParcelable(aor.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}

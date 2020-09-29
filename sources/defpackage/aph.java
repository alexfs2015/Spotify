package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aph reason: default package */
public final class aph extends apb<aph, a> {
    public static final Creator<aph> CREATOR = new Creator<aph>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aph(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aph[i];
        }
    };
    public final Uri a;
    public final apf b;

    /* renamed from: aph$a */
    public static class a extends defpackage.apb.a<aph, a> {
        public Uri f;
        public apf g;

        public final /* bridge */ /* synthetic */ defpackage.apb.a a(apb apb) {
            aph aph = (aph) apb;
            if (aph == null) {
                return this;
            }
            a aVar = (a) super.a(aph);
            aVar.f = aph.a;
            aVar.g = aph.b;
            return aVar;
        }
    }

    aph(Parcel parcel) {
        super(parcel);
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = (apf) parcel.readParcelable(apf.class.getClassLoader());
    }

    private aph(a aVar) {
        super((defpackage.apb.a) aVar);
        this.a = aVar.f;
        this.b = aVar.g;
    }

    public /* synthetic */ aph(a aVar, byte b2) {
        this(aVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}

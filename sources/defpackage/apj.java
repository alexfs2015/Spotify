package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: apj reason: default package */
public final class apj extends apm<apj, a> {
    public static final Creator<apj> CREATOR = new Creator<apj>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new apj(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new apj[i];
        }
    };

    /* renamed from: apj$a */
    public static final class a extends defpackage.apm.a<apj, a> {
        /* access modifiers changed from: private */
        public a a(apj apj) {
            if (apj == null) {
                return this;
            }
            a aVar = (a) super.a(apj);
            String str = "og:type";
            aVar.a.putString(str, apj.b(str));
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public final a a(Parcel parcel) {
            return a((apj) parcel.readParcelable(apj.class.getClassLoader()));
        }
    }

    apj(Parcel parcel) {
        super(parcel);
    }

    private apj(a aVar) {
        super((defpackage.apm.a<P, E>) aVar);
    }

    /* synthetic */ apj(a aVar, byte b) {
        this(aVar);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aov reason: default package */
public final class aov extends aoy<aov, a> {
    public static final Creator<aov> CREATOR = new Creator<aov>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aov[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aov(parcel);
        }
    };

    /* renamed from: aov$a */
    public static final class a extends defpackage.aoy.a<aov, a> {
        /* access modifiers changed from: private */
        public a a(aov aov) {
            if (aov == null) {
                return this;
            }
            a aVar = (a) super.a(aov);
            String str = "og:type";
            aVar.a.putString(str, aov.b(str));
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public final a a(Parcel parcel) {
            return a((aov) parcel.readParcelable(aov.class.getClassLoader()));
        }
    }

    /* synthetic */ aov(a aVar, byte b) {
        this(aVar);
    }

    private aov(a aVar) {
        super((defpackage.aoy.a<P, E>) aVar);
    }

    aov(Parcel parcel) {
        super(parcel);
    }
}

package defpackage;

import android.net.Uri;
import android.os.Parcel;
import defpackage.aon;
import defpackage.aon.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aon reason: default package */
public abstract class aon<P extends aon, E extends a> implements aou {
    public final Uri h;
    public final List<String> i;
    public final String j;
    public final String k;
    public final String l;
    public final aoo m;

    /* renamed from: aon$a */
    public static abstract class a<P extends aon, E extends a> {
        public Uri a;
        List<String> b;
        String c;
        public String d;
        String e;

        public E a(P p) {
            if (p == null) {
                return this;
            }
            this.a = p.h;
            List<String> list = p.i;
            this.b = list == null ? null : Collections.unmodifiableList(list);
            this.c = p.j;
            this.d = p.k;
            this.e = p.l;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected aon(a aVar) {
        this.h = aVar.a;
        this.i = aVar.b;
        this.j = aVar.c;
        this.k = aVar.d;
        this.l = aVar.e;
        this.m = null;
    }

    protected aon(Parcel parcel) {
        this.h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.i = arrayList.size() == 0 ? null : Collections.unmodifiableList(arrayList);
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        defpackage.aoo.a aVar = new defpackage.aoo.a();
        aoo aoo = (aoo) parcel.readParcelable(aoo.class.getClassLoader());
        if (aoo != null) {
            aVar.a = aoo.a;
        }
        this.m = new aoo(aVar, 0);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.h, 0);
        parcel.writeStringList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeParcelable(this.m, 0);
    }
}

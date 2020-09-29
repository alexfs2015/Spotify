package defpackage;

import android.net.Uri;
import android.os.Parcel;
import defpackage.apb;
import defpackage.apb.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: apb reason: default package */
public abstract class apb<P extends apb, E extends a> implements api {
    public final Uri h;
    public final List<String> i;
    public final String j;
    public final String k;
    public final String l;
    public final apc m;

    /* renamed from: apb$a */
    public static abstract class a<P extends apb, E extends a> {
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

    protected apb(Parcel parcel) {
        this.h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.i = arrayList.size() == 0 ? null : Collections.unmodifiableList(arrayList);
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        defpackage.apc.a aVar = new defpackage.apc.a();
        apc apc = (apc) parcel.readParcelable(apc.class.getClassLoader());
        if (apc != null) {
            aVar.a = apc.a;
        }
        this.m = new apc(aVar, 0);
    }

    protected apb(a aVar) {
        this.h = aVar.a;
        this.i = aVar.b;
        this.j = aVar.c;
        this.k = aVar.d;
        this.l = aVar.e;
        this.m = null;
    }

    public int describeContents() {
        return 0;
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

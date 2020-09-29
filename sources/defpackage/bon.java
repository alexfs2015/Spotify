package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bon reason: default package */
public final class bon extends bxw {
    public static final Creator<bon> CREATOR = new bqm();
    public String a;
    public final List<String> b;
    public final boolean c;
    public final boy d;
    public final boolean e;
    private boolean f;
    private final boa g;
    private final double h;
    private final boolean i;

    /* renamed from: bon$a */
    public static final class a {
        public String a;
        public List<String> b = new ArrayList();
        public boolean c;
        public boa d = new boa();
        public boolean e = true;
        public boy f;
        public boolean g;
        public double h;
        private boolean i;

        public a() {
            defpackage.boy.a aVar = new defpackage.boy.a();
            boy boy = new boy(aVar.a, null, null, aVar.b, false);
            this.f = boy;
            this.g = true;
            this.h = 0.05000000074505806d;
            this.i = false;
        }
    }

    public bon(String str, List<String> list, boolean z, boa boa, boolean z2, boy boy, boolean z3, double d2, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.a = str;
        int size = list == null ? 0 : list.size();
        this.b = new ArrayList(size);
        if (size > 0) {
            this.b.addAll(list);
        }
        this.f = z;
        if (boa == null) {
            boa = new boa();
        }
        this.g = boa;
        this.c = z2;
        this.d = boy;
        this.e = z3;
        this.h = d2;
        this.i = z4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, Collections.unmodifiableList(this.b), false);
        bxx.a(parcel, 4, this.f);
        bxx.a(parcel, 5, (Parcelable) this.g, i2, false);
        bxx.a(parcel, 6, this.c);
        bxx.a(parcel, 7, (Parcelable) this.d, i2, false);
        bxx.a(parcel, 8, this.e);
        bxx.a(parcel, 9, this.h);
        bxx.a(parcel, 10, this.i);
        bxx.b(parcel, a2);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bnw reason: default package */
public final class bnw extends bxf {
    public static final Creator<bnw> CREATOR = new bpv();
    public String a;
    public final List<String> b;
    public final boolean c;
    public final boh d;
    public final boolean e;
    private boolean f;
    private final bnj g;
    private final double h;
    private final boolean i;

    /* renamed from: bnw$a */
    public static final class a {
        public String a;
        public List<String> b = new ArrayList();
        public boolean c;
        public bnj d = new bnj();
        public boolean e = true;
        public boh f;
        public boolean g;
        public double h;
        private boolean i;

        public a() {
            defpackage.boh.a aVar = new defpackage.boh.a();
            boh boh = new boh(aVar.a, null, null, aVar.b, false);
            this.f = boh;
            this.g = true;
            this.h = 0.05000000074505806d;
            this.i = false;
        }
    }

    public bnw(String str, List<String> list, boolean z, bnj bnj, boolean z2, boh boh, boolean z3, double d2, boolean z4) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.a = str;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        this.b = new ArrayList(i2);
        if (i2 > 0) {
            this.b.addAll(list);
        }
        this.f = z;
        if (bnj == null) {
            bnj = new bnj();
        }
        this.g = bnj;
        this.c = z2;
        this.d = boh;
        this.e = z3;
        this.h = d2;
        this.i = z4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, Collections.unmodifiableList(this.b), false);
        bxg.a(parcel, 4, this.f);
        bxg.a(parcel, 5, (Parcelable) this.g, i2, false);
        bxg.a(parcel, 6, this.c);
        bxg.a(parcel, 7, (Parcelable) this.d, i2, false);
        bxg.a(parcel, 8, this.e);
        bxg.a(parcel, 9, this.h);
        bxg.a(parcel, 10, this.i);
        bxg.b(parcel, a2);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: gwp reason: default package */
public class gwp {
    public final gws a;
    public final gws b;
    public final gws c;
    public final gwn<hcs, gxf> d;
    /* access modifiers changed from: private */
    public final gwt e;
    /* access modifiers changed from: private */
    public final gwt f;
    /* access modifiers changed from: private */
    public final gxb g;
    private final gwr h;
    private final Set<b> i;
    /* access modifiers changed from: private */
    public hcs j;

    /* renamed from: gwp$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                a aVar = new a(parcel.readParcelable(gwp.class.getClassLoader()), parcel.readParcelable(gwp.class.getClassLoader()), parcel.readParcelable(gwp.class.getClassLoader()), parcel.readParcelable(gwp.class.getClassLoader()), 0);
                return aVar;
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        public final Parcelable a;
        public final Parcelable b;
        public final Parcelable c;
        public final Parcelable d;

        private a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4) {
            this.a = parcelable;
            this.b = parcelable2;
            this.c = parcelable3;
            this.d = parcelable4;
        }

        /* synthetic */ a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4, byte b2) {
            this(parcelable, parcelable2, parcelable3, parcelable4);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* renamed from: gwp$b */
    public interface b {
        boolean a();
    }

    public gwp(gwm gwm, gwr gwr) {
        this(new gwt(gwm), new gwt(gwm), new gxb(gwm), gwr);
    }

    private gwp(gwt gwt, gwt gwt2, gxb gxb, gwr gwr) {
        this.d = new gwn<hcs, gxf>() {
            public final /* bridge */ /* synthetic */ Object a() {
                return gwp.this.j;
            }

            public final /* synthetic */ Object b() {
                return gxf.a(gwp.this.j, (gxe) gwp.this.e.d.b(), (gxe) gwp.this.f.d.b(), (hcm) gwp.this.g.e.b());
            }
        };
        this.h = (gwr) fbp.a(gwr);
        this.e = (gwt) fbp.a(gwt);
        this.a = defpackage.gws.a.a(gwt);
        this.f = (gwt) fbp.a(gwt2);
        this.b = defpackage.gws.a.a(gwt2);
        this.g = (gxb) fbp.a(gxb);
        this.c = new defpackage.gws.a.b(gxb);
        this.i = new HashSet();
        this.h.b((androidx.recyclerview.widget.RecyclerView.a<?>) this.f);
        this.h.a(this.g);
        this.j = hdb.EMPTY;
    }

    private void a(hcs hcs) {
        this.h.a(hcs);
        this.e.e();
        this.f.e();
        this.g.a();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            if (((b) it.next()).a()) {
                it.remove();
            }
        }
    }

    public final Parcelable a() {
        a aVar = new a(this.h.b(), this.e.a.b(), this.f.a.b(), this.g.a.b(), 0);
        return aVar;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.h.a(aVar.a);
            this.e.a(aVar.b);
            this.f.a(aVar.c);
            gxb gxb = this.g;
            gxb.a.a(aVar.d);
        }
    }

    public final void a(hcs hcs, boolean z) {
        if (!hcs.body().isEmpty() && !this.h.a()) {
            this.h.a((androidx.recyclerview.widget.RecyclerView.a<?>) this.e);
        }
        this.e.a(hcs.body());
        this.j = (hcs) fbp.a(hcs);
        this.g.a(hcs.header());
        this.f.a(hcs.overlays());
        a(hcs);
        if (z) {
            if (this.h.a()) {
                this.h.a(0);
            }
            this.h.b(0);
        }
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: gup reason: default package */
public class gup {
    public final gus a;
    public final gus b;
    public final gus c;
    public final gun<gzz, gvf> d;
    /* access modifiers changed from: private */
    public final gut e;
    /* access modifiers changed from: private */
    public final gut f;
    /* access modifiers changed from: private */
    public final gvb g;
    private final gur h;
    private final Set<b> i;
    /* access modifiers changed from: private */
    public gzz j;

    /* renamed from: gup$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                a aVar = new a(parcel.readParcelable(gup.class.getClassLoader()), parcel.readParcelable(gup.class.getClassLoader()), parcel.readParcelable(gup.class.getClassLoader()), parcel.readParcelable(gup.class.getClassLoader()), 0);
                return aVar;
            }
        };
        public final Parcelable a;
        public final Parcelable b;
        public final Parcelable c;
        public final Parcelable d;

        public final int describeContents() {
            return 0;
        }

        /* synthetic */ a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4, byte b2) {
            this(parcelable, parcelable2, parcelable3, parcelable4);
        }

        private a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4) {
            this.a = parcelable;
            this.b = parcelable2;
            this.c = parcelable3;
            this.d = parcelable4;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* renamed from: gup$b */
    public interface b {
        boolean a();
    }

    public gup(gum gum, gur gur) {
        this(new gut(gum), new gut(gum), new gvb(gum), gur);
    }

    private gup(gut gut, gut gut2, gvb gvb, gur gur) {
        this.d = new gun<gzz, gvf>() {
            public final /* synthetic */ Object b() {
                return gvf.a(gup.this.j, (gve) gup.this.e.d.b(), (gve) gup.this.f.d.b(), (gzt) gup.this.g.e.b());
            }

            public final /* bridge */ /* synthetic */ Object a() {
                return gup.this.j;
            }
        };
        this.h = (gur) fay.a(gur);
        this.e = (gut) fay.a(gut);
        this.a = defpackage.gus.a.a(gut);
        this.f = (gut) fay.a(gut2);
        this.b = defpackage.gus.a.a(gut2);
        this.g = (gvb) fay.a(gvb);
        this.c = new defpackage.gus.a.b(gvb);
        this.i = new HashSet();
        this.h.b((androidx.recyclerview.widget.RecyclerView.a<?>) this.f);
        this.h.a(this.g);
        this.j = hai.EMPTY;
    }

    public final void a(gzz gzz, boolean z) {
        if (!gzz.body().isEmpty() && !this.h.a()) {
            this.h.a((androidx.recyclerview.widget.RecyclerView.a<?>) this.e);
        }
        this.e.a(gzz.body());
        this.j = (gzz) fay.a(gzz);
        this.g.a(gzz.header());
        this.f.a(gzz.overlays());
        a(gzz);
        if (z) {
            if (this.h.a()) {
                this.h.a(0);
            }
            this.h.b(0);
        }
    }

    private void a(gzz gzz) {
        this.h.a(gzz);
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
            gvb gvb = this.g;
            gvb.a.a(aVar.d);
        }
    }
}

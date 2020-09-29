package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.n;
import androidx.recyclerview.widget.RecyclerView.o;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: gyi reason: default package */
public abstract class gyi extends defpackage.gxl.a<a> {

    /* renamed from: gyi$a */
    public static class a extends defpackage.gwi.c.a<RecyclerView> {
        final C0038a b;
        final gwt c;
        final b d;
        hcm e;
        defpackage.gwi.b f;

        /* renamed from: gyi$a$a reason: collision with other inner class name */
        static class C0038a extends TraitsLayoutManager {
            public C0038a(Context context, gwm gwm) {
                super(context, gxu.a(context, gwm), context.getResources().getInteger(R.integer.hugs_grid_columns));
            }

            public final boolean e() {
                return false;
            }

            public final boolean f() {
                return false;
            }
        }

        /* renamed from: gyi$a$b */
        class b implements OnScrollChangedListener {
            ViewTreeObserver a;

            private b() {
            }

            /* synthetic */ b(a aVar, byte b2) {
                this();
            }

            public final void onScrollChanged() {
                hcm hcm = a.this.e;
                defpackage.gwi.b bVar = a.this.f;
                if (hcm != null && bVar != null) {
                    bVar.a(hcm, new c(a.this.c.a.b(), a.this.b.d()));
                }
            }
        }

        /* renamed from: gyi$a$c */
        static class c implements Parcelable {
            public static final Creator<c> CREATOR = new Creator<c>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new c(parcel, 0);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new c[i];
                }
            };
            final Parcelable a;
            final Parcelable b;

            private c(Parcel parcel) {
                this.a = parcel.readParcelable(gwt.class.getClassLoader());
                this.b = parcel.readParcelable(C0038a.class.getClassLoader());
            }

            /* synthetic */ c(Parcel parcel, byte b2) {
                this(parcel);
            }

            c(Parcelable parcelable, Parcelable parcelable2) {
                this.a = parcelable;
                this.b = parcelable2;
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.a, i);
                parcel.writeParcelable(this.b, i);
            }
        }

        public a(ViewGroup viewGroup, gwm gwm) {
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setLayoutParams(gas.b(viewGroup.getContext(), viewGroup));
            super(recyclerView);
            ((RecyclerView) this.a).setNestedScrollingEnabled(false);
            this.b = new C0038a(((RecyclerView) this.a).getContext(), gwm);
            ((RecyclerView) this.a).a((i) this.b);
            this.c = new gwt(gwm);
            if (viewGroup instanceof RecyclerView) {
                RecyclerView recyclerView2 = (RecyclerView) viewGroup;
                if (recyclerView2.c() instanceof gwt) {
                    RecyclerView recyclerView3 = (RecyclerView) this.a;
                    n c2 = recyclerView2.e.c();
                    o oVar = recyclerView3.e;
                    if (oVar.e != null) {
                        oVar.e.b();
                    }
                    oVar.e = c2;
                    if (!(oVar.e == null || RecyclerView.this.c() == null)) {
                        oVar.e.a();
                    }
                }
            }
            ((RecyclerView) this.a).a((androidx.recyclerview.widget.RecyclerView.a) this.c, false);
            this.d = new b(this, 0);
            ((RecyclerView) this.a).addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                    b bVar = a.this.d;
                    if (bVar.a == null || !bVar.a.isAlive()) {
                        bVar.a = ((RecyclerView) a.this.a).getViewTreeObserver();
                        bVar.a.addOnScrollChangedListener(bVar);
                    }
                }

                public final void onViewDetachedFromWindow(View view) {
                    b bVar = a.this.d;
                    if (bVar.a != null && bVar.a.isAlive()) {
                        bVar.a.removeOnScrollChangedListener(bVar);
                    }
                    bVar.a = null;
                }
            });
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a((RecyclerView) this.a, aVar, iArr);
        }

        public void a(hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            this.e = hcm;
            this.f = bVar;
            this.c.a(hcm.children());
            c cVar = (c) bVar.a(hcm);
            if (cVar != null) {
                this.c.a(cVar.a);
                this.b.a(cVar.b);
            } else {
                this.c.a((Parcelable) null);
                this.b.a(0, 0);
            }
            this.c.e();
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }
}

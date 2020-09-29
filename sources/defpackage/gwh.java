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

/* renamed from: gwh reason: default package */
public abstract class gwh extends defpackage.gvl.a<a> {

    /* renamed from: gwh$a */
    public static class a extends defpackage.gui.c.a<RecyclerView> {
        final C0037a b;
        final gut c;
        final b d;
        gzt e;
        defpackage.gui.b f;

        /* renamed from: gwh$a$a reason: collision with other inner class name */
        static class C0037a extends TraitsLayoutManager {
            public final boolean e() {
                return false;
            }

            public final boolean f() {
                return false;
            }

            public C0037a(Context context, gum gum) {
                super(context, gvt.a(context, gum), context.getResources().getInteger(R.integer.hugs_grid_columns));
            }
        }

        /* renamed from: gwh$a$b */
        class b implements OnScrollChangedListener {
            ViewTreeObserver a;

            private b() {
            }

            /* synthetic */ b(a aVar, byte b2) {
                this();
            }

            public final void onScrollChanged() {
                gzt gzt = a.this.e;
                defpackage.gui.b bVar = a.this.f;
                if (gzt != null && bVar != null) {
                    bVar.a(gzt, new c(a.this.c.a.b(), a.this.b.d()));
                }
            }
        }

        /* renamed from: gwh$a$c */
        static class c implements Parcelable {
            public static final Creator<c> CREATOR = new Creator<c>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new c[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new c(parcel, 0);
                }
            };
            final Parcelable a;
            final Parcelable b;

            public final int describeContents() {
                return 0;
            }

            /* synthetic */ c(Parcel parcel, byte b2) {
                this(parcel);
            }

            c(Parcelable parcelable, Parcelable parcelable2) {
                this.a = parcelable;
                this.b = parcelable2;
            }

            private c(Parcel parcel) {
                this.a = parcel.readParcelable(gut.class.getClassLoader());
                this.b = parcel.readParcelable(C0037a.class.getClassLoader());
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.a, i);
                parcel.writeParcelable(this.b, i);
            }
        }

        public void a(gzt gzt, gum gum, defpackage.gui.b bVar) {
            this.e = gzt;
            this.f = bVar;
            this.c.a(gzt.children());
            c cVar = (c) bVar.a(gzt);
            if (cVar != null) {
                this.c.a(cVar.a);
                this.b.a(cVar.b);
            } else {
                this.c.a((Parcelable) null);
                this.b.a(0, 0);
            }
            this.c.e();
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a((RecyclerView) this.a, aVar, iArr);
        }

        public a(ViewGroup viewGroup, gum gum) {
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setLayoutParams(fzy.b(viewGroup.getContext(), viewGroup));
            super(recyclerView);
            ((RecyclerView) this.a).setNestedScrollingEnabled(false);
            this.b = new C0037a(((RecyclerView) this.a).getContext(), gum);
            ((RecyclerView) this.a).a((i) this.b);
            this.c = new gut(gum);
            if (viewGroup instanceof RecyclerView) {
                RecyclerView recyclerView2 = (RecyclerView) viewGroup;
                if (recyclerView2.c() instanceof gut) {
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
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }
}

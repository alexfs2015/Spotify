package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.spotify.music.R;
import java.util.ArrayList;

/* renamed from: av reason: default package */
public final class av implements OnItemClickListener, bd {
    LayoutInflater a;
    ax b;
    int c;
    public defpackage.bd.a d;
    private Context e;
    private ExpandedMenuView f;
    private int g;
    private a h;

    /* renamed from: av$a */
    class a extends BaseAdapter {
        private int a = -1;

        public a() {
            a();
        }

        private void a() {
            az azVar = av.this.b.i;
            if (azVar != null) {
                ArrayList k = av.this.b.k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    if (((az) k.get(i)) == azVar) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        /* renamed from: a */
        public final az getItem(int i) {
            ArrayList k = av.this.b.k();
            int i2 = this.a;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return (az) k.get(i);
        }

        public final int getCount() {
            int size = av.this.b.k().size();
            return this.a < 0 ? size : size - 1;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = av.this.a.inflate(av.this.c, viewGroup, false);
            }
            ((defpackage.be.a) view).a(getItem(i), 0);
            return view;
        }

        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    private av(int i, int i2) {
        this.c = i;
        this.g = 0;
    }

    public av(Context context, int i) {
        this(i, 0);
        this.e = context;
        this.a = LayoutInflater.from(this.e);
    }

    public final be a(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (ExpandedMenuView) this.a.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.h == null) {
                this.h = new a();
            }
            this.f.setAdapter(this.h);
            this.f.setOnItemClickListener(this);
        }
        return this.f;
    }

    public final void a(Context context, ax axVar) {
        int i = this.g;
        if (i != 0) {
            this.e = new ContextThemeWrapper(context, i);
            this.a = LayoutInflater.from(this.e);
        } else if (this.e != null) {
            this.e = context;
            if (this.a == null) {
                this.a = LayoutInflater.from(this.e);
            }
        }
        this.b = axVar;
        a aVar = this.h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void a(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final void a(ax axVar, boolean z) {
        defpackage.bd.a aVar = this.d;
        if (aVar != null) {
            aVar.a(axVar, z);
        }
    }

    public final void a(defpackage.bd.a aVar) {
        this.d = aVar;
    }

    public final void a(boolean z) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(bi biVar) {
        if (!biVar.hasVisibleItems()) {
            return false;
        }
        ay ayVar = new ay(biVar);
        ax axVar = ayVar.a;
        defpackage.p.a aVar = new defpackage.p.a(axVar.a);
        ayVar.c = new av(aVar.a.a, (int) R.layout.abc_list_menu_item_layout);
        ayVar.c.d = ayVar;
        ayVar.a.a((bd) ayVar.c);
        aVar.a.m = ayVar.c.c();
        aVar.a.n = ayVar;
        View view = axVar.h;
        if (view != null) {
            aVar.a.e = view;
        } else {
            aVar.a.c = axVar.g;
            aVar.a(axVar.f);
        }
        aVar.a.l = ayVar;
        ayVar.b = aVar.a();
        ayVar.b.setOnDismissListener(ayVar);
        LayoutParams attributes = ayVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ayVar.b.show();
        defpackage.bd.a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.a(biVar);
        }
        return true;
    }

    public final int b() {
        return 0;
    }

    public final boolean b(az azVar) {
        return false;
    }

    public final ListAdapter c() {
        if (this.h == null) {
            this.h = new a();
        }
        return this.h;
    }

    public final boolean c(az azVar) {
        return false;
    }

    public final Parcelable f() {
        if (this.f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.a((MenuItem) this.h.getItem(i), (bd) this, 0);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.spotify.music.R;
import java.util.ArrayList;

/* renamed from: ezn reason: default package */
public final class ezn implements bd {
    public NavigationMenuView a;
    public LinearLayout b;
    ax c;
    public int d;
    public b e;
    public LayoutInflater f;
    int g;
    boolean h;
    ColorStateList i;
    ColorStateList j;
    Drawable k;
    int l;
    int m;
    public int n;
    int o;
    final OnClickListener p = new OnClickListener() {
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            ezn.this.b(true);
            az azVar = navigationMenuItemView.e;
            boolean a2 = ezn.this.c.a((MenuItem) azVar, (bd) ezn.this, 0);
            if (azVar != null && azVar.isCheckable() && a2) {
                ezn.this.e.a(azVar);
            }
            ezn.this.b(false);
            ezn.this.a(false);
        }
    };
    private defpackage.bd.a q;

    /* renamed from: ezn$a */
    static class a extends j {
        public a(View view) {
            super(view);
        }
    }

    /* renamed from: ezn$b */
    public class b extends androidx.recyclerview.widget.RecyclerView.a<j> {
        final ArrayList<d> a = new ArrayList<>();
        boolean d;
        private az e;

        public final long b(int i) {
            return (long) i;
        }

        public final /* synthetic */ void a(u uVar) {
            j jVar = (j) uVar;
            if (jVar instanceof g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.o;
                if (navigationMenuItemView.d != null) {
                    navigationMenuItemView.d.removeAllViews();
                }
                navigationMenuItemView.c.setCompoundDrawables(null, null, null, null);
            }
        }

        public final /* synthetic */ void a(u uVar, int i) {
            j jVar = (j) uVar;
            int a2 = a(i);
            boolean z = true;
            if (a2 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.o;
                navigationMenuItemView.j = ezn.this.j;
                if (navigationMenuItemView.j == null) {
                    z = false;
                }
                navigationMenuItemView.k = z;
                if (navigationMenuItemView.e != null) {
                    navigationMenuItemView.a(navigationMenuItemView.e.getIcon());
                }
                if (ezn.this.h) {
                    jm.a((TextView) navigationMenuItemView.c, ezn.this.g);
                }
                if (ezn.this.i != null) {
                    navigationMenuItemView.c.setTextColor(ezn.this.i);
                }
                ip.a((View) navigationMenuItemView, ezn.this.k != null ? ezn.this.k.getConstantState().newDrawable() : null);
                f fVar = (f) this.a.get(i);
                navigationMenuItemView.a = fVar.b;
                int i2 = ezn.this.l;
                navigationMenuItemView.setPadding(i2, 0, i2, 0);
                navigationMenuItemView.c.setCompoundDrawablePadding(ezn.this.m);
                navigationMenuItemView.a(fVar.a, 0);
            } else if (a2 != 1) {
                if (a2 == 2) {
                    e eVar = (e) this.a.get(i);
                    jVar.o.setPadding(0, eVar.a, 0, eVar.b);
                }
            } else {
                ((TextView) jVar.o).setText(((f) this.a.get(i)).a.getTitle());
            }
        }

        public b() {
            a();
        }

        public final int b() {
            return this.a.size();
        }

        public final int a(int i) {
            d dVar = (d) this.a.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                return ((f) dVar).a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            if (!this.d) {
                this.d = true;
                this.a.clear();
                this.a.add(new c());
                int size = ezn.this.c.i().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    az azVar = (az) ezn.this.c.i().get(i3);
                    if (azVar.isChecked()) {
                        a(azVar);
                    }
                    if (azVar.isCheckable()) {
                        azVar.a(false);
                    }
                    if (azVar.hasSubMenu()) {
                        SubMenu subMenu = azVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.a.add(new e(ezn.this.o, 0));
                            }
                            this.a.add(new f(azVar));
                            int size2 = this.a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                az azVar2 = (az) subMenu.getItem(i4);
                                if (azVar2.isVisible()) {
                                    if (!z2 && azVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (azVar2.isCheckable()) {
                                        azVar2.a(false);
                                    }
                                    if (azVar.isChecked()) {
                                        a(azVar);
                                    }
                                    this.a.add(new f(azVar2));
                                }
                            }
                            if (z2) {
                                e(size2, this.a.size());
                            }
                        }
                    } else {
                        int groupId = azVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.a.size();
                            boolean z3 = azVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                this.a.add(new e(ezn.this.o, ezn.this.o));
                            }
                            z = z3;
                        } else if (!z && azVar.getIcon() != null) {
                            e(i2, this.a.size());
                            z = true;
                        }
                        f fVar = new f(azVar);
                        fVar.b = z;
                        this.a.add(fVar);
                        i = groupId;
                    }
                }
                this.d = false;
            }
        }

        private void e(int i, int i2) {
            while (i < i2) {
                ((f) this.a.get(i)).b = true;
                i++;
            }
        }

        public final void a(az azVar) {
            if (this.e != azVar && azVar.isCheckable()) {
                az azVar2 = this.e;
                if (azVar2 != null) {
                    azVar2.setChecked(false);
                }
                this.e = azVar;
                azVar.setChecked(true);
            }
        }

        public final Bundle c() {
            Bundle bundle = new Bundle();
            az azVar = this.e;
            if (azVar != null) {
                bundle.putInt("android:menu:checked", azVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) this.a.get(i);
                if (dVar instanceof f) {
                    az azVar2 = ((f) dVar).a;
                    View actionView = azVar2 != null ? azVar2.getActionView() : null;
                    if (actionView != null) {
                        ezp ezp = new ezp();
                        actionView.saveHierarchyState(ezp);
                        sparseArray.put(azVar2.getItemId(), ezp);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new g(ezn.this.f, viewGroup, ezn.this.p);
            }
            if (i == 1) {
                return new i(ezn.this.f, viewGroup);
            }
            if (i == 2) {
                return new h(ezn.this.f, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new a(ezn.this.b);
        }
    }

    /* renamed from: ezn$c */
    static class c implements d {
        c() {
        }
    }

    /* renamed from: ezn$d */
    interface d {
    }

    /* renamed from: ezn$e */
    static class e implements d {
        final int a;
        final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: ezn$f */
    static class f implements d {
        final az a;
        boolean b;

        f(az azVar) {
            this.a = azVar;
        }
    }

    /* renamed from: ezn$g */
    static class g extends j {
        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.o.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: ezn$h */
    static class h extends j {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: ezn$i */
    static class i extends j {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: ezn$j */
    static abstract class j extends u {
        public j(View view) {
            super(view);
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(bi biVar) {
        return false;
    }

    public final boolean b(az azVar) {
        return false;
    }

    public final boolean c(az azVar) {
        return false;
    }

    public final void a(Context context, ax axVar) {
        this.f = LayoutInflater.from(context);
        this.c = axVar;
        this.o = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void a(boolean z) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a();
            bVar.e();
        }
    }

    public final void a(defpackage.bd.a aVar) {
        this.q = aVar;
    }

    public final void a(ax axVar, boolean z) {
        defpackage.bd.a aVar = this.q;
        if (aVar != null) {
            aVar.a(axVar, z);
        }
    }

    public final int b() {
        return this.d;
    }

    public final Parcelable f() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray sparseArray = new SparseArray();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        b bVar = this.e;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.c());
        }
        if (this.b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                b bVar = this.e;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    bVar.d = true;
                    int size = bVar.a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        d dVar = (d) bVar.a.get(i3);
                        if (dVar instanceof f) {
                            az azVar = ((f) dVar).a;
                            if (azVar != null && azVar.getItemId() == i2) {
                                bVar.a(azVar);
                                break;
                            }
                        }
                        i3++;
                    }
                    bVar.d = false;
                    bVar.a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = bVar.a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        d dVar2 = (d) bVar.a.get(i4);
                        if (dVar2 instanceof f) {
                            az azVar2 = ((f) dVar2).a;
                            if (azVar2 != null) {
                                View actionView = azVar2.getActionView();
                                if (actionView != null) {
                                    ezp ezp = (ezp) sparseParcelableArray2.get(azVar2.getItemId());
                                    if (ezp != null) {
                                        actionView.restoreHierarchyState(ezp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.j = colorStateList;
        a(false);
    }

    public final void b(ColorStateList colorStateList) {
        this.i = colorStateList;
        a(false);
    }

    public final void a(int i2) {
        this.g = i2;
        this.h = true;
        a(false);
    }

    public final void a(Drawable drawable) {
        this.k = drawable;
        a(false);
    }

    public final void b(int i2) {
        this.l = i2;
        a(false);
    }

    public final void c(int i2) {
        this.m = i2;
        a(false);
    }

    public final void b(boolean z) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.d = z;
        }
    }
}

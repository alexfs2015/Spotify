package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: jsm reason: default package */
public final class jsm extends BaseAdapter {
    public jsn a;
    private final DataSetObserver b = new DataSetObserver() {
        public final void onChanged() {
            jsm.this.a();
        }

        public final void onInvalidated() {
            jsm.this.a();
        }
    };
    private final Context c;
    private final List<a> d = new ArrayList();
    private final SparseArray<a> e = new SparseArray<>();
    private int f;
    private int g = 3;
    private final jsn h;
    private a i;

    /* renamed from: jsm$a */
    public static class a {
        public final ListAdapter a;
        public String b;
        public final int c;
        public int d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public View i;
        public View j;
        private boolean k;
        private boolean l;

        private a(ListAdapter listAdapter, String str, int i2, View view, View view2) {
            this.h = -1;
            fbp.a(listAdapter);
            this.a = listAdapter;
            this.b = str;
            this.c = i2;
            this.e = true;
            this.i = view;
            this.j = view2;
            this.k = true;
            this.l = true;
        }

        /* synthetic */ a(ListAdapter listAdapter, String str, int i2, View view, View view2, byte b2) {
            this(listAdapter, str, i2, view, view2);
        }

        private boolean d() {
            return this.b != null;
        }

        private boolean e() {
            return this.i != null && this.l;
        }

        private boolean f() {
            return this.j != null && this.k;
        }

        public final int a() {
            return d() ? 1 : 0;
        }

        public final boolean a(int i2) {
            return i2 < a();
        }

        public final int b() {
            return e() ? 1 : 0;
        }

        public final boolean b(int i2) {
            return i2 < a() + b() && i2 >= a();
        }

        public final int c() {
            return f() ? 1 : 0;
        }

        public final boolean c(int i2) {
            return i2 < ((a() + b()) + this.a.getCount()) + c() && i2 >= (a() + b()) + this.a.getCount();
        }

        public final int d(int i2) {
            int i3 = i2 - this.f;
            if (i3 < 0 || i3 >= this.a.getCount() + a() + b() + c()) {
                StringBuilder sb = new StringBuilder("global position out of bounds: ");
                sb.append(i2);
                Assertion.a(sb.toString());
            }
            return i3;
        }

        public final int e(int i2) {
            int d2 = d(i2);
            if (a(d2)) {
                StringBuilder sb = new StringBuilder("Should not find title at ");
                sb.append(i2);
                Assertion.a(sb.toString());
            }
            if (b(d2)) {
                StringBuilder sb2 = new StringBuilder("Should not find header at ");
                sb2.append(i2);
                Assertion.a(sb2.toString());
            }
            if (c(d2)) {
                StringBuilder sb3 = new StringBuilder("Should not find footer at ");
                sb3.append(i2);
                Assertion.a(sb3.toString());
            }
            return (d2 - a()) - b();
        }
    }

    public jsm(Context context) {
        this.c = context;
        jsk jsk = new jsk(this.c);
        this.h = jsk;
        this.a = jsk;
    }

    private void b() {
        int i2 = 0;
        for (a aVar : this.d) {
            aVar.f = i2;
            if (aVar.e) {
                i2 += aVar.a.getCount() + aVar.a() + aVar.b() + aVar.c();
            }
            aVar.g = i2;
        }
        this.f = i2;
        this.i = null;
    }

    private void c() {
        int i2 = this.g;
        for (a aVar : this.d) {
            if (aVar.h == -1) {
                aVar.h = i2;
                i2 += aVar.a.getViewTypeCount();
            }
        }
        this.g = i2;
    }

    private a d(int i2) {
        a aVar = this.i;
        if (aVar != null && aVar.f <= i2 && i2 < this.i.g) {
            return this.i;
        }
        for (a aVar2 : this.d) {
            if (i2 < aVar2.g) {
                this.i = aVar2;
                return aVar2;
            }
        }
        if (this.f == 0) {
            throw new IndexOutOfBoundsException("No section found, adapter is empty");
        }
        StringBuilder sb = new StringBuilder("No section found for global position=");
        sb.append(i2);
        sb.append(", should be between 0 and ");
        sb.append(this.f);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int a(int i2) {
        a d2 = d(i2);
        int d3 = d2.d(i2);
        if (!d2.a(d3) && !d2.b(d3) && !d2.c(d3)) {
            return d2.c;
        }
        return Integer.MIN_VALUE;
    }

    public final int a(int i2, int i3) {
        return b(i3).e(i2);
    }

    public void a() {
        b();
        c();
        notifyDataSetChanged();
    }

    public final void a(ListAdapter listAdapter, int i2, int i3) {
        a(listAdapter, i2, i3, (View) null, (View) null);
    }

    public final void a(ListAdapter listAdapter, int i2, int i3, View view, View view2) {
        a(listAdapter, this.c.getString(i2), i3, (View) null, view2);
    }

    public final void a(ListAdapter listAdapter, String str, int i2) {
        a(listAdapter, str, i2, (View) null, (View) null);
    }

    public final void a(ListAdapter listAdapter, String str, int i2, View view, View view2) {
        int i3 = i2;
        fbp.a(listAdapter);
        if (i3 != Integer.MIN_VALUE) {
            fbp.a(this.e.get(i2, null) == null, "Section id %s is already in use!", (Object) Integer.toString(i2));
        }
        a aVar = new a(listAdapter, str, i2, view, view2, 0);
        aVar.d = this.d.size();
        this.d.add(aVar);
        if (i3 != Integer.MIN_VALUE) {
            this.e.put(i2, aVar);
        }
        ListAdapter listAdapter2 = listAdapter;
        listAdapter.registerDataSetObserver(this.b);
        a();
    }

    public final void a(int... iArr) {
        boolean z = false;
        for (int i2 : iArr) {
            if (b(i2).e) {
                z = true;
            }
            b(i2).e = false;
        }
        if (z) {
            a();
        }
    }

    public final boolean areAllItemsEnabled() {
        for (a aVar : this.d) {
            if (aVar.e && !aVar.a.areAllItemsEnabled()) {
                return false;
            }
        }
        return true;
    }

    public a b(int i2) {
        fbp.a(i2 != Integer.MIN_VALUE, (Object) "Invalid section id: SECTION_ID_NONE");
        a aVar = (a) this.e.get(i2, null);
        fbp.a(aVar);
        return aVar;
    }

    public final void b(int... iArr) {
        boolean z = false;
        for (a aVar : this.d) {
            if (aVar.e) {
                z = true;
            }
            aVar.e = false;
        }
        if (z) {
            a();
        }
    }

    public final void c(int... iArr) {
        boolean z = false;
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[0];
            if (!b(i3).e) {
                z = true;
            }
            b(i3).e = true;
        }
        if (z) {
            a();
        }
    }

    public final boolean c(int i2) {
        a b2 = b(i2);
        boolean z = b2.e;
        b2.e = b2.a.getCount() > 0;
        if (z != b2.e) {
            a();
        }
        return b2.e;
    }

    public final int getCount() {
        return this.f;
    }

    public final Object getItem(int i2) {
        a d2 = d(i2);
        int d3 = d2.d(i2);
        return d2.a(d3) ? d2.b : d2.b(d3) ? d2.i : d2.c(d3) ? d2.j : d2.a.getItem(d2.e(i2));
    }

    public final long getItemId(int i2) {
        a d2 = d(i2);
        int d3 = d2.d(i2);
        if (d2.a(d3)) {
            return -1;
        }
        if (d2.b(d3)) {
            return -2;
        }
        if (d2.c(d3)) {
            return -3;
        }
        return d2.a.getItemId(d2.e(i2));
    }

    public final int getItemViewType(int i2) {
        a d2 = d(i2);
        int d3 = d2.d(i2);
        if (d2.a(d3)) {
            return 0;
        }
        if (d2.b(d3)) {
            return 1;
        }
        if (d2.c(d3)) {
            return 2;
        }
        int itemViewType = d2.a.getItemViewType(d2.e(i2));
        if (itemViewType == -1 || itemViewType == -2) {
            return -1;
        }
        return d2.h + itemViewType;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        a d2 = d(i2);
        int d3 = d2.d(i2);
        if (!d2.a(d3)) {
            return d2.b(d3) ? (View) fbp.a(d2.i) : d2.c(d3) ? (View) fbp.a(d2.j) : (View) fbp.a(d2.a.getView(d2.e(i2), view, viewGroup));
        }
        String str = d2.b;
        int i3 = d2.c;
        View a2 = this.a.a(viewGroup);
        this.a.a(i3, a2, d2.b, str, i2 == 0);
        return a2;
    }

    public final int getViewTypeCount() {
        return this.g;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEmpty() {
        return this.f == 0;
    }

    public final boolean isEnabled(int i2) {
        a d2 = d(i2);
        int d3 = d2.d(i2);
        if (!d2.a(d3) && !d2.b(d3) && !d2.c(d3)) {
            return d2.a.isEnabled(d2.e(i2));
        }
        return false;
    }
}

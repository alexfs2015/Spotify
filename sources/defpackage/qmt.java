package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qmt reason: default package */
public abstract class qmt extends BaseAdapter {
    public final List<String> a = new ArrayList();
    private final DataSetObserver b = new DataSetObserver() {
        public final void onChanged() {
            qmt.this.a();
            qmt.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            qmt.this.a();
            qmt.this.notifyDataSetInvalidated();
        }
    };
    private final Context c;
    private ListAdapter d;
    private int[] e;
    private int[] f;
    private int g;

    protected qmt(Context context, ListAdapter listAdapter) {
        this.c = context;
        this.d = listAdapter;
        listAdapter.registerDataSetObserver(this.b);
    }

    public abstract int a(int i);

    public void a() {
        if (this.d != null && !this.a.isEmpty()) {
            int[] iArr = new int[this.a.size()];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = 0;
            }
            for (int i2 = 0; i2 < this.d.getCount(); i2++) {
                int a2 = a(i2);
                iArr[a2] = iArr[a2] + 1;
            }
            this.g = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (iArr[i3] > 0) {
                    iArr[i3] = iArr[i3] + 1;
                    this.g++;
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr[i5];
                iArr[i5] = i4;
                i4 += i6;
            }
            this.e = (int[]) iArr.clone();
            this.f = new int[(i4 + 1)];
            int i7 = 0;
            while (i7 < iArr.length) {
                int i8 = i7 + 1;
                this.f[iArr[i7]] = -i8;
                iArr[i7] = iArr[i7] + 1;
                i7 = i8;
            }
            for (int i9 = 0; i9 < this.d.getCount(); i9++) {
                int a3 = a(i9);
                this.f[iArr[a3]] = i9;
                iArr[a3] = iArr[a3] + 1;
            }
        }
    }

    public boolean areAllItemsEnabled() {
        return this.g == 0 && this.d.areAllItemsEnabled();
    }

    public int getCount() {
        return this.d.getCount() + this.g;
    }

    public Object getItem(int i) {
        int[] iArr = this.f;
        int i2 = iArr[i];
        if (i2 >= 0) {
            return this.d.getItem(iArr[i]);
        }
        return this.a.get((-i2) - 1);
    }

    public long getItemId(int i) {
        if (i < 0) {
            return -1;
        }
        int i2 = this.f[i];
        if (i2 < 0) {
            return -1;
        }
        return this.d.getItemId(i2);
    }

    public int getItemViewType(int i) {
        int[] iArr = this.f;
        if (i > iArr.length) {
            return -1;
        }
        int i2 = iArr[i];
        if (i2 < 0) {
            return 0;
        }
        return this.d.getItemViewType(i2) + 1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        fbp.a(i, this.f.length, "index");
        int i2 = this.f[i];
        if (i2 >= 0) {
            return this.d.getView(i2, view, viewGroup);
        }
        boolean z = true;
        String str = (String) this.a.get((-i2) - 1);
        fsm fsm = (fsm) fqv.b(view, fsm.class);
        if (fsm == null) {
            fsm = fqv.e().c(this.c, viewGroup);
        }
        if (i != 0) {
            z = false;
        }
        fsm.b(z);
        fsm.a((CharSequence) str);
        return fsm.getView();
    }

    public int getViewTypeCount() {
        return this.d.getViewTypeCount() + 1;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public boolean isEnabled(int i) {
        int[] iArr = this.f;
        if (i > iArr.length) {
            return false;
        }
        int i2 = iArr[i];
        if (i2 < 0) {
            return false;
        }
        return this.d.isEnabled(i2);
    }
}

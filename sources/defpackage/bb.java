package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: bb reason: default package */
abstract class bb implements OnItemClickListener, bd, bg {
    Rect g;

    public abstract void a(int i);

    public final void a(Context context, ax axVar) {
    }

    public abstract void a(View view);

    public abstract void a(OnDismissListener onDismissListener);

    public abstract void a(ax axVar);

    public final int b() {
        return 0;
    }

    public abstract void b(int i);

    public abstract void b(boolean z);

    public final boolean b(az azVar) {
        return false;
    }

    public abstract void c(int i);

    public abstract void c(boolean z);

    public final boolean c(az azVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    bb() {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        a(listAdapter).a.a((MenuItem) listAdapter.getItem(i), (bd) this, h() ? 0 : 4);
    }

    protected static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static aw a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (aw) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (aw) listAdapter;
    }

    protected static boolean b(ax axVar) {
        int size = axVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = axVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}

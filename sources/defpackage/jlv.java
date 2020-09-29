package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

@Deprecated
/* renamed from: jlv reason: default package */
public final class jlv implements ListAdapter {
    private View a;
    private final boolean b = false;

    public final int getCount() {
        return 1;
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public jlv(View view) {
        this.a = (View) fay.a(view);
    }

    public jlv(View view, boolean z) {
        this.a = (View) fay.a(view);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.a;
    }

    public final boolean areAllItemsEnabled() {
        return this.b;
    }

    public final boolean isEnabled(int i) {
        return this.b;
    }
}

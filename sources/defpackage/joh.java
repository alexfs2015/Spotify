package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

@Deprecated
/* renamed from: joh reason: default package */
public final class joh implements ListAdapter {
    private View a;
    private final boolean b = false;

    public joh(View view) {
        this.a = (View) fbp.a(view);
    }

    public joh(View view, boolean z) {
        this.a = (View) fbp.a(view);
    }

    public final boolean areAllItemsEnabled() {
        return this.b;
    }

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

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return this.a;
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

    public final boolean isEnabled(int i) {
        return this.b;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}

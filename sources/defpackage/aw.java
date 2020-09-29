package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: aw reason: default package */
public final class aw extends BaseAdapter {
    public ax a;
    boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public aw(ax axVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = axVar;
        this.f = i;
        a();
    }

    private void a() {
        az azVar = this.a.i;
        if (azVar != null) {
            ArrayList k = this.a.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((az) k.get(i)) == azVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    /* renamed from: a */
    public final az getItem(int i) {
        ArrayList k = this.d ? this.a.k() : this.a.i();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (az) k.get(i);
    }

    public final int getCount() {
        ArrayList k = this.d ? this.a.k() : this.a.i();
        return this.c < 0 ? k.size() : k.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.b() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId);
        if (listMenuItemView.b != null) {
            listMenuItemView.b.setVisibility((listMenuItemView.d || !z) ? 8 : 0);
        }
        a aVar = (a) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

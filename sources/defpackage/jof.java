package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

@Deprecated
/* renamed from: jof reason: default package */
public abstract class jof<T> extends BaseAdapter {
    protected List<T> a;
    private Activity b;
    private boolean c = true;

    public jof(Activity activity, List<T> list) {
        this.b = (Activity) fbp.a(activity);
        this.a = (List) fbp.a(list);
    }

    public abstract View a(ViewGroup viewGroup);

    public abstract void a(View view, int i);

    public int getCount() {
        return this.a.size();
    }

    public T getItem(int i) {
        return this.a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Object item = getItem(i);
        if (view == null) {
            view = a(viewGroup);
        }
        view.setTag(item);
        a(view, i);
        return view;
    }
}

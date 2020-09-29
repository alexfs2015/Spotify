package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: ith reason: default package */
public abstract class ith<D> extends u {

    /* renamed from: ith$a */
    public interface a<D> {
        void onItemClick(int i, View view, D d);
    }

    public ith(View view) {
        super(view);
    }

    public static View a(int i, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    public abstract void a(D d, int i);

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }
}

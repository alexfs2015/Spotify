package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: iqu reason: default package */
public abstract class iqu<D> extends u {

    /* renamed from: iqu$a */
    public interface a<D> {
        void onItemClick(int i, View view, D d);
    }

    public abstract void a(D d, int i);

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    public iqu(View view) {
        super(view);
    }

    public static View a(int i, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }
}

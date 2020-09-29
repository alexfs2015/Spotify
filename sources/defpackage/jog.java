package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.base.java.logging.Logger;

/* renamed from: jog reason: default package */
public final class jog extends a<u> implements gkw {
    private final View a;
    private final boolean d;
    private FrameLayout e;

    public jog(View view) {
        this(view, false);
    }

    public jog(View view, boolean z) {
        this.a = view;
        this.a.setLayoutParams(new LayoutParams(-1, -2));
        this.d = z;
        a(true);
    }

    public final int a(int i) {
        return this.a.hashCode();
    }

    public final u a(ViewGroup viewGroup, int i) {
        if (this.e != null) {
            Logger.b("onCreateViewHolder() was called several times. Should only be called once.", new Object[0]);
            this.e.removeAllViews();
        }
        this.e = new FrameLayout(viewGroup.getContext());
        this.e.setLayoutParams(new LayoutParams(-1, -2));
        this.e.addView(this.a);
        return new u(this.e) {
        };
    }

    public final void a(u uVar, int i) {
        uVar.o.setEnabled(this.d);
    }

    public final int b() {
        return 1;
    }

    public final long b(int i) {
        return (long) this.a.hashCode();
    }
}
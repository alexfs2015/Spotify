package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;
import com.spotify.music.R;

/* renamed from: ukj reason: default package */
public final class ukj implements uki {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final vhu e;
    private final RecyclerView f;

    /* renamed from: ukj$a */
    static final class a extends h {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            int e = RecyclerView.e(view);
            boolean z = true;
            if (recyclerView.c() == null || e != recyclerView.c().b() - 1) {
                z = false;
            }
            if (!z) {
                rect.set(0, 0, view.getContext().getResources().getDimensionPixelSize(R.dimen.std_8dp), 0);
            }
        }
    }

    public ukj(View view) {
        this.a = view;
        this.e = new vhu((ViewGroup) view.findViewById(R.id.accessory));
        this.b = (TextView) view.findViewById(R.id.text1);
        this.c = (TextView) view.findViewById(R.id.text2);
        this.d = (ImageView) view.findViewById(R.id.image_view);
        this.f = (RecyclerView) view.findViewById(R.id.tagsScrollView);
        RecyclerView recyclerView = this.f;
        recyclerView.a((h) new a(0));
        view.getContext();
        this.f.a((i) new LinearLayoutManager(0, false));
        if (!view.isInEditMode()) {
            TextView textView = this.b;
            fzy.a(textView, vfj.b(20.0f, textView.getResources()));
            fzy.a(this.a);
        }
        vfz.b(getView().findViewById(R.id.row_view)).a(this.b, this.c).b(this.d).a();
    }

    public final View a() {
        return this.e.b;
    }

    public final void a(View view) {
        this.e.a(view);
        this.e.a();
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void a(boolean z) {
        View view = this.a;
        if (view instanceof vhv) {
            ((vhv) view).a(z);
        }
    }

    public final TextView b() {
        return this.b;
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void b(boolean z) {
        this.e.a(z);
    }

    public final ImageView c() {
        return this.d;
    }

    public final void c(CharSequence charSequence) {
    }

    public final void c(boolean z) {
        this.a.setEnabled(!z);
        this.f.setEnabled(!z);
    }

    public final TextView d() {
        return this.c;
    }

    public final void d(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public final RecyclerView e() {
        return this.f;
    }

    public final void e(boolean z) {
        jzb.a(this.c.getContext(), this.c, z);
    }

    public final View getView() {
        return this.a;
    }
}

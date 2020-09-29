package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fru reason: default package */
abstract class fru implements frt {
    private final View a;
    private final vhu b;

    protected fru(View view) {
        this.a = view;
        this.b = new vhu((ViewGroup) view.findViewById(R.id.accessory));
    }

    public View a() {
        return this.b.b;
    }

    public void a(View view) {
        this.b.a(view);
        this.b.a();
    }

    public void a(boolean z) {
        View view = this.a;
        if (view instanceof vhv) {
            ((vhv) view).a(z);
        }
    }

    public void b(boolean z) {
        this.b.a(z);
    }

    public void c(boolean z) {
        View view = this.a;
        if (view instanceof vhw) {
            ((vhw) view).c(z);
        }
    }

    public View getView() {
        return this.a;
    }
}

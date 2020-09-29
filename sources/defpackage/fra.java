package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: fra reason: default package */
abstract class fra implements fqz {
    private final View a;
    private final uwe b;

    protected fra(View view) {
        this.a = view;
        this.b = new uwe((ViewGroup) view.findViewById(R.id.accessory));
    }

    public void a(boolean z) {
        View view = this.a;
        if (view instanceof uwf) {
            ((uwf) view).a(z);
        }
    }

    public View getView() {
        return this.a;
    }

    public void a(View view) {
        this.b.a(view);
        this.b.a();
    }

    public void b(boolean z) {
        this.b.a(z);
    }

    public void c(boolean z) {
        View view = this.a;
        if (view instanceof uwg) {
            ((uwg) view).c(z);
        }
    }

    public View a() {
        return this.b.b;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ukl reason: default package */
public final class ukl implements ukk {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final vhu f;

    public ukl(View view) {
        this.a = view;
        this.f = new vhu((ViewGroup) view.findViewById(R.id.accessory));
        this.b = (ImageView) view.findViewById(R.id.image_view);
        this.c = (TextView) view.findViewById(R.id.text1);
        this.d = (TextView) view.findViewById(R.id.text2);
        this.e = (TextView) view.findViewById(R.id.subtitle_tag);
        if (!view.isInEditMode()) {
            fzy.c(this.c);
            fzy.b(this.d);
            fzy.a(this.a);
        }
        vfz.b(getView().findViewById(R.id.row_view)).a(this.c, this.d).b(this.b).a();
    }

    public final View a() {
        return this.f.b;
    }

    public final void a(View view) {
        this.f.a(view);
        this.f.a();
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void a(String str) {
        if (fbo.a(str)) {
            this.e.setVisibility(8);
            return;
        }
        this.e.setVisibility(0);
        this.e.setText(str);
    }

    public final void a(boolean z) {
        View view = this.a;
        if (view instanceof vhv) {
            ((vhv) view).a(z);
        }
    }

    public final TextView b() {
        return this.c;
    }

    public final void b(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void b(boolean z) {
        this.f.a(z);
    }

    public final ImageView c() {
        return this.b;
    }

    public final void c(CharSequence charSequence) {
    }

    public final void c(boolean z) {
    }

    public final TextView d() {
        return this.d;
    }

    public final View getView() {
        return this.a;
    }
}

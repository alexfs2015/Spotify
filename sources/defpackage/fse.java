package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fse reason: default package */
class fse extends fru implements fsb {
    private final TextView a;
    private final TextView b;
    private boolean c;

    public fse(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908308);
        this.b = (TextView) view.findViewById(16908309);
        if (!view.isInEditMode()) {
            fzy.c(this.a);
            fzy.b(this.b);
            fzy.a(getView());
        }
        vfz.b(getView().findViewById(R.id.row_view)).a(b(), d()).a();
    }

    private void d(boolean z) {
        this.c = z;
        vgl.b(getView().getContext(), this.b, z ? R.attr.pasteTextAppearanceMetadata : R.attr.pasteTextAppearanceSecondary);
    }

    public void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public TextView b() {
        return this.a;
    }

    public void b(CharSequence charSequence) {
        if (this.c) {
            d(false);
            this.b.setTransformationMethod(null);
        }
        this.b.setText(charSequence);
    }

    public void c(CharSequence charSequence) {
        if (!this.c) {
            d(true);
        }
        this.b.setText(charSequence);
    }

    public TextView d() {
        return this.b;
    }
}

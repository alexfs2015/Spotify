package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: frk reason: default package */
class frk extends fra implements frh {
    private final TextView a;
    private final TextView b;
    private boolean c;

    public frk(View view) {
        super(view);
        this.a = (TextView) view.findViewById(16908308);
        this.b = (TextView) view.findViewById(16908309);
        if (!view.isInEditMode()) {
            fze.c(this.a);
            fze.b(this.b);
            fze.a(getView());
        }
        uui.b(getView().findViewById(R.id.row_view)).a(b(), d()).a();
    }

    private void d(boolean z) {
        this.c = z;
        uuu.b(getView().getContext(), this.b, z ? R.attr.pasteTextAppearanceMetadata : R.attr.pasteTextAppearanceSecondary);
    }

    public TextView b() {
        return this.a;
    }

    public TextView d() {
        return this.b;
    }

    public void a(CharSequence charSequence) {
        this.a.setText(charSequence);
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
}

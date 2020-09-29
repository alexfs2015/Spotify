package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.music.R;

/* renamed from: uio reason: default package */
public final class uio implements uin {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(16908308));
    private final TextView c = ((TextView) this.a.findViewById(16908309));
    private final TextView d = ((TextView) this.a.findViewById(R.id.description));
    private final TextView e = ((TextView) this.a.findViewById(R.id.time_label));
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.primary_action_button));
    private final ImageView g = ((ImageView) this.a.findViewById(16908294));
    private final ImageView h = ((ImageView) this.a.findViewById(R.id.quickaction_mark_as_played));
    private final ImageView i = ((ImageView) this.a.findViewById(R.id.download_img));
    private final View j = this.a.findViewById(R.id.top_container);
    private final ProgressBar k = ((ProgressBar) this.a.findViewById(R.id.download_progress));
    private final ProgressBar l = ((ProgressBar) this.a.findViewById(R.id.progress));
    private final vhu m = new vhu((ViewGroup) this.a.findViewById(R.id.accessory));
    private final int n;

    public uio(View view) {
        this.a = view;
        vfz.c(this.h).b(this.h).a();
        vfz.c(this.i).b(this.i).a();
        Context context = view.getContext();
        vgl.b(context, this.d, R.attr.pasteTextAppearanceBodySmall);
        this.d.setTextColor(fr.c(context, R.color.glue_row_subtitle_color));
        if (jvi.c(this.a.getContext())) {
            this.n = 400;
        } else {
            this.n = 160;
        }
    }

    public final View a() {
        return this.m.b;
    }

    public final void a(int i2) {
        this.l.setMax(i2);
    }

    public final void a(View view) {
        this.m.a(view);
        this.m.a();
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void a(String str) {
        String str2;
        TextView textView = this.d;
        if (str != null) {
            int length = str.length();
            int i2 = this.n;
            if (length < i2) {
                i2 = str.length();
            }
            str2 = str.substring(0, i2);
        } else {
            str2 = "";
        }
        textView.setText(str2);
    }

    public final void a(boolean z) {
        this.a.setActivated(z);
    }

    public final TextView b() {
        return this.b;
    }

    public final void b(int i2) {
        this.l.setProgress(i2);
    }

    public final void b(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void b(boolean z) {
        this.m.a(z);
    }

    public final ImageView c() {
        return this.g;
    }

    public final void c(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void c(boolean z) {
        this.a.setEnabled(!z);
        this.j.setEnabled(!z);
        this.h.setEnabled(!z);
        this.i.setEnabled(!z);
    }

    public final TextView d() {
        return this.c;
    }

    public final void d(boolean z) {
        if (z) {
            this.k.setVisibility(0);
            this.i.setVisibility(4);
            return;
        }
        this.k.setVisibility(8);
        this.i.setVisibility(0);
    }

    public final void e() {
        this.l.setVisibility(0);
    }

    public final void f() {
        this.l.setVisibility(8);
    }

    public final void g() {
        this.d.setVisibility(0);
    }

    public final View getView() {
        return this.a;
    }

    public final void h() {
        this.d.setVisibility(8);
    }

    public final TextView i() {
        return this.e;
    }

    public final ImageView j() {
        return this.f;
    }

    public final ImageView k() {
        return this.i;
    }

    public final TextView l() {
        return this.d;
    }

    public final View m() {
        return this.j;
    }

    public final Optional<ImageView> n() {
        return Optional.b(this.h);
    }

    public final Optional<ImageView> o() {
        return Optional.e();
    }
}

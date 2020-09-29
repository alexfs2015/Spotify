package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: uhg reason: default package */
public class uhg implements uhf {
    final ImageView a = ((ImageView) fbp.a(this.b.findViewById(R.id.primary_action_button)));
    private final View b;
    private final TextView c = ((TextView) fbp.a(this.b.findViewById(16908308)));
    private final TextView d = ((TextView) fbp.a(this.b.findViewById(16908309)));
    private final ProgressBar e = ((ProgressBar) fbp.a(this.b.findViewById(R.id.progress)));
    private final ImageView f = ((ImageView) fbp.a(this.b.findViewById(16908294)));

    public uhg(View view) {
        this.b = view;
    }

    public final View a() {
        return null;
    }

    public final void a(int i) {
        this.e.setMax(i);
    }

    public final void a(View view) {
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void a(String str) {
    }

    public final void a(boolean z) {
        this.b.setActivated(z);
    }

    public final TextView b() {
        return this.c;
    }

    public final void b(int i) {
        this.e.setProgress(i);
    }

    public final void b(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void b(boolean z) {
    }

    public final ImageView c() {
        return this.f;
    }

    public final void c(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void c(boolean z) {
        this.b.setEnabled(!z);
    }

    public final TextView d() {
        return this.d;
    }

    public final void e() {
        this.e.setVisibility(0);
    }

    public final void f() {
        this.e.setVisibility(8);
    }

    public final void g() {
    }

    public View getView() {
        return this.b;
    }

    public final void h() {
    }
}

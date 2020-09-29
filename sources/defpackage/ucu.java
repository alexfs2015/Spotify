package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: ucu reason: default package */
public final class ucu implements ucs {
    private final View a;
    private final View b = this.a.findViewById(R.id.container);
    private final TextView c = ((TextView) fbp.a(this.a.findViewById(16908308)));
    private final TextView d = ((TextView) fbp.a(this.a.findViewById(16908309)));
    private final ImageView e = ((ImageView) fbp.a(this.a.findViewById(R.id.primary_action_button)));
    private final ProgressBar f = ((ProgressBar) fbp.a(this.a.findViewById(R.id.progress)));
    private final ImageView g = ((ImageView) fbp.a(this.a.findViewById(16908294)));
    private final uct h;

    private ucu(Context context, View view, Picasso picasso) {
        this.a = view;
        vfz.c(this.e).b(this.e).a();
        vfz.b(this.b).b(this.b).a();
        this.h = new uct(context, picasso);
        this.d.setAllCaps(false);
        fqz.a(this);
    }

    public static ucs a(Context context, ViewGroup viewGroup, Picasso picasso) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.episode_compact_action_card, viewGroup, false);
        if (VERSION.SDK_INT >= 21) {
            inflate.setClipToOutline(true);
        }
        return new ucu(context, inflate, picasso);
    }

    public final View a() {
        return null;
    }

    public final void a(int i) {
        this.f.setMax(i);
    }

    public final void a(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    public final void a(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void a(View view) {
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void a(String str) {
        this.h.a(this.g, str);
    }

    public final void a(boolean z) {
        this.a.setActivated(z);
    }

    public final TextView b() {
        return this.c;
    }

    public final void b(int i) {
        this.f.setProgress(i);
    }

    public final void b(OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    public final void b(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void b(String str) {
        this.e.setContentDescription(str);
    }

    public final void b(boolean z) {
    }

    public final ImageView c() {
        return this.g;
    }

    public final void c(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void c(boolean z) {
        this.c.setEnabled(!z);
        this.d.setEnabled(!z);
        e(!z);
    }

    public final TextView d() {
        return this.d;
    }

    public final void d(boolean z) {
        if (z) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(8);
        }
    }

    public final void e() {
        this.d.setVisibility(0);
    }

    public final void e(boolean z) {
        this.e.setEnabled(z);
    }

    public final void f() {
        this.d.setVisibility(0);
    }

    public final void g() {
        this.f.setVisibility(0);
    }

    public final View getView() {
        return this.a;
    }

    public final void h() {
        this.f.setVisibility(8);
    }

    public final void i() {
        jzb.a(this.a.getContext(), this.d, true);
    }

    public final void j() {
        jzb.a(this.a.getContext(), this.d, false);
    }
}

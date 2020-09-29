package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: tqt reason: default package */
public final class tqt implements tqs {
    private final View a;
    private final View b = this.a.findViewById(R.id.container);
    private final TextView c = ((TextView) this.a.findViewById(16908308));
    private final TextView d = ((TextView) this.a.findViewById(16908309));
    private final TextView e = ((TextView) this.a.findViewById(R.id.description));
    private final TextView f = ((TextView) this.a.findViewById(R.id.time_label));
    private final ImageView g = ((ImageView) this.a.findViewById(R.id.primary_action_button));
    private final ImageView h = ((ImageView) this.a.findViewById(16908294));
    private final ImageView i = ((ImageView) this.a.findViewById(R.id.quickaction_start));
    private final ImageView j = ((ImageView) this.a.findViewById(R.id.quickaction_middle));
    private final ImageView k = ((ImageView) this.a.findViewById(R.id.quickaction_end));
    private final ProgressBar l = ((ProgressBar) this.a.findViewById(R.id.download_progress));
    private final ProgressBar m = ((ProgressBar) this.a.findViewById(R.id.progress));
    private final uwe n = new uwe((ViewGroup) this.a.findViewById(R.id.accessory));
    private final LottieAnimationView o = ((LottieAnimationView) this.a.findViewById(R.id.lottie_animated_icon_end));
    private final int p;
    private final tqq q;

    public static tqs a(Context context, ViewGroup viewGroup, Picasso picasso) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.episode_quick_action_card, viewGroup, false);
        if (VERSION.SDK_INT >= 21) {
            inflate.setClipToOutline(true);
        }
        return new tqt(context, inflate, picasso);
    }

    private tqt(Context context, View view, Picasso picasso) {
        this.a = view;
        uui.c(this.i).b(this.i).a();
        uui.c(this.j).b(this.j).a();
        uui.c(this.k).b(this.k).a();
        uui.b(this.b).b(this.b).a();
        Context context2 = view.getContext();
        uuu.b(context2, this.e, R.attr.pasteTextAppearanceBodySmall);
        this.e.setTextColor(fr.c(context2, R.color.glue_row_subtitle_color));
        if (jtc.c(context)) {
            this.p = 400;
        } else {
            this.p = 160;
        }
        this.q = new tqq(context, picasso);
        this.i.setVisibility(8);
        g(false);
        h(false);
        fqf.a(this);
    }

    public final void a(OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final View getView() {
        return this.a;
    }

    public final ImageView c() {
        return this.h;
    }

    public final void a(View view) {
        this.n.a(view);
        this.n.a();
    }

    public final View a() {
        return this.n.b;
    }

    public final void b(boolean z) {
        this.n.a(z);
    }

    public final void a(boolean z) {
        this.a.setActivated(z);
    }

    public final void c(boolean z) {
        this.c.setEnabled(!z);
        this.d.setEnabled(!z);
        this.f.setEnabled(!z);
        e(!z);
        this.i.setEnabled(!z);
        this.j.setEnabled(!z);
        i(!z);
    }

    public final void a(String str) {
        this.q.a(this.h, str);
    }

    public final void d(String str) {
        String str2;
        TextView textView = this.e;
        if (str != null) {
            int length = str.length();
            int i2 = this.p;
            if (length < i2) {
                i2 = str.length();
            }
            str2 = str.substring(0, i2);
        } else {
            str2 = "";
        }
        textView.setText(str2);
    }

    public final void c(OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.e.setOnTouchListener(new $$Lambda$tqt$uPvRydT8Ny_ZzhNIm8lfe1hsu2E(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        this.b.onTouchEvent(motionEvent);
        return false;
    }

    public final void k() {
        this.e.setVisibility(0);
    }

    public final void l() {
        this.e.setVisibility(8);
    }

    public final void a(int i2) {
        this.m.setMax(i2);
    }

    public final void b(int i2) {
        this.m.setProgress(i2);
    }

    public final void g() {
        this.m.setVisibility(0);
    }

    public final void h() {
        this.m.setVisibility(8);
    }

    public final TextView b() {
        return this.c;
    }

    public final TextView d() {
        return this.d;
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void b(OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public final void d(boolean z) {
        if (z) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
    }

    public final void b(String str) {
        this.g.setContentDescription(str);
    }

    public final void a(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    public final void e(boolean z) {
        this.g.setEnabled(z);
    }

    public final void f(boolean z) {
        if (z) {
            this.l.setVisibility(0);
            this.k.setVisibility(4);
            return;
        }
        this.l.setVisibility(8);
        this.k.setVisibility(0);
    }

    public final void c(Drawable drawable) {
        this.k.setImageDrawable(drawable);
    }

    public final void e(OnClickListener onClickListener) {
        this.k.setOnClickListener(onClickListener);
    }

    public final void h(boolean z) {
        if (z) {
            this.k.setVisibility(0);
        } else {
            this.k.setVisibility(8);
        }
    }

    public final void f(String str) {
        this.k.setContentDescription(str);
    }

    public final void i(boolean z) {
        this.k.setEnabled(z);
    }

    public final LottieAnimationView m() {
        return this.o;
    }

    public final void c(String str) {
        this.f.setText(str);
    }

    public final void b(Drawable drawable) {
        this.j.setImageDrawable(drawable);
    }

    public final void g(boolean z) {
        if (z) {
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
    }

    public final void e(String str) {
        this.j.setContentDescription(str);
    }

    public final void d(OnClickListener onClickListener) {
        this.j.setOnClickListener(onClickListener);
    }

    public final void i() {
        jxb.a(this.a.getContext(), this.d, true);
    }

    public final void j() {
        jxb.a(this.a.getContext(), this.d, false);
    }

    public final void e() {
        this.d.setVisibility(0);
    }

    public final void f() {
        this.d.setVisibility(0);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.widgets.EmptyView;

/* renamed from: fut reason: default package */
final class fut implements fuj {
    /* access modifiers changed from: private */
    public final EmptyView a;
    private final a b = new a(this, 0);
    private final Button c;
    /* access modifiers changed from: private */
    public final Button d;

    /* renamed from: fut$a */
    class a extends ful {
        private a() {
        }

        /* synthetic */ a(fut fut, byte b) {
            this();
        }

        public final void a(Drawable drawable) {
            fut.this.a.a(drawable);
        }

        public final void a(boolean z) {
            fut.this.a.c.setVisibility(z ? 0 : 8);
        }

        public final void a(vsl vsl) {
            vsl.a(fut.this.a.c);
        }

        public final Button a() {
            return fut.this.d;
        }

        public final void b(boolean z) {
            fut.this.d.setVisibility(z ? 0 : 8);
        }

        public final void a(int i) {
            fut.this.a.setPadding(fut.this.a.getPaddingLeft(), i, fut.this.a.getPaddingRight(), i);
        }

        public final ImageView b() {
            return fut.this.a.c;
        }
    }

    public fut(EmptyView emptyView) {
        this.a = emptyView;
        this.a.setId(R.id.empty);
        Context context = emptyView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        this.c = fzz.f(context);
        this.c.setId(R.id.button_primary);
        this.c.setSingleLine(true);
        this.c.setEllipsize(TruncateAt.END);
        this.c.setVisibility(8);
        linearLayout.addView(this.c, new LayoutParams(-2, -2));
        this.d = fzz.g(context);
        this.d.setId(R.id.button_secondary);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TruncateAt.END);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.topMargin = uts.b(16.0f, context.getResources());
        this.d.setLayoutParams(layoutParams);
        linearLayout.addView(this.d);
        this.d.setVisibility(8);
        emptyView.d.a((View) linearLayout);
    }

    public final void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void a(int i) {
        this.a.a.setText(i);
    }

    public final TextView b() {
        return this.a.a;
    }

    public final void b(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void b(int i) {
        EmptyView emptyView = this.a;
        emptyView.b(emptyView.getContext().getString(i));
    }

    public final TextView c() {
        return this.a.b;
    }

    public final void c(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void c(int i) {
        this.c.setText(i);
    }

    public final Button V_() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final fuk a() {
        return this.b;
    }

    public final View getView() {
        return this.a;
    }
}

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

/* renamed from: fvn reason: default package */
final class fvn implements fvd {
    /* access modifiers changed from: private */
    public final EmptyView a;
    private final a b = new a(this, 0);
    private final Button c;
    /* access modifiers changed from: private */
    public final Button d;

    /* renamed from: fvn$a */
    class a extends fvf {
        private a() {
        }

        /* synthetic */ a(fvn fvn, byte b) {
            this();
        }

        public final Button a() {
            return fvn.this.d;
        }

        public final void a(int i) {
            fvn.this.a.setPadding(fvn.this.a.getPaddingLeft(), i, fvn.this.a.getPaddingRight(), i);
        }

        public final void a(Drawable drawable) {
            fvn.this.a.a(drawable);
        }

        public final void a(wgr wgr) {
            wgr.a(fvn.this.a.c);
        }

        public final void a(boolean z) {
            fvn.this.a.c.setVisibility(z ? 0 : 8);
        }

        public final ImageView b() {
            return fvn.this.a.c;
        }

        public final void b(boolean z) {
            fvn.this.d.setVisibility(z ? 0 : 8);
        }
    }

    public fvn(EmptyView emptyView) {
        this.a = emptyView;
        this.a.setId(R.id.empty);
        Context context = emptyView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        this.c = gat.f(context);
        this.c.setId(R.id.button_primary);
        this.c.setSingleLine(true);
        this.c.setEllipsize(TruncateAt.END);
        this.c.setVisibility(8);
        linearLayout.addView(this.c, new LayoutParams(-2, -2));
        this.d = gat.g(context);
        this.d.setId(R.id.button_secondary);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TruncateAt.END);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.topMargin = vfj.b(16.0f, context.getResources());
        this.d.setLayoutParams(layoutParams);
        linearLayout.addView(this.d);
        this.d.setVisibility(8);
        emptyView.d.a((View) linearLayout);
    }

    public final Button V_() {
        return this.c;
    }

    public final fve a() {
        return this.b;
    }

    public final void a(int i) {
        this.a.a.setText(i);
    }

    public final void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void a(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final TextView b() {
        return this.a.a;
    }

    public final void b(int i) {
        EmptyView emptyView = this.a;
        emptyView.b(emptyView.getContext().getString(i));
    }

    public final void b(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final TextView c() {
        return this.a.b;
    }

    public final void c(int i) {
        this.c.setText(i);
    }

    public final void c(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final View getView() {
        return this.a;
    }
}

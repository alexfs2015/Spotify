package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.ScrollView;
import com.spotify.music.R;

/* renamed from: fso reason: default package */
public final class fso extends Dialog {
    static final fsw d = new fsw() {
        public final void a() {
        }

        public final void b() {
        }
    };
    final Button a;
    final Button b;
    fsw c = d;
    private boolean e;
    private final fsq f;

    protected fso(Context context, int i, fsq fsq) {
        super(context, i);
        this.f = fsq;
        View inflate = getLayoutInflater().inflate(R.layout.glue_dialog, null);
        this.a = (Button) inflate.findViewById(R.id.button_positive);
        this.b = (Button) inflate.findViewById(R.id.button_negative);
        wld.a(this.a, null, 0);
        wld.a(this.b, null, 0);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.content);
        this.f.a(getLayoutInflater(), scrollView);
        a(scrollView, -fsq.a());
        setContentView(inflate);
    }

    public final void show() {
        super.show();
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        this.e = true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.e) {
            this.c.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
        if (!z) {
            a(this.a, getContext().getResources().getDimensionPixelSize(R.dimen.single_positive_button_margin));
        } else {
            a(this.a, getContext().getResources().getDimensionPixelSize(R.dimen.glue_dialog_button_spacing));
        }
    }

    private static void a(View view, int i) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            ((MarginLayoutParams) view.getLayoutParams()).bottomMargin = i;
        }
    }
}

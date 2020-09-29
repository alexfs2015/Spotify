package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.ScrollView;
import com.spotify.music.R;

/* renamed from: fti reason: default package */
public final class fti extends Dialog {
    static final ftq d = new ftq() {
        public final void a() {
        }

        public final void b() {
        }
    };
    final Button a;
    final Button b;
    ftq c = d;
    private boolean e;
    private final ftk f;

    protected fti(Context context, int i, ftk ftk) {
        super(context, i);
        this.f = ftk;
        View inflate = getLayoutInflater().inflate(R.layout.glue_dialog, null);
        this.a = (Button) inflate.findViewById(R.id.button_positive);
        this.b = (Button) inflate.findViewById(R.id.button_negative);
        wzj.a(this.a, null, 0);
        wzj.a(this.b, null, 0);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.content);
        this.f.a(getLayoutInflater(), scrollView);
        a(scrollView, -ftk.a());
        setContentView(inflate);
    }

    private static void a(View view, int i) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            ((MarginLayoutParams) view.getLayoutParams()).bottomMargin = i;
        }
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

    public final void onRestoreInstanceState(Bundle bundle) {
        this.e = true;
    }

    public final void show() {
        super.show();
    }
}

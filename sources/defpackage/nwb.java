package defpackage;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.R;

/* renamed from: nwb reason: default package */
public final class nwb {
    private final Context a;
    private final fvi b;

    public nwb(Context context, ViewGroup viewGroup, OnClickListener onClickListener) {
        this.a = (Context) fbp.a(context);
        fbp.a(viewGroup);
        this.b = fvm.b(context, viewGroup);
        viewGroup.addView(this.b.getView());
        this.b.getView().setVisibility(8);
        this.b.b().setVisibility(0);
        this.b.b().setTextColor(fr.c(this.a, R.color.white));
        this.b.b().setTextSize(2, 24.0f);
        this.b.b().setTypeface(this.b.b().getTypeface(), 1);
        this.b.c().setVisibility(4);
        this.b.V_().setVisibility(0);
        this.b.V_().setText(R.string.error_button_title);
        this.b.V_().setTextColor(-16777216);
        this.b.V_().setBackgroundResource(R.drawable.glue_button_primary_white);
        this.b.V_().setOnClickListener(onClickListener);
        this.b.getView().setBackgroundColor(0);
    }

    public final void a() {
        this.b.getView().setVisibility(8);
    }

    public final void a(int i, boolean z) {
        this.b.a((CharSequence) this.a.getString(i));
        int i2 = 0;
        this.b.getView().setVisibility(0);
        Button V_ = this.b.V_();
        if (!z) {
            i2 = 8;
        }
        V_.setVisibility(i2);
    }
}

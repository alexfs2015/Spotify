package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

@cfp
/* renamed from: bhu reason: default package */
public final class bhu extends FrameLayout implements OnClickListener {
    private final ImageButton a;
    private final bic b;

    public bhu(Context context, bhv bhv, bic bic) {
        super(context);
        this.b = bic;
        setOnClickListener(this);
        this.a = new ImageButton(context);
        this.a.setImageResource(17301527);
        this.a.setBackgroundColor(0);
        this.a.setOnClickListener(this);
        ImageButton imageButton = this.a;
        dqe.a();
        int a2 = cpc.a(context, bhv.a);
        dqe.a();
        int a3 = cpc.a(context, 0);
        dqe.a();
        int a4 = cpc.a(context, bhv.b);
        dqe.a();
        imageButton.setPadding(a2, a3, a4, cpc.a(context, bhv.d));
        this.a.setContentDescription("Interstitial close button");
        dqe.a();
        cpc.a(context, bhv.e);
        ImageButton imageButton2 = this.a;
        dqe.a();
        int a5 = cpc.a(context, bhv.e + bhv.a + bhv.b);
        dqe.a();
        addView(imageButton2, new LayoutParams(a5, cpc.a(context, bhv.e + bhv.d), 17));
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.a;
            i = 8;
        } else {
            imageButton = this.a;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        bic bic = this.b;
        if (bic != null) {
            bic.c();
        }
    }
}

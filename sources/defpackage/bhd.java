package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

@cey
/* renamed from: bhd reason: default package */
public final class bhd extends FrameLayout implements OnClickListener {
    private final ImageButton a;
    private final bhl b;

    public bhd(Context context, bhe bhe, bhl bhl) {
        super(context);
        this.b = bhl;
        setOnClickListener(this);
        this.a = new ImageButton(context);
        this.a.setImageResource(17301527);
        this.a.setBackgroundColor(0);
        this.a.setOnClickListener(this);
        ImageButton imageButton = this.a;
        dpn.a();
        int a2 = col.a(context, bhe.a);
        dpn.a();
        int a3 = col.a(context, 0);
        dpn.a();
        int a4 = col.a(context, bhe.b);
        dpn.a();
        imageButton.setPadding(a2, a3, a4, col.a(context, bhe.d));
        this.a.setContentDescription("Interstitial close button");
        dpn.a();
        col.a(context, bhe.e);
        ImageButton imageButton2 = this.a;
        dpn.a();
        int a5 = col.a(context, bhe.e + bhe.a + bhe.b);
        dpn.a();
        addView(imageButton2, new LayoutParams(a5, col.a(context, bhe.e + bhe.d), 17));
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
        bhl bhl = this.b;
        if (bhl != null) {
            bhl.c();
        }
    }
}

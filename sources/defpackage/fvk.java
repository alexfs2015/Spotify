package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fvk reason: default package */
public final class fvk implements fvj {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final LinearLayout d;

    public final boolean b() {
        return false;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return 0;
    }

    public fvk(View view) {
        this.a = view;
        this.b = (ImageView) view.findViewById(R.id.cover_art_image);
        this.b.setVisibility(0);
        this.c = (TextView) view.findViewById(R.id.text1);
        this.c.setVisibility(0);
        ((TextView) view.findViewById(R.id.text2)).setVisibility(0);
        this.d = (LinearLayout) view.findViewById(R.id.bottom_linear_layout);
        this.d.setVisibility(0);
    }

    public final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final ImageView a() {
        return this.b;
    }

    public final LinearLayout e() {
        return this.d;
    }

    public final View getView() {
        return this.a;
    }
}

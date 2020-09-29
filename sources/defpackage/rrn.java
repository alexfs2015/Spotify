package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

/* renamed from: rrn reason: default package */
public final class rrn implements rro {
    private final Context a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.home_tappable_header_title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.home_tappable_header_subtitle));
    private final ImageView e = ((ImageView) this.b.findViewById(R.id.home_tappable_header_image));
    private final wgj f;

    public rrn(Context context, ViewGroup viewGroup, Picasso picasso) {
        this.a = context;
        this.b = LayoutInflater.from((Context) fbp.a(context)).inflate(R.layout.home_tappable_section_header, viewGroup, false);
        this.f = new wgj(new wgu(picasso), context);
        vfz.b(this.b).b(this.e).a(this.c, this.d).a();
    }

    public final void a() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        String str = "";
        this.c.setText(str);
        this.d.setText(str);
        this.e.setImageResource(0);
    }

    public final void a(Uri uri, Drawable drawable, String str) {
        TruncateAt truncateAt;
        int i;
        this.e.setVisibility(0);
        wgr a2 = this.f.a(uri);
        if (vgi.a(this.a)) {
            i = 8388613;
            truncateAt = TruncateAt.START;
        } else {
            i = 8388611;
            truncateAt = TruncateAt.END;
        }
        this.c.setGravity(i);
        this.d.setGravity(i);
        this.c.setEllipsize(truncateAt);
        this.d.setEllipsize(truncateAt);
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1498085729) {
            if (hashCode == 1385468589 && str.equals("rounded")) {
                c2 = 0;
            }
        } else if (str.equals("circular")) {
            c2 = 1;
        }
        if (c2 == 0) {
            a2.a(drawable);
            a2.b(drawable);
            a2.a(vhj.a(this.e, vgt.a((float) getView().getResources().getDimensionPixelSize(R.dimen.episode_card_corner_radius))));
        } else if (c2 != 1) {
            a2.a(drawable);
            a2.b(drawable);
            a2.a(this.e);
        } else {
            vgr vgr = new vgr(drawable, 1.0f);
            a2.a((Drawable) vgr);
            a2.b((Drawable) vgr);
            a2.a(vhj.a(this.e));
            this.c.setGravity(1);
            this.d.setGravity(1);
        }
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
            return;
        }
        this.c.setText("");
        this.c.setVisibility(8);
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.setText(charSequence);
            this.d.setVisibility(0);
            return;
        }
        this.d.setText("");
        this.d.setVisibility(8);
    }

    public final View getView() {
        return this.b;
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.music.R;

/* renamed from: oms reason: default package */
public final class oms extends fwh {
    final FrameLayout a = ((FrameLayout) fay.a(getView().findViewById(R.id.cover_container)));
    final ImageView b = ((ImageView) getView().findViewById(R.id.cover_art_image));
    final TextView c = ((TextView) fay.a(getView().findViewById(R.id.metadata_section)));
    final TextView d = ((TextView) fay.a(getView().findViewById(R.id.description)));
    final ToggleButton e;
    final int f;
    private final TextView g = ((TextView) fay.a(getView().findViewById(R.id.full_bleed_title)));
    private final TextView h = ((TextView) fay.a(getView().findViewById(R.id.title)));
    private final TransformationSet i = fvv.a(this.b);

    public oms(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.refresh_header_content_view, viewGroup, false));
        LinearLayout linearLayout = (LinearLayout) fay.a(getView().findViewById(R.id.follow_container));
        this.f = uts.b(12.0f, context.getResources());
        this.e = fzz.h(context);
        this.e.setTextOn(context.getString(R.string.header_playlist_following));
        this.e.setTextOff(context.getString(R.string.header_playlist_follow));
        this.e.setEllipsize(TruncateAt.END);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, 0, new LayoutParams(-2, -2));
        this.d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void a(String str) {
        this.h.setText(str);
        this.h.setVisibility(fax.a(str) ? 8 : 0);
    }

    public final void b(String str) {
        this.g.setText(str);
        this.g.setVisibility(fax.a(str) ? 8 : 0);
    }

    public final void a(int i2, float f2) {
        this.i.a(f2);
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.music.R;

/* renamed from: omd reason: default package */
final class omd extends fwh {
    final int a;
    final TextView b;
    final TextView c = ((TextView) fay.a(getView().findViewById(R.id.header_description)));
    final TextView d = ((TextView) fay.a(getView().findViewById(16908309)));
    final TextView e = ((TextView) fay.a(getView().findViewById(16908308)));
    final ToggleButton f;
    final ImageView g;

    public omd(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.p2s_header_content_view, viewGroup, false));
        LinearLayout linearLayout = (LinearLayout) fay.a(getView().findViewById(R.id.follow_container));
        this.b = (TextView) linearLayout.findViewById(R.id.followers_count);
        this.f = fzz.h(context);
        this.f.setTextOn(context.getString(R.string.header_playlist_following));
        this.f.setTextOff(context.getString(R.string.header_playlist_follow));
        this.f.setEllipsize(TruncateAt.END);
        this.f.setVisibility(8);
        linearLayout.addView(this.f, 0, new LayoutParams(-2, -2));
        this.d.setVisibility(8);
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.a = uts.b(12.0f, context.getResources());
        this.g = (ImageView) getView().findViewById(R.id.cover_art_image);
    }
}

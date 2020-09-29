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
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.R;

/* renamed from: otq reason: default package */
final class otq extends fwh {
    final int a;
    final TextView b;
    final TextView c = ((TextView) fay.a(getView().findViewById(R.id.header_description)));
    final TextView d = ((TextView) fay.a(getView().findViewById(16908308)));
    final ToggleButton e;
    final ImageView f;
    final ImageView g;
    final VideoSurfaceView h;
    private final ImageView i;

    public otq(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.story_header_content_view, viewGroup, false));
        LinearLayout linearLayout = (LinearLayout) fay.a(getView().findViewById(R.id.metadata_container));
        this.b = (TextView) linearLayout.findViewById(R.id.metadata_text);
        this.e = fzz.h(context);
        this.e.setTextOn(context.getString(R.string.header_playlist_following));
        this.e.setTextOff(context.getString(R.string.header_playlist_follow));
        this.e.setEllipsize(TruncateAt.END);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, 0, new LayoutParams(-2, -2));
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.a = uts.b(12.0f, context.getResources());
        this.i = (ImageView) getView().findViewById(R.id.cover_art_image);
        this.f = (ImageView) getView().findViewById(R.id.header_profile_picture);
        this.g = (ImageView) getView().findViewById(R.id.header_profile_picture_outline_animatable);
        this.h = (VideoSurfaceView) getView().findViewById(R.id.story_thumbnail_video_view);
    }
}

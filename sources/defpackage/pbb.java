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
import com.spotify.music.features.playlistentity.story.header.PlaylistStoryHeaderAnimatedTooltip;

/* renamed from: pbb reason: default package */
final class pbb extends fxb {
    final int a;
    final TextView b;
    final TextView c = ((TextView) fbp.a(getView().findViewById(R.id.header_description)));
    final TextView d = ((TextView) fbp.a(getView().findViewById(16908308)));
    final ToggleButton e;
    final ImageView f;
    final VideoSurfaceView g;
    final PlaylistStoryHeaderAnimatedTooltip h;
    private final ImageView i;

    public pbb(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(R.layout.story_header_content_view, viewGroup, false));
        LinearLayout linearLayout = (LinearLayout) fbp.a(getView().findViewById(R.id.metadata_container));
        this.b = (TextView) linearLayout.findViewById(R.id.metadata_text);
        this.e = gat.h(context);
        this.e.setTextOn(context.getString(R.string.header_playlist_following));
        this.e.setTextOff(context.getString(R.string.header_playlist_follow));
        this.e.setEllipsize(TruncateAt.END);
        this.e.setVisibility(8);
        linearLayout.addView(this.e, 0, new LayoutParams(-2, -2));
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.a = vfj.b(12.0f, context.getResources());
        this.i = (ImageView) getView().findViewById(R.id.cover_art_image);
        this.f = (ImageView) getView().findViewById(R.id.header_profile_picture);
        this.g = (VideoSurfaceView) getView().findViewById(R.id.story_thumbnail_video_view);
        this.h = (PlaylistStoryHeaderAnimatedTooltip) getView().findViewById(R.id.header_tooltip);
    }
}

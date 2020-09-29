package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: mdr reason: default package */
public final class mdr {
    public static View a(Context context, fpt fpt, spi spi, OnClickListener onClickListener) {
        $$Lambda$mdr$ovpjcJWj1Sa98H91gaKuB68Kr78 r6 = new $$Lambda$mdr$ovpjcJWj1Sa98H91gaKuB68Kr78(spi);
        boolean z = true;
        if (((Integer) fpt.a(nrn.a)).intValue() != 1) {
            z = false;
        }
        if (z) {
            return a(context, R.string.placeholder_collection_empty_title_songs, -1, R.string.placeholder_collection_empty_browse_music_button, R.string.placeholder_collection_empty_import_music_button, a(context, SpotifyIcon.TRACK_32), r6, onClickListener);
        }
        return a(context, R.string.placeholder_collection_empty_title_songs, -1, R.string.placeholder_collection_empty_browse_music_button, a(context, SpotifyIcon.TRACK_32), r6);
    }

    public static View a(Context context, int i, int i2, SpotifyIconDrawable spotifyIconDrawable, spi spi) {
        return a(context, i, -1, R.string.placeholder_collection_empty_browse_music_button, spotifyIconDrawable, new $$Lambda$mdr$k0M6Q4Y1x117Q_lESBD0JKjYULU(spi));
    }

    private static View a(Context context, int i, int i2, int i3, SpotifyIconDrawable spotifyIconDrawable, OnClickListener onClickListener) {
        return a(context, i, i2, i3, 0, spotifyIconDrawable, onClickListener, null);
    }

    private static View a(Context context, int i, int i2, int i3, int i4, SpotifyIconDrawable spotifyIconDrawable, OnClickListener onClickListener, OnClickListener onClickListener2) {
        fqb.f();
        fuj a = fum.a(context, null);
        a.getView().setId(R.id.empty);
        a(a.b(), a.c());
        a.a((CharSequence) context.getString(i));
        if (i2 != -1) {
            a.b((CharSequence) context.getString(i2));
        }
        if (jtc.b(context) || spotifyIconDrawable == null) {
            a.a().a(uts.b(16.0f, context.getResources()));
        } else {
            a.a().a((Drawable) spotifyIconDrawable);
        }
        a.a(false);
        a.a().b(false);
        if (onClickListener != null) {
            a.a(true);
            Button V_ = a.V_();
            V_.setId(R.id.button_primary);
            V_.setText(i3);
            V_.setOnClickListener(onClickListener);
        }
        if (onClickListener2 != null) {
            a.a().b(true);
            Button a2 = a.a().a();
            a2.setId(R.id.button_secondary);
            a2.setText(i4);
            a2.setOnClickListener(onClickListener2);
        }
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LayoutParams(-1, -1));
        scrollView.addView(a.getView());
        scrollView.setFillViewport(true);
        return scrollView;
    }

    public static fuj a(Context context, String str) {
        fqb.f();
        fuj a = fum.a(context, null);
        a.a(false);
        a(a.b(), a.c());
        a.a((CharSequence) context.getString(R.string.placeholder_no_result_title, new Object[]{str}));
        a.b((CharSequence) context.getString(R.string.placeholder_no_result_body));
        a.a().a((Drawable) a(context, SpotifyIcon.FLAG_32));
        return a;
    }

    public static View a(Context context, fpt fpt, OnClickListener onClickListener, nrl nrl) {
        View a = a(context, onClickListener, (OnClickListener) new $$Lambda$mdr$r6fw1GKyB9PVVPha7YIIP9OLZic(nrl, fpt), (int) R.string.placeholder_collection_no_local_files_content_button);
        ((fuj) fqb.a(a.findViewById(R.id.empty), fuj.class)).b((CharSequence) context.getString(R.string.placeholder_collection_no_local_files_content_body));
        return a;
    }

    public static View a(Context context, OnClickListener onClickListener, OnClickListener onClickListener2, int i) {
        fqb.f();
        fuj a = fum.a(context, null);
        a.a((CharSequence) context.getString(R.string.placeholder_collection_no_content_title));
        a.getView().setId(R.id.empty);
        a(a.b(), a.c());
        if (jtc.b(context)) {
            a.a().a(uts.b(16.0f, context.getResources()));
        } else {
            a.a().a((Drawable) a(context, SpotifyIcon.FLAG_32));
        }
        Button V_ = a.V_();
        V_.setId(R.id.button_primary);
        V_.setText(R.string.placeholder_collection_no_content_button);
        V_.setOnClickListener(onClickListener);
        a.a(true);
        if (onClickListener2 != null) {
            a.a().b(true);
            Button a2 = a.a().a();
            a2.setId(R.id.button_secondary);
            a2.setText(i);
            a2.setOnClickListener(onClickListener2);
        } else {
            a.a().b(false);
        }
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(a.getView());
        scrollView.setFillViewport(true);
        return scrollView;
    }

    public static SpotifyIconDrawable a(Context context, SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIcon, (float) context.getResources().getDimensionPixelSize(R.dimen.empty_view_icon_size));
        spotifyIconDrawable.a(uuu.b(context, R.attr.pasteColorPlaceholder));
        return spotifyIconDrawable;
    }

    private static void a(TextView textView, TextView textView2) {
        textView.setSingleLine(false);
        textView.setEllipsize(null);
        textView2.setSingleLine(false);
        textView2.setEllipsize(null);
    }
}

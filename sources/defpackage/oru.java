package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.a;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.features.playlistentity.empty.EmptyPlaylistView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: oru reason: default package */
final class oru implements ors, ort {
    private static final int a;
    private static final int b;
    private final orp c;
    private final Context d;
    private final Picasso e;
    private vhx f;
    private EmptyPlaylistView g;
    private fvd h;
    private fvd i;

    static {
        Class<oru> cls = oru.class;
        a = cls.hashCode();
        b = cls.hashCode() + 1;
    }

    public oru(Context context, Picasso picasso, orq orq, ooe ooe) {
        orp orp = new orp((opw) orq.a(orq.a.get(), 1), (orl) orq.a(orq.b.get(), 2), (hec) orq.a(orq.c.get(), 3), (szp) orq.a(orq.d.get(), 4), (String) orq.a(orq.e.get(), 5), (Scheduler) orq.a(orq.f.get(), 6), (ooe) orq.a(ooe, 7));
        this.c = orp;
        this.d = context;
        this.e = picasso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        orp orp = this.c;
        orp.b.b();
        orp.d.a("spotify:home");
    }

    private void a(TextView textView, Button button) {
        textView.setText(this.d.getString(R.string.playlist_add_songs_description));
        button.setText(this.d.getString(R.string.playlist_add_songs_button));
        button.setOnClickListener(new $$Lambda$oru$6jtul3pqfqE9Sv5iPfbDS7Djc(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        orp orp = this.c;
        orp.b.a();
        orp.c.a(orp.e);
    }

    public final Completable a() {
        return this.c.f;
    }

    public final List<View> a(ViewGroup viewGroup, vhx vhx) {
        this.f = vhx;
        fqv.f();
        this.h = fvg.a(this.d, viewGroup);
        this.h.a(true);
        this.h.b().setSingleLine(false);
        this.h.b().setEllipsize(null);
        a(this.h.b(), this.h.V_());
        this.f.a((a<H>) new jog<H>(this.h.getView(), false), b);
        this.f.a(false, b);
        this.g = new EmptyPlaylistView(this.d);
        this.g.setVisibility(8);
        fqv.f();
        this.i = fvg.a(this.d, viewGroup);
        this.i.a(false);
        this.i.b().setSingleLine(false);
        this.i.b().setEllipsize(null);
        this.i.c().setSingleLine(false);
        this.i.c().setEllipsize(null);
        this.i.b((CharSequence) this.d.getString(R.string.placeholder_no_result_body));
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.d, SpotifyIconV2.FLAG, (float) this.d.getResources().getDimensionPixelSize(R.dimen.empty_view_icon_size));
        spotifyIconDrawable.a(vgl.b(this.d, R.attr.pasteColorPlaceholder));
        this.i.a().a((Drawable) spotifyIconDrawable);
        this.f.a((a<H>) new jog<H>(this.i.getView(), false), a);
        this.f.a(false, a);
        return ImmutableList.a(this.g);
    }

    public final void a(Bundle bundle) {
    }

    public final void a(String str) {
        this.i.a((CharSequence) this.d.getString(R.string.placeholder_no_result_title, new Object[]{str}));
    }

    public final void a(String str, String str2) {
        this.g.b.setText(str);
        if (str2 != null) {
            EmptyPlaylistView emptyPlaylistView = this.g;
            emptyPlaylistView.c.setText(this.d.getString(R.string.playlist_subtitle, new Object[]{str2}));
        }
    }

    public final void a(a aVar) {
        this.c.a(aVar);
    }

    public final void a(boolean z) {
        if (z) {
            this.f.a(true, a);
            return;
        }
        this.f.a(false, a);
    }

    public final void ay_() {
        this.c.a((ort) this);
    }

    public final void b(Bundle bundle) {
    }

    public final void b(String str) {
        ImageView imageView = (ImageView) fbp.a(this.g.a);
        this.e.a(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY).a(imageView.getDrawable()).a((int) R.dimen.playlist_header_image_size, (int) R.dimen.playlist_header_image_size).d().b(gaa.e(this.d)).a(imageView);
    }

    public final void b(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void c() {
        this.c.a((ort) null);
    }

    public final void c(boolean z) {
        if (z) {
            this.f.a(true, b);
            return;
        }
        this.f.a(false, b);
    }

    public final void d() {
        this.c.a.c();
    }

    public final void d(boolean z) {
        if (z) {
            a(this.g.d, this.g.e);
            return;
        }
        TextView textView = this.g.d;
        Button button = this.g.e;
        textView.setText(this.d.getString(R.string.playlist_empty_view_others_playlist_description));
        button.setText(this.d.getString(R.string.playlist_empty_view_others_playlist_button));
        button.setOnClickListener(new $$Lambda$oru$qaKCFjAhvuNlbnhKuvZbWsi_X1M(this));
    }
}

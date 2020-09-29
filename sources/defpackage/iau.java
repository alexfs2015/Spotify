package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: iau reason: default package */
public final class iau extends androidx.recyclerview.widget.RecyclerView.a<a> {
    private final LayoutInflater a;
    private final iay d;

    /* renamed from: iau$a */
    static class a extends u {
        private final View a;
        private final TextView b;
        private final ImageView c;
        private final iay d;

        a(View view, iay iay) {
            super(view);
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.optout_artist_text);
            this.c = (ImageView) view.findViewById(R.id.optout_artist_ban);
            this.d = iay;
        }

        /* access modifiers changed from: 0000 */
        public final void c(int i) {
            String str;
            TextView textView = this.b;
            iay iay = this.d;
            if (i == 0) {
                str = iay.e.a(R.string.marquee_optout_menu_optout_artist);
            } else if (i == 1) {
                str = iay.e.a(R.string.marquee_optout_menu_optout_altogether);
            } else {
                throw new IllegalArgumentException("unsupported view type");
            }
            textView.setText(str);
            ImageView imageView = this.c;
            iay iay2 = this.d;
            imageView.setImageDrawable(new SpotifyIconDrawable((Context) iay2.d.get(), SpotifyIconV2.BAN, ((ka) iay2.d.get()).getResources().getDimension(R.dimen.ban_icon_size)));
            this.a.setOnClickListener(new $$Lambda$iau$a$ff83Gmf1GC0XPqUv9aw4f6HUm0c(this, i));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i, View view) {
            iay iay = this.d;
            if (i == 0) {
                iay.a.a("optout_artist", "", iay.b, iay.c);
                iay.f.ai();
                iay.f.d(R.string.marquee_optout_artist_notification_text);
            } else if (i == 1) {
                iay.f.ah();
            } else {
                throw new IllegalArgumentException("unsupported view type");
            }
        }
    }

    public final int b() {
        return 2;
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) uVar).c(i);
    }

    public iau(LayoutInflater layoutInflater, iay iay) {
        this.a = layoutInflater;
        this.d = iay;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a((RelativeLayout) this.a.inflate(R.layout.optout_menu_item, viewGroup, false), this.d);
    }
}

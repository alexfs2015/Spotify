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

/* renamed from: idg reason: default package */
public final class idg extends androidx.recyclerview.widget.RecyclerView.a<a> {
    private final LayoutInflater a;
    private final idk d;

    /* renamed from: idg$a */
    static class a extends u {
        private final View a;
        private final TextView b;
        private final ImageView c;
        private final idk d;

        a(View view, idk idk) {
            super(view);
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.optout_artist_text);
            this.c = (ImageView) view.findViewById(R.id.optout_artist_ban);
            this.d = idk;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i, View view) {
            idk idk = this.d;
            if (i == 0) {
                idk.a.a("optout_artist", "", idk.b, idk.c);
                idk.f.ai();
                idk.f.d(R.string.marquee_optout_artist_notification_text);
            } else if (i == 1) {
                idk.f.ah();
            } else {
                throw new IllegalArgumentException("unsupported view type");
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c(int i) {
            String str;
            TextView textView = this.b;
            idk idk = this.d;
            if (i == 0) {
                str = idk.e.a(R.string.marquee_optout_menu_optout_artist);
            } else if (i == 1) {
                str = idk.e.a(R.string.marquee_optout_menu_optout_altogether);
            } else {
                throw new IllegalArgumentException("unsupported view type");
            }
            textView.setText(str);
            ImageView imageView = this.c;
            idk idk2 = this.d;
            imageView.setImageDrawable(new SpotifyIconDrawable((Context) idk2.d.get(), SpotifyIconV2.BAN, ((kf) idk2.d.get()).getResources().getDimension(R.dimen.ban_icon_size)));
            this.a.setOnClickListener(new $$Lambda$idg$a$0TLb1rXhZQKiNt4rbkCANppK9W8(this, i));
        }
    }

    public idg(LayoutInflater layoutInflater, idk idk) {
        this.a = layoutInflater;
        this.d = idk;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a((RelativeLayout) this.a.inflate(R.layout.optout_menu_item, viewGroup, false), this.d);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        ((a) uVar).c(i);
    }

    public final int b() {
        return 2;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rik reason: default package */
public final class rik {
    public final Context a;
    final float b = (((float) this.c) / ((float) vfj.b(24.0f, this.a.getResources())));
    final int c = vfj.b(16.0f, this.a.getResources());

    /* renamed from: rik$a */
    public static class a implements rij {
        private final View a;
        private final TextView b;
        private final Button c;

        public a(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (Button) view.findViewById(R.id.button);
        }

        public final TextView a() {
            return this.b;
        }

        public final Button b() {
            return this.c;
        }

        public final View getView() {
            return this.a;
        }
    }

    /* renamed from: rik$b */
    public class b implements rjg {
        private final View a;
        private final TextView b;
        private final TextView c;
        private final ImageButton d;

        public b(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.subtitle);
            this.d = (ImageButton) view.findViewById(R.id.collapse_button);
        }

        public final void a(String str) {
            this.b.setText(str);
        }

        public final void a(defpackage.rjg.a aVar) {
            this.d.setOnClickListener(new $$Lambda$rik$b$eh6KVlO7Srhct66olAEoV47RWp4(aVar));
        }

        public final void a(boolean z) {
            ImageButton imageButton = this.d;
            Context context = rik.this.a;
            SpotifyIconV2 spotifyIconV2 = z ? SpotifyIconV2.CHART_DOWN : SpotifyIconV2.CHART_UP;
            float f = (float) rik.this.c;
            float f2 = rik.this.b;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
            spotifyIconDrawable.a(context.getResources().getColor(R.color.white_70));
            imageButton.setImageDrawable(new LayerDrawable(new Drawable[]{context.getResources().getDrawable(R.drawable.section_header_collapse_button_bg), new vgu(spotifyIconDrawable, f2)}));
        }

        public final void b(String str) {
            this.c.setText(str);
        }

        public final void b(boolean z) {
            this.d.setVisibility(z ? 0 : 8);
        }

        public final View getView() {
            return this.a;
        }
    }

    /* renamed from: rik$c */
    public static class c implements rjh {
        private final View a;
        private final TextView b;
        private final TextView c;

        public c(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.action);
        }

        public final TextView a() {
            return this.c;
        }

        public final void a(String str) {
            this.b.setText(str);
        }

        public final View getView() {
            return this.a;
        }
    }

    public rik(Context context) {
        this.a = context;
    }
}

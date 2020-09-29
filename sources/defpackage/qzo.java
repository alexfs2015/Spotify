package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: qzo reason: default package */
public final class qzo {
    public final Context a;
    final float b = (((float) this.c) / ((float) uts.b(24.0f, this.a.getResources())));
    final int c = uts.b(16.0f, this.a.getResources());
    public final Typeface d;

    /* renamed from: qzo$a */
    public static class a implements qzn {
        private final View a;
        private final TextView b;
        private final Button c;

        public a(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (Button) view.findViewById(R.id.button);
        }

        public final View getView() {
            return this.a;
        }

        public final TextView a() {
            return this.b;
        }

        public final Button b() {
            return this.c;
        }
    }

    /* renamed from: qzo$b */
    public class b implements rak {
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

        public final void b(String str) {
            this.c.setText(str);
        }

        public final View getView() {
            return this.a;
        }

        public final void a(boolean z) {
            SpotifyIconV2 spotifyIconV2;
            ImageButton imageButton = this.d;
            Context context = qzo.this.a;
            if (z) {
                spotifyIconV2 = SpotifyIconV2.CHART_DOWN;
            } else {
                spotifyIconV2 = SpotifyIconV2.CHART_UP;
            }
            float f = (float) qzo.this.c;
            float f2 = qzo.this.b;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
            spotifyIconDrawable.a(context.getResources().getColor(R.color.white_70));
            imageButton.setImageDrawable(new LayerDrawable(new Drawable[]{context.getResources().getDrawable(R.drawable.section_header_collapse_button_bg), new uvd(spotifyIconDrawable, f2)}));
        }

        public final void b(boolean z) {
            this.d.setVisibility(z ? 0 : 8);
        }

        public final void a(defpackage.rak.a aVar) {
            this.d.setOnClickListener(new $$Lambda$qzo$b$0DgVTFJKesYUaHwMP_ie1lTldUo(aVar));
        }
    }

    /* renamed from: qzo$c */
    public static class c implements ral {
        private final View a;
        private final TextView b;
        private final TextView c;

        public c(View view) {
            this.a = view;
            this.b = (TextView) view.findViewById(R.id.title);
            this.c = (TextView) view.findViewById(R.id.action);
        }

        public final View getView() {
            return this.a;
        }

        public final void a(String str) {
            this.b.setText(str);
        }

        public final TextView a() {
            return this.c;
        }
    }

    public qzo(Context context) {
        this.a = context;
        this.d = utw.a(context, 2132017666);
    }
}

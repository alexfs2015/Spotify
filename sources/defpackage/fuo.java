package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;

/* renamed from: fuo reason: default package */
public final class fuo implements fup {
    final Context a;
    final Picasso b;
    final View c;
    final ImageView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final TextView h;
    final TextView i;
    private final int j;
    private final OnGlobalLayoutListener k = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            fuo.this.c();
        }
    };
    private final OnClickListener l = new OnClickListener() {
        public final void onClick(View view) {
            fuo.this.h.setMaxLines(Integer.MAX_VALUE);
            fuo.this.i.setVisibility(8);
        }
    };

    public fuo(Context context, Picasso picasso, String str) {
        this.a = context;
        this.b = picasso;
        this.c = LayoutInflater.from(context).inflate(R.layout.glue_context_menu_header, null);
        this.d = (ImageView) this.c.findViewById(R.id.image);
        this.e = (TextView) this.c.findViewById(R.id.title);
        this.f = (TextView) this.c.findViewById(R.id.subtitle);
        this.g = (TextView) this.c.findViewById(R.id.description_header);
        this.h = (TextView) this.c.findViewById(R.id.description);
        this.i = (TextView) this.c.findViewById(R.id.description_show_more);
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(this.k);
        this.i.setCompoundDrawablesWithIntrinsicBounds(null, null, new SpotifyIconDrawable(context, SpotifyIcon.CHEVRON_DOWN_16, (float) context.getResources().getDimensionPixelSize(R.dimen.context_menu_description_show_more_drawable_size)), null);
        this.i.setText(str);
        this.j = context.getResources().getInteger(R.integer.context_menu_description_max_lines);
    }

    public final View a() {
        return this.c;
    }

    public final int b() {
        return this.c.getTop() + this.d.getTop() + (this.d.getHeight() / 2);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        TextView textView = this.h;
        if (textView != null) {
            Layout layout = textView.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                boolean z = true;
                int i2 = 0;
                if (lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
                    z = false;
                }
                TextView textView2 = this.i;
                if (!z) {
                    i2 = 8;
                }
                textView2.setVisibility(i2);
                OnClickListener onClickListener = null;
                this.i.setOnClickListener(z ? this.l : null);
                TextView textView3 = this.h;
                if (z) {
                    onClickListener = this.l;
                }
                textView3.setOnClickListener(onClickListener);
                if (z) {
                    this.h.setMaxLines(this.j);
                }
            }
        }
    }
}

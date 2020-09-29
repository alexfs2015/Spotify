package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: joe reason: default package */
public final class joe {
    private static final OnClickListener a = new a(0);

    /* renamed from: joe$a */
    static class a implements OnClickListener {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onClick(View view) {
            view.showContextMenu();
        }
    }

    public static View a(Context context) {
        ImageButton b = jwz.b(context, SpotifyIconV2.MORE_ANDROID);
        b.setContentDescription(context.getString(R.string.content_description_show_context_menu));
        b.setOnClickListener(a);
        return b;
    }

    public static <T> View a(final Context context, final jmf<T> jmf, final T t, final sih sih) {
        ImageButton b = jwz.b(context, SpotifyIconV2.MORE_ANDROID);
        b.setContentDescription(context.getString(R.string.content_description_show_context_menu));
        b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                jly.a(context, jmf, t, sih);
            }
        });
        return b;
    }

    public static <T> View a(final Context context, Drawable drawable, final jmf<T> jmf, final T t, final sih sih) {
        ImageButton a2 = jwz.a(context, drawable);
        a2.setContentDescription(context.getString(R.string.content_description_show_context_menu));
        a2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                jly.a(context, jmf, t, sih);
            }
        });
        return a2;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: jqq reason: default package */
public final class jqq {
    private static final OnClickListener a = new a(0);

    /* renamed from: jqq$a */
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
        ImageButton b = jyz.b(context, SpotifyIconV2.MORE_ANDROID);
        b.setContentDescription(context.getString(R.string.content_description_show_context_menu));
        b.setOnClickListener(a);
        return b;
    }

    public static <T> View a(final Context context, Drawable drawable, final jor<T> jor, final T t, final sso sso) {
        ImageButton a2 = jyz.a(context, drawable);
        a2.setContentDescription(context.getString(R.string.content_description_show_context_menu));
        a2.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                jok.a(context, jor, t, sso);
            }
        });
        return a2;
    }

    public static <T> View a(final Context context, final jor<T> jor, final T t, final sso sso) {
        ImageButton b = jyz.b(context, SpotifyIconV2.MORE_ANDROID);
        b.setContentDescription(context.getString(R.string.content_description_show_context_menu));
        b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                jok.a(context, jor, t, sso);
            }
        });
        return b;
    }
}

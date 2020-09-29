package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.app.PasteViewFactories;
import com.spotify.android.paste.app.PasteViewFactories.ViewFactory;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: fzz reason: default package */
public final class fzz {
    private static final a a = new a(0);

    /* renamed from: fzz$a */
    public static final class a {
        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }

        public static Button a(Context context) {
            return (Button) fzz.a(context, Button.class, null, R.attr.solarButtonPrimaryGreen);
        }

        public static Button b(Context context) {
            return (Button) fzz.a(context, Button.class, null, R.attr.solarButtonPrimaryWhite);
        }

        public static Button c(Context context) {
            return (Button) fzz.a(context, Button.class, null, R.attr.solarButtonTertiaryOutlined);
        }
    }

    public static <T extends View> T a(Context context, Class<T> cls, AttributeSet attributeSet, int i) {
        ViewFactory a2 = PasteViewFactories.a(cls);
        fay.a(a2);
        if (i == 0) {
            i = a2.a();
        }
        T a3 = a2.a(context, null, i);
        if (a3 instanceof TextView) {
            fzv.a((TextView) a3, context, null, i);
        }
        return a3;
    }

    public static TextView a(Context context) {
        return (TextView) a(context, TextView.class, null, 0);
    }

    public static Button b(Context context) {
        return (Button) a(context, Button.class, null, R.attr.pasteButtonStyleSmall);
    }

    public static Button c(Context context) {
        return (Button) a(context, Button.class, null, R.attr.pasteButtonStylePrimary);
    }

    public static Button d(Context context) {
        return (Button) a(context, Button.class, null, R.attr.pasteButtonStylePrimarySmall);
    }

    public static Button e(Context context) {
        return (Button) a(context, Button.class, null, R.attr.pasteButtonStyleInfo);
    }

    public static Button f(Context context) {
        return (Button) a(context, Button.class, null, R.attr.glueButtonPrimaryWhite);
    }

    public static Button g(Context context) {
        return (Button) a(context, Button.class, null, R.attr.pasteButtonStyleSecondary);
    }

    public static ToggleButton h(Context context) {
        return (ToggleButton) a(context, ToggleButton.class, null, R.attr.pasteButtonStyleSmall);
    }

    public static SpotifyIconView i(Context context) {
        return (SpotifyIconView) a(context, SpotifyIconView.class, null, R.attr.pasteSpotifyIconStyleAccessory);
    }

    public static a a() {
        return a;
    }
}

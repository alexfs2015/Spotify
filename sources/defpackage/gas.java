package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.spotify.music.R;

/* renamed from: gas reason: default package */
public final class gas {
    public static LayoutParams a(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(R.layout.paste_wrap_content);
        do {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }

    public static LayoutParams b(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(R.layout.paste_match_parent_width);
        do {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }

    public static LayoutParams c(Context context, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        XmlResourceParser layout = context.getResources().getLayout(R.layout.paste_match_parent_width_and_height);
        do {
            try {
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } while (layout.nextToken() != 2);
        return viewGroup.generateLayoutParams(layout);
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.app.PasteViewFactories;
import com.spotify.android.paste.app.PasteViewFactories.ViewFactory;

/* renamed from: fzx reason: default package */
public final class fzx implements Factory {
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        ViewFactory a = PasteViewFactories.a(str);
        if (a != null) {
            View a2 = a.a(context, attributeSet, a.a());
            int a3 = a.a();
            if (a2 instanceof TextView) {
                fzv.a((TextView) a2, context, attributeSet, a3);
            }
            return a2;
        } else if (!"fragment".equals(str)) {
            return null;
        } else {
            throw new IllegalArgumentException("<fragment> tags are not supported when FontSupport is in use.");
        }
    }

    public static void a(Activity activity) {
        if (activity.getLayoutInflater().getFactory() == null) {
            activity.getLayoutInflater().setFactory(new fzx());
        }
    }
}

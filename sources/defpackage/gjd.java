package defpackage;

import android.view.View;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.music.R;

@Deprecated
/* renamed from: gjd reason: default package */
public final class gjd {
    public static void a(View view, gje gje, InteractionIntent interactionIntent) {
        String str;
        fay.a(view);
        String str2 = null;
        if (gje != null) {
            str = gje.a();
        } else {
            str = null;
        }
        if (interactionIntent != null) {
            str2 = interactionIntent.mInteractionIntent;
        }
        a(view, str, str2);
    }

    public static void a(View view, String str, String str2) {
        fay.a(view);
        view.setTag(R.id.instrumentation_component_item_id, str);
        view.setTag(R.id.instrumentation_component_intent, str2);
    }

    public static void a(View view, String str) {
        fay.a(view);
        if (str != null) {
            fay.a(str);
        } else {
            str = null;
        }
        view.setTag(R.id.instrumentation_component_item_id, str);
    }

    public static String a(View view) {
        fay.a(view);
        return (String) view.getTag(R.id.instrumentation_component_item_id);
    }

    public static String b(View view) {
        fay.a(view);
        return (String) view.getTag(R.id.instrumentation_component_intent);
    }

    public static boolean c(View view) {
        return (a(view) == null && b(view) == null) ? false : true;
    }
}

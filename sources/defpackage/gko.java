package defpackage;

import android.view.View;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.music.R;

@Deprecated
/* renamed from: gko reason: default package */
public final class gko {
    public static String a(View view) {
        fbp.a(view);
        return (String) view.getTag(R.id.instrumentation_component_item_id);
    }

    public static void a(View view, gkp gkp, InteractionIntent interactionIntent) {
        fbp.a(view);
        String str = null;
        String a = gkp != null ? gkp.a() : null;
        if (interactionIntent != null) {
            str = interactionIntent.mInteractionIntent;
        }
        a(view, a, str);
    }

    public static void a(View view, String str) {
        fbp.a(view);
        if (str != null) {
            fbp.a(str);
        } else {
            str = null;
        }
        view.setTag(R.id.instrumentation_component_item_id, str);
    }

    public static void a(View view, String str, String str2) {
        fbp.a(view);
        view.setTag(R.id.instrumentation_component_item_id, str);
        view.setTag(R.id.instrumentation_component_intent, str2);
    }

    public static String b(View view) {
        fbp.a(view);
        return (String) view.getTag(R.id.instrumentation_component_intent);
    }

    public static boolean c(View view) {
        return (a(view) == null && b(view) == null) ? false : true;
    }
}

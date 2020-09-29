package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import com.spotify.music.R;

/* renamed from: eyg reason: default package */
public final class eyg extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new eyg("childrenAlpha");

    public final /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }

    private eyg(String str) {
        super(Float.class, str);
    }
}

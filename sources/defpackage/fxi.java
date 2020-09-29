package defpackage;

import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fxi reason: default package */
public final class fxi {

    /* renamed from: fxi$a */
    static class a implements fxl {
        private final View a;
        private final List<Property<View, Float>> b = new ArrayList();

        public a(View view, List<Property<View, Float>> list) {
            this.a = view;
            this.b.addAll(list);
        }

        public final void a(float f) {
            for (Property property : this.b) {
                property.set(this.a, Float.valueOf(f));
            }
        }
    }

    public static fxl a(View view, Property<View, Float> property) {
        return new a(view, Collections.singletonList(property));
    }

    public static fxl a(View view, List<Property<View, Float>> list) {
        return new a(view, list);
    }
}

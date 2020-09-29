package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: fxd reason: default package */
final class fxd implements fxc {
    private final Set<View> a = new HashSet(1);
    private final List<fvz> b = new ArrayList(1);
    private final LinearLayout c;
    private final TransformationSet d;

    fxd(Context context, ViewGroup viewGroup) {
        this.c = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.glue_header_view_binder_content_set, viewGroup, false);
        this.d = fwp.a(this.c);
    }

    public final List<fvz> a() {
        return Collections.unmodifiableList(this.b);
    }

    public final void a(int i, float f) {
        this.d.a(f);
    }

    public final void a(fvz fvz) {
        View view = fvz.getView();
        this.a.add(view);
        this.b.add(fvz);
        this.c.addView(view, -1, new LayoutParams(-1, -2));
    }

    public final void b() {
        for (fvz fvz : this.b) {
            if (fvz.b()) {
                this.c.setPivotX((float) fvz.c());
                this.c.setPivotY((float) fvz.d());
                return;
            }
        }
    }

    public final View getView() {
        return this.c;
    }
}

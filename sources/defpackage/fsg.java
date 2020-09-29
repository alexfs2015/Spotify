package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import java.util.Collection;
import java.util.Map;

/* renamed from: fsg reason: default package */
public final class fsg implements fse {
    private final GlueToolbarLayout a;
    private final TextView b = this.a.c;
    private ColorDrawable c;
    private boolean d;

    public fsg(GlueToolbarLayout glueToolbarLayout) {
        this.a = glueToolbarLayout;
    }

    public final void a(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void a(float f) {
        this.b.setAlpha(f);
    }

    public final void a(ToolbarSide toolbarSide, float f) {
        Collection<View> collection;
        GlueToolbarLayout glueToolbarLayout = this.a;
        if (toolbarSide == ToolbarSide.START) {
            collection = glueToolbarLayout.a.values();
        } else {
            collection = glueToolbarLayout.b.values();
        }
        for (View view : collection) {
            view.setAlpha(f);
            view.setVisibility(f == 0.0f ? 4 : 0);
        }
    }

    public final void a(ToolbarSide toolbarSide, View view, int i) {
        this.a.a(toolbarSide, view, i);
    }

    public final View a(int i) {
        GlueToolbarLayout glueToolbarLayout = this.a;
        return (View) jtc.a(glueToolbarLayout.a.get(Integer.valueOf(i)), glueToolbarLayout.b.get(Integer.valueOf(i)));
    }

    public final void b(int i) {
        this.c = new ColorDrawable(i);
        ip.a((View) this.a, (Drawable) this.c);
    }

    public final void a(boolean z) {
        this.d = false;
        ip.a((View) this.a, (Drawable) this.c);
    }

    public final void a(MenuItem menuItem) {
        GlueToolbarLayout glueToolbarLayout = this.a;
        if (glueToolbarLayout.e == null) {
            glueToolbarLayout.a();
        }
        glueToolbarLayout.d.b.add(menuItem);
    }

    public final void a(ToolbarSide toolbarSide) {
        GlueToolbarLayout glueToolbarLayout = this.a;
        Map<Integer, View> map = toolbarSide == ToolbarSide.START ? glueToolbarLayout.a : glueToolbarLayout.b;
        for (View removeView : map.values()) {
            glueToolbarLayout.removeView(removeView);
        }
        glueToolbarLayout.e = null;
        fsh fsh = glueToolbarLayout.d;
        fsh.c = null;
        fsh.b.clear();
        map.clear();
    }

    public final View getView() {
        return this.a;
    }
}

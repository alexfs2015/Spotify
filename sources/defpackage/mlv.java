package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;
import com.spotify.paste.widgets.internal.PasteLinearLayout;

/* renamed from: mlv reason: default package */
public class mlv implements fqe {
    public final mlw a;
    private final PasteLinearLayout b;
    private final PasteLinearLayout c;
    private final View d;

    public mlv(Context context, ViewGroup viewGroup, mlx mlx) {
        Drawable a2 = uuu.a(context, (int) R.attr.pasteListDivider);
        this.b = new PasteLinearLayout(context);
        this.b.setLayoutParams(new LayoutParams(-1, -1));
        this.b.setOrientation(1);
        this.b.setDividerDrawable(a2);
        this.b.setShowDividers(2);
        this.c = new PasteLinearLayout(context);
        this.c.setLayoutParams(new LayoutParams(-1, -2));
        this.c.setOrientation(1);
        this.c.setDividerDrawable(a2);
        this.c.setShowDividers(2);
        PasteLinearLayout pasteLinearLayout = this.b;
        frq frq = mlx.a;
        this.a = new mlw(frq.a(context, (ViewGroup) pasteLinearLayout, false));
        fsa d2 = fqb.e().d(context, viewGroup);
        d2.a((CharSequence) context.getString(R.string.data_saver_mode_settings_description_title));
        d2.b(context.getString(R.string.data_saver_mode_settings_description_body));
        d2.c().setMaxLines(Integer.MAX_VALUE);
        d2.c().setEllipsize(null);
        this.d = d2.getView();
        fqb.e().d(context, viewGroup);
        mlw mlw = this.a;
        mlw.c = context.getString(R.string.data_saver_mode_settings_enabled);
        mlw.a(mlw.a.isChecked());
        mlw mlw2 = this.a;
        mlw2.d = context.getString(R.string.data_saver_mode_settings_disabled);
        mlw2.a(mlw2.a.isChecked());
        mlw mlw3 = this.a;
        mlw3.e = context.getString(R.string.data_saver_mode_settings_enabled_subtitle);
        mlw3.a(mlw3.a.isChecked());
        mlw mlw4 = this.a;
        mlw4.a(mlw4.a.isChecked());
        this.b.addView(this.a.getView());
        this.b.addView(this.c);
        this.b.addView(this.d);
        a(false);
        fqf.a(this);
    }

    public final void a(boolean z) {
        int i = 0;
        boolean z2 = z && this.c.getChildCount() > 0;
        this.c.setVisibility(z2 ? 0 : 8);
        View view = this.d;
        if (z2) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public View getView() {
        return this.b;
    }
}

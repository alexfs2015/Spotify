package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.music.R;
import com.spotify.paste.widgets.internal.PasteLinearLayout;

/* renamed from: mqo reason: default package */
public class mqo implements fqy {
    public final mqp a;
    private final PasteLinearLayout b;
    private final PasteLinearLayout c;
    private final View d;

    public mqo(Context context, ViewGroup viewGroup, mqq mqq) {
        Drawable a2 = vgl.a(context, (int) R.attr.pasteListDivider);
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
        fsk fsk = mqq.a;
        this.a = new mqp(fsk.a(context, (ViewGroup) pasteLinearLayout, false));
        fsu d2 = fqv.e().d(context, viewGroup);
        d2.a((CharSequence) context.getString(R.string.data_saver_mode_settings_description_title));
        d2.b(context.getString(R.string.data_saver_mode_settings_description_body));
        d2.c().setMaxLines(Integer.MAX_VALUE);
        d2.c().setEllipsize(null);
        this.d = d2.getView();
        fqv.e().d(context, viewGroup);
        mqp mqp = this.a;
        mqp.c = context.getString(R.string.data_saver_mode_settings_enabled);
        mqp.a(mqp.a.isChecked());
        mqp mqp2 = this.a;
        mqp2.d = context.getString(R.string.data_saver_mode_settings_disabled);
        mqp2.a(mqp2.a.isChecked());
        mqp mqp3 = this.a;
        mqp3.e = context.getString(R.string.data_saver_mode_settings_enabled_subtitle);
        mqp3.a(mqp3.a.isChecked());
        mqp mqp4 = this.a;
        mqp4.a(mqp4.a.isChecked());
        this.b.addView(this.a.getView());
        this.b.addView(this.c);
        this.b.addView(this.d);
        a(false);
        fqz.a(this);
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

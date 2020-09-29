package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: jog reason: default package */
public final class jog implements fsq {
    public TextView a;
    public TextView b;
    public CheckBox c;
    public String d;
    public String e;
    public String f;

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.settings_dialog_content_title_body_checkbox, viewGroup, true);
        this.a = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.body);
        this.c = (CheckBox) inflate.findViewById(R.id.checkbox);
        if (!inflate.isInEditMode()) {
            fze.c(this.a);
            fze.b(this.b);
            fze.a(inflate);
        }
        this.a.setText(this.d);
        this.b.setText(this.e);
        this.c.setText(this.f);
    }

    public final int a() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }
}

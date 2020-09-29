package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.spotify.music.R;

/* renamed from: ftu reason: default package */
final class ftu implements ftk {
    private TextView a;
    private TextView b;
    private CharSequence c;
    private CharSequence d;

    ftu() {
    }

    public final int a() {
        return (int) Math.ceil((double) Math.abs(this.b.getPaint().getFontMetrics().descent));
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.glue_dialog_content_title_body, viewGroup, true);
        this.a = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.body);
        if (!inflate.isInEditMode()) {
            fzy.c(this.a);
            fzy.b(this.b);
            fzy.a(inflate);
        }
        this.a.setText(this.c);
        this.b.setText(this.d, BufferType.SPANNABLE);
    }

    public final void a(CharSequence charSequence) {
        this.c = charSequence;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

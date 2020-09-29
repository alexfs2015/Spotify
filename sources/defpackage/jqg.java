package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: jqg reason: default package */
public final class jqg extends LinearLayout {
    public TextView a = ((TextView) findViewById(16908308));
    public TextView b = ((TextView) findViewById(16908309));

    public jqg(Context context) {
        super(context);
        inflate(getContext(), R.layout.header_info_2_lines_page, this);
    }

    public final void a(int i) {
        this.a.setMaxLines(i);
    }

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.a.setVisibility(8);
            return;
        }
        this.a.setVisibility(0);
        this.a.setText(charSequence);
    }

    public final void a(String str) {
        if (fax.a(str)) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.b.setText(str);
    }
}

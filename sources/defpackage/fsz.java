package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: fsz reason: default package */
final class fsz implements fsq {
    private TextView a;
    private String b;

    fsz() {
    }

    public final void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = (TextView) layoutInflater.inflate(R.layout.glue_dialog_content_text, viewGroup, true).findViewById(R.id.body);
        this.a.setText(this.b);
    }

    public final int a() {
        return (int) Math.ceil((double) Math.abs(this.a.getPaint().getFontMetrics().descent));
    }

    public final void a(String str) {
        this.b = str;
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        }
    }
}

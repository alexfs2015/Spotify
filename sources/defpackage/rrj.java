package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: rrj reason: default package */
public final class rrj implements rrk {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));

    public rrj(Context context, ViewGroup viewGroup) {
        this.a = LayoutInflater.from((Context) fbp.a(context)).inflate(R.layout.home_section_header, viewGroup, false);
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
        }
    }

    public final View getView() {
        return this.a;
    }
}

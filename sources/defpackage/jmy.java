package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: jmy reason: default package */
public final class jmy implements fvz {
    final TextView a = ((TextView) this.c.findViewById(R.id.header));
    final TextView b = ((TextView) this.c.findViewById(R.id.subtitle));
    private final View c;

    public jmy(Context context, ViewGroup viewGroup) {
        this.c = LayoutInflater.from(context).inflate(R.layout.view_premium_destination_header_content, viewGroup, false);
    }

    public final void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return 0;
    }

    public final View getView() {
        return this.c;
    }
}

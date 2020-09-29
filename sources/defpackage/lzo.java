package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: lzo reason: default package */
public final class lzo extends fxb {
    final TextView a = ((TextView) ip.d(getView(), (int) R.id.header_title));

    public lzo(Context context, ViewGroup viewGroup, int i) {
        super(LayoutInflater.from((Context) fbp.a(context)).inflate(i, viewGroup, false));
    }
}

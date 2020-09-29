package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: lvp reason: default package */
public final class lvp extends fwh {
    final TextView a = ((TextView) ip.c(getView(), (int) R.id.header_title));

    public lvp(Context context, ViewGroup viewGroup, int i) {
        super(LayoutInflater.from((Context) fay.a(context)).inflate(i, viewGroup, false));
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.spotify.music.R;
import com.spotify.paste.widgets.EmptyView;

@Deprecated
/* renamed from: fum reason: default package */
public final class fum {
    public static fuj a(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.paste_legacy_empty_view);
        fut fut = new fut((EmptyView) viewStub.inflate());
        fqf.a(fut);
        fqc.a(fut.getView());
        return fut;
    }

    public static fuj a(Context context, ViewGroup viewGroup) {
        fut fut = new fut(new EmptyView(context));
        if (viewGroup != null) {
            fut.getView().setLayoutParams(fzy.c(context, viewGroup));
        }
        fqf.a(fut);
        fqc.a(fut.getView());
        return fut;
    }
}

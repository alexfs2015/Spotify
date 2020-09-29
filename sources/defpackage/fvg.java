package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.spotify.music.R;
import com.spotify.paste.widgets.EmptyView;

@Deprecated
/* renamed from: fvg reason: default package */
public final class fvg {
    public static fvd a(Context context, ViewGroup viewGroup) {
        fvn fvn = new fvn(new EmptyView(context));
        if (viewGroup != null) {
            fvn.getView().setLayoutParams(gas.c(context, viewGroup));
        }
        fqz.a(fvn);
        fqw.a(fvn.getView());
        return fvn;
    }

    public static fvd a(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.paste_legacy_empty_view);
        fvn fvn = new fvn((EmptyView) viewStub.inflate());
        fqz.a(fvn);
        fqw.a(fvn.getView());
        return fvn;
    }
}

package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lop reason: default package */
public final class lop extends jql {
    jwv e = jww.a(getContext());

    public lop(Context context) {
        super(context);
        ggw.a(jww.class);
        a(getContext().getString(R.string.album_header_album_by));
        this.b.setImageDrawable(fzg.a(getContext()));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.a();
    }
}

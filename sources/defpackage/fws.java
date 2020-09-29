package defpackage;

import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView.GlueHeaderViewLayoutParams;

/* renamed from: fws reason: default package */
public final class fws {
    public final GlueHeaderView a;
    public fxe b;
    public fsy c;
    public fvp d;

    public fws(GlueHeaderView glueHeaderView, fvp fvp) {
        this.a = (GlueHeaderView) fbp.a(glueHeaderView);
        this.d = (fvp) fbp.a(fvp);
    }

    public static void a(float f, fqy fqy) {
        if (fqy != null) {
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) fqy.getView().getLayoutParams();
            if (glueHeaderViewLayoutParams != null && glueHeaderViewLayoutParams.c != null) {
                glueHeaderViewLayoutParams.c.a(f);
            }
        }
    }
}

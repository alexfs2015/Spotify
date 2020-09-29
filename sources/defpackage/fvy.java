package defpackage;

import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView.GlueHeaderViewLayoutParams;

/* renamed from: fvy reason: default package */
public final class fvy {
    public final GlueHeaderView a;
    public fwk b;
    public fse c;
    public fuv d;

    public fvy(GlueHeaderView glueHeaderView, fuv fuv) {
        this.a = (GlueHeaderView) fay.a(glueHeaderView);
        this.d = (fuv) fay.a(fuv);
    }

    public static void a(float f, fqe fqe) {
        if (fqe != null) {
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) fqe.getView().getLayoutParams();
            if (glueHeaderViewLayoutParams != null && glueHeaderViewLayoutParams.c != null) {
                glueHeaderViewLayoutParams.c.a(f);
            }
        }
    }
}

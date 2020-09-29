package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;

/* renamed from: hxy reason: default package */
public class hxy extends jqp {
    public hxy(SnackBar snackBar, kf kfVar) {
        super(snackBar, R.id.top_banner_ad_container, kfVar, hxy.class.getCanonicalName());
    }

    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        Context context = viewGroup.getContext();
        viewGroup.setPadding(0, viewGroup.getPaddingTop() + (gaa.b(context) ? gaa.c(context) : 0), 0, 0);
    }
}

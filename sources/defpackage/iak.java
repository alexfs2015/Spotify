package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;

/* renamed from: iak reason: default package */
public class iak extends jta {
    public iak(SnackBar snackBar, kk kkVar) {
        super(snackBar, R.id.top_banner_ad_container, kkVar, iak.class.getCanonicalName());
    }

    public final void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        Context context = viewGroup.getContext();
        viewGroup.setPadding(0, viewGroup.getPaddingTop() + (gau.b(context) ? gau.c(context) : 0), 0, 0);
    }
}

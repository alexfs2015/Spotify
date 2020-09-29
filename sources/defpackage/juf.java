package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState;

/* renamed from: juf reason: default package */
public final class juf {
    /* access modifiers changed from: private */
    public static /* synthetic */ DownloadIndicatorDrawable a(Context context) {
        return new DownloadIndicatorDrawable(context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, TextView textView, b bVar) {
        ((DownloadIndicatorDrawable) jyw.a(context, textView, 0, R.id.drawable_group_download_indicator, new $$Lambda$juf$npr8n9oSpu3fRnyilz9Hz347ZWQ(context))).a(DownloadState.DOWNLOADING);
        int i = bVar.a;
        if (i > 0) {
            textView.setText(context.getString(R.string.header_downloading_progress, new Object[]{Integer.valueOf(i)}));
        }
    }

    public static void a(Context context, TextView textView, vli vli) {
        vli.a((ged<f>) new $$Lambda$juf$9VJhTMNfgQCThSwpesLXsAJQPc<f>(textView), (ged<h>) new $$Lambda$juf$vmascy3GmOGAv2d4aNIWQt7J_zI<h>(context, textView), (ged<b>) new $$Lambda$juf$fJK2DBS8jGwsWXSC6P7Wd0z8lRA<b>(context, textView), (ged<a>) new $$Lambda$juf$xl1NaReRseKaEN5ICykajsbLu5c<a>(context, textView), (ged<c>) new $$Lambda$juf$zF41r4iEqR7B1Q4bWIYaSQ_q5k<c>(textView), (ged<e>) new $$Lambda$juf$5gyR8jbw4LXSVHYM3aMr3D8ixAs<e>(textView), (ged<d>) new $$Lambda$juf$13MD3KXoHBEG49dVfR9exMbkGs<d>(textView), (ged<g>) new $$Lambda$juf$AQmtPBT3aYrGnG9Jzg6iikWkRNs<g>(textView));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DownloadIndicatorDrawable b(Context context) {
        return new DownloadIndicatorDrawable(context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DownloadIndicatorDrawable c(Context context) {
        return new DownloadIndicatorDrawable(context);
    }
}

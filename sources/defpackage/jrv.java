package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState;

/* renamed from: jrv reason: default package */
public final class jrv {
    public static void a(Context context, TextView textView, uzf uzf) {
        uzf.a((gcs<f>) new $$Lambda$jrv$mFS2GGk0lb5u_OJtT9tW2f2lj0g<f>(textView), (gcs<h>) new $$Lambda$jrv$i8sdjv5WPP1DoQx1r1sIJDrS1Q<h>(context, textView), (gcs<b>) new $$Lambda$jrv$PxI1FrSIsk9DwCDVxSDRDC7fU04<b>(context, textView), (gcs<a>) new $$Lambda$jrv$BSYxIKxc93pdqb5gtrCUqQZVyiQ<a>(context, textView), (gcs<c>) new $$Lambda$jrv$mdpSQsIPxJv7oG_fYkSfLbfiSwY<c>(textView), (gcs<e>) new $$Lambda$jrv$6iBPmfakxQLZpLXj2qRdEcZUCdQ<e>(textView), (gcs<d>) new $$Lambda$jrv$hpu_QTcwu5iaBHV3XM4a881w46c<d>(textView), (gcs<g>) new $$Lambda$jrv$TMImnuPLkIVRIVUhAiu9GKRSMFQ<g>(textView));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DownloadIndicatorDrawable c(Context context) {
        return new DownloadIndicatorDrawable(context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, TextView textView, b bVar) {
        ((DownloadIndicatorDrawable) jwu.a(context, textView, 0, R.id.drawable_group_download_indicator, new $$Lambda$jrv$dsm9z3XfrhHULbG2PhdJHjo66hI(context))).a(DownloadState.DOWNLOADING);
        int i = bVar.a;
        if (i > 0) {
            textView.setText(context.getString(R.string.header_downloading_progress, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DownloadIndicatorDrawable b(Context context) {
        return new DownloadIndicatorDrawable(context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ DownloadIndicatorDrawable a(Context context) {
        return new DownloadIndicatorDrawable(context);
    }
}

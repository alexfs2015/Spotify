package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.freetiercommon.uicomponents.Rows.AnonymousClass4;
import com.spotify.music.freetiercommon.uicomponents.Rows.f;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable.DownloadState;
import java.util.EnumSet;
import java.util.List;

/* renamed from: mvg reason: default package */
public final class mvg implements rev<View> {
    private final Context a;
    private final fbd<DownloadIndicatorDrawable> b = new $$Lambda$mvg$S2eEgY3ju3S2I0ecBu4BhtXIQU(this);

    public final int b() {
        return R.id.row_track_download_progress;
    }

    mvg(Context context) {
        this.a = (Context) fay.a(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ DownloadIndicatorDrawable c() {
        return new DownloadIndicatorDrawable(this.a);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        fqb.b();
        frh a2 = frq.a(context, viewGroup, false);
        AnonymousClass4 r3 = new f(a2, new rgi((ViewGroup) a2.getView().findViewById(R.id.accessory))) {
            private /* synthetic */ frh a;
            private /* synthetic */ rgi b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final TextView b() {
                return this.a.b();
            }

            public final TextView d() {
                return this.a.d();
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final void b(CharSequence charSequence) {
                this.a.b(charSequence);
            }

            public final void c(CharSequence charSequence) {
                this.a.c(charSequence);
            }

            public final void a(View view) {
                this.b.a(view);
            }

            public final View a() {
                return this.b.b();
            }

            public final void b(boolean z) {
                this.b.a(z);
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final View getView() {
                return this.a.getView();
            }

            public final void c(boolean z) {
                this.a.c(z);
            }

            public final void a(List<View> list) {
                this.b.a(list);
                this.b.a();
            }
        };
        fqf.a(r3);
        return r3.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        uzf uzf;
        View view2 = view;
        gzt gzt2 = gzt;
        gum gum2 = gum;
        f fVar = (f) fqb.a(view2, f.class);
        Context context = view.getContext();
        guj.a(gum2, view2, gzt2);
        fVar.a(gzt.text().title());
        fVar.b(gzt.text().subtitle());
        fVar.a("1".equals(gzt.custom().get("hubs:glue:highlight")));
        fVar.c(gzt.custom().boolValue("disabled", false));
        TextView d = fVar.d();
        byte[] byteArray = gzt.custom().byteArray("availability");
        if (byteArray == null) {
            uzf = new f();
        } else {
            new uzh();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            uzf = uzh.a(obtain);
            obtain.recycle();
        }
        uzf.a((gcs<f>) new $$Lambda$mvg$KYmFntIom_4k5oY9dW45cPIaXw<f>(d), (gcs<h>) new $$Lambda$mvg$NA9XTrUFK72uuFhHOVWUncViI8<h>(this, d), (gcs<b>) new $$Lambda$mvg$hO440im_jQLkEaC5xzvnU6WzS3g<b>(this, d), (gcs<a>) new $$Lambda$mvg$mVQhuIX6whxBTjaP0yUNUx5lzCw<a>(this, d), (gcs<c>) new $$Lambda$mvg$uxAZgrUw84hzKwMap9Nq_GdNNKc<c>(d), (gcs<e>) new $$Lambda$mvg$LVvHCWSCGbGNUfhUuxd6qBQn4M<e>(d), (gcs<d>) new $$Lambda$mvg$nvCjb6WlchkmmccbrUCdX64sdE<d>(d), (gcs<g>) new $$Lambda$mvg$coW4QUZSti5pNOUKRz12KJQXeCM<g>(d));
        jxb.a(context, fVar.d(), gzt.metadata().boolValue("explicit", false));
        View a2 = jwz.a(context, SpotifyIconV2.MORE_ANDROID);
        String str = "rightAccessoryClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum2.c).a(str).a(gzt2).a(a2).a();
        }
        fVar.a(a2);
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, h hVar) {
        ((DownloadIndicatorDrawable) jwu.a(this.a, textView, 0, R.id.drawable_download_progress, this.b)).a(DownloadState.WAITING);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, b bVar) {
        ((DownloadIndicatorDrawable) jwu.a(this.a, textView, 0, R.id.drawable_download_progress, this.b)).a(DownloadState.DOWNLOADING);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, a aVar) {
        ((DownloadIndicatorDrawable) jwu.a(this.a, textView, 0, R.id.drawable_download_progress, this.b)).a(DownloadState.DOWNLOADED);
    }
}

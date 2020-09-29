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

/* renamed from: nah reason: default package */
public final class nah implements rnx<View> {
    private final Context a;
    private final fbu<DownloadIndicatorDrawable> b = new $$Lambda$nah$72vBfKEe49rKEYZeL_QsxFPPn0o(this);

    nah(Context context) {
        this.a = (Context) fbp.a(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, a aVar) {
        ((DownloadIndicatorDrawable) jyw.a(this.a, textView, 0, R.id.drawable_download_progress, this.b)).a(DownloadState.DOWNLOADED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, b bVar) {
        ((DownloadIndicatorDrawable) jyw.a(this.a, textView, 0, R.id.drawable_download_progress, this.b)).a(DownloadState.DOWNLOADING);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(TextView textView, h hVar) {
        ((DownloadIndicatorDrawable) jyw.a(this.a, textView, 0, R.id.drawable_download_progress, this.b)).a(DownloadState.WAITING);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ DownloadIndicatorDrawable c() {
        return new DownloadIndicatorDrawable(this.a);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        fqv.b();
        fsb a2 = fsk.a(context, viewGroup, false);
        AnonymousClass4 r3 = new f(a2, new rpk((ViewGroup) a2.getView().findViewById(R.id.accessory))) {
            private /* synthetic */ fsb a;
            private /* synthetic */ rpk b;

            {
                this.a = r1;
                this.b = r2;
            }

            public final View a() {
                return this.b.b();
            }

            public final void a(View view) {
                this.b.a(view);
            }

            public final void a(CharSequence charSequence) {
                this.a.a(charSequence);
            }

            public final void a(List<View> list) {
                this.b.a(list);
                this.b.a();
            }

            public final void a(boolean z) {
                this.a.a(z);
            }

            public final TextView b() {
                return this.a.b();
            }

            public final void b(CharSequence charSequence) {
                this.a.b(charSequence);
            }

            public final void b(boolean z) {
                this.b.a(z);
            }

            public final void c(CharSequence charSequence) {
                this.a.c(charSequence);
            }

            public final void c(boolean z) {
                this.a.c(z);
            }

            public final TextView d() {
                return this.a.d();
            }

            public final View getView() {
                return this.a.getView();
            }
        };
        fqz.a(r3);
        return r3.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        vli vli;
        View view2 = view;
        hcm hcm2 = hcm;
        gwm gwm2 = gwm;
        f fVar = (f) fqv.a(view2, f.class);
        Context context = view.getContext();
        gwj.a(gwm2, view2, hcm2);
        fVar.a(hcm.text().title());
        fVar.b(hcm.text().subtitle());
        fVar.a("1".equals(hcm.custom().get("hubs:glue:highlight")));
        fVar.c(hcm.custom().boolValue("disabled", false));
        TextView d = fVar.d();
        byte[] byteArray = hcm.custom().byteArray("availability");
        if (byteArray == null) {
            vli = new f();
        } else {
            new vlk();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            vli = vlk.a(obtain);
            obtain.recycle();
        }
        vli.a((ged<f>) new $$Lambda$nah$QqasTXP2jZaJvf5kLQnPsLFJWP8<f>(d), (ged<h>) new $$Lambda$nah$7NHxoormEgf3zeXCLdilGh0TKYM<h>(this, d), (ged<b>) new $$Lambda$nah$gtGu_gcW3Wpg_tKe9nuZf4eUW2Y<b>(this, d), (ged<a>) new $$Lambda$nah$jQ8CX3on3S6ldnQ9LAuVHo34cg<a>(this, d), (ged<c>) new $$Lambda$nah$fkdNmXfh6RpeQoHbReW602SGRZc<c>(d), (ged<e>) new $$Lambda$nah$hd9KkZhwrZOexOOuDiZAaoXgAi4<e>(d), (ged<d>) new $$Lambda$nah$yK6W5uC1actkrYTJwQ9mJWbWZw<d>(d), (ged<g>) new $$Lambda$nah$czVNe9GUyKWjlbtvgvKnMCDZ0<g>(d));
        jzb.a(context, fVar.d(), hcm.metadata().boolValue("explicit", false));
        View a2 = jyz.a(context, SpotifyIconV2.MORE_ANDROID);
        String str = "rightAccessoryClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm2.c).a(str).a(hcm2).a(a2).a();
        }
        fVar.a(a2);
    }

    public final int b() {
        return R.id.row_track_download_progress;
    }
}

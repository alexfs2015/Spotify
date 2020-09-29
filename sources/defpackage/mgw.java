package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.music.R;
import com.spotify.music.features.connect.picker.ui.DevicePickerActivity;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

/* renamed from: mgw reason: default package */
public class mgw extends jor implements mgz {
    public mhf T;
    private ImageView U;
    private TextView V;
    private ViewGroup W;
    private mhc X;
    public mgx a;
    public iqw b;

    public static mgw a(mhc mhc) {
        mgw mgw = new mgw();
        Bundle bundle = new Bundle();
        bundle.putParcelable("tag_education_item", mhc);
        mgw.g(bundle);
        return mgw;
    }

    public final void a(List<a> list) {
        for (a aVar : list) {
            mgv mgv = new mgv(n(), null);
            mgv.c();
            mgv.b().setText(aVar.a);
            mgv.d().setTransformationMethod(null);
            mgv.d().setText(aVar.b);
            this.W.addView(mgv.getView());
        }
    }

    public final void b(String str) {
        this.V.setText(str);
        this.V.setVisibility(0);
    }

    public final void c() {
        this.V.setVisibility(8);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_connect_education_steps, viewGroup, false);
        this.W = (ViewGroup) inflate.findViewById(R.id.steps_list);
        this.U = (ImageView) inflate.findViewById(R.id.steps_icon);
        this.V = (TextView) inflate.findViewById(R.id.steps_additional);
        this.V.setOnClickListener(new $$Lambda$mgw$4xHxnuGlgeFLgEaWjdgxMQPizHE(this));
        inflate.findViewById(R.id.steps_got_it).setOnClickListener(new $$Lambda$mgw$FycL0G1Q5KwsJ8ZGXIP_QzuaGtI(this));
        return inflate;
    }

    public final void e() {
        mhc mhc = this.X;
        ka p = p();
        if ((p instanceof DevicePickerActivity) && mhc != null) {
            ((DevicePickerActivity) p).b(mgu.b(mhc).a(), mgu.a(mhc).toString());
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.X = (mhc) bundle2.getParcelable("tag_education_item");
        }
        mhc mhc = this.X;
        if (mhc != null) {
            mgx mgx = this.a;
            View a2 = mgx.a.a(layoutInflater, viewGroup);
            mgx.a.a(mhc.e);
            String str = mhc.c;
            if (fax.a(str)) {
                mgx.a.c();
            } else {
                mgx.a.b(str);
            }
            mgx.a.b(mhc);
            mgx.a.e();
            return a2;
        }
        throw new RuntimeException("EducationItem expected");
    }

    public final void b(mhc mhc) {
        int i = mhc.a;
        int i2 = i != 0 ? i != 1 ? (i == 3 || i == 4 || i == 5) ? 0 : i != 6 ? R.drawable.connect_education_speaker : R.drawable.connect_education_social_listening : R.drawable.connect_education_tv : R.drawable.connect_education_computer;
        Context n = n();
        if (i2 != 0 || n == null) {
            this.U.setImageResource(i2);
        } else {
            this.U.setImageDrawable(new SpotifyIconDrawable(n, this.X.b(), (float) n.getResources().getDimensionPixelSize(R.dimen.connect_education_icon_size)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a("validation-button", InteractionIntent.VALIDATE, mgu.b(this.X), mgu.a(this.X));
        ka p = p();
        if (p != null) {
            p.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        String str = this.X.d;
        if (str != null) {
            if (str.startsWith("http")) {
                ka p = p();
                if (p != null) {
                    this.T.a.a((Activity) p, Uri.parse(str));
                }
                return;
            }
            Intent intent = new Intent();
            intent.setAction(str);
            startActivityForResult(intent, 100);
        }
    }
}

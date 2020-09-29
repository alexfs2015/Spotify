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

/* renamed from: mlk reason: default package */
public class mlk extends jrd implements mln {
    public mlt T;
    private ImageView U;
    private TextView V;
    private ViewGroup W;
    private mlq X;
    public mll a;
    public ryo b;

    public static mlk a(mlq mlq) {
        mlk mlk = new mlk();
        Bundle bundle = new Bundle();
        bundle.putParcelable("tag_education_item", mlq);
        mlk.g(bundle);
        return mlk;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a("validation-button", InteractionIntent.VALIDATE, mli.b(this.X), mli.a(this.X));
        kf p = p();
        if (p != null) {
            p.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        String str = this.X.d;
        if (str != null) {
            if (str.startsWith("http")) {
                kf p = p();
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

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_connect_education_steps, viewGroup, false);
        this.W = (ViewGroup) inflate.findViewById(R.id.steps_list);
        this.U = (ImageView) inflate.findViewById(R.id.steps_icon);
        this.V = (TextView) inflate.findViewById(R.id.steps_additional);
        this.V.setOnClickListener(new $$Lambda$mlk$gCoAn_dYl8p1XqscgzVSOC4y3QI(this));
        inflate.findViewById(R.id.steps_got_it).setOnClickListener(new $$Lambda$mlk$ZaQ7qjUonGYcTrYzisvniwF5Bs(this));
        return inflate;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 != null) {
            this.X = (mlq) bundle2.getParcelable("tag_education_item");
        }
        mlq mlq = this.X;
        if (mlq != null) {
            mll mll = this.a;
            View a2 = mll.a.a(layoutInflater, viewGroup);
            mll.a.a(mlq.e);
            String str = mlq.c;
            if (fbo.a(str)) {
                mll.a.c();
            } else {
                mll.a.b(str);
            }
            mll.a.b(mlq);
            mll.a.e();
            return a2;
        }
        throw new RuntimeException("EducationItem expected");
    }

    public final void a(List<a> list) {
        for (a aVar : list) {
            mlj mlj = new mlj(n(), null);
            mlj.c();
            mlj.b().setText(aVar.a);
            mlj.d().setTransformationMethod(null);
            mlj.d().setText(aVar.b);
            this.W.addView(mlj.getView());
        }
    }

    public final void b(String str) {
        this.V.setText(str);
        this.V.setVisibility(0);
    }

    public final void b(mlq mlq) {
        int i = mlq.a;
        int i2 = i != 0 ? i != 1 ? (i == 3 || i == 4 || i == 5) ? 0 : i != 6 ? R.drawable.connect_education_speaker : R.drawable.connect_education_social_listening : R.drawable.connect_education_tv : R.drawable.connect_education_computer;
        Context n = n();
        if (i2 != 0 || n == null) {
            this.U.setImageResource(i2);
        } else {
            this.U.setImageDrawable(new SpotifyIconDrawable(n, this.X.b(), (float) n.getResources().getDimensionPixelSize(R.dimen.connect_education_icon_size)));
        }
    }

    public final void c() {
        this.V.setVisibility(8);
    }

    public final void e() {
        mlq mlq = this.X;
        kf p = p();
        if ((p instanceof DevicePickerActivity) && mlq != null) {
            ((DevicePickerActivity) p).b(mli.b(mlq).a(), mli.a(mlq).toString());
        }
    }
}

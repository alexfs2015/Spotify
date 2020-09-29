package defpackage;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.functions.Action;
import java.util.Locale;

/* renamed from: kzn reason: default package */
public final class kzn extends kzo {
    private final kzl a;
    private final Action b;
    private final Action c;
    private final Picasso d;
    private CountDownTimer e;

    public kzn(kzl kzl, Action action, Action action2, Picasso picasso) {
        this.a = (kzl) fbp.a(kzl);
        this.b = (Action) fbp.a(action);
        this.c = (Action) fbp.a(action2);
        this.d = (Picasso) fbp.a(picasso);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        try {
            this.b.run();
        } catch (Exception unused) {
            Logger.e("Failed to run actions.", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        try {
            this.c.run();
        } catch (Exception unused) {
            Logger.e("Failed to run actions.", new Object[0]);
        }
    }

    public final void a() {
        this.e.cancel();
    }

    public final View getSlateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.a.a(), viewGroup, false);
        TextView textView = (TextView) fbp.a(inflate.findViewById(R.id.countdown));
        TextView textView2 = (TextView) fbp.a(inflate.findViewById(R.id.sub_title));
        Button button = (Button) fbp.a(inflate.findViewById(R.id.action_button));
        Button button2 = (Button) fbp.a(inflate.findViewById(R.id.secondary_action_button));
        ImageView imageView = (ImageView) fbp.a(inflate.findViewById(R.id.image_view));
        a(this.a.b(), (TextView) fbp.a(inflate.findViewById(R.id.title)));
        a(this.a.c(), textView2);
        a(this.a.k(), button2);
        button2.setOnClickListener(new $$Lambda$kzn$SiMSL2xGReiFr5DRXqcU2ks2iow(this));
        a(this.a.j(), button);
        button.setOnClickListener(new $$Lambda$kzn$WnkDOxa18w90kpNF65lKoTfLeM(this));
        Long g = this.a.g();
        if (g != null) {
            AnonymousClass1 r0 = new CountDownTimer(1000 * g.longValue(), 1000, textView) {
                private /* synthetic */ TextView a;

                {
                    this.a = r6;
                }

                public final void onFinish() {
                    this.a.setText("00:00:00");
                }

                public final void onTick(long j) {
                    long j2 = j / 1000;
                    long j3 = j2 % 60;
                    long j4 = (j2 / 60) % 60;
                    long j5 = (j2 / 3600) % 24;
                    this.a.setText(String.format(Locale.US, "%02d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}));
                }
            };
            this.e = r0.start();
        }
        ulw f = this.a.f();
        if (f != null) {
            f.a(imageView, this.d);
        }
        return inflate;
    }
}

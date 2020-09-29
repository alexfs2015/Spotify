package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: tmm reason: default package */
public final class tmm implements tum {
    private final Context a;
    private final tmj b;
    private final jmq c;
    private final sih d;

    /* renamed from: tmm$a */
    public static class a extends tuq {
        public String a;
        public String b;
        public boolean c;
    }

    /* renamed from: tmm$b */
    public static class b extends defpackage.tum.a {
        final Button a;
        final ImageButton b;

        public b(View view, ImageButton imageButton) {
            super(view);
            this.a = (Button) view.findViewById(R.id.follow_button);
            this.b = imageButton;
            ((ViewGroup) view.findViewById(R.id.context_menu_holder)).addView(this.b);
        }
    }

    public /* synthetic */ void a(tuq tuq) {
        CC.$default$a(this, tuq);
    }

    public tmm(Context context, tmj tmj, jmq jmq, sih sih) {
        this.a = context;
        this.b = tmj;
        this.c = jmq;
        this.d = sih;
    }

    public final defpackage.tum.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.podcast_adapter_delegate_podcast_info, viewGroup, false);
        Context context = this.a;
        ImageButton a2 = jwz.a(context, jwz.c(context, SpotifyIconV2.MORE_ANDROID));
        a2.setContentDescription(this.a.getString(R.string.context_menu_content_description));
        return new b(inflate, a2);
    }

    public final void a(tuq tuq, u uVar) {
        b bVar = (b) uVar;
        a aVar = (a) tuq;
        bVar.a.setText(this.a.getResources().getString(aVar.c ? R.string.options_menu_following : R.string.options_menu_follow));
        bVar.a.setSelected(aVar.c);
        bVar.a.setOnClickListener(new $$Lambda$tmm$EIMrByznUFqrc4bGPaUAeSbBs(this, aVar));
        bVar.b.setOnClickListener(new $$Lambda$tmm$VQUdCaKxU3HzWtGtpCGks9rTE20(this, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar, View view) {
        this.b.a(aVar.a, aVar.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, View view) {
        jly.a(this.a, new $$Lambda$tmm$m5XwnRUX47HrjPl1Hcq3_gjOkJQ(this), aVar, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(a aVar) {
        return this.c.c(aVar.a, aVar.b).a(this.d).a(false).a();
    }
}

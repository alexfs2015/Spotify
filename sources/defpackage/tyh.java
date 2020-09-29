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

/* renamed from: tyh reason: default package */
public final class tyh implements ugp {
    private final Context a;
    private final tye b;
    private final jpc c;
    private final sso d;

    /* renamed from: tyh$a */
    public static class a extends ugt {
        public String a;
        public String b;
        public boolean c;
    }

    /* renamed from: tyh$b */
    public static class b extends defpackage.ugp.a {
        final Button a;
        final ImageButton b;

        public b(View view, ImageButton imageButton) {
            super(view);
            this.a = (Button) view.findViewById(R.id.follow_button);
            this.b = imageButton;
            ((ViewGroup) view.findViewById(R.id.context_menu_holder)).addView(this.b);
        }
    }

    public tyh(Context context, tye tye, jpc jpc, sso sso) {
        this.a = context;
        this.b = tye;
        this.c = jpc;
        this.d = sso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(a aVar) {
        return this.c.c(aVar.a, aVar.b).a(this.d).a(false).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, View view) {
        jok.a(this.a, new $$Lambda$tyh$NmQFzrP0N6_FBFQazGTkvCmWqIg(this), aVar, this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar, View view) {
        this.b.a(aVar.a, aVar.c);
    }

    public final defpackage.ugp.a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.podcast_adapter_delegate_podcast_info, viewGroup, false);
        Context context = this.a;
        ImageButton a2 = jyz.a(context, jyz.c(context, SpotifyIconV2.MORE_ANDROID));
        a2.setContentDescription(this.a.getString(R.string.context_menu_content_description));
        return new b(inflate, a2);
    }

    public /* synthetic */ void a(ugt ugt) {
        CC.$default$a(this, ugt);
    }

    public final void a(ugt ugt, u uVar) {
        b bVar = (b) uVar;
        a aVar = (a) ugt;
        bVar.a.setText(this.a.getResources().getString(aVar.c ? R.string.options_menu_following : R.string.options_menu_follow));
        bVar.a.setSelected(aVar.c);
        bVar.a.setOnClickListener(new $$Lambda$tyh$3vGikL27e5TVyeiz2xs3_lsYUU(this, aVar));
        bVar.b.setOnClickListener(new $$Lambda$tyh$snnA82RYjbUjZRpDBWo7CgVXLg(this, aVar));
    }
}

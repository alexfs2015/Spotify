package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: ocj reason: default package */
public class ocj extends jor implements ock {
    public a a;

    public static ocj c() {
        Bundle bundle = new Bundle();
        ocj ocj = new ocj();
        ocj.g(bundle);
        return ocj;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_phone_number_start, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.button_facebook);
        TextView textView2 = (TextView) view.findViewById(R.id.button_email);
        a((TextView) view.findViewById(R.id.button_phone_number), SpotifyIconV2.DEVICE_MOBILE);
        a(textView, SpotifyIconV2.FACEBOOK);
        a(textView2, SpotifyIconV2.EMAIL);
        View findViewById = view.findViewById(R.id.button_phone_number_container);
        View findViewById2 = view.findViewById(R.id.button_facebook_container);
        View findViewById3 = view.findViewById(R.id.button_email_container);
        uui.c(findViewById).a();
        uui.c(findViewById2).a();
        uui.c(findViewById3).a();
        findViewById.setOnClickListener(new $$Lambda$ocj$_uMyiyXLwNRkVAgivhQFET2yKX0(this));
        findViewById2.setOnClickListener(new $$Lambda$ocj$gw1mScrKXjyRNrkwmkcjJJmmMUM(this));
        findViewById3.setOnClickListener(new $$Lambda$ocj$CiR6zVhQxAJqPMTVkA2AkYeoKd8(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.c();
    }

    private void a(TextView textView, SpotifyIconV2 spotifyIconV2) {
        jm.b(textView, a(n(), spotifyIconV2, textView.getTextColors().getDefaultColor()), null, null, null);
    }

    private static SpotifyIconDrawable a(Context context, SpotifyIconV2 spotifyIconV2, int i) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, context.getResources().getDimension(R.dimen.text_view_icon_size));
        spotifyIconDrawable.a(i);
        return spotifyIconDrawable;
    }
}

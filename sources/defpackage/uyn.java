package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.music.R;

/* renamed from: uyn reason: default package */
public class uyn extends jrd {
    public sxw a;
    public uyq b;

    public static uyn a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        uyn uyn = new uyn();
        Bundle bundle = new Bundle();
        bundle.putInt("page_title_text", i);
        bundle.putInt("page_title_desc", i2);
        bundle.putInt("page_image", i4);
        bundle.putInt("page_content_description", i3);
        bundle.putBoolean("page_show_done_button", z);
        bundle.putBoolean("page_show_tos", z2);
        uyn.g(bundle);
        return uyn;
    }

    static Intent b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(context.getString(R.string.voice_tos)));
        return intent;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_voice_onboarding, viewGroup, false);
        Bundle bundle2 = (Bundle) fbp.a(this.i);
        ((TextView) inflate.findViewById(R.id.onboarding_title)).setText(bundle2.getInt("page_title_text"));
        ((TextView) inflate.findViewById(R.id.onboarding_description)).setText(bundle2.getInt("page_title_desc"));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.onboarding_image);
        int i = bundle2.getInt("page_content_description");
        imageView.setImageResource(bundle2.getInt("page_image"));
        imageView.setContentDescription(((Context) fbp.a(n())).getString(i));
        View findViewById = inflate.findViewById(R.id.onboarding_tos);
        Button button = (Button) inflate.findViewById(R.id.done_button);
        if (bundle2.getBoolean("page_show_done_button", false)) {
            findViewById.setVisibility(8);
            button.setVisibility(0);
            button.setContentDescription(a((int) R.string.voice_onboarding_finish_button));
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    kf p = uyn.this.p();
                    if (p != null) {
                        Intent intent = p.getIntent();
                        uyn.this.b.a(InteractionIntent.NEXT);
                        uyn.this.a.a(p, fqo.a((Activity) p), intent.getStringExtra("voice_internal_referrer"));
                    }
                }
            });
        } else if (bundle2.getBoolean("page_show_tos", false)) {
            button.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    view.getContext().startActivity(uyn.b(view.getContext()));
                }
            });
        } else {
            findViewById.setVisibility(8);
            button.setVisibility(8);
        }
        return inflate;
    }
}

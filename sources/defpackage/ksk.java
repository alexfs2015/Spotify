package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: ksk reason: default package */
public final class ksk {
    private final ksb a;
    private final kry b;

    public ksk(ksb ksb, kry kry) {
        this.a = ksb;
        this.b = kry;
    }

    private static View a(Context context, ViewGroup viewGroup, String str, String str2, OnClickListener onClickListener, OnClickListener onClickListener2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.empty_view_anchor, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.empty_view_button);
        TextView textView = (TextView) inflate.findViewById(R.id.create_with_anchor_text);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        button.setText(str2);
        button.setOnClickListener(onClickListener);
        Spannable a2 = ksm.a(context.getString(R.string.your_library_podcast_tab_create_podcast_with_anchor), "Anchor", onClickListener2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(a2);
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.b();
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.d();
        this.a.a();
    }

    public final View a(Context context, ViewGroup viewGroup, String str, OnClickListener onClickListener) {
        return a(context, viewGroup, context.getString(R.string.your_library_podcast_tab_followed_empty_title_follow_anchor), str, onClickListener, new $$Lambda$ksk$uLqvf25tZWQgAhXHgII9_AL3Y48(this));
    }

    public final View b(Context context, ViewGroup viewGroup, String str, OnClickListener onClickListener) {
        return a(context, viewGroup, context.getString(R.string.your_library_podcast_tab_episodes_empty_title_anchor), str, onClickListener, new $$Lambda$ksk$zKFpm_1ieuKsWSsY_sO5aZ_1MDM(this));
    }
}

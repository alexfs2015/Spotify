package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.music.R;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import com.spotify.music.features.speakercompanion.resultspage.ResultsPageActivity;
import com.spotify.paste.spotifyicon.SpotifyIconView;

/* renamed from: qpd reason: default package */
public class qpd extends jsy implements b {
    private a b;
    private TextView c;
    private Button d;
    private SpotifyIconView e;

    public qpd(SnackBar snackBar) {
        super(snackBar, 0, qpd.class.getSimpleName());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.b.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.d();
    }

    public final void a(ViewGroup viewGroup) {
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_snack_speaker, viewGroup, false);
        Context context = viewGroup.getContext();
        if (gau.b(context)) {
            i = gau.a(context.getResources());
        }
        if (i != 0) {
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop() + i, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
        }
        this.c = (TextView) viewGroup2.findViewById(R.id.text_header);
        this.d = (Button) viewGroup2.findViewById(R.id.button_snack_results);
        this.e = (SpotifyIconView) viewGroup2.findViewById(R.id.button_snack_close);
        viewGroup.addView(viewGroup2);
    }

    public final void a(EntityResultsPageResponse entityResultsPageResponse) {
        String uid = entityResultsPageResponse.uid();
        Payload payload = entityResultsPageResponse.payload();
        if (uid != null && payload != null) {
            Context context = this.c.getContext();
            context.startActivity(ResultsPageActivity.a(context, uid, payload));
        }
    }

    public final void a(String str) {
        this.c.setText(this.c.getResources().getString(R.string.speaker_banner_now_playing, new Object[]{str}));
    }

    public final void a(a aVar) {
        this.b = aVar;
        this.d.setOnClickListener(new $$Lambda$qpd$LmR0uhDiOCE5x1kQ558uNjuo3dc(this));
        this.e.setOnClickListener(new $$Lambda$qpd$CMZMeHJnfEcoIFMNdmnF9gz7Uns(this));
    }

    public final void aE_() {
        a(true);
    }

    public final void b() {
        a(false);
    }
}

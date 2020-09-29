package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.rcs.model.Fetch.Type;
import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties;

/* renamed from: puz reason: default package */
public class puz extends jor implements jol, udv {
    private Button T;
    private TextView U;
    public vhl a;
    public AppsMusicFeaturesRemoteconfigurationProperties b;

    public final Fragment ae() {
        return this;
    }

    public final String e() {
        return "fragment_remoteconfiguration";
    }

    public static puz c() {
        return new puz();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_remoteconfiguration, viewGroup, false);
        Button button = (Button) viewGroup2.findViewById(R.id.remote_config_button_refresh);
        Button button2 = (Button) viewGroup2.findViewById(R.id.remote_config_button_activate);
        Button button3 = (Button) viewGroup2.findViewById(R.id.remote_config_button_fetch);
        this.T = (Button) viewGroup2.findViewById(R.id.remote_config_button);
        this.U = (TextView) viewGroup2.findViewById(R.id.remote_config_text);
        button.setOnClickListener(new $$Lambda$puz$TJZW7k3jJXO22xvrhPvgQUKny54(this));
        button2.setOnClickListener(new $$Lambda$puz$bTSrcMoN21tBGpebJLViisQ1TvY(this));
        button3.setOnClickListener(new $$Lambda$puz$i1lWnFA67zq46CMmVlTHCJW8CRU(this));
        return viewGroup2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a().a(Type.UNKNOWN);
    }

    public final String b(Context context) {
        return context.getString(R.string.remoteconfiguration_fragment_title);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.REMOTECONFIGURATION_DEBUG, null);
    }

    public final udr ag() {
        return udt.aJ;
    }

    public final gjf aj() {
        return PageIdentifiers.REMOTECONFIGURATION_DEBUG;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.T.setBackgroundColor(Color.parseColor(this.b.b().toString()));
        int i = this.b.a() ? 50 : 0;
        this.T.setPadding(i, i, i, i);
        this.U.setText(this.b.c().toString());
    }
}

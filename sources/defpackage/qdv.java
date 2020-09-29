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

/* renamed from: qdv reason: default package */
public class qdv extends jrd implements jqx, uqq {
    private Button T;
    private TextView U;
    public vuq a;
    public AppsMusicFeaturesRemoteconfigurationProperties b;

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.a().a(Type.UNKNOWN);
    }

    public static qdv c() {
        return new qdv();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.T.setBackgroundColor(Color.parseColor(this.b.b().toString()));
        int i = this.b.a() ? 50 : 0;
        this.T.setPadding(i, i, i, i);
        this.U.setText(this.b.c().toString());
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_remoteconfiguration, viewGroup, false);
        Button button = (Button) viewGroup2.findViewById(R.id.remote_config_button_refresh);
        Button button2 = (Button) viewGroup2.findViewById(R.id.remote_config_button_activate);
        Button button3 = (Button) viewGroup2.findViewById(R.id.remote_config_button_fetch);
        this.T = (Button) viewGroup2.findViewById(R.id.remote_config_button);
        this.U = (TextView) viewGroup2.findViewById(R.id.remote_config_text);
        button.setOnClickListener(new $$Lambda$qdv$_NRWld4cz8BVJKTM2IkHOPU4c(this));
        button2.setOnClickListener(new $$Lambda$qdv$2C5nJrJ8bnrReW338clLByyHXk(this));
        button3.setOnClickListener(new $$Lambda$qdv$f35hazmdcZfN0GZsT7JWzSry8qk(this));
        return viewGroup2;
    }

    public final Fragment ae() {
        return this;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.REMOTECONFIGURATION_DEBUG, null);
    }

    public final uqm ag() {
        return uqo.aJ;
    }

    public final gkq aj() {
        return PageIdentifiers.REMOTECONFIGURATION_DEBUG;
    }

    public final String b(Context context) {
        return context.getString(R.string.remoteconfiguration_fragment_title);
    }

    public final String e() {
        return "fragment_remoteconfiguration";
    }
}

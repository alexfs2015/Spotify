package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.R;

/* renamed from: qqh reason: default package */
public final class qqh implements rum {
    private final Application a;

    public qqh(Application application) {
        this.a = application;
    }

    public final XmlResourceParser a() {
        return this.a.getResources().getXml(R.xml.voice_assistant_package_validator_whitelist);
    }
}

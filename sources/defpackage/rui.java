package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.R;

/* renamed from: rui reason: default package */
public final class rui implements rum {
    private final Application a;

    public rui(Application application) {
        this.a = application;
    }

    public final XmlResourceParser a() {
        return this.a.getResources().getXml(R.xml.allowed_media_browser_callers_v2);
    }
}

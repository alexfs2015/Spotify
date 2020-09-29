package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.R;

/* renamed from: sdv reason: default package */
public final class sdv implements vey {
    private final Application a;

    public sdv(Application application) {
        this.a = application;
    }

    public final XmlResourceParser a() {
        return this.a.getResources().getXml(R.xml.allowed_media_browser_callers_v2);
    }
}

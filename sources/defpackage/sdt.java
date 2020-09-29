package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.R;

/* renamed from: sdt reason: default package */
public final class sdt implements vey {
    private final Application a;

    public sdt(Application application) {
        this.a = application;
    }

    public final XmlResourceParser a() {
        return this.a.getResources().getXml(R.xml.allowed_media_browser_callers);
    }
}

package defpackage;

import android.app.Application;
import android.content.res.XmlResourceParser;
import com.spotify.music.R;

/* renamed from: low reason: default package */
public final class low implements rum {
    private final Application a;

    public low(Application application) {
        this.a = application;
    }

    public final XmlResourceParser a() {
        return this.a.getResources().getXml(R.xml.android_auto_package_validator_whitelist);
    }
}

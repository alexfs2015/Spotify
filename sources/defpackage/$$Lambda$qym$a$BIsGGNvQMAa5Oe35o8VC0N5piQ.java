package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Response;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$qym$a$BIsGGNvQMAa5-Oe35o8VC0N5piQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qym$a$BIsGGNvQMAa5Oe35o8VC0N5piQ implements Action {
    private final /* synthetic */ Response f$0;

    public /* synthetic */ $$Lambda$qym$a$BIsGGNvQMAa5Oe35o8VC0N5piQ(Response response) {
        this.f$0 = response;
    }

    public final void run() {
        Logger.b("Successfully prepared the context %s", this.f$0.toString());
    }
}

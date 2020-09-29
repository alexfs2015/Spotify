package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import com.spotify.libs.instrumentation.performance.ViewLoadSequence.Step;

/* renamed from: gll reason: default package */
public class gll implements glu {
    private final glm a;

    public boolean a(ViewLoadSequence viewLoadSequence) {
        return false;
    }

    public boolean b(ViewLoadSequence viewLoadSequence) {
        return true;
    }

    public gll(glm glm) {
        this.a = glm;
    }

    public void process(ViewLoadSequence viewLoadSequence) {
        if (!a(viewLoadSequence)) {
            Long l = (Long) viewLoadSequence.g.get(Step.STARTED.toString());
            if (l != null) {
                Long l2 = (Long) viewLoadSequence.g.get(Step.DATA_LOADED.toString());
                this.a.c("view_loading_started", l.longValue());
                if (l2 != null) {
                    this.a.c("view_data_loaded", l2.longValue());
                }
                String str = viewLoadSequence.d;
                if (Step.FINISHED.toString().equals(str)) {
                    Long l3 = (Long) viewLoadSequence.g.get(Step.FINISHED.toString());
                    String str2 = viewLoadSequence.a;
                    String str3 = viewLoadSequence.c;
                    if (b(viewLoadSequence)) {
                        this.a.a("usable_state", l3.longValue(), str2);
                    } else {
                        Logger.d("Received complete event for uri %s that is not in cold start list", str3);
                        this.a.a("non_default_uri_requested", l3.longValue(), str2);
                    }
                } else if (Step.CANCELLED.toString().equals(str)) {
                    Long l4 = (Long) viewLoadSequence.g.get(Step.CANCELLED.toString());
                    String str4 = viewLoadSequence.a;
                    this.a.a("first_view_cancel", l4.longValue(), str4);
                } else if (Step.FAILED.toString().equals(str)) {
                    Long l5 = (Long) viewLoadSequence.g.get(Step.FAILED.toString());
                    String str5 = viewLoadSequence.a;
                    this.a.a("first_view_error", l5.longValue(), str5);
                }
            }
        }
    }

    public final void c(ViewLoadSequence viewLoadSequence) {
        process(viewLoadSequence);
    }

    public final void a() {
        this.a.a("shut_down", (String) null);
    }
}

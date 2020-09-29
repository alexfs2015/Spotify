package defpackage;

import android.text.TextUtils;
import java.util.Map;

@cfp
/* renamed from: csp reason: default package */
public final class csp implements bhc<csh> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        csh csh = (csh) obj;
        if (((Boolean) dqe.f().a(dtg.bs)).booleanValue()) {
            ctx b = csh.b();
            String str = "1";
            if (b == null) {
                try {
                    ctx ctx = new ctx(csh, Float.parseFloat((String) map.get("duration")), str.equals(map.get("customControlsAllowed")), str.equals(map.get("clickToExpandAllowed")));
                    csh.a(ctx);
                    b = ctx;
                } catch (NullPointerException e) {
                    e = e;
                    cml.a("Unable to parse videoMeta message.", e);
                    bkc.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                } catch (NumberFormatException e2) {
                    e = e2;
                    cml.a("Unable to parse videoMeta message.", e);
                    bkc.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                }
            }
            boolean equals = str.equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str2 = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str2) ? 0.0f : Float.parseFloat(str2);
            if (cml.a(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str2);
                sb.toString();
                cpn.a(3);
            }
            b.a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}

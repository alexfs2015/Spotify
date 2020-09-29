package defpackage;

import android.text.TextUtils;
import java.util.Map;

@cey
/* renamed from: cry reason: default package */
public final class cry implements bgl<crq> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        crq crq = (crq) obj;
        if (((Boolean) dpn.f().a(dsp.bs)).booleanValue()) {
            ctg b = crq.b();
            String str = "1";
            if (b == null) {
                try {
                    ctg ctg = new ctg(crq, Float.parseFloat((String) map.get("duration")), str.equals(map.get("customControlsAllowed")), str.equals(map.get("clickToExpandAllowed")));
                    crq.a(ctg);
                    b = ctg;
                } catch (NullPointerException e) {
                    e = e;
                    clu.a("Unable to parse videoMeta message.", e);
                    bjl.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                } catch (NumberFormatException e2) {
                    e = e2;
                    clu.a("Unable to parse videoMeta message.", e);
                    bjl.i().a(e, "VideoMetaGmsgHandler.onGmsg");
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
            if (clu.a(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str2);
                sb.toString();
                cow.a(3);
            }
            b.a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}

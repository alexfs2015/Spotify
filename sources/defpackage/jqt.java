package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.spotify.music.cappedondemand.dialog.CappedOndemandDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: jqt reason: default package */
public final class jqt {
    private final kk a;

    jqt(kk kkVar) {
        this.a = kkVar;
    }

    private static void a(LinkedHashMap<String, jry> linkedHashMap) {
        try {
            linkedHashMap.put("uninstall_release_version", (jry) Class.forName("com.spotify.music.features.uninstallrelease.UninstallReleaseVersionDialogFragment").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public final void a(fqn fqn) {
        String str = "dialog_presenter";
        if (this.a.a(str) == null) {
            kk kkVar = this.a;
            jue jue = new jue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(ppr.class.getSimpleName(), ppr.e());
            linkedHashMap.put("playback_error_dialog_fragment", jrv.a(fqn));
            linkedHashMap.put("offline_sync_error_fragment", jrp.a(fqn));
            linkedHashMap.put("disk_almost_full_fragment", new mre());
            linkedHashMap.put("tag_switch_device_fragment", jsb.a(fqn));
            linkedHashMap.put("tag_new_device_fragment", mkj.a(fqn));
            linkedHashMap.put("app_rater_fragment", new uqr());
            linkedHashMap.put("marketing_opt_in_fragment", new jro());
            linkedHashMap.put("churn_locked_state_detector_fragment", mhf.e());
            a(linkedHashMap);
            linkedHashMap.put("set_password_fragment", lqo.e());
            linkedHashMap.put("CappedOndemandDialogFragment", CappedOndemandDialogFragment.a(fqn));
            linkedHashMap.put("tag_entity_feedback_headless_fragment", qpn.a(fqn));
            linkedHashMap.put(rww.class.getSimpleName(), rww.e());
            kr a2 = kkVar.a().a((Fragment) jue, str);
            for (Entry entry : linkedHashMap.entrySet()) {
                a2.a((Fragment) entry.getValue(), (String) entry.getKey());
            }
            a2.b();
            for (jry jry : linkedHashMap.values()) {
                fbp.a(!TextUtils.isEmpty(jry.z), (Object) "Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
                jry.a(jue);
            }
        }
    }
}

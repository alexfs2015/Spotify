package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.spotify.music.cappedondemand.dialog.CappedOndemandDialogFragment;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: joh reason: default package */
public final class joh {
    private final kf a;

    joh(kf kfVar) {
        this.a = kfVar;
    }

    public final void a(fpt fpt) {
        String str = "dialog_presenter";
        if (this.a.a(str) == null) {
            kf kfVar = this.a;
            jru jru = new jru();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(pja.class.getSimpleName(), pja.e());
            linkedHashMap.put("playback_error_dialog_fragment", jpj.a(fpt));
            linkedHashMap.put("offline_sync_error_fragment", jpd.a(fpt));
            linkedHashMap.put("disk_almost_full_fragment", new mml());
            linkedHashMap.put("tag_switch_device_fragment", jpp.a(fpt));
            linkedHashMap.put("tag_new_device_fragment", mfx.a(fpt));
            linkedHashMap.put("app_rater_fragment", new udw());
            linkedHashMap.put("marketing_opt_in_fragment", new jpc());
            linkedHashMap.put("churn_locked_state_detector_fragment", mdc.e());
            a(linkedHashMap);
            linkedHashMap.put("set_password_fragment", lmo.e());
            linkedHashMap.put("CappedOndemandDialogFragment", CappedOndemandDialogFragment.a(fpt));
            linkedHashMap.put("tag_entity_feedback_headless_fragment", qgz.a(fpt));
            linkedHashMap.put(rnq.class.getSimpleName(), rnq.e());
            km a2 = kfVar.a().a((Fragment) jru, str);
            for (Entry entry : linkedHashMap.entrySet()) {
                a2.a((Fragment) entry.getValue(), (String) entry.getKey());
            }
            a2.b();
            for (jpm jpm : linkedHashMap.values()) {
                fay.a(!TextUtils.isEmpty(jpm.z), (Object) "Fragment must be added to a transaction with a specific tag before being registered in DialogPresenter.");
                jpm.a(jru);
            }
        }
    }

    private static void a(LinkedHashMap<String, jpm> linkedHashMap) {
        try {
            linkedHashMap.put("uninstall_release_version", (jpm) Class.forName("com.spotify.music.features.uninstallrelease.UninstallReleaseVersionDialogFragment").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}

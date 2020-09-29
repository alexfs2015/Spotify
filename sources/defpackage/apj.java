package defpackage;

import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* renamed from: apj reason: default package */
public interface apj<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}

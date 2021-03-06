package org.smartregister.anc.event;

import java.util.Map;

/**
 * Created by ndegwamartin on 17/07/2018.
 */
public class ClientDetailsFetchedEvent extends BaseEvent {
    private Map<String, String> womanClient;
    private boolean isEditMode = false;

    public Map<String, String> getWomanClient() {
        return womanClient;
    }

    public ClientDetailsFetchedEvent(Map<String, String> client, boolean isEditMode) {
        this.womanClient = client;
        this.isEditMode = isEditMode;
    }

    public boolean isEditMode() {
        return isEditMode;
    }
}

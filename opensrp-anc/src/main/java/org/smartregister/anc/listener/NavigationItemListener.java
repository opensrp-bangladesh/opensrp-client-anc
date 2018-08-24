package org.smartregister.anc.listener;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;

import org.smartregister.anc.R;
import org.smartregister.anc.activity.HomeRegisterActivity;
import org.smartregister.anc.application.AncApplication;
import org.smartregister.anc.util.JsonFormUtils;

/**
 * Created by keyman on 4/07/18.
 */

public class NavigationItemListener implements View.OnClickListener {

    private Activity context;

    public NavigationItemListener(Activity context) {
        this.context = context;
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.anc_register) {
            Intent intent = new Intent(context, HomeRegisterActivity.class);
            context.startActivity(intent);
        } else if (id == R.id.counseling_resources) {
            // TODO go to counseling resources page
        } else if (id == R.id.site_characteristics) {
            JsonFormUtils.launchSiteCharacteristicsForm(context);
        } else if (id == R.id.sync_data) {
            // TODO start sync service
            //ServiceTools.startSyncService(context.getApplicationContext());
        } else if (id == R.id.logout) {
            AncApplication.getInstance().logoutCurrentUser();
        }

        DrawerLayout drawer = context.findViewById(R.id.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);
    }

}

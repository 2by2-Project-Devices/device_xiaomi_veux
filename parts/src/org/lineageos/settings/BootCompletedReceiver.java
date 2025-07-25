/*
 * SPDX-FileCopyrightText: The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.util.Log;
import android.os.Handler;
import android.os.UserHandle;
import android.provider.Settings;

import org.lineageos.settings.thermal.ThermalUtils;
import org.lineageos.settings.refreshrate.RefreshUtils;
import org.lineageos.settings.dirac.DiracUtils;
import org.lineageos.settings.touchsampling.TouchSamplingUtils;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final boolean DEBUG = false;
    private static final String TAG = "XiaomiParts";

    @Override
    public void onReceive(final Context context, Intent intent) {

        if (DEBUG)
            Log.d(TAG, "Received boot completed intent");

        // Dirac
        try {
            DiracUtils.getInstance(context);
        } catch (Exception e) {
            Log.d(TAG, "Dirac is not present in system");
        }
        // Thermal Profiles
        ThermalUtils.startService(context);

        // Per App Refreash Rate
        RefreshUtils.startService(context);        

        // High Touch Sampling
        TouchSamplingUtils.restoreSamplingValue(context);
    }
}

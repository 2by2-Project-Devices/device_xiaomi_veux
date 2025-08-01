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

package org.lineageos.settings.dirac;

import android.media.audiofx.AudioEffect;

import java.util.UUID;

public class DiracSound extends AudioEffect {

    private static final int DIRACSOUND_PARAM_HEADSET_TYPE = 1;
    private static final int DIRACSOUND_PARAM_EQ_LEVEL = 2;
    private static final int DIRACSOUND_PARAM_MUSIC = 4;
    private static final int DIRACSOUND_PARAM_HIFI = 8;
    private static final int DIRACSOUND_PARAM_SCENE = 15;

    private static final UUID EFFECT_TYPE_DIRACSOUND =
            UUID.fromString("5b8e36a5-144a-4c38-b1d7-0002a5d5c51b");
    private static final String TAG = "DiracSound";

    public DiracSound(int priority, int audioSession) {
        super(EFFECT_TYPE_NULL, EFFECT_TYPE_DIRACSOUND, priority, audioSession);
    }

    public int getMusic() throws IllegalStateException,
            IllegalArgumentException, UnsupportedOperationException,
            RuntimeException {
        int[] value = new int[1];
        checkStatus(getParameter(DIRACSOUND_PARAM_MUSIC, value));
        return value[0];
    }

    public void setMusic(int enable) throws IllegalStateException,
            IllegalArgumentException, UnsupportedOperationException,
            RuntimeException {
        checkStatus(setParameter(DIRACSOUND_PARAM_MUSIC, enable));
    }

    public void setHeadsetType(int type) throws IllegalStateException,
            IllegalArgumentException, UnsupportedOperationException,
            RuntimeException {
        checkStatus(setParameter(DIRACSOUND_PARAM_HEADSET_TYPE, type));
    }

    public void setLevel(int band, float level) throws IllegalStateException,
            IllegalArgumentException, UnsupportedOperationException,
            RuntimeException {
        checkStatus(setParameter(new int[]{DIRACSOUND_PARAM_EQ_LEVEL, band},
                String.valueOf(level).getBytes()));
    }

    public void setHifiMode(int mode) throws IllegalStateException,
            IllegalArgumentException, UnsupportedOperationException,
            RuntimeException {
        checkStatus(setParameter(DIRACSOUND_PARAM_HIFI, mode));
    }

    public void setScenario(int scene) throws IllegalStateException,
            IllegalArgumentException, UnsupportedOperationException,
            RuntimeException {
        checkStatus(setParameter(DIRACSOUND_PARAM_SCENE, scene));
    }
}

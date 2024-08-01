echo "Cloning Audio Configs...."
# Clone own audio config tree
rm -rf hardware/qcom-caf/sm8350/audio/configs/holi && git clone https://github.com/Amrito-Projects/hardware_qcom-caf_sm8350_audio_configs_holi.git -b 14 hardware/qcom-caf/sm8350/audio/configs/holi --depth=1

echo "Cloning vendor..."
# Clone Vendor
git clone --depth=1 https://amritokun-admin@bitbucket.org/amritokun/vendor_xiaomi_veux.git -b 15 vendor/xiaomi/veux

echo "Cloning hardware related stuff..."
# Hardware
git clone --depth=1 https://github.com/LineageOS/android_hardware_xiaomi -b lineage-22.1 hardware/xiaomi

echo "Cloning Kernel"
# Kernel
git clone --depth=1 https://github.com/PaimonLab/kernel_xiaomi_veux.git kernel/xiaomi/veux

echo "Cloning MIUI Camera..."
# MIUI Camera
git clone --depth=1 https://github.com/Amrito-Projects/vendor_xiaomi_miuicamera-veux.git vendor/xiaomi/miuicamera-veux
git clone --depth=1  https://x-token-auth:ATCTT3xFfGN0IWkL-sntCsnITb6fTEiU1lhQl7w3gUNDf9bUOYJ3cnurlMY3EBI9I4vvUP8p72_h8nbF_nI_1RlaItBjYvRlllNtz9mkdTpcdjdQAf32tDYTBYpY1ueHQI509UEiM1DSF7CG9QZhtCPbrenReXpOSyvyBiTnK_SEMcC7QNIX75w=2D043E66@bitbucket.org/amritokun/vendor_xiaomi_miuicamera.git vendor/xiaomi/miuicamera

echo "Cloning Sony Dolby"
git clone https://github.com/userariii/vendor_sony_dolby.git vendor/sony/dolby

echo "Cloning ViPER4AndroidFX"
git clone https://github.com/TogoFire/packages_apps_ViPER4AndroidFX packages/apps/ViPER4AndroidFX
echo "Completed, proceeding to lunch"

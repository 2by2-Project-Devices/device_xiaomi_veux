echo "Cloning Audio Configs...."
# Clone own audio config tree
rm -rf hardware/qcom-caf/sm8350/audio/configs/holi && git clone https://github.com/Amrito-Projects/hardware_qcom-caf_sm8350_audio_configs_holi.git -b 14 hardware/qcom-caf/sm8350/audio/configs/holi --depth=1

echo "Cloning vendor..."
# Clone Vendor
git clone --depth=1 https://github.com/Amrito-Projects/vendor_xiaomi_veux-new.git -b 15 vendor/xiaomi/veux

echo "Cloning hardware related stuff..."
# Hardware
git clone --depth=1 https://github.com/LineageOS/android_hardware_xiaomi -b lineage-22.1 hardware/xiaomi

echo "Cloning Kernel"
# Kernel
git clone --depth=1 https://github.com/PaimonLab/kernel_xiaomi_veux.git kernel/xiaomi/veux

echo "Cloning MIUI Camera (Lecia)..."
# MIUI Camera (Lecia)
git clone https://x-token-auth:ATCTT3xFfGN0yGAyPmg8csgUOB4N41KCVUKagu10beAVq3bdrWSOdCK5Yu8VqTCkV_pEeL42rH_e-ekxD_MM8ga3PRW3yxdXKPb3nEDMP-Ow4G4-tNMblFsbhVGijkQbAxfIFn-7qaZ8eSr7pk9vSrlDuXLHSXUL3TKiXgJjOq8l88Bssv870ac=02F69C6E@bitbucket.org/amritokun/vendor_xiaomi_miuicamera-veux.git vendor/xiaomi/miuicamera-veux

echo "Cloning Sony Dolby"
git clone https://github.com/userariii/vendor_sony_dolby.git vendor/sony/dolby

echo "Cloning ViPER4AndroidFX"
git clone https://github.com/TogoFire/packages_apps_ViPER4AndroidFX packages/apps/ViPER4AndroidFX
echo "Completed, proceeding to lunch"
